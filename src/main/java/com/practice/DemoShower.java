package com.practice;

public class DemoShower {

    public static void main(String[] args) {

//        drawStar();
//        drawHorizontalLine(8);
//        drawVerticalLine(3);
//        drawRightTraingle(3);
        drawIsoscelesTraingle(3);
    }

    private static void drawIsoscelesTraingle(int n) {
        for(int h = 0; h < n-1; h++) {
            blank(n - h - 1);
            drawHorizontalLine(2 * (h + 1) - 1);
            toNextLine();
        }
        priintName("Oliver");
        for(int h = n - 2; h >= 0; h-- ){
            blank(n - h - 1);
            drawHorizontalLine(2 * (h + 1) - 1);
            toNextLine();
        }
    }

    private static void priintName(String name) {
        System.out.println(name);
    }

    private static void blank(int i) {
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
    }

    private static void drawRightTraingle(int line) {
        for(int h = 0; h < line; h++){
            drawHorizontalLine(h + 1);
            toNextLine();
        }
    }

    private static void drawVerticalLine(int i) {
        for(int j = 0; j < i; j++){
            drawStar();
            toNextLine();
        }
    }

    private static void toNextLine() {
        System.out.println();
    }

    private static void drawHorizontalLine(int i) {
        for(int j = 0; j < i; j++){
            drawStar();
        }
    }

    private static void drawStar() {
        System.out.print("*");
    }

}
