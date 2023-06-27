package java8.code;

public class App {

	public static void main(String[] args) {

//		Printer<Integer> printer = new Printer<>(111);
//		printer.prin();
//
//		Printer<String> printer1 = new Printer<>("gk");
//		printer1.prin();

		Printer<Cat> printer2 = new Printer<>(new Cat("Cat"));
		printer2.prin();

		Printer<Dog> printer3 = new Printer<>(new Dog("Dog"));
		printer3.prin();

		
	}
}
