package inheritance;

public class child_box extends Box {
    double weight  ;

       child_box(){
       this.weight=4;
    }
       child_box(double weight,double h,double l, double w){
           super(l,w,h);
           this.weight=weight;
       }
}

