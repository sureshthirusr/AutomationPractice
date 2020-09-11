package Excel_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	public static String value;

	public static void main(String[] args) throws Throwable {

		File f = new File(System.getProperty("user.dir")+"\\New.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);

		System.out.println(sheet.getPhysicalNumberOfRows());
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			String s = "Yes";
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					value = cell.getStringCellValue();
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long value1 = (long) numericCellValue;
					value = String.valueOf(value1);
				} else if(cellType.equals(cellType.BLANK)){
					value ="";
					System.out.println("NO");
				}

				System.out.println(value);
				
				 /* if(!(cell==null)) { value="NA"; }else { value="Loosu"; }
				  System.out.println(value); }*/
				 
			}

			
			  Sheet sheetAt = wb.getSheetAt(1); 
			  Row createRow = sheetAt.createRow(3); 
			  Cell createCell = createRow.createCell(0); 
			  createCell.setCellValue("cc"); 
			  Cell createCell1 = createRow.createCell(1); 
			  createCell1.setCellValue(3);
			  
			   Sheet createSheet = wb.createSheet("viky"); 
			  createSheet.createRow(0).createCell(0).setCellValue("Personal");
			  
			  FileOutputStream fos=new FileOutputStream(f); wb.write(fos); // wb.close();
			 

		}
	}
}
