package org.excelHandling;

 

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex4 {
                 //cellMethod
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/Testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis); // syntax
			Sheet s = wb.getSheet("StringData");
			Row r1 = s.getRow(1);
			int lastRow = s.getLastRowNum();
			int lastPhyRow = s.getPhysicalNumberOfRows();
			for (int k = 1; k < lastRow; k++) {
				Row r2 = s.getRow(k);
				int data1 = r2.getRowNum();
				System.out.println("data1= " + data1);
			}

			Cell c0 = r1.getCell(0);
			int lastCellNum = r1.getLastCellNum();
			int lastPhyNum = r1.getPhysicalNumberOfCells();
			//		String c0Data=c0.getStringCellValue();
			//		System.out.println(c0Data);
			for (int i = 0; i < lastCellNum; i++) {
				Cell c = r1.getCell(i);
				String cellData = c.getStringCellValue();
				System.out.println("cellData= " + cellData);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
