public class SelectionSort {
    public static void main (String[] args) {

        int[] arr = {4, 9, 5, 3, 6, 0}; //array

        for(int i = 0; i < arr.length - 1; i++) { //for loop starts at i so will start at 4
            for (int j = i + 1; j < arr.length; j++) { //for loop starts at i = 1, so will start at 9
                if (arr[j] < arr[i]){ //if i is less than j, swap
                    //swap
                    int temp = arr[i]; //orange juice example.
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int num : arr){ //for each sorted number in the array, 
            System.out.print(num + " "); //print this
        }
        System.out.println(); //just to give me a next line

    }

}

//here we are not checking pairs, we are checking one element in the entire lot, not just comparing adjacent pairs.