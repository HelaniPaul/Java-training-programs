class Food{
	void fooding() {
		System.out.println("variety");
	}
}
class Pizza extends Food{
	void fooding() {
		System.out.println("chicken pizza");
	}
}
class Burger extends Food{
	void fooding() {
		System.out.println("Vegetarian Burger");
	}
}
class Fruits{
	void sweet() {
		System.out.println("sweetness");
	}
}
class Apple extends Fruits{
	void sweet() {
		System.out.println("Red Apple");
	}
}
class Grapes extends Fruits{
	void sweet() {
		System.out.println("Green Grapes");
	}
class Method_Overridding{
	public static void main(String[] args) {
		Food f;
		f = new Pizza();
		f.fooding();
		f = new Burger();
		f.fooding();
		Fruits fr;
		fr = new Apple();
		fr.sweet();
		fr = new Grapes();
		fr.sweet();
	}
}
}