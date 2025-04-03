package com.selenium.prj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class read_exceldata 
{
    int lastrownum,lastcellnum;
    
    public void excel_read()throws IOException{
    	String filename = "data.xlsx";
    	String sheetname = "Sheet1";
    	
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh = wb.getSheet(sheetname);
    	
    	// to read
    	XSSFRow r = sh.getRow(0);
    	XSSFCell cell1 = r.getCell(0);
    	String s = cell1.getStringCellValue();
    	
    	//To create a cell and write it
    	
    	System.out.println(s);
    	
    	
    }
    
}
