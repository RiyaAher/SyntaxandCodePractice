public class Bubbles {
    public static void main(String[] args){

        int[] arr = {5, 8, 7, 6, 1 , 2}; //given an array

        for(int i = 0; i < arr.length - 1; i++){ //first loop runs through the array
            for(int j = 0; j < arr.length - i - 1; j++) { //secomd loop checks every number in pairs, how?
                if(arr[j] >= arr[j+1]){ // ans. this way, here we are asking is arr[j], i.e 5 more than or equal to the next number (arr[j+1]), i.e 8? if yes then,
                    //swap
                    int temp = arr[j]; //the orange juice example
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 

            }
        } 
        for(int num : arr){ //for each num in the array, print each sorted number
            System.out.print(num + " "); 
        }
        System.out.println(); //just to give a new line after the new array
    }
}