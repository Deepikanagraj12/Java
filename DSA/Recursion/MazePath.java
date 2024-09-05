package Recursion;

public class MazePath {
    public static void main(String[] args) {
        path(" ", 3 ,3);
    }
    static void path(String p,int r, int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p +'v',r-1,c);
        }
        if(c>1){
            path(p +'h',r, c-1);
        }
        if(r>1&&c>1){
            path(p +'d',r-1,c-1);
        }
    }
}
