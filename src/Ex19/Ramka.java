package Ex19;

import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {

    public Ramka() {
        getContentPane().setLayout(new FlowLayout());
        setBounds(100, 100, 100, 100);
        setLocationRelativeTo(null);
        getContentPane().add(new Panel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ramka();
    }
}