package com.solvd.mobileoperator.vector;

import java.util.List;

import java.time.LocalDate; // temporary

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


/**
 * @author asemenkov
 * @since Jun 29, 2021
 */
public class Main {

    public static void main_(String[] args) {
        List<TriCoordVector> vectors = VectorCollectionsUtil.generateVectors(10);
        double median = VectorCollectionsUtil.getMedianLength(vectors);
        List<TriCoordVector> removalList = VectorCollectionsUtil.removeShorterVectors(vectors, median);
        int intersections = VectorCollectionsUtil.countIntersection(vectors, removalList);
    }

    public static void main(String[] args) {

        TriCoordVector v1 = new TriCoordVector(1, 2, 3);
        Vector v2 = new TriCoordVector(4, 5, 6);
        VectorMultipliable<TriCoordVector> v3 = new TriCoordVector(7, 8, 9);

        double cos = v1.getCosAngle(v2);
        double scalar = v2.getScalarProduct(v1);

        
        
        // 1.2, 1.3
        Random r = new Random(0);
        // Using Lambda Expression
        List<Vector> vectors01 = VectorFunctionalUtils.generate(10,() -> LocalDate.now().getYear());

        // Passing as Method Parameter
        List<Vector> vectors02 = VectorFunctionalUtils.generate(10,() -> new Random().nextInt(100));
        //                                                         () -> (int)(Math.random() * 100)
        
        // Using Method Reference
        List<Vector> listOfVectors = VectorFunctionalUtils.generate(10,r::nextInt);
        //                                                        r.nextInt() 
        
        System.out.println("====== Initial ======");
        for (int i = 0; i < listOfVectors.size(); i++) {
        	System.out.println(listOfVectors.get(i).getLength() + "," + listOfVectors.get(i).getScalarProduct(listOfVectors.get(i)) + "," + listOfVectors.get(i).getCosAngle(listOfVectors.get(i)));   	
        }
        
        
        
        //2.3, 2.4
        Comparator<Vector> vectorsComparator = (obj1, obj2) -> {
        	if (obj1.getLength() > obj2.getLength()) return -1;
        	else if (obj1.getLength() < obj2.getLength()) return 1;
        	else return 0;
        };
                
        listOfVectors = VectorFunctionalUtils.sort(listOfVectors,vectorsComparator);
 	   
        System.out.println("====== Sorted ======");
        for (int i = 0; i < listOfVectors.size(); i++) {
        	System.out.println(listOfVectors.get(i).getLength() + "," + listOfVectors.get(i).getScalarProduct(listOfVectors.get(i)) + "," + listOfVectors.get(i).getCosAngle(listOfVectors.get(i)));   	
        }
        
// 	    listOfVectors = VectorFunctionalUtils.sort(listOfVectors,VectorComparator);
//  	   
//        System.out.println("====== Sorted 2 ======");
//        for (int i = 0; i < listOfVectors.size(); i++) {
//        	System.out.println(listOfVectors.get(i).getLength() + "," + listOfVectors.get(i).getScalarProduct(listOfVectors.get(i)) + "," + vectors.get(i).getCosAngle(listOfVectors.get(i)));   	
//        }
        
        //20:20
        

    }

}
