import java.awt.*;
import javax.swing.*;

public class triangle extends JPanel implements shape {
    int x;
    int y;
    public triangle(){
        x=3;
        y=4;
    }
    public void paintComponent(Graphics g) {
        int [] xCoord = {50, 50+x*100 , 50};
        int [] yCoord = {50, 50+y*100, 50+y*100};
        g.drawPolygon(xCoord, yCoord, 3);
    }
    public void display(){
        JFrame window = new JFrame("Demo Triangle");
        window.add(new triangle());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setBackground(Color.white);
        window.setVisible(true);
    }
    public double calculateArea(){
        return (x*y)/2;
    }
    
}
