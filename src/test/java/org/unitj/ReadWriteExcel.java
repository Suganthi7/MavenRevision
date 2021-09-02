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

public class ReadWriteExcel {
	public static void main(String[] args) throws IOException {
		 // File Location
		 File f = new
		 File("C:\\Users\\admin\\eclipse-workspace\\BaseClassFrame\\Excel\\excelworkread.xlsx");
		
		 // Read a File
		 FileInputStream fin = new FileInputStream(f);
		
		 // Create WorkBook
		 Workbook book = new XSSFWorkbook(fin);
		
		 // get a Sheet
		 Sheet sh = book.getSheet("Sheet1");
		
		 // get a Row
		 Row r = sh.getRow(1);
		
		 // get a cell
		
		 Cell c = r.getCell(1);
		 System.out.println(c);

		// Write FIle

		// File Location
		File f1 = new  File("C:\\Users\\admin\\eclipse-workspace\\BaseClassFrame\\Excel\\excelworkread.xlsx");
		
		 // Create WorkBook
		 Workbook book1 = new XSSFWorkbook();
		
		 // Create Sheet
		 Sheet sh1 = book1.createSheet("TestData");
		
		 // Create Row
		
		 Row r1 = sh1.createRow(0);
		
		 // Create Cell
		
		 Cell c1 = r1.createCell(0);
		
		 // Assiging value
		 c1.setCellValue("Green");
		
		 // Create object for Write file
		 FileOutputStream fo = new FileOutputStream(f1);
		
		 // write File
		 book1.write(fo);

	

		
}}
