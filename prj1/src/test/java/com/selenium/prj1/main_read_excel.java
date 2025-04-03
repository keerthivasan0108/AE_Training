package com.selenium.prj1;

import java.io.IOException;

public class main_read_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read_exceldata d = new read_exceldata();
		//d.excel_read();
		excel_update_write w = new excel_update_write();
		w.excel_update();
		w.excel_write();
	}

}
