package Lab_5;

import java.util.Scanner;

public class Box {
    double h, w, d;

    Box(double width, double height, double depth) {
        h = height;
        w = width;
        d = depth;
    }

    double volume() {
        double v;
        v = h * w * d;
        return v;
    }

    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        double width, height, depth;

        System.out.println("\n>> Enter the dimensions of the Box (order h,w,d):");
        height = cmd.nextDouble();
        width = cmd.nextDouble();
        depth = cmd.nextDouble();
        cmd.close();

        Box bc = new Box(width, height, depth);
        System.out.println(bc.volume());
    }
}
