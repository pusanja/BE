package com.orthofx;

import java.util.Scanner;
import java.util.ArrayList;

public class Samsung extends MobileClass {

	String  sensor;

	public void enter() {
		Scanner read = new Scanner(System.in);
		System.out.println("eneter the model of samsung");
		model = read.next();
		map.put(model, new ArrayList<String>());
		System.out.println("enter the storage of samsung");
		storage = read.next();
		map.get(model).add(storage);
		System.out.println("enter the colour of samsung");
		colour = read.next();
		map.get(model).add(colour);
		System.out.println("enter the sensor type(face or finger");
		sensor = read.next();
		map.get(model).add(sensor);

	}

	public void read() {
		Scanner read = new Scanner(System.in);
		System.out.println("eneter the model of samsung");
		model = read.next();
		if (map.containsKey(model)) {
			System.out.println("storage of the samsung phone is");
			System.out.println(map.get(model).get(0));
			System.out.println("colour of the samsung phone is");
			System.out.println(map.get(model).get(1));
			System.out.println("sensor of the samsung phone is");
			System.out.println(map.get(model).get(2));
		} else
			System.out.println("model of the phone doesnot exist");
	}

	public void edit() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the diplay of samsung");
		model = read.next();
		if (map.containsKey(model)) {
			System.out.println("press 1 for editing storage of samsung");
			System.out.println("press 2 for editing colour of samsung");
			System.out.println("press 3 for editing sensor of the samsung");
			int s = read.nextInt();
			switch (s) {
			case 1:
				System.out.println("enter the new storage of samsung");
				storage = read.next();
				map.get(model).add(0, storage);
				break;
			case 2:
				System.out.println("enter the new colour of samsung");
				colour = read.next();
				map.get(model).add(1, colour);
				break;
			case 3:

				System.out.println("enter the new sensor type");
				sensor = read.next();
				map.get(model).add(2, sensor);
			default:
				System.out.println("not a valid option");
			}

		}

	}

	public void remove() {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the samsung model to remove");
		model = read.next();
		if (map.containsKey(model))
			;
		map.remove(model);
	}

}
