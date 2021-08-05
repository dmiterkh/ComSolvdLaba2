package com.solvd.mobileoperator.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.mobileoperator.executor.Executor;
import com.solvd.mobileoperator.staff.Animal;
import com.solvd.mobileoperator.staff.AnimalPlace;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.Object.*;

public class AnimalJson {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public void showAnimalJsonTestCode() {	
		
		AnimalPlace place = new AnimalPlace();
		place.setTitle("Worldd");
		
		AnimalPlace place1 = new AnimalPlace();
		place1.setTitle("Europee");
		
		AnimalPlace place2 = new AnimalPlace();
		place2.setTitle("Asiaa");
		
		Animal animal = new Animal();
		animal.setId(13213);
		animal.setName("Rex_Rexie");
		animal.getName();
		animal.setPlace(place);
		
		
		Animal animal1 = new Animal();
		animal1.setId(14324);
		animal1.setName("Rex1_Rexie");
		animal1.getName();
		animal1.setPlace(place1);
		
		Animal animal2 = new Animal();
		animal2.setId(15435);
		animal2.setName("Rex2_Rexie");
		animal2.getName();
		animal2.setPlace(place2);
		
		
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(animal);
		animals.add(animal1);
		animals.add(animal2);
		LOGGER.info("=======================================");
		LOGGER.info("======showJsonTestCodeAnimal()========");
		LOGGER.info("=======================================");
		LOGGER.info(animal.getId());
		LOGGER.info("=============");
		
		
		JsonExecAnimal jsonAction = new JsonExecAnimal();
		
		String jsonSrt = jsonAction.convertJavaToJsonStr(animal);
		
		LOGGER.info(jsonSrt);
		LOGGER.info("================");
		jsonAction.convertJavaToJsonFile(animal, "src/main/resources/animal.json");
		
		jsonAction.convertJavaToJsonFile(animals, "src/main/resources/animals.json");
		
		
		String jsonStr1 = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
		
		Animal animal4 = jsonAction.convertJsonStrToAnimalPOJO(jsonStr1);
		
		LOGGER.info("Name from POJO: " + animal4.getName());
		LOGGER.info("Name place from POJO: " + animal4.getPlace().getTitle());		
		
			
	}
	
}
