public class multi_dimensional_arrays {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //   System.out.println(flats[1][1]);
        for (int a = 0; a < flats.length; a++) {
            for (int b = 0; b < flats[a].length; b++) {
                System.out.print(flats[a][b]);
                System.out.print(" ");
            }
            System.out.println("\n");


        }
    }
}
