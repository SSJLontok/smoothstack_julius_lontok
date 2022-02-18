import java.io.IOException;
import java.util.Scanner;

public class a3 {
    public a3(Scanner sc) throws IOException{
        String content="";
        int output=0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            content = content.concat(line + " ");
        }
        for(int i=0;i<content.length();i++){
            if(content.charAt(i)=='e'){
                output++;
            }
        }
        System.out.println("Number of 'e' in dummy.txt: " + output);
        return ;
    }
}
