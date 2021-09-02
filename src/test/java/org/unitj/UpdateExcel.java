package org.unitj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcel {
	public static void main(String[] args) throws IOException {
		File f2 = new File("C:\\Users\\admin\\eclipse-workspace\\BaseClassFrame\\Excel\\excelworkread.xlsx");

		FileInputStream fin2 = new FileInputStream(f2);

		Workbook book3 = new XSSFWorkbook(fin2);
		Sheet sh2 = book3.getSheet("TestData");
		Row r2 = sh2.getRow(0);
		Cell c2 = r2.getCell(0);
		String name = c2.getStringCellValue();
		if (name.equals("Green")) {
			c2.setCellValue(" Green Technology");

		} else {
			c2.setCellValue("Perumbakkam");

		}

		FileOutputStream fo2 = new FileOutputStream(f2);
		book3.write(fo2);

	}

		
	}


