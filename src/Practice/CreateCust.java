package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateCust {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
//open workbook in read mode
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("sheet1");
Row row=sh.getRow(1);
Cell cel=row.createCell(6);
cel.setCellValue("pass");
//String customername=row.getCell(1).getStringCellValue();
//System.out.println(customername);
FileOutputStream fos=new FileOutputStream("./data/testdata.xlsx");
wb.write(fos);
wb.close();
System.out.println("done");
	}

}
