package pl.sdacademy.examples;

public class Parrot extends Animal {
	private String color;

	public Parrot(String name, String color) {
		super(name);
		this.color = color;
	}

	public void talk() {
		System.out.println(name + " wants a cookie!");
	}
}
