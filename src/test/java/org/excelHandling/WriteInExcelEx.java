package org.excelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcelEx {
	// getAllRowsData in String
	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/Testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis); // syntax
			Sheet s = wb.getSheet("WriteData");

//			s.getRow(1).getCell(2).setCellValue("PASS");
			// .getCell() not usable instead .createCell() is Use
			s.getRow(1).createCell(3).setCellValue("OK");
			s.getRow(2).createCell(3).setCellValue("NOT OK");
			s.getRow(3).createCell(3).setCellValue("OK");
			FileOutputStream fos = new FileOutputStream("./ExcelFile/Testdata.xlsx");
			wb.write(fos);
			fos.close();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("cause: "+e.getCause());//additional 
		}
		System.out.println("Program Ends");

	}

}
