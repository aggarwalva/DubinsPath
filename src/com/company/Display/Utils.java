package com.company.Display;

import com.company.Lesterbrary.*;
import com.company.Lesterbrary.Point;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

public class Utils {
    public static Point convertCoordinates(Point p, double x, double y){
        double a = p.getX() + x/2;
        double b = -p.getY() + y/2;
        return new Point(a,b);
    }

    public static double convertAngle(double theta){
        return -theta + 90;
    }

    public static void drawArc(Arc a, Graphics2D g){
        Point convertedCenter = convertCoordinates(a.getCenter(), 640, 480);
        double angle1 = convertAngle(Math.toDegrees(a.getL1().getTheta()));
        double angle2 = Math.toDegrees(a.getAngle()) * ((a.getDirection() == Arc.Direction.LEFT) ? 1 : -1);
        Arc2D.Double arc = new Arc2D.Double(convertedCenter.getX() - a.getRadius(), convertedCenter.getY() - a.getRadius(), a.getRadius()*2, a.getRadius()*2, angle1, angle2, Arc2D.OPEN);
        g.draw(arc);
    }

    public static void drawLineSegment(LineSegment l, Graphics2D g){
        Point c1 = convertCoordinates(l.getA(), 640,480);
        Point c2 = convertCoordinates(l.getB(),640,480);
        Line2D line = new Line2D.Double(c1.getX(), c1.getY(), c2.getX(), c2.getY());
        g.draw(line);
    }

    public static void drawCCCPath(CCCPath c, Graphics2D g, String name){
        if(c.isValid()){
            Utils.drawArc(c.getA1(), g);
            Utils.drawArc(c.getA2(), g);
            Utils.drawArc(c.getA3(), g);
            System.out.println(name + " length: " + c.getLength());
        } else{
            System.out.println(name + " is invalid");
        }
    }

    public static void drawCSCPath(CSCPath c, Graphics2D g, String name){
        if(c.isValid()){
            Utils.drawArc(c.getA1(), g);
            Utils.drawLineSegment(c.getL2(), g);
            Utils.drawArc(c.getA3(), g);
            System.out.println(name + " length: " + c.getLength());
        } else{
            System.out.println(name + " is invalid");
        }
    }
}
