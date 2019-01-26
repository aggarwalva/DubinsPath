package com.company.Lesterbrary;

public class CSCPath {
    private Arc a1, a3;
    private LineSegment l2;
    private boolean isValid;
    private double length;

    public CSCPath(Arc a1, LineSegment l2, Arc a3){
        this.isValid = true;
        this.a1 = a1;
        this.l2 = l2;
        this.a3 = a3;
        this.length = a1.getLength() + l2.getMagnitude() + a3.getLength();
    }

    public CSCPath(boolean isValid){
        isValid = false;
    }

    public boolean isValid(){
        return isValid;
    }

    public double getLength(){
        return length;
    }

    public Arc getA1(){
        return a1;
    }

    public LineSegment getL2(){
        return l2;
    }

    public Arc getA3(){
        return a3;
    }

    public Pose getPose1(){
        return a1.getPose1();
    }

    public Pose getPose2(){
        return a1.getPose2();
    }

    public Pose getPose3(){
        return a3.getPose1();
    }

    public Pose getPose4(){
        return a3.getPose2();
    }

    public String getEquations(){
        String out = this.getPose1().getEquation();
        out += "\n" + this.getPose4().getEquation();
        out += "\n" + this.a1.getEquation();
        out += "\n" + this.a3.getEquation();
        out += "\n" + this.l2.getEquation();
        return out;
    }
}
