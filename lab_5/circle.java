import java.util.Scanner;
class area{
    double radious;
    double area;

    public area(double radious){
        this.radious=radious;
        this.area = Math.PI*radious*radious;
    }
    public double PrintArea (){
        return area;
    }
}
public class circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radious =");
        double radious = sc.nextDouble();
        area a1 = new area(radious);
        double PrintArea = a1.PrintArea();
        sc.close();
        System.out.println("Radious ="+radious+"then area ="+PrintArea);
    }
}