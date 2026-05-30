public class Car {
    double fuel; //we create fields (data = variables) and methods (functions - for actions) inside the class.
    
    void fuelLevel(double distance) { // we create function to link with the data. (do something) - action for the variable - #create function that takes parameters as distance.
        fuel = fuel - (distance * 0.1); //takes data from the class
        System.out.println("your car drove for " + distance + " kms and your gas level is " + fuel + " litres"); //function does this 
    }

    public static void main(String [] args){ 

        Car Honda = new Car(); //now we create object from the data and method i.e variable + functions.
        Honda.fuel = 17.25; //assign it as per the data

        Honda.fuelLevel(10); //update as per data given.
    }
}