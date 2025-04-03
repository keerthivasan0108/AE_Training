package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class common_methods {
	public static WebDriver dr;
	public ArrayList<String> uarr = new ArrayList<>();
	public ArrayList<String> pwdarr = new ArrayList<>();
	public static int n = 1;
	public static void chrome_launcher(String s) {
		dr = new ChromeDriver();
		dr.get(s);
		dr.manage().window().maximize();
	}
	
	
	public String excel_data1(int r,int c) throws IOException {
		String filename = "users.xlsx";
    	String sheetname1 = "Sheet1";
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh1 = wb.getSheet(sheetname1);
    	XSSFRow r1 = sh1.getRow(r);
    	XSSFCell cell1 = r1.getCell(c);	
    	String un = cell1.getStringCellValue();
    	return un;    	
	}
	
	
	public void take_screenshot() throws IOException {
		TakesScreenshot ss = ((TakesScreenshot)dr);
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\keerthivasan.v\\Documents\\"+n+".png");
		FileUtils.copyFile(src,dest);
		n++;
	}
	
}
