public class Swap {

    //swapping using a third variable.
    public static void main (String[] args){
        //two containers
        int a = 30;
        int b = 40;

        //create a new third empty container(variable) and add 'a' in it.
        int temp = a;

        //now that 'a' is empty, so we can add 'b' in it.
        a = b;

        //now that 'b' is empty, we can add 'temp' in it. 
        b = temp;

        //if you get confused, always remember the orange juice and apple juice technique. 

     //Swapping without a third variable - just like math.

     a = a + b;
     b = a - b;
     a = a - b;

     //here we are using math formula but its slower than temp formula. People usually use the temp method.


    }
}



