package aug18;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadwriteFormate {

	public static void main(String[] args) throws Throwable {
	FileInputStream fi =new FileInputStream("F://Book.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheet("Login");
	int rowcount=ws.getLastRowNum();
	System.out.println("no of rows are::"+rowcount);
	for(int i=1;i<=rowcount;i++)
	{
		String user=ws.getRow(i).getCell(0).getStringCellValue();
		String pass=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(user+"   "+pass);
		ws.getRow(i).createCell(2).setCellValue(pass);
		XSSFCellStyle style=wb.createCellStyle();
		XSSFFont font=wb.createFont();
		font.setColor(IndexedColors.BRIGHT_GREEN.getIndex());
		font.setBold(true);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		ws.getRow(i).getCell(2).setCellStyle(style);
		
	}
     fi.close();
     FileOutputStream fo=new FileOutputStream("F://Results.xlsx");
     wb.write(fo);
     fo.close();
     wb.close();
	}

}
