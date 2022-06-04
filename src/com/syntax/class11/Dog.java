package com.syntax.class11;

public class Dog {

	String breed;
	String name;
	int age;
	double weight;
	String color;
	double size;
	int lifespan;
	String coatType;
	String coatLength;
	String energyLevel;

	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dogs like to eat bone");
	}

	void jump() {
		System.out.println("Dog jumps");
	}

	void run() {
		System.out.println("Dog runs");

	}
	
	void steal() {
		System.out.println("Dog steals flip flops");
	}

	public static void main(String[] args) {

		Dog husky = new Dog();

		husky.breed = "Husky";
		husky.name = "Togo";
		husky.age = 12;
		husky.weight = 60;
		husky.color = "Dark Grey";
		husky.size = 23.5;
		husky.lifespan = 14;
		husky.coatType = "Double";
		husky.coatLength = "Medium";
		husky.energyLevel = "High Energy";

		husky.run();

		Dog bulldog = new Dog();

		bulldog.breed = "Bulldog";
		bulldog.name = "Tillman";
		bulldog.age = 5;
		bulldog.weight = 50;
		bulldog.color = "Fawn";
		bulldog.size = 15;
		bulldog.lifespan = 10;
		bulldog.coatType = "Smooth";
		bulldog.coatLength = "Short";
		bulldog.energyLevel = "Medium Energy";

		bulldog.eat();

		Dog labrador = new Dog();

		labrador.breed = "Labrador Retriever";
		labrador.name = "Cora";
		labrador.age = 4;
		labrador.weight = 70;
		labrador.color = "Yellow";
		labrador.size = 23.5;
		labrador.lifespan =12;
		labrador.coatType="Double";
		labrador.coatLength="Short";
		labrador.energyLevel="High Energy";
		
		labrador.jump();
		
		Dog maltese = new Dog();
		
		maltese.breed = "Maltese";
		maltese.name = "Rocky";
		maltese.age=1;
		maltese.weight=8.8;
		maltese.color="White";
		maltese.size=9;
		maltese.lifespan=15;
		maltese.coatType="Silky";
		maltese.coatLength="Long";
		maltese.energyLevel="Medium Energy";
		
		maltese.steal();

	}
}
