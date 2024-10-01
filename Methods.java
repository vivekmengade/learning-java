package com.method_1;

public class Method {
	void show(String MName , String Director , String Actor , int Budget  ) {
		System.out.println(MName);
		System.out.println(Director);
		System.out.println(Actor);
		System.out.println(Budget);
	}
	public static void main(String args[]) {
		Student M1= new Student();
		M1.show("movie1","director1", "Actor1", 10000);
		System.out.println();
		M1.show("movie2","director2","actor2",20000);
	}

  System.out.println("New Practice Question")
  void Add(int x,int y) {
		int res=x+y;
		System.out.println(res);
	}
	void Sub (int x,int y) {
		int res=x-y;
		System.out.println(res);
	}
	public static void main(String args[]) {
		int a=5;
		int b=6;
		Student Num = new Student();
		Num.Add(a, b);
		Num.Sub(a, b);
	}
}
