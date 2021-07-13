package com.solvd.mobileoperator.vector;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.Comparator;
import java.util.stream.Collectors;


public class VectorFunctionalUtils {
	
	//1.1
    public static List<Vector> generate(int n, IntSupplier supplier){
        List<Vector> listOfVectors = new ArrayList<>();
        for (int i = 0; i < n; i++){
        	listOfVectors.add(new TriCoordVector(supplier.getAsInt(), supplier.getAsInt(), supplier.getAsInt()));
        }
        return listOfVectors;
    }
   
   //2.1, 2.2 
   public static List<Vector> sort (List<Vector> listOfVectors, Comparator<Vector> vectorsComparator){
       List<Vector> newListOfVectors = new ArrayList<>(listOfVectors);
       return newListOfVectors.stream().sorted(vectorsComparator).collect(Collectors.toList());
   }
   
   //3.1, 3.2
   public static List<Long> map(List<Vector> mapListOfVectors, Function<Vector, Long> mapFunction){
        List<Vector> newListOfVectors = new ArrayList<>(mapListOfVectors);
        return newListOfVectors.stream().map(mapFunction).collect(Collectors.toList());
   }
}