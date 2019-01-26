package com.company.Lesterbrary;

public class Main {

    public static void main(String[] args) {
        /*Point center = new Point(1,0);
        Point a = new Point(-2,0);
        Point b = new Point(Math.sqrt(2)/2 + 1, Math.sqrt(2)/2);

        Arc arc = new Arc(center, 2, a, b, Arc.Direction.RIGHT);

        System.out.println(Math.toDegrees(arc.getAngle()));
        System.out.println(arc.getLength());
        System.out.println(Math.toDegrees(arc.getPose1().getTheta()));
        System.out.println(Math.toDegrees(arc.getPose2().getTheta()));*/


        //CSC PATH
        /*Pose a = new Pose(2,1, 3);
        Pose b = new Pose(7,2,6);

        Circle c = a.getRightCircle(2);
        Circle d = b.getLeftCircle(2);

        LineSegment t = Lester.getRightInnerTangent(c,d);

        System.out.println(a.getEquation());
        System.out.println(b.getEquation());
        System.out.println(c.getEquation());
        System.out.println(d.getEquation());
        System.out.println(t.getEquation());*/

        Pose a = new Pose(2,1, 3);
        Pose b = new Pose(7,2,6);

        CSCPath c = Lester.generateRSLPath(a,b,2);
        System.out.print(c.getEquations());


        //CCC PATH
        /*Pose a = new Pose(2,3,Math.toRadians(28));
        Pose b = new Pose(4,5, Math.toRadians(58));

        Circle c = a.getRightCircle(2);
        Circle d = b.getRightCircle(2);

        Circle left = Lester.getLeftTangentCircle(c,d);

        System.out.println(Lester.getDistance(c.getCenter(),d.getCenter()));
        System.out.println(a.getEquation());
        System.out.println(b.getEquation());
        System.out.println(c.getEquation());
        System.out.println(d.getEquation());
        System.out.println(left.getEquation());*/

        //Pose a = new Pose(2,3, Math.toRadians(28));
        //Pose b = new Pose(4,5, Math.toRadians(58));

        //CCCPath rlr = Lester.generateRLRPath(a,b,2);

        /*Pose p1 = new Pose(2 * 25,3 * 25, Math.toRadians(28));
        Pose p2 = new Pose(4 * 25,5 * 25, Math.toRadians(58));

        CCCPath rlr = Lester.generateRLRPath(p1,p2,50);
        if(rlr.isValid()){
            System.out.println(rlr.getEquations());
            System.out.println(rlr.getA3().getL1().getEquation());
            System.out.println(rlr.getA3().getL2().getEquation());
        } else{
            System.out.print("Invalid");
        }*/
    }
}
