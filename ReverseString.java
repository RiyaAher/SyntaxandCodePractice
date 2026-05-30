public class ReverseString {
    public static void main(String[] args) {

        StringBuilder justin = new StringBuilder("Bieber"); //we created a new string called justin which has value => Bieber

        //now we will reverse it using loops
        for(int i = 0; i < justin.length()/2; i++){ //This will loop run until it has reached half the length of the string and replace it (just to make it faster). hence it is divided by 2.
            int front = i; // starting here
            int back = justin.length() - 1 - i; //this because we wanna go the back as i increases everytime and swap it with the corresponding character as i moves, eg: 'b' with 'r', 'i' with 'e' and so on... 

            char frontchar = justin.charAt(front); //get the characters at front index (ith index)
            char backchar = justin.charAt(back); // get characters at back index (justin.length() - 1 - ith index)

            //replace using this method
            justin.setCharAt(front, backchar);
            justin.setCharAt(back, frontchar);
        }
        System.out.println(justin);

    }
}

