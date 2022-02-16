import java.awt.*;
import javax.swing.*;

public class circle extends JPanel implements shape {
    int r;
    public circle(){
        r=2;
    }
    public void paintComponent(Graphics g) {
        g.drawOval(50, 50, r*200, r*200);
    }
    public void display(){
        JFrame window = new JFrame("Demo Circle");
        window.add(new circle());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setBackground(Color.white);
        window.setVisible(true);
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
    
}
