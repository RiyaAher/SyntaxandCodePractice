public class Devilwearsprada {

    public static void main(String[] args) { 
        StringBuilder miranda = new StringBuilder("Andrea");
        miranda.delete(3, 6); // 6 coz string lenght is n-1, therefore, 6-1 = 5 hence, 3 to 5. 
        System.out.println(miranda);

    }
}
//output should be "And"