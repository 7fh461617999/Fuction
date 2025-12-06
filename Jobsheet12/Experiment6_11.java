package Jobsheet12;

import java.util.Scanner;

public class Experiment6_11 {
    static int CalculateArea(int l, int w) {
        int area = w * l;
        return area;
    }

    static int CalculateVolume(int l, int w, int h) {
        int Vol = CalculateArea(l, w) * h;
        return Vol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, Vol;
        System.out.print("Input lenght : ");
        p = input.nextInt();
        System.out.print("input weight : ");
        l = input.nextInt();
        System.out.print("Input height : ");
        t = input.nextInt();
        L = CalculateArea(p,l);
        System.out.println("area of the rectangle = " + L);
        Vol = CalculateVolume(p,l,t);
        System.out.println("Volume of the rectangle = " + Vol);
    }
}
