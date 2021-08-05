package com.solvd.mobileoperator.utils.jsonfolder;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.mobileoperator.executor.Executor;
import com.solvd.mobileoperator.staff.Boss;
import com.solvd.mobileoperator.staff.Employee;
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;
import com.solvd.mobileoperator.staff.Staff;

public class ColleagueArrayJson {
	
	private final static Logger LOGGER = Logger.getLogger(Executor.class);

	public void showColleagueArrayJsonTestCode() {
		LOGGER.info("\n\n\n");
		LOGGER.info("=======================================");
		LOGGER.info("======showJsonTestCodeStaff()========");
		LOGGER.info("=======================================");
		
		
		Employee employee = new Employee(25, "f"); 
		employee.setInfoAgain(26, "f", 2000, "employee");
		Boss boss = new Boss(76, "m"); 
		boss.setInfoAgain(46, "m", 3000, "boss");
		ExpiriencedApplicant expiriencedApplicant = new ExpiriencedApplicant(56, "trans");
		expiriencedApplicant.setInfoAgain(16, "trans", 1500, "expirienced applicant");

		
		List<Staff> staff = new ArrayList<Staff>();
		
		staff.add(employee);
		staff.add(boss);
		staff.add(expiriencedApplicant);
				
		LOGGER.info("=============");
		LOGGER.info("\n" + employee);
		LOGGER.info("=============");
		LOGGER.info("\n" + staff);
		
		JsonExec jsonAction = new JsonExec();
//		JsonExecAnimal jsonAction = new JsonExecAnimal();
		
		String jsonSrt = jsonAction.convertJavaToJsonStr(employee);
		String jsonSrt1 = jsonAction.convertJavaToJsonStr(boss);
		String jsonSrt2 = jsonAction.convertJavaToJsonStr(expiriencedApplicant);
		String jsonSrt3 = jsonAction.convertJavaToJsonStr(staff);
		
		LOGGER.info(jsonSrt);
		LOGGER.info(jsonSrt1);
		LOGGER.info(jsonSrt2);
		LOGGER.info(jsonSrt3);
		
		LOGGER.info("================================================================");
		
		jsonAction.convertJavaToJsonFile(employee, "src/main/resources/employee.json");
		jsonAction.convertJavaToJsonFile(boss, "src/main/resources/boss.json");
		jsonAction.convertJavaToJsonFile(expiriencedApplicant, "src/main/resources/expiriencedApplicant.json");
		jsonAction.convertJavaToJsonFile(staff, "src/main/resources/staff.json");
				
		String jsonStrEmp = "{\"salary\":2500,\"age\":27,\"sex\":\"trans\",\"status\":\"employee\"}";
		String jsonStrBos = "{\"salary\":3500,\"age\":37,\"sex\":\"f\",\"status\":\"boss\"}";
		String jsonStrExp = "{\"salary\":1700,\"age\":15,\"sex\":\"m\",\"status\":\"expirienced applicant\"}";
		String jsonStrSta = "[{\"salary\":2500,\"age\":26,\"sex\":\"trans\",\"status\":\"employee\"},{\"salary\":3500,\"age\":37,\"sex\":\"f\",\"status\":\"boss\"},{\"salary\":1700,\"age\":15,\"sex\":\"m\",\"status\":\"expirienced applicant\"}]";
		
		Employee employee2 = jsonAction.convertJsonStrToEmployeePOJO(jsonStrEmp);
		Boss boss2 = jsonAction.convertJsonStrToBossPOJO(jsonStrBos);
		ExpiriencedApplicant experiencedApplicant2 = jsonAction.convertJsonStrToExpiriencedApplicantPOJO(jsonStrExp);
		Staff staff2 = jsonAction.convertJsonStrToStaffPOJO(jsonStrSta);
		
		LOGGER.info(employee2);
		LOGGER.info(boss2);
		LOGGER.info(experiencedApplicant2);
		LOGGER.info(staff2);
		
																
//		LOGGER.info("Name from POJO: " + employee2.showStatus());
//		LOGGER.info("Name from POJO: " + employee2.showAge());
//		LOGGER.info("Name from POJO: " + employee2.showSex());
//		LOGGER.info("Name from POJO: " + employee2.showSalary());

//		
//		LOGGER.info("Name from POJO: " + boss2.showStatus());
//		LOGGER.info("Name from POJO: " + boss2.showAge());
//		LOGGER.info("Name from POJO: " + boss2.showSex());
//		LOGGER.info("Name from POJO: " + boss2.showSalary());

//		
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showStatus());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showAge());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showSex());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showSalary());

		
	}	
}
