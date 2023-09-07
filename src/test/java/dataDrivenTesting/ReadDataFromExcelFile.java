package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: open the document in java readable format
		FileInputStream fis = new FileInputStream("C:\\Users\\ummruman\\eclipse-workspace\\EpsilonSelenium\\src\\test\\resources\\Data.xlsx");
		
		//step 2: create a workbook
        Workbook wb = WorkbookFactory.create(fis);	
        
        //step 3: navigate the required sheet
        Sheet sh = wb.getSheet("Sheet1");
        
        //step 4:navigate to required row
        Row rw = sh.getRow(1);
        
        //step 5:navigate to required cell
        Cell cl = rw.getCell(0);
        
        //step 6:capture the data in the cell
        String value = cl.getStringCellValue();
        System.out.println(value);
        
        
		
	}

}
