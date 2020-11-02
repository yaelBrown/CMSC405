package Project1;

import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame frame;
    JPanel panel;

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    Graphics gp1 = new Graphics();

    public GUI() {
        frame = new JFrame("Java 2D Graphics");
        panel = new JPanel();

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation((screen.width - frame.getWidth()) / 2, (screen.height - frame.getHeight())/2 );
        frame.setVisible(true);

//        frame = gp1;
        frame.add(gp1);
    }



}
