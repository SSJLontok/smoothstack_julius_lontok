import java.awt.*;
import javax.swing.*;

public class rectangle extends JPanel implements shape {
    int x;
    int y;
    public rectangle(){
        //creates a demo rectangle with arbitrarily assigned parameters set by dev
        x=3;
        y=4;
    }
    public void paintComponent(Graphics g) {
        g.drawRect(50, 50, x*100, y*100);
    }
    public void display(){
        JFrame window = new JFrame("Demo Rectangle");
        window.add(new rectangle());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setBackground(Color.white);
        window.setVisible(true);
    }
    public double calculateArea(){
        return x*y;
    }
}
