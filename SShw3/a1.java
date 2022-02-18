import java.io.File;

public class a1 {
    public a1(){
        String[] contents;
        File folder = new File("folder");
        System.out.println("Contents of sample folder:");
        contents = folder.list();
        for (String path : contents) {
            System.out.println(path);
        }
        return;
    }
}
