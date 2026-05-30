class AnimalConstructor {
    int legs;

    // Animal Birth Instructions
    AnimalConstructor(int legs) {
        this.legs = legs; //this.legs means legs from the class above or parent class and legs after = is legs taken as input from the user/programmer in the main method.
        System.out.println("Animal foundation built with " + legs + " legs.");
    }
}

class Tortoise extends AnimalConstructor {
    boolean hasShell; // by default boolean is alwyas false. 

    // Tortoise Birth Instructions
    Tortoise() {
        super(4); // Calls Animal constructor: "Give me 4 legs!" - this has to go first before modifying anything else in the object.
        this.hasShell = true; // Specific tortoise instruction
        System.out.println("Tortoise shell added.");
    }
}
//**constructor is basically making an object born with something by default. eg: cat will be born with whiskers and camel will be born with hump.

class main {
    public static void main(String[] args) {
        
        Tortoise t = new Tortoise();

        t.hasShell = true;

        //here we dont need methods because the constructor already did half of the work for us. 

    }
}