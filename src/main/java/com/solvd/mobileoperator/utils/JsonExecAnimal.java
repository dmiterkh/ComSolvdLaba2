package com.solvd.mobileoperator.utils;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.*;
import com.solvd.mobileoperator.staff.Animal;


public class JsonExecAnimal {
	
	private final static Logger LOGGER = Logger.getLogger(JsonExecAnimal.class);

	public String convertJavaToJsonStr(Object obj) {

		String jsonStr = "";

		try {
			jsonStr = new ObjectMapper().writeValueAsString(obj);
			LOGGER.info("convert to string, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return jsonStr;
	}

	
	public void convertJavaToJsonFile(Object obj, String pathToFile) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
			LOGGER.info("write to file, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public Animal convertJsonStrToAnimalPOJO(String jsonStr) {

		Animal animal = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			animal  = mapper.readValue(jsonStr, Animal.class);
			LOGGER.info("convert to POJO, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return animal;
	}
	

}

