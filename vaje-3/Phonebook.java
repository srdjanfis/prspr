package com.srdjan;

import java.util.*;

class Phonebook{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many records would you like to enter: ");
		int n=in.nextInt();
		in.nextLine();
		HashMap<String,Integer> h = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			System.out.print("Name: ");
			String name=in.nextLine();
			System.out.print("Number: ");
			int phone=in.nextInt();
			h.put(name, Integer.valueOf(phone));
			in.nextLine();
		}
		Integer temp;
		System.out.print("Now write a name and I fill find the number: ");
		while(in.hasNext())
		{
			String s=in.nextLine();
			temp = h.get(s);
			if(temp!=null){
				System.out.println(s+"="+temp);
			}else{
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
