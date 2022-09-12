package aug18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readandwrite {

	public static void main(String[] args)throws Throwable {
	FileInputStream fi=new FileInputStream("G://Book.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("Login");
	int rowcount=ws.getLastRowNum();
	System.out.println("no of rows are::"+rowcount);
	//iterate all rows
	for (int i=1;i<=rowcount;i++) {
		String username=ws.getRow(i).getCell(0).getStringCellValue();
		String password=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(username+"  "+password);
		//write some text into cell
		ws.getRow(i).createCell(2).setCellValue("pass");
		
	}
	fi.close();
	FileOutputStream fo=new FileOutputStream("F://Results.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
	}

}
