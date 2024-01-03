package org.excelHandling;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
            //Sheet Method
	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("./ExcelFile/Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);   //syntax
		
		Sheet s=wb.getSheet("StringData");
		
		int lastNum=s.getLastRowNum();
		System.out.println("lastNum= "+lastNum);
		int allPhyNum=s.getPhysicalNumberOfRows();
		System.out.println("allPhyNum= "+allPhyNum);
		
//		Row r1=s.getRow(1);
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

	
}
