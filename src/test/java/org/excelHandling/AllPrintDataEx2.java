package org.excelHandling;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllPrintDataEx2 {
	// getAllRowsData in String
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/Testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis); // syntax
			Sheet s = wb.getSheet("AllTypeData");
			for (int k = 1; k <= s.getLastRowNum(); k++) {
				for (int i = 0; i < s.getRow(k).getLastCellNum(); i++) {
					CellType ct = s.getRow(k).getCell(i).getCellType();
					// System.out.println(ct);
					switch (ct) {
					case STRING:
						System.out.println(s.getRow(k).getCell(i).getStringCellValue());
						break;
					case NUMERIC:
						if (DateUtil.isCellDateFormatted(s.getRow(k).getCell(i))) {

							Date dt = s.getRow(k).getCell(i).getDateCellValue();

							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

							System.out.println(sdf.format(dt));
						} else {
							System.out.println((long) s.getRow(k).getCell(i).getNumericCellValue());// returns double

						}
						break;
					case BOOLEAN:
						System.out.println(s.getRow(k).getCell(i).getBooleanCellValue());
						break;
					case FORMULA:
						System.out.println(s.getRow(k).getCell(i).getCellFormula());
						break;
					case BLANK:
						System.out.println("It is Blank");
						break;
					case ERROR:
						System.out.println("ERROR");
						break;
					case _NONE:
						System.out.println("NONE");
						break;
					default:
						System.out.println("Invalid");
						break;
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
