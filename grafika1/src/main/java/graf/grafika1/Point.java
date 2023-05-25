package graf.grafika1;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Point {
    private double x;
    private double y;
    private double z;
    private double step = 5.0;
    private double alpha = Math.toRadians(8);
    private double d =200;


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double get2DX() {
        return x/z*d;
    }

    public double get2DY() {
        return y/z*d;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void translateX(boolean direction) {
        if (direction)
            this.x = this.x - step;
        else
            this.x = x + step;
    }

    public void translateY(boolean direction) {
        if (direction)
            this.y = this.y + step;
        else
            this.y = y - step;
    }

    public void translateZ(boolean direction) {
        if (direction) {
            this.z = this.z + step;
        } else {
            this.z = z - step;
        }
    }

    public void rotateX(boolean direction) {
        if (direction) {
            this.y = (cos(alpha) * (y)) - (sin(alpha) * z);
            this.z = (sin(alpha) * (y)) + (cos(alpha) * z);
        } else {
            this.y = (cos(-1.0 * alpha) * (y)) - (sin(-1.0 * alpha) * z);
            this.z = (sin(-1.0 * alpha) * (y)) + (cos(-1.0 * alpha) * z);
        }
    }

    public void rotateY(boolean direction) {
        if (direction) {
            this.x = (cos(alpha) * x) + (sin(alpha) * z);
            this.z = (-1.0 * sin(alpha) * x) + (cos(alpha) * z);
        } else {
            this.x = (cos(-1.0 * alpha) * x) + (sin(-1.0 * alpha) * z);
            this.z = (-1.0 * sin(-1.0 * alpha)*x) + (cos(-1.0 * alpha) * z);
        }
    }

    public void rotateZ(boolean direction) {
        if (direction) {
            this.x = (cos(alpha) * (x)) - (sin(alpha) * (y));
            this.y = (sin(alpha) * (x)) + (cos(alpha) * (y));
        } else {
            this.x = (cos(-1.0 * alpha) * (x)) - (sin(-1.0 * alpha) * y);
            this.y = (sin(-1.0 * alpha) * (x)) + (cos(-1.0 * alpha) * y);
        }
    }

    public void scaleUp(){;
        d=400;
    }

    public void scaleDown(){
        d=200;
    }
}
