public class Second {
    public static void main(String[] args){

        int rows[]{} = new int[3];
        int cols[] =ew int[4];

        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < cols.length; j++){
                int result = (rows[i] * cols[j]);
                System.out.print(result);
            }
            System.out.println();
        }
    }
}