package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;
	// 1. Browser configure and setup 
	public static void getDriver(String browsertype) {
	switch (browsertype) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
	case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "Edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	default:
		break;
	}



	}

	// 2.To launch url
	public static void loadurl(String url) {
		driver.get(url);
	}

	// 3. To Maximize the window 
	public static void maximize() {
		driver.manage().window().maximize();
	}
	// 4.Insert value in textbox
	public  void Type(WebElement element,String data){
		element.sendKeys(data);

	}
	//5. click method
	public  void click(WebElement element) {
		element.click();
	}

	//6. clear method
		public  void Clear(WebElement element) {
			element.clear();
		}
	
	
	
	public static void Thread(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	//6.get title
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	//7.find element by Id
	public WebElement findElementById(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}
	//8.find element by Name
	public WebElement findElementByName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}
	//9.find element by class
	public  WebElement findElenmentByClass(String AttributeValue){
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	//10.find element by xpath

	public WebElement findElementByXpath(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;
	}
	//11.To get url
	public String getUrl(String url) {
		String Curenturl = driver.getCurrentUrl();
		return Curenturl;
	}

	//12.To getText 
	public String getText(WebElement element) {
		String text= element.getText();
		return text;

	}

	//13.getAttribute value
	public String  getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;


	}

	//14. getAttribute Name
	public String getAttributeName(WebElement element,String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}
	//15. drop and down ====> SelectOption 
	//15.1. SelectOption by visible text
	public void selectOptionByText(WebElement element,String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	//15.2.selectOption By index

	public void selectOptionByIndex(WebElement element,int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}


	public String getPropertyFileValue(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object name = properties.get(key);
		String value = (String)name;
		return value;

	}

	//15.3.selectOption By value
	public void selectOptionByValue(WebElement element,String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}
	//16.type or insert value by JavaScript
	public void typeJs(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("aruguments[0].getAttribute('value'," + data + "')", element);
	}
	//17.To go backward
	public void backWard() {
		driver.navigate().back();
	}
	//18. To go Forward
	public void forWard() {
		driver.navigate().forward();
	}
	//19.To Reload or Refresh
	public void refresh() {
		driver.navigate().refresh();
	}
	//20.To mouseHover Action
	public void moveToElement(WebElement element) {
		Actions actions= new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	//21.Drag and Drop
	public void dragnDrop(WebElement source,WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).build().perform();
	}
	//22.To RightClick

	public void rightClick(WebElement element) {
		Actions actions= new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	//23.To keyBoard actions

	public static void keyboardActions(int keycode) throws AWTException {
		Robot robot =new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}
	//24.To doubleClick
	public static void doubleclick(WebElement element) {
		Actions actions = new  Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	//25. To alerts 
	public static void alerts() {
		Alert alert =driver.switchTo().alert();
		alert.accept();
	}
	public static void alertcancel( ) {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	//26.Scroll up and Scroll down
	//26.1 Scroll down
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("aruments[0].scrollIntoView(true)",element);
	}

	//26.2 Scroll down
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("aruments[0].scrollIntoView(false)",element);
	}

	// 27.get all selected options
	public List<WebElement>  webgetAllSelectedOption(WebElement element) {
		Select select= new Select(element);
		List<WebElement> selectedOptions =select.getAllSelectedOptions();
		return selectedOptions;	
	}
	public void implicitwait(int num){
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(num));

	}


	//28. to check get options is multiple or single in drop down
	public void isMultiple(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
	}
	//29.drop down methods

	//29.1 deselectbyINdex
	public void deSelectbyIndex(WebElement element,int index,String value) {
		Select select= new Select(element);
		select.deselectByIndex(index);

		//29.2 deSelectAll
		select.deselectAll();

		//29.3 deSelectByValue
		select.deselectByValue(value);

		//29.4 deSelectByVisibleText

		select.deselectByVisibleText(value);	

	}
	//	//30.To TakesScreenShot
	//	public void TakesScreenShot(File source,WebElement element,File dest ,String pathname) throws IOException {
	//		TakesScreenshot screenshot=(TakesScreenshot)driver;
	//		File soruce = new File(pathname); 
	//		File dest = screenshot.getScreenshotAs( (OutputType.FILE));
	//		FileUtils.copyFile(soruce,dest);

	//	}

	//31.To Wait concept
	//=================================
	// 31.1 Implicit wait




	//31.2 Explicit Wait ( WebDriver Wait)

	public static void explicitWait(int sec) {
		new WebDriverWait(driver, java.time.Duration.ofSeconds(sec));
	}	

	public  void fluentWait(int sec,WebElement element) {
		new FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofSeconds(sec));
		pollingEvery(java.time.Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);

	}
	private FluentWait<WebDriver> pollingEvery(java.time.Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	//33.To switch to Frame
	public static void frame(int index,int id ,String name, WebElement element) {
		//33.1 By index
		driver.switchTo().frame(index);
		// 33.2 by String Id
		driver.switchTo().frame(id);
		//33.3 by string name 
		driver.switchTo().frame(name);
		// 33.4 by frameElement
		driver.switchTo().frame(element);

	}
	// 34.To come before frame or parent frame
	public static void parentframe() {
		driver.switchTo().parentFrame();

	}
	//35.To Exit all frame 
	public static void ExitFrame() {
		driver.switchTo().defaultContent();


	}
	// 36.To Switch and handle window

	//36.1.get all window id

	public WebDriver getWindowHandle() {
		String parentId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String string : allWindowId) {
			if (!(string.equals(parentId))) {
				driver.switchTo().window(string);

			}
		}
		return driver;

	}

	// 37. switch to window by url and title
	public static void switchTowinByurl(String url,String title) {
		driver.switchTo().window(url);
		driver.switchTo().window(title);


	}
	public static void closeWindow() {
		driver.close();
	}
	public static void quitWindow() {
		driver.quit();


	}

	//	public String getData(String sheetName,int rowNo,int cellNo) throws IOException {
	//		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Framework\\Excel\\Adactin info1.xlsx");
	//		FileInputStream stream=new FileInputStream(file);
	//
	//		Workbook workbook= new XSSFWorkbook(stream);
	//		Sheet sheet = workbook.getSheet(sheetName);
	//		Row row = sheet.getRow(rowNo);
	//		Cell cell = row.getCell(cellNo);
	//		CellType type = cell.getCellType();
	//
	//		String res =" ";
	//
	//		switch (type) {
	//		case STRING:
	//			res = cell.getStringCellValue();
	//
	//			break;
	//		case NUMERIC:
	//			if (DateUtil.isCellDateFormatted(cell)) {
	//				Date dateCellValue = cell.getDateCellValue();
	//				SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mmm-yyyy");
	//				res=dateFormat.format(dateCellValue);
	//
	//			} else {
	//				double numericCellValue = cell.getNumericCellValue();
	//				BigDecimal decimal = BigDecimal.valueOf(numericCellValue);
	//				res=decimal.toString();
	//
	//			}
	//
	//		default:
	//			break;
	//		}
	//
	//		FileOutputStream output= new FileOutputStream(file);
	//		workbook.write(output);
	//		return res;
	//	}	
	//	// 2. update / replace data in excel
	//
	//
	//	public void updateData(String sheetName,int rowNo,int cellNo,String oldData,String newData) throws IOException {
	//		File file= new File("C:\\Users\\DELL\\eclipse-workspace\\Framework\\Excel\\Adactin info1.xlsx");
	//		FileInputStream stream=new FileInputStream(file);
	//		Workbook workbook= new XSSFWorkbook(stream);
	//		Sheet sheet = workbook.getSheet(sheetName);
	//		Row row = sheet.getRow(rowNo);
	//		Cell cell = row.getCell(cellNo);
	//		CellType type = cell.getCellType();
	//		if (type.equals(oldData)) {
	//			cell.setCellValue(newData);
	//
	//		}
	//		FileOutputStream outputStream =new FileOutputStream(file);
	//		workbook.write(outputStream);
	//
	//	}
	//
	//	//3. write a new data or insert data in excel
	//
	//	public void writeData(String sheetName,int rowNo, int cellNo,String data) throws IOException {
	//		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Framework\\Excel\\Adactin info1.xlsx");
	//		FileInputStream stream= new FileInputStream(file);
	//		Workbook workbook= new XSSFWorkbook(stream);
	//		Sheet sheet = workbook.getSheet(sheetName);
	//		// row is already created
	//		Row row = sheet.getRow(rowNo);
	//		// create new cell insert a value
	//		Cell cell = row.createCell(cellNo);
	//		cell.setCellValue(data);
	//
	//		FileOutputStream outputStream =new FileOutputStream(file);
	//		workbook.write(outputStream);
	//
	//	}
	//
	//
	//
	//
	//
}
