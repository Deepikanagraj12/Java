package inheritance;

public class Box {
    double l;
    double w;
    double h;
    double side;

        Box(){
        this.l=1;
        this.w=1;
        this.h=1;
        }
       Box(double l, double w, double h){
       this.l=l;
        this.w=w;
        this.h=h;
       }
       Box(double side){

            this.l=side;
            this.h=side;
            this.w=side;
       }
           Box(Box old){
            this.l=old.l;
            this.h= old.h;
            this.w=old.w;
           }

}
