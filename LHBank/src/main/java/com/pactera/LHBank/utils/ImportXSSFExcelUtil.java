package com.pactera.LHBank.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ImportXSSFExcelUtil {
	

	public static List<String> importXSSFExcel(File file) {
		
		String fileName = file.getName();
		
		if (!fileName.toLowerCase().endsWith("xlsx")) {
			//2007
			System.out.println("不支持的excel类型");return null;
		}
		List list = new ArrayList();
		String[] cellArray= null ;
		XSSFWorkbook book = null;
		try {
						
			FileInputStream is = new FileInputStream(file);
			BufferedInputStream bf = new BufferedInputStream(is);
			book = new XSSFWorkbook(bf);
			XSSFSheet sheet = book.getSheetAt(0);
			int rowNum = sheet.getLastRowNum();
			
			for (int i = 0;i <= rowNum ;i++) {
				XSSFRow row= sheet.getRow(i);
				int cellNum = row.getLastCellNum();
				cellArray = new String[cellNum];
				for(int j =0; j< cellNum ;j++) {
					XSSFCell cell = row.getCell(j);
					String cellValue = getCellType(cell);
					cellArray[j] = cellValue;
				}
				list.add(cellArray);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			finally {
			try {
				book.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

				return list;
	}
	
	//判断cell类型
	public static String getCellType(XSSFCell cell) {
		
		if (cell == null) {
			
			return "";
		}
		
		String cellValue = "";
		switch (cell.getCellType()) {
		case XSSFCell.CELL_TYPE_STRING:
			cellValue = cell.getStringCellValue().trim();
			break;
		case XSSFCell.CELL_TYPE_NUMERIC:
			cellValue = String.valueOf(cell.getNumericCellValue()).toString().trim();
			break;
		case XSSFCell.CELL_TYPE_BOOLEAN:
			cellValue = String.valueOf(cell.getBooleanCellValue()).toString().trim();
			break;
		case XSSFCell.CELL_TYPE_FORMULA:
			cellValue = cell.getCellFormula();
			break;
		default:
			cellValue = "";
			break;
		}
		return cellValue;
	}
}
