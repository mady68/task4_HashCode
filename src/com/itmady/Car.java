package com.itmady;

import java.util.*;


public class Car implements Comparable<Car> {

    private String company;
    private String model;
    private int year;
    private int power;


    Car(String company, String model, int year, int power){

        this.model = model;
        this.year = year;
        this.power = power;
        this.company = company;
    }

    /*redefine method compareTo()

     */
    @Override
    public int compareTo(Car otherCar){
        return this.company.compareTo(otherCar.getCompany());
    }

    // setters:
    public void setCompany(String company){this.company = company;}
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}
    public void setPower(int power){this.power = power;}
    // getters:
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getPower(){
        return power;
    }
    public String toString() {return company+" "+model;}

    @Override
    public int hashCode(){
        //System.out.println("this is hashcode for object: "+ this.company + " " + this.model);
        int i = (int) new Date().getTime();
        Random rnd = new Random();
        int j = rnd.nextInt();
        //System.out.println(i);
        //System.out.println(j);
        return  (int)(((Math.sqrt(year+company.length()+model.length()))*i*j));

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            if (this.company.equals(car.company) &&
                    this.model.equals(car.model) &&
                    this.power == car.power &&
                    this.year == car.year) {
                return true;
            }
        }
        return false;
    }



}
