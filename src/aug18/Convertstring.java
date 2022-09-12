package aug18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convertstring {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("F://Book.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Login");
		int rowcount =ws.getLastRowNum();
		System.out.println("no of rows are::"+rowcount);

		for (int i = 1; i <=rowcount; i++) {
			//read all rows first row data
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			//read all rows second celldata
			if (wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC) {
				//get integer type cell and store
				int celldata=(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
				//convert integer type into string type
				String password =String.valueOf(celldata);
				System.out.println(username+"   "+password);
				//write some text into results cell
				ws.getRow(i).createCell(2).setCellValue("pass");

			}

		}
		fi.close();
		//create new workbook
		FileOutputStream fo=new FileOutputStream("G:/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}

