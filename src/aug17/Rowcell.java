package aug17;

import java.io.FileInputStream;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rowcell {

	public static void main(String[] args) throws Throwable {
		//read path of excel file
	FileInputStream fi=new FileInputStream("G://Book.xlsx");
	//get workbook from file
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	//get sheet from workbook
	XSSFSheet ws=wb.getSheet("login");
	//get first row from sheet
	XSSFRow row=ws.getRow(0);
	//count no of rows in a sheet
	int rowcount=ws.getLastRowNum();
	//count no of cells in first row
	int cellcount =row.getLastCellNum();
	System.out.println("no of rows are::"+rowcount+"   "+"no of cells in first row::"+cellcount);
   fi.close();
   wb.close();
	}

}
