import java.util.Arrays;

public class _10_search_in_string {
    public static void main(String[] args) {
        String name = "deepika";
        char target = 'f';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search_in_array(name, target));
    }
    static boolean Search_in_array(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
           if( target == name.charAt(i)) {
               return true;
             }
           }
        return false;
    }
}
