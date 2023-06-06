package com.srdjan;
import java.util.*;
class AvgMedian{
	public static void main(String []argh)
	{
		ArrayList<Double> lDouble = new ArrayList<Double>();
		lDouble.add(2.54);
		lDouble.add(0.33322);
		lDouble.add(-1.2222);
		lDouble.add(0.004);
		lDouble.add(0.54443);
		System.out.println("Average: " + average(lDouble));
		System.out.println("Median: " + median(lDouble));
	}
	public static double median(ArrayList<Double> values) {
        Collections.sort(values);
        if (values.size() % 2 == 1)
            return values.get(((values.size() + 1) / 2) - 1);
        else {
            double lower = values.get((values.size() / 2) - 1);
            double upper = values.get(values.size() / 2);
            return (lower + upper) / 2.0;
        }
    }
	public static double average(ArrayList<Double> values) {
        double sum = 0;
        for(Double d: values) {
        	sum += d;
        }
        return sum/values.size();
    }
}
