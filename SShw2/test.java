import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            //new a1(sc);
            //new a2(sc);
            sc.close();
            shape x=new rectangle();
            x.display();
            System.out.println("Demo rectangle's area is "+x.calculateArea());
            x=new circle();
            x.display();
            System.out.println("Demo circle's area is "+x.calculateArea());
            x=new triangle();
            x.display();
            System.out.println("Demo triangle's area is "+x.calculateArea());

    }
}