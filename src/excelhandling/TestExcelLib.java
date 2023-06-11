package excelhandling;

import utils.ExcelLib;

public class TestExcelLib {

	public static void main(String[] args) {
		
		ExcelLib xl = new ExcelLib("./testdata/testadata.xlsx");
		int count = xl.getRowCount("adminusers");
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String row = xl.getCellData("adminusers", i, 0);
			String col = xl.getCellData("adminusers", i, 1);
			System.out.println(row+" : "+col);
		}
	}
}
