package org.unitj;

import java.io.IOException;

import org.base.BaseClass;

public class ReadWriteUsingBaseClass extends BaseClass {
	public static void main(String[] args) throws IOException {
//		cellWriteToExcel("excelworkread", "TestData", 0, 1, "Perumbakkam");
//		cellWriteToExcel("excelworkread", "TestData", 0, 2, "Adayar");
//		createRowInExcel("excelworkread", "TestData",1);
//		cellWriteToExcel("excelworkread", "TestData", 1, 1, "Perumbakkam");
//		cellWriteToExcel("excelworkread", "TestData", 1, 2, "Adayar");
//		createSheetInExcel("Book1", "TestData2");
//		createRowInExcel("Book1", "TestData1",0);
//		createRowInExcel("Book1", "TestData1",1);
//		cellWriteToExcel("Book1", "TestData1", 0, 0, "Green");
//		cellWriteToExcel("Book1", "TestData1", 1, 0, "Green");
//		createRowInExcel("Book1", "TestData2",0);
//		createRowInExcel("Book1", "TestData2",1);
//		cellWriteToExcel("Book1", "TestData2", 0, 0, "Green");
//		cellWriteToExcel("Book1", "TestData2", 1, 0, "Green");
//		updateCellInExcel("Book1", "TestData1", 0, 0, "Green", "Python", "Java");
		
		updateShName("Book1", "TestData1", "GreenTech");
		System.out.println("Success");
		
		
	}
	

}
