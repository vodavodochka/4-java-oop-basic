package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;


    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public String toString() {
        return String.format("start point: %s; end point: %s", point1.toString(), point2.toString());
    }

    public boolean isCollinearLine(Point p) {
        return ((p.getX() - point1.getX())/(point2.getX() - point1.getX()) == (p.getY() - point1.getY())/(point2.getY()- point1.getY()));
    }
}
