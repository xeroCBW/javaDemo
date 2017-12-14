package com.pactera.LHBank.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ImportHSSFExcelUtil {

	/**
	 * 返回excel中的数据
	* @param file 文件
	* @return 
	 */
	public static List importHSSFExcel(File file) {

		String fileName = file.getName();

		if (!fileName.toLowerCase().endsWith("xls")) {
			// 2007
			System.out.println("不支持的excel类型");
			return null;
		}
		List list = new ArrayList();
		String[] cellArray = null;
		try {

			InputStream is = new FileInputStream(file);
			BufferedInputStream bf = new BufferedInputStream(is);
			HSSFWorkbook book = new HSSFWorkbook(bf);

			HSSFSheet sheet = book.getSheetAt(0);

			int rowNum = sheet.getLastRowNum();
			for (int i = 0; i < rowNum; i++) {
				HSSFRow row = sheet.getRow(i);
				int cellNum = row.getLastCellNum();
				for (int j = 0; j < cellNum; j++) {
					HSSFCell cell = row.getCell(j);
					String cellValue = getCellType(cell);
					cellArray[j] = cellValue;
				}
				list.add(cellArray);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	// 判断cell类型
	public static String getCellType(HSSFCell cell) {
		
		//判断为空值的情况
		if (cell == null) {
			return "";
		}
		
		String cellValue = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING:
			cellValue = cell.getStringCellValue().trim();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			cellValue = String.valueOf(cell.getNumericCellValue()).toString().trim();
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			cellValue = String.valueOf(cell.getBooleanCellValue()).toString().trim();
			break;
		case HSSFCell.CELL_TYPE_FORMULA:
			cellValue = cell.getCellFormula();
			break;
		default:
			cellValue = "";
			break;
		}
		return cellValue;
	}
}
