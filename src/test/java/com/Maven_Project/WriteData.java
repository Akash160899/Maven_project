package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	
private static void datauu() throws IOException {
		
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\lk.xlsx");
		
		FileInputStream cc=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(cc);
		
		w.createSheet("tt").createRow(0).createCell(0).setCellValue("Akash");
		w.getSheet("tt").getRow(0).createCell(1).setCellValue("90");
		w.getSheet("tt").createRow(1).createCell(0).setCellValue("santhosh");
		w.getSheet("tt").getRow(1).createCell(1).setCellValue("70");
		
		FileOutputStream yy =new FileOutputStream(f);
		w.write(yy);
		
		System.out.println("sucessfully entered");
		
		

	}
	
public static void main(String[] args) throws IOException {
	
	datauu();
	
}

}
