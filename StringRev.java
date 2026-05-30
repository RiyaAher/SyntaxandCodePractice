public class StringRev {
    public static void main(String[] args){
        
        //create a stringbuilder
        StringBuilder name = new StringBuilder("Megan");

        //go on each letter of the name and reverse it.
        for(int i = 0; i < name.length()/2; i++){
            int front = i;
            int back = name.length() - 1 - i;
        
            //go to the characters 
            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            //replace them
            name.setCharAt(front, backchar);
            name.setCharAt(back, frontchar);
        }
        System.out.println(name); //print replaced characters 
        
    }
}