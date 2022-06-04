package com.syntax.class11;

public class Phone {

	String brand;
	String model;
	int year;
	String condition;
	String color;
	String operatingSystem;
	String simCardType;
	double wSize;
	double hSize;
	double dSize;
	double mass;
	int storageMemory;

	void call() {
		System.out.println("Makes a call");
	}

	void photo() {
		System.out.println("Takes a photo");
	}

	void message() {
		System.out.println("Send the text message");
	}

	void video() {
		System.out.println("Takes a video");
	}

	void app() {
		System.out.println("Runs the application");
	}

	void gps() {
		System.out.println("Receive a gps posittion");
	}

	public static void main(String[] args) {

		Phone iPhone13 = new Phone();

		iPhone13.brand = "Apple";
		iPhone13.model = "iPhone 13";
		iPhone13.year = 2021;
		iPhone13.condition = "new";
		iPhone13.color = "Starlight";
		iPhone13.operatingSystem = "iOS";
		iPhone13.simCardType = "Nano-Sim";
		iPhone13.wSize = 71.5;
		iPhone13.hSize = 146.7;
		iPhone13.dSize = 7.65;
		iPhone13.mass = 174;
		iPhone13.storageMemory = 512;

		iPhone13.call();

		Phone pixel = new Phone();

		pixel.brand = "Google";
		pixel.model = "Pixel 5a";
		pixel.year = 2021;
		pixel.condition = "new";
		pixel.color = "Black";
		pixel.operatingSystem = "Android";
		pixel.simCardType = "Nano-Sim";
		pixel.wSize = 73.7;
		pixel.hSize = 154.9;
		pixel.dSize = 7.6;
		pixel.mass = 183;
		pixel.storageMemory = 128;

		pixel.photo();

		Phone samsung = new Phone();

		samsung.brand = "Samsung";
		samsung.model = "Galaxy M52";
		samsung.year = 2021;
		samsung.condition = "New";
		samsung.color = "Light Blue";
		samsung.operatingSystem = "Android";
		samsung.simCardType = "Nano-Sim";
		samsung.wSize = 76.4;
		samsung.hSize = 164.4;
		samsung.dSize = 7.4;
		samsung.mass = 173;
		samsung.storageMemory = 128;

		samsung.gps();

	}
}
