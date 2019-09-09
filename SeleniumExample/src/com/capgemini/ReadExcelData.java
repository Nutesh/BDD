package com.capgemini;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

      	
	
	       public static Object[][] readDataFromExcelFile(String filepath,String fileName,String sheetName) throws IOException {
			 
	    	        System.out.println("Data is read from excel");  
	             	File file=new File(filepath+"\\"+fileName);
	             	FileInputStream fis=new FileInputStream(file);
	             	Workbook workbook=new XSSFWorkbook(fis);
	                Sheet sheet=workbook.getSheet(sheetName);
	             	Row headerRow=sheet.getRow(0);
	             	int rowCount=sheet.getLastRowNum();
	                System.out.println("Row count is"+rowCount);
	                
	                Hashtable<String, String> table=null;
	                
	                Object[][] data=new Object[3][1];
	                
	                for(int r=1;r<=rowCount;r++){
	                
	                	table=new Hashtable<String, String>();
	                	Row row=sheet.getRow(r);
;	                	for(int c=0;c<row.getLastCellNum();c++){
	
	                             String key=headerRow.getCell(c).getStringCellValue();
							      
	                             String value=row.getCell(c).getStringCellValue();
	                             table.put(key, value);

							}
	                
                          data[r-1][0]=table;
	                
	                
	                }
	                
	             
	             
	             
	             return data;
	    	   
	    	   
	    	   
	         
	                
	      
	      }
	       
	     


}
