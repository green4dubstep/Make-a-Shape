
//Spring 2023 - CS1083 - Section 001 - Project 2 - Shaper - written by Bryan Conger qml168
import java.util.Scanner;

public class shaper {
    public static void main(String[] args) {
        getMenuSelection(-1);
    }

    // menu
    public static void showMenu() {
        System.out.println("Enter your choice, from the Options 0 - 3.");
        System.out.println("0: Exit");
        System.out.println("1: Draw a Diamond");
        System.out.println("2; Draw a Rectangle");
        System.out.println("3: Draw a Triangle");
    }

    public static void getMenuSelection(int menu) {
        Scanner scnr = new Scanner(System.in);

        do {
            showMenu();
            menu = scnr.nextInt();
            if (menu == 0) {
                ExitMenu();
            } else if (menu == 1) {
                Diamond();
            } else if (menu == 2) {
                rectangle();
            } else if (menu == 3) {
                triangle();
            } else {
                System.out.println("Invaild Choice, Please Enter a number form 0 to 3.");
            }
        } while (menu != 0);
        scnr.close();
    }

    // diamond draw
    public static void drawDiamond(char fillChar, char edgeChar, int size) {
        Scanner scnr = new Scanner(System.in);
        size = scnr.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= (size - i) / 2 || j < (size + i) / 2) {
                    System.out.println(" ");
                } else {
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }

    // diamond print
    public static void Diamond() {
        char fill;
        char edge;
        int size;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please write the char that you would like to be used to fill the diamond");
        fill = scnr.next().charAt(0);

        System.out.println("Please write the char that you would like to be used as the edge of diamond");
        edge = scnr.next().charAt(0);

        System.out.println("What size do you want the diamond to be drawn");
        size = scnr.nextInt();

        while (size > 60 || size < 0) {
            System.out.println("Please insert an even number between 0 and 60");
            size = scnr.nextInt();
        }

        drawDiamond(fill, edge, size);
        scnr.close();
    }

    public static void showCharNTimes(char c, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(c);
        }
    }

    // draw rectangle
    public static void drawRectangle(char chr, int size, boolean hollow) {
        if (hollow) {
            for (int i = 0; i < size; i++) {
                if (i == 0 || i == size - 1) {
                    showCharNTimes(chr, size);
                } else {
                    System.out.print(chr);
                    showCharNTimes(' ', size - 2);
                    System.out.print(chr);
                }

                System.out.println();
            }
        } else {
            for (int i = 0; i < size; i++) {
                showCharNTimes(chr, size);
                System.out.println();
            }
        }
    }

    // print rectangle
    public static void rectangle() {
        char chr;
        int size;
        boolean hollow;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Write the char you would like to use as the contour of the rectangle");
        chr = scnr.next().charAt(0);

        System.out.println("Do you want the rectangle to be printed hollow");
        hollow = scnr.nextBoolean();

        System.out.println("What size do you want the rectangle to be drawn");
        size = scnr.nextInt();

        while (size > 60 || size < 0) {
            System.out.println("Please insert any number between 0 and 60");
            size = scnr.nextInt();
        }

        drawRectangle(chr, size, hollow);
    }

    // draw triangle
    public static void drawTriangle(int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    // print triangle
    public static void triangle() {

        int width;
        Scanner scnr = new Scanner(System.in);
        System.out.println("What size do you want the triangle to be?");
        width = scnr.nextInt();

        System.out.println("Insert a number between 0 and 60");
        drawTriangle(width);
    }

    public static void ExitMenu() {
        System.out.println("Thank you for using the Shaper Program, GoodBye!");
    }

}
