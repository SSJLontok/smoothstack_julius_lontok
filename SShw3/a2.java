import java.io.FileWriter;
import java.io.IOException;

public class a2 {
    public a2() {
        try {
            FileWriter fw = new FileWriter("dummy.txt", true);
            fw.write("\n" + "eeeee");
            fw.close();
        } catch (IOException e) {
            System.out.println("AAAAAAAAAAAAAAAAAAAA");
        }
    }
}
