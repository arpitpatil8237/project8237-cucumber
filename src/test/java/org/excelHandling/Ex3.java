package org.excelHandling;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {
             //Row Method
	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("./ExcelFile/Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);   //syntax
		
		Sheet s=wb.getSheet("StringData");
		
		Row r1=s.getRow(1);
		
		int LastNumber=r1.getLastCellNum();
		System.out.println("LastNumber= "+LastNumber);
		
		int physicalNoOfCells=r1.getPhysicalNumberOfCells();
		System.out.println("physicalNoOfCells="+physicalNoOfCells);
		
//		Cell c0=r1.getCell(0);
//		System.out.println("cellNo="+c0);//it will print but not right
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

	
}
