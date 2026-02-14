package com.example.task05;


public class PolygonalLine {

    private Point[] points;


    public void setPoints(Point[] points) {
        Point[] newArray = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            newArray[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newArray;
    }

    public void addPoint(Point point) {
        if (this.points == null) {
            this.points = new Point[]{
                    new Point(point.getX(), point.getY())
            };
            return;
        }

        Point[] newArray = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, newArray, 0, this.points.length);
        newArray[this.points.length] =
                new Point(point.getX(), point.getY());
        this.points = newArray;
    }


    public void addPoint(double x, double y) {
        if (this.points == null){
            this.points = new Point[] {new Point(x,y)};
            return;
        }

        Point[] newArray = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, newArray, 0, this.points.length);
        newArray[this.points.length] = new Point(x, y);
        this.points = newArray;
    }

    public double getLength() {
        double length = 0;
        if (this.points == null || this.points.length == 1) {
            return 0;
        }

        for (int i = 1; i < this.points.length; i++) {
            length += this.points[i-1].getLength(this.points[i]);
        }
        return length;
    }

}
