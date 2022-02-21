
class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b,double c) {
		return a+b+c;
	}
	static double add(double a,double b,double c,double d) {
		return a+b+c+d;
	}
	static int add(int a,int b,int c,int d,int e) {
		return a+b+c+d+e;
	}
class Methodoveloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(12,23));
		System.out.println(Adder.add(12.34,10.56,14.89));
		System.out.println(Adder.add(2.44,1.69,6.943,4.554));
		System.out.println(Adder.add(3,89,56,23,54));
	}
}
	
	
}
