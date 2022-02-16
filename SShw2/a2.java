import java.util.Scanner;

public class a2 {
    public a2(Scanner sc){
        System.out.println("Set size of randomized array to retrieve max value from.");
        int x=sc.nextInt();
        int[] a=new int[x];
        for(int i=0;i<x;i++){
            int rand = (int) Math.floor(Math.random()*(100-2)+1);
            System.out.println(rand+" will be added to the array at index "+i);
            a[i]=rand;
        }
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=i;
            }
        }
        System.out.println("The largest value of this array is "+a[max]+"which is at index "+max);
    }
}
