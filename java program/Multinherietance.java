class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class Dogs extends Animal{
	void bark(){
		System.out.println("Barking");
	}
	
}
class Cat extends Dogs{
	void meow(){
		System.out.println("meowing");
	}
}
class Multinherietance{
	public static void main(String[] args){
		Cat a= new Cat();
		a.meow();
		a.bark();
		a.eat();
	}
}