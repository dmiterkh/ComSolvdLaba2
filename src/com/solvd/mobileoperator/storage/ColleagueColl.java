package com.solvd.mobileoperator.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.solvd.mobileoperator.staff.Staff;
import com.solvd.mobileoperator.staff.Employee;
import com.solvd.mobileoperator.staff.BadEmployee;
import com.solvd.mobileoperator.staff.Boss;
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;

public class ColleagueColl {
	
	
	private List<Employee> listOfEmployees;
	private List<BadEmployee> listOfBadEmployees;
	
	private Set<Boss>  setOfBosses;
	
	private List<Staff> listOfStaff;
	private Set<Staff> setOfStaff;
	
	private Set<Staff> sortedSetOfStaff;
	private Set<Staff> sortedSetOfStaff2;
		
//	List< ? extends Staff> listOfStaff;
	
	private Map<Integer, Staff> mapOfStaff;
	
	private Map<Integer, Staff> sortedMapOfStaff;
	private Map<Integer, Staff> sortedMapOfStaff2;
	
	public ColleagueColl() {
		
		listOfEmployees  = new ArrayList<Employee>();
		listOfBadEmployees  = new LinkedList<BadEmployee>();
		
		setOfBosses = new HashSet<Boss>();
		
		listOfStaff = new ArrayList<>();
		setOfStaff = new HashSet<Staff>();
		
		sortedSetOfStaff = new TreeSet<Staff>();
				
//		sortedSetOfStaff2 = new TreeSet<Staff>(new Comparator<Staff>() {
//			public int compare(Staff obj1, Staff obj2) {
//				return obj1.toString().compareTo(obj2.toString());
//			}
//		});
		
//		listOfStaff = new ArrayList<>();                 // List< ? extends Staff> listOfStaff;
		
		mapOfStaff = new HashMap<Integer, Staff>();	
		
		sortedMapOfStaff = new TreeMap<Integer, Staff>();	
		
//		sortedMapOfStaff2 = new TreeMap<Integer, Staff>(new Comparator<Staff>() {
//			public int compare(Staff obj1, Staff obj2) {
//				return obj1.toString().compareTo(obj2.toString());
//			}
//		});
	}
	
	
	public void printInfoStorage(Collection<?> list) {
		for(Object ls : list) {
			System.out.println("============");
			System.out.println(ls.toString());
		}
	}
	
	public void printInfoSize1(Collection<? extends Staff> list) {
			System.out.println("============");
			System.out.println(list.size());
	}
	
	public void printInfoSize2(Collection<? extends Employee> list) {
			System.out.println("============");
			System.out.println(list.size());
	}
	
	public void printInfoStorage(Map<Integer, ?> map, Integer number) {
		System.out.println(map.get(number));
	}
	
		
	public void setListOfEmployees(Employee employee) {
		listOfEmployees.add(employee);		
	}	
		
	public List<Employee> getListOfEmployees() {
		return listOfEmployees;		
	}
	
	public void setListOfBadEmployees(BadEmployee badEmployee) {
		listOfBadEmployees.add(badEmployee);		
	}	
		
	public List<BadEmployee> getListOfBadEmployees() {
		return listOfBadEmployees;		
	}
	
	public void setSetOfBosses(Boss boss) {
		setOfBosses.add(boss);		
	}	
		
	public Set<Boss> getSetOfBosses() {
		return setOfBosses;		
	}
	
	public void setListOfStaff(Staff staff) {
		listOfStaff.add(staff);		
	}	
		
	public List<Staff> getListOfStaff() {
		return listOfStaff;		
	}
	
	public void setSetOfStaff(Staff staff) {
		setOfStaff.add(staff);		
	}	
		
	public Set<Staff> getSetOfStaff() {
		return setOfStaff;		
	}
	

	
	public void setSortedSetOfStaff(Staff staff) {
		sortedSetOfStaff.add(staff);		
	}	
		
	public Set<Staff> getSortedSetOfStaff() {
		return sortedSetOfStaff;		
	}
	
//	public void setListOfStaff(Staff staff) {               // List< ? extends Staff> listOfStaff;
//		listOfStaff.add(staff);		
//	}	
//		
//	public List<Staff> getListOfStaff() {
//		return listOfStaff;		
//	}
	
	public void setMapOfStaff(int number, Staff staff) {
		mapOfStaff.put(number, staff);		
	}	
		
	public Map<Integer, Staff> getMapOfStaff() {
		return mapOfStaff;		
	}
	
	public void setSortedMapOfStaff(int number, Staff staff) {
		sortedMapOfStaff.put(number, staff);		
	}	
		
	public Map<Integer, Staff> getSortedMapOfStaff() {
		return sortedMapOfStaff;		
	}

	
}
