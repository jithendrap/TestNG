package aug17;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

//import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcelldata {

	public static void main(String[] args) throws Throwable {
	FileInputStream fi=new FileInputStream("G://Book.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheetAt(0);
	XSSFRow row=ws.getRow(12);
	XSSFCell c1=row.getCell(0);
	XSSFCell c2=row.getCell(1);
	String user=c1.getStringCellValue();
	String pass=c2.getStringCellValue();
	System.out.println(user+"  "+pass);
	fi.close();
	wb.close();

	}

}
