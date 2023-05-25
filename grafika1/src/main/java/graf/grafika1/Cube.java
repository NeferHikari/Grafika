package graf.grafika1;

import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Cube {
    private final Point A;
    private final Point B;
    private final Point C;
    private final Point D;
    private final Point E;
    private final Point F;
    private final Point G;
    private final Point H;
    private final List<Point> pointList;

    public Cube(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        G = g;
        H = h;
        pointList = new ArrayList<>();
        pointList.add(A);
        pointList.add(B);
        pointList.add(C);
        pointList.add(D);
        pointList.add(E);
        pointList.add(F);
        pointList.add(G);
        pointList.add(H);
    }

    public void moveRight() {
        for (Point point : pointList) {
            point.translateX(true);
        }
    }

    public void moveLeft() {
        for (Point point : pointList) {
            point.translateX(false);
        }
    }

    public void moveForwards() {
        for (Point point : pointList) {
            point.translateZ(false);
        }
    }

    public void moveBackwards() {
        for (Point point : pointList) {
            point.translateZ(true);
        }
    }

    public void moveUp() {
        for (Point point : pointList) {
            point.translateY(true);
        }
    }

    public void moveDown() {
        for (Point point : pointList) {
            point.translateY(false);
        }
    }

    public void rotateX() {
        for (Point point : pointList) {
            point.rotateX(false);
        }
    }

    public void rotateXBack() {
        for (Point point : pointList) {
            point.rotateX(true);
        }
    }

    public void rotateY() {
        for (Point point : pointList) {
            point.rotateY(false);
        }
    }

    public void rotateYBack() {
        for (Point point : pointList) {
            point.rotateY(true);
        }
    }

    public void rotateZ() {
        for (Point point : pointList) {
            point.rotateZ(false);
        }
    }

    public void rotateZBack() {
        for (Point point : pointList) {
            point.rotateZ(true);
        }
    }

    public void scaleUP() {
        for (Point point : pointList) {
            point.scaleUp();
        }
    }

    public void scaleDown() {
        for (Point point : pointList) {
            point.scaleDown();
        }
    }

    public void addToScene(Group group) {
        drawLine(A, B, group);
        drawLine(B, C, group);
        drawLine(C, D, group);
        drawLine(A, D, group);
        drawLine(E, F, group);
        drawLine(F, G, group);
        drawLine(G, H, group);
        drawLine(E, H, group);
        drawLine(A, E, group);
        drawLine(B, F, group);
        drawLine(C, G, group);
        drawLine(D, H, group);
    }

    private void drawLine(Point a, Point b, Group group) {
        Line line;
        line = new Line(a.get2DX(), a.get2DY(), b.get2DX(), b.get2DY());
        if (a.getZ() < 0) {
            line = new Line(-a.get2DX(), -a.get2DY(), b.get2DX(), b.get2DY());
        }
        if (b.getZ() < 0) {
            line = new Line(a.get2DX(), a.get2DY(), -b.get2DX(), -b.get2DY());
        }
        if (a.getZ() < 0 && b.getZ() < 0) {
            line = new Line(-a.get2DX(), -a.get2DY(), -b.get2DX(), -b.get2DY());;
        }
        group.getChildren().add(line);
    }
}
