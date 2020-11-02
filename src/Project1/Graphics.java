package Project1;

import javax.swing.*;
import java.awt.*;

public class Graphics extends JPanel{

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponents(g);
        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.GREEN);
        g2D.setStroke(new BasicStroke(20));
        g2D.drawLine(0,0,300,300);
    }



}
