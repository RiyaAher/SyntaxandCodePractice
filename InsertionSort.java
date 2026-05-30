public class InsertionSort {

    public static void main (String[] args){

        int[] arr = {4, 3, 1, 6, 0, 5};

        for(int i = 1; i < arr.length; i++){ //unsorted section
            int current = arr[i]; // we are storing i's value in this container so that it doesnt get lost in the programme.
            int j = i - 1; // sorted section
            while (j >= 0 && current < arr[j]){ //until j is greater than equal to 0, we ll keep tracking it and replacing it so that the Array doesnt go beyond 0 and until current value which is at ith location (3) is greater than element at j's location (4), keep tracking. 
               arr[j + 1] = arr[j]; // if both the conditions meet, we move the largest element to the right 
               j--; //keep moving left and keep making space for the smallest item.
            }
         //placement
         arr[j+1] = current; //asa the "current < arr[j]" is dissatisfied, we do this. 
        }
        for(int num : arr){
            System.out.print(num + " "); 
        }
        System.out.println();
    }
        
}
        