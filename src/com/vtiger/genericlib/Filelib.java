package com.vtiger.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Supriya Jaiswal
 */
public class Filelib {
	/**
	 * @param
	 * @return
	 * @throws Throwable 
	
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/common.properties");
		Properties pobj =new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
		
	
	
	public String getExcelData(String sheetName,int rowNum,int CellNum) throws Throwable {
		FileInputStream fis =new FileInputStream("./data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(CellNum).getStringCellValue();
		wb.close();
		return data;
		
	}
	public void setexcelData(String sheetName,int rowNum,int CellNum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(CellNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testdata.xlsx");
		wb.write(fos);
		wb.close();
		
	}
}
