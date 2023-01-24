package com.resumedone.io.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenClass {

	public String excel(int a, int b) throws EncryptedDocumentException, IOException 
	{
		String path="F:\\Local repository\\Resumedone.io\\resumedone.io\\ExcelSheets\\ResumedoneDatarecords.xlsx";
		
		FileInputStream File=new FileInputStream(path);
		
		String Data=WorkbookFactory.create(File).getSheet("CONTACT").getRow(a).getCell(b).getStringCellValue();
		
		return Data;	
		
	}
	
	
	
}
