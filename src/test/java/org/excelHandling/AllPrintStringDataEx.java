package org.excelHandling;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.utilities.BaseUtility;

public class AllPrintStringDataEx {
	// getAllRowsData in String
	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		ArrayList<String> str=bu.getStringCellValueForRow("Testdata.xlsx", "StringData",1);
//	}
		/*try {
			FileInputStream fis = new FileInputStream("./ExcelFile/Testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis); // syntax
			Sheet s = wb.getSheet("StringData");
//			Row r1 = s.getRow(1);
			int lastRow = s.getLastRowNum();
//			int lastCellNum = r1.getLastCellNum();
			for (int k = 1; k <= lastRow; k++) {
				Row r1 = s.getRow(k);
				for (int i = 0; i < r1.getLastCellNum(); i++) {
					Cell c = r1.getCell(i);
					String cellData = c.getStringCellValue();
					System.out.println(cellData);

				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
//		String str=bu.getStringCellValueForParticularRow("Testdata.xlsx", "StringData", 1, 0);
		
		
		System.out.println(str);
	}

}
