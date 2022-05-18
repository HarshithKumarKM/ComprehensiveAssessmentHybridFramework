package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	HSSFWorkbook wb;
	ConfigRead rc = new ConfigRead();
	public ReadExcel() {
		
		File f = new File(rc.getExcelDataPath());
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(f);
			wb = new HSSFWorkbook(fis);
		}catch(Exception e) {
			System.out.println("Exception is:"+e.getMessage());
		}
	}
	public String getStringData(int sheetIndex, int row, int coloumn) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(coloumn).getStringCellValue();
	}
	public String getStringData(String sheetName, int row, int coloumn) {
		return wb.getSheet(sheetName).getRow(row).getCell(coloumn).getStringCellValue();
	}
	public String getNumericData(int sheetName, int row, int coloumn) {
		return wb.getSheetAt(sheetName).getRow(row).getCell(coloumn).getStringCellValue();
	}
}
