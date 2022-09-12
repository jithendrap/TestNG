package aug18;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcelldata1 {

	public static void main(String[] args) throws Throwable {
	FileInputStream fi=new FileInputStream("G://Book.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("Login");
	int rowcount=ws.getLastRowNum();
	System.out.println("no of rows are::"+rowcount);
	String user=ws.getRow(5).getCell(0).getStringCellValue();
    String pass=ws.getRow(10).getCell(1).getStringCellValue();
    System.out.println(user+"   "+pass);
    fi.close();
    wb.close();
	

	}

}
