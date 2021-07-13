package com.solvd.mobileoperator.vector;

import java.util.Comparator;

public class VectorComparator implements Comparator<Vector> {
	public int compare(Vector obj1, Vector obj2) {
		return obj1.getLength().compareTo(obj2.getLength());
	} 
}