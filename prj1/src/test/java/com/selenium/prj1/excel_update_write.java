package com.selenium.prj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_update_write {
	
	public void excel_update() throws IOException {
		String filename = "data.xlsx";
    	String sheetname = "Sheet1";
    	
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh = wb.getSheet(sheetname);
    	XSSFRow r = sh.getRow(0);
    	XSSFCell cell2 = r.getCell(1);
		cell2.setCellValue("Mphasis");
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		
		//to update a cell
		
		
	}
	public void excel_write() throws IOException {
		String filename = "data.xlsx";
    	String sheetname = "Sheet1";
    	
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh = wb.getSheet(sheetname);
    	XSSFRow r = sh.getRow(0);
    	FileOutputStream fos = new FileOutputStream(filename);
    	XSSFCell cell3 = r.createCell(2);
		cell3.setCellValue("Infosys");
		
		wb.write(fos);
	}
}
