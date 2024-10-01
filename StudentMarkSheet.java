package com.method_1;

class Marks {
	void Marks(String Name, float Eng, float Mar, float Sci, float Hin, float Math) {
		System.out.println(Name);
		System.out.println("English"+Eng+",Marathi"+Mar+",Science"+Sci+",Hindi"+Hin+",Mathematics"+Math);
		float Add=Eng+Mar+Sci+Hin+Math;
		System.out.println("Total = "+Add );
		float Per;
		Per=Add/500*100;
		System.out.println("Percentage Obtained By Student = "+Per+"%" );
		
	}
}

public class StudentMarkSheet{
	public static void main(String args[]) {
		Marks Student= new Marks();
		Student.Marks("vivek",70.9f,80.0f,70.9f,80.0f,90.0f);
	}
	 
 }
