package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public WebDriver driver;
//code for fetching excel sheet data
	public String getTd(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("");
		Sheet sh=WorkbookFactory.create(file).getSheet("loginnsheet");
		String value=sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	public void captureScrinshot(WebDriver driver) throws IOException {
		// code for fetching the data from excel sheet
		this.driver=driver;
		Date d=new Date();
		String str=d.toString().replace(":","_").replace(" ", "_");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\AutoScreenshot\\"+str+".jfif");
		FileHandler.copy(source, dest);
	}
}
