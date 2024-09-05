public class _14_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 4}
        };
        System.out.println(Maxwealth(accounts));
    }

    static int Maxwealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                 rowsum += accounts[person][account];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
