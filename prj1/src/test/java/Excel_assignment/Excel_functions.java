package Excel_assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_functions {
	HashMap<Integer,Student> hs = new HashMap<>();
	HashMap<Integer,Marks> hm = new HashMap<>();
	
	public void read_data() throws IOException {
		String filename = "Student.xlsx";
    	String sheetname1 = "Sheet1";
    	String sheetname2 = "Sheet2";
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh1 = wb.getSheet(sheetname1);
    	XSSFSheet sh2 = wb.getSheet(sheetname2);
    	
    	
    	
    	for(int i=1;i<4;i++) {
    		XSSFRow r = sh1.getRow(i);
    		XSSFCell cell1 = r.getCell(0);
    		XSSFCell cell2 = r.getCell(1);
    		XSSFCell cell3 = r.getCell(2);
    		int s1 = (int) cell1.getNumericCellValue();
    		String s2 = cell2.getStringCellValue();
    		String s3 = cell3.getStringCellValue();
    		
    	
    		hs.put(s1, new Student(s1,s2,s3));
    		
    	}
    	
    	for(int i=2;i<5;i++) {
    		XSSFRow r = sh2.getRow(i);
    		XSSFCell cell1 = r.getCell(1);
    		XSSFCell cell2 = r.getCell(2);
    		XSSFCell cell3 = r.getCell(3);
    		int s1 = (int) cell1.getNumericCellValue();
    		int s2 = (int) cell2.getNumericCellValue();
    		int s3 = (int) cell3.getNumericCellValue();
    		
    		
    		Marks m =new Marks();
    		double avg = m.avg(s2,s3);
    		hm.put(s1, new Marks(s1,s2,s3,avg));
    		
    		
    		
    	}
    	
	}
	
	public void write_data() throws IOException {
		String filename = "Student.xlsx";
    	String sheetname = "Sheet1";
    	
    	FileInputStream fis = new FileInputStream(filename);
    	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh = wb.getSheet(sheetname);
    	
    	
    	int i=1;
    	for(Map.Entry<Integer, Marks> h : hm.entrySet() ) {
    		
	    		XSSFRow r = sh.getRow(i++);
	    		
	    		XSSFCell cell4 = r.getCell(3);
	    		
	    		cell4.setCellValue(h.getValue().Avg);
	    		FileOutputStream fos = new FileOutputStream(filename);
	    		wb.write(fos);
	    		System.out.println(h.getValue().Avg);	
	    		
    		
    	}	
		
		
	}
	
	public void show() {
		for(Map.Entry<Integer,Student> h: hs.entrySet()) {
			System.out.println(h.getValue().sid);
		}
		
		for(Map.Entry<Integer,Marks> m : hm.entrySet()) {
			System.out.println(m.getValue().Avg);
		}
	}
	
	
	
	
	
}
