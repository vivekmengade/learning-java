package com.method_1;

	public class Method_Chain{
		
	 public void Country( String c1 , String c2 ,String c3){
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 state("maharshtra","UP","Goa");
		 
	 }
		public void state(String  s1,String s2,String s3) {
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			Dist("Pune","Satara","Ratnagiri");
		}
		public void Dist(String d1, String d2, String d3) {
			System.out.println(d1+","+d2+","+d3);
		}
		public static void main(String args[]) {
			Method_Chain Country= new Method_Chain();
			Country.Country("India", "USA", "uk");
		}
 }


	
