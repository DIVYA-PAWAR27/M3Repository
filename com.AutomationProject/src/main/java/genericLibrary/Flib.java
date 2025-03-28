package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath, String sheetName ,int rowno, int cellno) throws EncryptedDocumentException, IOException

	{

		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

	    Sheet sheet = wb.getSheet(sheetName);

	    Row row = sheet.getRow(rowno);

	    Cell cell = row.getCell(cellno);

	    String data = cell.toString();

		return data;

	}

	

	public String readPropertyData(String propPath, String key) throws IOException

	{

		FileInputStream fis1 = new FileInputStream(propPath);

		Properties prop = new Properties();

		prop.load(fis1);

		String data = prop.getProperty(key);

		return data;
	}
	public int lastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException

	{

		FileInputStream fis2 = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis2);
        Sheet sheet = wb.getSheet(sheetName);

	    int rc = sheet.getLastRowNum();

		return rc;
	}
	public int randomNumber() {
		 Random random = new Random();
		 int number = random.nextInt(1000,9999);
		 return number;
		 
		
	}
	public long readExcelData1(String excelPath, String sheetName ,int rowno, int cellno) throws EncryptedDocumentException, IOException

	{

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowno);
	    Cell cell = row.getCell(cellno);
	    long data = (long)cell.getNumericCellValue();
		return data;

	}

}


