package java8.code;

public class Printer<T extends Animal> {
	T thingToPrint;

	Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void prin() {
		System.out.println("the values is : " + thingToPrint);
	}

}
