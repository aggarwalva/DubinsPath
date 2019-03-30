package com.company.Display;

import com.company.Lesterbrary.*;
import com.company.Lesterbrary.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class DrawLester extends JPanel {

    private void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(320,0,320,480);
        g2d.drawLine(0, 240, 640, 240);

        //long time = System.currentTimeMillis();
        Pose p1 = new Pose(-34,5, Math.toRadians(0));
        Pose p2 = new Pose(100,182, Math.toRadians(45));

        /*CCCPath rlr = Lester.generateRLRPath(p1,p2,50);
        CCCPath lrl = Lester.generateLRLPath(p1,p2,50);
        CSCPath rsr = Lester.generateRSRPath(p1,p2,50);
        CSCPath lsl = Lester.generateLSLPath(p1,p2,50);
        CSCPath rsl = Lester.generateRSLPath(p1,p2,50);
        CSCPath lsr = Lester.generateLSRPath(p1,p2,50);

        System.out.println("Elapsed Time: " + (System.currentTimeMillis() - time));*/

        long time = System.currentTimeMillis();

        DubinsPath shortest = Lester.generateDubinsPath(p1, p2, 50);
        System.out.println("Elapsed time 2: " + (System.currentTimeMillis() - time));

        System.out.println("Shortest length: " + shortest.getLength());

        g2d.setColor(Color.BLUE);
        Utils.drawDubinsPath(shortest, g2d, "Path");

        /*g2d.setColor(Color.BLUE);
        Utils.drawCCCPath(rlr, g2d, "RLR");
        g2d.setColor(Color.BLACK);
        Utils.drawCCCPath(lrl, g2d, "LRL");
        g2d.setColor(Color.RED);
        Utils.drawCSCPath(rsr, g2d, "RSR");
        g2d.setColor(Color.CYAN);
        Utils.drawCSCPath(lsl, g2d, "LSL");
        g2d.setColor(Color.GREEN);
        Utils.drawCSCPath(rsl, g2d, "RSL");
        g2d.setColor(Color.MAGENTA);
        Utils.drawCSCPath(lsr, g2d, "LSR");*/
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
}
