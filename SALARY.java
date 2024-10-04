package com.method_1;

	class Salary{
		static int da;
		static int hra;
		static int ta;
		static int pt;
		static int pf;
		static double salary;
		static double gross_salary;
		static double net_salary;
		
		public double DA() {
			Double da=(salary*10)/100;
			return da;
		}
		
		public double HRA() {
			double hra=(salary*15)/100;
			return hra;
		}
		
		public double TA() {
			double ta=(salary*20)/100;
			return ta;
		}
		
		public double PT() {
			double pt=(salary*15)/100;
			return pt;
		}
		
		public double PF() {
			double pf=(salary*10)/100;
			return pf;
		}
		
		public double GROSS_SALARY() {
			gross_salary=salary+da+hra+ta;
			return gross_salary;
		}
		
		public double NET_SALARY(){
			Salary obj=new Salary();
			net_salary=obj.GROSS_SALARY()+(PF()+PT());
			return net_salary;
		}
		
	}
	public class SALARY{
		
	public static void main(String args[]) {
		SALARY salary = new SALARY();
		salary.salary=500000;
		System.out.println("DA = "+salary.DA());
		System.out.println("HRA = "+salary.HRA());
		System.out.println("TA = "+salary.TA());
		System.out.println("PT = "+salary.PT());
		System.out.println("PF = "+salary.PF());
    System.out.println("GROSS_SALARY = "+salary.GROSS_SALARY());
		System.out.println("NET_SALARY = "+salary.NET_SALARY());
	}
	
	}
	
