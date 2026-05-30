public class Newarray {
    public static void main(String[] args) { 
         
        int score[] = new int[3];

        score[0] = 34;
        score[1] = 23;
        score[2] = 45;

        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
    }
}