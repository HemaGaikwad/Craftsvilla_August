package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;


public class ReadExcel 
{
	public static String[][] getData(String filename, String sheetname) throws Exception
	{
		try
		{
			File f = new File(filename);
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sh = wb.getSheet(sheetname);
			int row = sh.getLastRowNum() +1;
			int col = sh.getRow(0).getLastCellNum();
			String[][] data = new String[row][col];
			
			for(int i = 0; i<row; i++)
			{
				Row r = sh.getRow(i);
				for(int j = 0; j<col; j++)
				{
					Cell c = r.getCell(j);
					String value = new DataFormatter().formatCellValue(c);
					
					data[i][j] = value;
				}
				
			}
			
			return data;
		}
		catch (Exception e) 
		{
			Reporter.log("Unable to read the input file");
			return null;
			
		}
		
		
	}
	

}
