package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args)  {
		
		try
		{
			File file = new File("./testdata/testadata.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int count = wb.getSheet("users").getLastRowNum()+1;
			System.out.println("Total no of active rows : "+count);
			
			for(int i=0; i<count; i++)
			{
				String row = wb.getSheet("users").getRow(i).getCell(0).toString();
				String col = wb.getSheet("users").getRow(i).getCell(1).toString();
				System.out.println(row+" : "+col);
			}
			
			wb.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
