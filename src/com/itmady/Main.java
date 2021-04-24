package com.itmady;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s1 = "Ford";
        String s2 = "Honda";
        String s3 = "Audi";
        String s4 = "Ferrari";
        String s5 = "Lamborgini";

        var cars = new ArrayList<String>();

        cars.add(s1);
        cars.add(s2);
        cars.add(s3);
        cars.add(s4);
        cars.add(s5);
        cars.add("Vaz21010");
        cars.add("Suzuiki");
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

        var cars2 = new ArrayList<String>();
        var numbers = new ArrayList<Integer>();
        cars2.add(s1);
        cars2.add("Chevrolet");
        cars2.add("Vaz2105");
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        System.out.println(cars2);
        System.out.println(numbers);
        System.out.println();
        Collections.sort(cars2);
        Collections.sort(numbers);
        System.out.println(cars2);
        System.out.println(numbers);

        ArrayList<Car> cars3 = new ArrayList<>();

        cars3.add(new Car("Ford", "Mustang27", 1967, 45));
        cars3.add(new Car("Honda","Civic03", 2002, 89 ));
        cars3.add(new Car("Audi", "A7", 1996, 230));
        cars3.add(new Car("BMW", "S1", 2020, 345));
        cars3.add(new Car("Cherry", "Tiigo", 2017, 187));
        cars3.add(new Car("Cherry", "Tiigo", 2017, 187));
        Car car5 = new Car("Cherry3", "Tiigo4", 2017, 187);
        Car car6 = new Car("Cherry344", "Tiigo444", 201734, 187);
        System.out.println(car5.getModel());
        System.out.println(car6.getModel());
        System.out.println("Before sort----------------");
        System.out.println(cars3);
        System.out.println(cars3.hashCode());
        System.out.println();
        System.out.println("After sort-----------------");
        Collections.sort(cars3);
        System.out.println(cars3);

        System.out.println(cars3.get(2).equals(cars3.get(3)));
        System.out.println(cars3.get(0).equals(cars3.get(5)));

    }
}
