package Ex19;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setPreferredSize(new Dimension(300,200));
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.drawOval(0, 0, 299, 199);
    }

}