package com.skrbics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class BubbleSort {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for(int i=0;i<cars.size()-1;i++) {
    	for(int j=0;j<cars.size()-1;j++) {
        	if(cars.get(j).compareTo(cars.get(j+1))>0) {
        		Collections.swap(cars, j, j+1);
        	}
        }
    }
    Iterator<String> it = cars.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
  }
}
