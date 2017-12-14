/**
 * 
 */
package com.pactera.LHBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.pactera.LHBank.po.WorkFlowDetail;
import com.pactera.LHBank.utils.CreatFileUtil;
import com.pactera.LHBank.utils.DateUtil;
import com.pactera.LHBank.utils.ImportXSSFExcelUtil;

/**
 * @Title: WorkFlowGenerator.java
 * @Package com.pactera.LHBank
 * @Description: TODO(用一句话描述该文件做什么)
 * @author cbw
 * @date 2017年12月14日 下午2:05:14
 * @version V1.0
 */
public class WorkFlowGenerator {

	private final static String filePath = "src/main/resources/json";
	private final static String fileName = "DepositStatistics.json";
	private final static String excelPath = "src/main/resources/template/workFlow.xlsx";

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		// 生成json文件
		generatorJson();
	}

	/**
	 * 生成json文件
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ParseException
	 */
	private static void generatorJson() throws FileNotFoundException, IOException, ParseException {

		File file = new File(excelPath);

		List list = ImportXSSFExcelUtil.importXSSFExcel(file);

		// List<WorkFlowDetail> detailList = toModelList(list);

		// 防止引用
		String jsonString = JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect);

		try {
			CreatFileUtil.createJsonFile(jsonString, filePath, fileName);
			System.out.println("--------------------------------");
			System.out.println("保存成功,请按F5刷新工程,查看json文件");
			System.out.println("生成json文件路径为:" + filePath + "/" + fileName);
			System.out.println("--------------------------------");

		} catch (Exception e) {
			System.out.println("--------------------------------");
			System.out.println("保存失败");
			System.out.println("--------------------------------");
		}

	}

	
	//用来转模型
	public static List toModelList(List list) throws ParseException {

		ArrayList<WorkFlowDetail> detailList = new ArrayList<WorkFlowDetail>();

		System.out.println("list大小---》" + list.size());
		WorkFlowDetail workFlowDetail = null;
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMddHHmmss");
		String datePrefix = simple.format(new Date());

		for (int i = 0; i < list.size(); i++) {
			workFlowDetail = new WorkFlowDetail();
			String[] obj = (String[]) list.get(i);
			String indexString = String.format("%04d", i);
			workFlowDetail.setFlowNo1(Long.parseLong(datePrefix + indexString));
			workFlowDetail.setOrderNo(Long.parseLong(datePrefix + indexString));
			workFlowDetail.setAccount(obj[0]);
			workFlowDetail.setTransactionType(Short.parseShort(DateUtil.dealData(obj[1])));

			simple = new SimpleDateFormat("yyyyMMdd");
			workFlowDetail.setTransactionDate(simple.parse(obj[2]));
			workFlowDetail.setDetailType(Short.parseShort(DateUtil.dealData(obj[3])));
			workFlowDetail.setAmount(new BigDecimal(obj[4]));
			workFlowDetail.setPrinciple(new BigDecimal(obj[5] == "" ? "0" : obj[5]));
			workFlowDetail.setRepayRate(new BigDecimal(obj[6] == "" ? "0" : obj[6]));
			workFlowDetail.setPernaltyAmount(new BigDecimal(obj[7] == "" ? "0" : obj[7]));
			workFlowDetail.setPernaltyInterest(new BigDecimal(obj[8] == "" ? "0" : obj[8]));
			workFlowDetail.setIdentifyNo(obj[9]);
			workFlowDetail.setGender(Short.parseShort(DateUtil.dealData(obj[10])));
			workFlowDetail.setName(obj[11]);
			workFlowDetail.setAge(Short.parseShort(obj[12]));
			workFlowDetail.setProvince(obj[13]);
			workFlowDetail.setCity(obj[14]);
			if (obj.length >= 16) {
				workFlowDetail.setRemark(obj[15]);
			}
			detailList.add(workFlowDetail);

		}
		return detailList;
	}
}
