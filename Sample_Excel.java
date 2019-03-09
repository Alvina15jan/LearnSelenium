package seleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Sample_Excel {

	public static void main(String[] args) throws BiffException, IOException
	{
		
		String FilePath = "d://test.xls";
		/*FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(0); // this is to get the access to Sheet1. 
		//Sheet sh = wb.getSheet("sheet1");
		 String CellGetContent = sh.getCell(0,0).getContents();
		//String 	CellGetContent=GetCell.	getContents();
		System.out.println(CellGetContent);*/
		
		
		FileInputStream fis=new FileInputStream(FilePath);
		String content=Workbook.getWorkbook(fis).getSheet(0).getCell(0,0).getContents();
		System.out.println(content);
		/*Sheet sh1 = wb1.getSheet(0);
		Cell[] rw1 = sh1.getRow(0);
		Object cell = rw1.getcell();*/
		 
		 
		
		

	}

}
