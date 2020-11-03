package Project1;

import javax.swing.*;
import java.awt.*;

public class Graphics extends JPanel{

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponents(g);
        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

        createLine(g2D);
        createTriangle(g2D);
        createSquare(g2D);
    }

    // Crossing lines
    private void createLine(Graphics2D out) {
        out.setColor(Color.GREEN);
        out.setStroke(new BasicStroke(20));
        out.drawLine(0,0,300,300);
        out.drawLine(300,0,0,300);
    }

    // Creates a square
    private void createSquare(Graphics2D g) {
        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(20));

        int[] x = {50, 250, 250, 50};
        int[] y = {650, 650, 850, 850};

        g.drawPolygon(x, y, 4);
    }

    // Creates a triangle
    private void createTriangle(Graphics2D g) {
        g.setColor(Color.YELLOW);
        g.setStroke(new BasicStroke(20));

        int[] x = {50, 150, 250};
        int[] y = {580, 400, 580};

        g.drawPolygon(x, y, 3);
    }

    // Translate the images
    private void translateImages(Graphics2D g) {
        g.translate(-5, +7);
    }

    // Rotate the images 45 degrees
    private void rotateImages45(Graphics2D g) {
        g.rotate(45.0);
    }

    // Rotate the images 90 degrees
    private void rotateImages90(Graphics2D g) {
        g.rotate(90.0);
    }

    // Scale the images
    private void scaleImages(Graphics2D g) {
        g.scale(2, 0.5);
    }
}
