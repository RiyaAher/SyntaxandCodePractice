public class Thermostat {
    private double temperature; //double so that we can get decimals plus its private.

    public void settemperature(double temp) { //we are only giving access to change it to a certain range.
        if (temp <= 25){
            temperature = temp;
        } else {
            System.out.println("Temperature cannot be more than 25 degrees!");
        }
    }

    public double getTemperature() { //we create getters for other programs to only read, not use it. 
        return this.temperature;
    }
}

//I have purposely created a different class to run the main method and to test whether the code shows error or not, since I am creating the object in a different class.
class Amazonecho {
     public static void main(String [] args){

        Thermostat amazon = new Thermostat();
        amazon.temperature = 27; // this is the compile error - since double temperature is a private variable - this is the error I wanted.

        amazon.settemperature(26);
    }

}