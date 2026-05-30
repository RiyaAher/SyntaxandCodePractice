abstract class Beverage { //this is an abstract class - meaning this is a requirement that other classes should have 
    String name;

   abstract void prepare(); //has an empty method, meaning this method does nothing on its own but the other classes need to have this, 
//asbstract methods dont have {} - curly braces!
}
//abstract is like a reminder for other subclasses should have in it, they can modify it but they should have it.
class Tea extends Beverage {

    @Override
    void prepare(){
        System.out.println("Steeping the teabags.."); //like this, its overriden but see it can still use abstract methods. 
    }
}

class Main {
    public static void main(String[] args) {
        
        Tea orangepekoe = new Tea(); //we create objects out of subclass
        orangepekoe.name = "Earl Grey";

        orangepekoe.prepare(); //use the method in the subclass.


    }
}