interface Pizzeria { //This is a Functional interface : which means an interface which has a single abstract method like this one. 
    void bake(int temp, String metric); //abstract method, hence it doesnt have a body and an interface only has an abstract method which is by default 'public void' hence no need to write them, it needs to be overidden by the objects in the main method that is calling them.
} 

public class Lambdas { //we ll learn how lambdas function under the hood, they only work with functional interfaces!
    public static void main(String[] args) { // -> is a lambda expression which knows which method you are calling.
        Pizzeria Dominos = (temp, metric) -> System.out.println("Dominos is baking"); //method overriden by the object. No need of curly brackets here coz its a single line of code!
        Dominos.bake(220,"Celcius"); //we pass the arguments here.

        Pizzeria Pizzahut = (temp, metric) -> System.out.println("Pizzahut is baking"); //same
        Pizzahut.bake(180, "Faranheit");

        Pizzeria Ovenstory = (temp, metric) -> { //the reason we have curly brackets here is coz this method has 2 lines of code!
            System.out.print("Ovenstory is baking: ");
            System.out.println("Gourmet Style Pizza 🍕");
        };
        Ovenstory.bake(200,"Celcius"); //we pass the arguments outside of the curly brackets.
    }
}