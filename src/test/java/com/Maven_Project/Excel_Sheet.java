package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Sheet {

	private static void readdata() throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\data1.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("data1");
		

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row1 = sheet.getRow(i);

			for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {

				Cell cell1 = row1.getCell(j);

				CellType Type = cell1.getCellType();

				if (Type.equals(CellType.STRING)) {

					String s = cell1.getStringCellValue();
					System.out.print(s + " | ");

				} else if (Type.equals(CellType.NUMERIC)) {

					double num = cell1.getNumericCellValue();
					int c = (int) num;
					System.out.println(c);
					System.out.println();

				}

			}

		}

		System.out.println("no of rows: " + sheet.getPhysicalNumberOfRows());
		System.out.println("no of cells in a row: " + sheet.getRow(1).getPhysicalNumberOfCells());
	}
	
	private static void datauu() throws IOException {
		
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\ak.xlsx");
		
		FileInputStream cc=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(cc);
		
		w.createSheet("Sheet5").createRow(0).createCell(0).setCellValue("Akash");
		w.getSheet("Sheet5").getRow(0).createCell(1).setCellValue("90");
		w.getSheet("Sheet5").createRow(1).createCell(0).setCellValue("santhosh");
		w.getSheet("Sheet5").getRow(1).createCell(1).setCellValue("70");
		
		FileOutputStream yy =new FileOutputStream(f);
		w.write(yy);
		
		

	}
	

	public static void main(String[] args) throws IOException {

		readdata();
		datauu();
		
		

	}

}
