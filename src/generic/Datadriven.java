package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven implements Constant {
		public String abc(String sheet,int r,int c)
		{
		
			String s="";
			try {
			FileInputStream f=new FileInputStream(PATH);
			Workbook w = WorkbookFactory.create(f);
			s = w.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			System.out.println(s);
		}
			catch(Exception e)
			{
				
			}
		return s;


	}

}
