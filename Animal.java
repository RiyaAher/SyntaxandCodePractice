public class Animal {
    int age;
    String name;

    void celebrateBirthday() {
        int newage = age + 1;
        System.out.println("I turned " + newage + " years old!");
    }

    public static void main(String [] args){

        Animal Dog = new Animal();
        Dog.age = 2;
        Dog.name = "Ronnie";

        Dog.celebrateBirthday();

    }
}