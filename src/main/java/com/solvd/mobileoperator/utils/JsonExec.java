package com.solvd.mobileoperator.utils;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.mobileoperator.staff.*;
import com.fasterxml.jackson.databind.*;
import com.solvd.mobileoperator.staff.Employee;

public class JsonExec {
	
	private final static Logger LOGGER = Logger.getLogger(JsonExec.class);
	
	public String convertJavaToJsonStr(Object obj) {

		String jsonStr = "";

		try {
			jsonStr = new ObjectMapper().writeValueAsString(obj);
			LOGGER.info("Convertation to string finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			LOGGER.info("Convertation to string encountered some problems!");
		}

		return jsonStr;
	}

	public void convertJavaToJsonFile(Object obj, String pathToFile) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
			LOGGER.info("Writing to file finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			LOGGER.info("Writing to file encountered some problems!");
			
		} catch (IOException e) {
			e.printStackTrace();
			LOGGER.info("Writing to file encountered some problems!");
		}
	}
//	
//	
//	public Employee convertJsonStrToEmployeePOJO(String jsonStr) {
//
//		Employee employee = null;
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			employee  = mapper.readValue(jsonStr, Employee.class);
//			LOGGER.info("Convertation to POJO finished!");
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//			LOGGER.info("Convertation to POJO encountered some problems!");
//		}
//
//		return employee;
//	}
//	
//	public Boss convertJsonStrToBossPOJO(String jsonStr) {
//
//		Boss boss = null;
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			boss  = mapper.readValue(jsonStr, Boss.class);
//			LOGGER.info("Convertation to POJO finished!");
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//			LOGGER.info("Convertation to POJO encountered some problems!");
//		}
//
//		return boss;
//	}
//	
//	public ExpiriencedApplicant convertJsonStrToExpiriencedApplicantPOJO(String jsonStr) {
//
//		ExpiriencedApplicant expiriencedApplicant = null;
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			expiriencedApplicant  = mapper.readValue(jsonStr, ExpiriencedApplicant.class);
//			LOGGER.info("Convertation to POJO finished!");
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//			LOGGER.info("Convertation to POJO encountered some problems!");
//		}
//
//		return expiriencedApplicant;
//	}

}