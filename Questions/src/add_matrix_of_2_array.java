public class add_matrix_of_2_array {
    public static void main(String[] args) {
        int[][] a1={{1,2,3},
                    {4,5,6}};

        int[][] a2={{7,8,9},
                    {4,6,8}};

        int[][] result={{0,0,0},
                        { 0,0,0}};

            for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){

                result[i][j] = a1[i][j]+a2[i][j];
                System.out.print(result[i][j]+" ");

            }
                System.out.println(" ");
        }
    }
}
