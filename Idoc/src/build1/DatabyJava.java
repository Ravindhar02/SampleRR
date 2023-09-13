package build1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabyJava {
	
	
	public void getdata() throws IOException {
			FileInputStream excel =new FileInputStream("F:\\databyexcel.xlsx");
			Workbook wb= new XSSFWorkbook(excel);
			 Sheet sheet = wb.getSheetAt(0);
			 
			 Iterator<Row> rowiterator = sheet.iterator();
			 
			 while(rowiterator.hasNext()) {
			       Row rowvalue = rowiterator.next();
			      Iterator<Cell> coloumniterator = rowvalue.iterator();
			      while(coloumniterator.hasNext()) {
			    	  Cell cellvalue = coloumniterator.next();
			    	  System.out.println(cellvalue);
			      }
			        
	              }
	
	}
	

	public static void main(String[] args) throws IOException {
		
                         DatabyJava poi=new DatabyJava();
                          poi.getdata();
	}

}
