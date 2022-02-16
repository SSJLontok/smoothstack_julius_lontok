import java.util.Scanner;

public class a1{
    public a1(Scanner sc){
        int output=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(5-i)+" more numbers.");
            output+= sc.nextInt();
        }
        System.out.println("The sum of the provided "+5+" numbers is "+output);
    }
}