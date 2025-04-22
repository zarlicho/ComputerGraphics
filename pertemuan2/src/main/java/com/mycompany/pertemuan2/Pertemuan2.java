package com.mycompany.pertemuan2;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.*;
import java.awt.Polygon;

public class Pertemuan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("pertemuan 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        MainPanel panel = new MainPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}

public class MainPanel extends JPanel {
    public MainPanel() {
        JLabel label = new JLabel("test kotak");
        add(label);
        this.setBackground(new Color(255,255,255));
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int[][] koordinats = {
            // Segitiga
            {10, 10, 100, 10},
            {10, 10, 100, 100},
            {100, 10, 100, 100},
            // Jajar Genjang
            {150, 10, 300, 10}, 
            {200, 100, 350, 100},
            {150, 10, 200, 100},
            {300, 10, 350, 100}
        };
        for (int[] koordinat : koordinats) {
            Line2D gariss = new Line2D.Float(koordinat[0], koordinat[1], koordinat[2], koordinat[3]);
            // g2.draw(gariss);
        }
        g2.setColor(new Color(255, 0, 0));
        Ellipse2D.Double circle = new Ellipse2D.Double();
        circle.setFrame(104,150,100,100);
        g2.fill(circle);
        //elipse
        g2.setColor(Color.ORANGE);
        Ellipse2D.Double elipse = new Ellipse2D.Double();
        elipse.setFrame(230,230,50,200);
        g2.fill(elipse);

        Polygon ruang = new Polygon();
        ruang.addPoint(130,10);
        ruang.addPoint(170,30);
        ruang.addPoint(260,0);
        ruang.addPoint(300,30);
        ruang.addPoint(300,80);
        ruang.addPoint(100,100);
        ruang.addPoint(130,10);
        g2.setColor(Color.BLUE);
        g2.fill(ruang);

        Polygon segitiga = new Polygon();
        // panah.addPoint(130,10);
        segitiga.addPoint(10,10);
        segitiga.addPoint(100,10);
        segitiga.addPoint(100,100);
        g2.setColor(Color.GREEN);
        g2.fill(segitiga);
    }
}
