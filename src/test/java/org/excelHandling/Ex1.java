package org.excelHandling;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
               //Workbook method
	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("./ExcelFile/Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);   //syntax
		int TotalSheet=wb.getNumberOfSheets();
		System.out.println("TotalSheet: "+TotalSheet);
		
		String sheetName=wb.getSheetName(1);
		
		System.out.println("sheetName= "+sheetName);
		int sheetNo=wb.getSheetIndex(sheetName);
		System.out.println("SheetNo= "+sheetNo);
		System.out.println(wb.getSheetIndex("StringData"));
		for(int i=0;i<TotalSheet;i++) {
			System.out.println(wb.getSheetName(i));
			
//			Sheet s=wb.getSheet("StringData");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

	
}
