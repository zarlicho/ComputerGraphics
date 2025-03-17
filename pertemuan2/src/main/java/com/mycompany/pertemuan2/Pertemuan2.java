package com.mycompany.pertemuan2;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Pertemuan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set frame size

        MainPanel panel = new MainPanel(); // Ensure MainPanel exists
        frame.add(panel);

        frame.setVisible(true);
    }
}

public class MainPanel extends JPanel {
    public MainPanel() {
        JLabel label = new JLabel("Humam Kon**ol!");
        add(label);
        this.setBackground(new Color(255,255,255));
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // float Line = new Line2d.Float(10,10,100,10);
        g2.draw(new Line2D.Double(10,10,100,10));
        g2.draw(new Line2D.Double(100,10,100,100));
        g2.draw(new Line2D.Double(100,10,100,100));
    }
}
