import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("dummy.txt");
        Scanner sc = new Scanner(file);
        new a1();
        new a2();
        new a3(sc);
        sc.close();
    }
}
