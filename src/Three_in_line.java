import java.util.Scanner;

/**
 * Created by shse14 on 2016-09-09.
 */
public class Three_in_line {

    char[] board = new char[9];

    static String pos11 = "_";
    static String pos12 = "_";
    static String pos13 = "_";
    static String pos21 = "_";
    static String pos22 = "_";
    static String pos23 = "_";
    static String pos31 = "_";
    static String pos32 = "_";
    static String pos33 = "_";

    static int la = 0;
    static int lo = 0;

    public static void main (String [] args) {


        System.out.println("Three in line: The game");
        System.out.println(" ");

        printGame();

        Scanner sc = new Scanner(System.in);

        while (running()) {
            System.out.println("Player (x) turn: ");
            System.out.print("lat:  ");
            la = sc.nextInt();
            System.out.print("long: ");
            lo = sc.nextInt();
            gameX();

            printGame();

            System.out.println("Player (o) turn: ");
            System.out.print("lat:  ");
            la = sc.nextInt();
            System.out.print("long: ");
            lo = sc.nextInt();
            gameO();

            printGame();
        }

    }

    public static boolean running() {
        return true;
    }

    public static void printGame() {
        System.out.println("    1\"2\"3\"");
        System.out.println("1' |"+pos11+"|"+pos12+"|"+pos13+"|");
        System.out.println("2' |"+pos21+"|"+pos22+"|"+pos23+"|");
        System.out.println("3' |"+pos31+"|"+pos32+"|"+pos33+"|");

    }

    public static void gameX() {
        if (la == 1 && lo == 1 && pos11 == "_") {
            pos11 = "x";
        }
        if (la == 1 && lo == 2 && pos12 == "_") {
            pos12 = "x";
        }
        if (la == 1 && lo == 3 && pos13 == "_") {
            pos13 = "x";
        }
        if (la == 2 && lo == 1 && pos21 == "_") {
            pos21 = "x";
        }
        if (la == 2 && lo == 2 && pos22 == "_") {
            pos22 = "x";
        }
        if (la == 2 && lo == 3 && pos23 == "_") {
            pos23 = "x";
        }
        if (la == 3 && lo == 1 && pos31 == "_") {
            pos31 = "x";
        }
        if (la == 3 && lo == 2 && pos32 == "_") {
            pos32 = "x";
        }
        if (la == 3 && lo == 3 && pos33 == "_") {
            pos33 = "x";
        }
        else {
            System.out.println("False value!");
        }
    }

    public static void gameO() {
        if (la == 1 && lo == 1 && pos11 == "_") {
            pos11 = "o";
        }
        if (la == 1 && lo == 2 && pos12 == "_") {
            pos12 = "o";
        }
        if (la == 1 && lo == 3 && pos13 == "_") {
            pos13 = "o";
        }
        if (la == 2 && lo == 1 && pos21 == "_") {
            pos21 = "o";
        }
        if (la == 2 && lo == 2 && pos22 == "_") {
            pos22 = "o";
        }
        if (la == 2 && lo == 3 && pos23 == "_") {
            pos23 = "o";
        }
        if (la == 3 && lo == 1 && pos31 == "_") {
            pos31 = "o";
        }
        if (la == 3 && lo == 2 && pos32 == "_") {
            pos32 = "o";
        }
        if (la == 3 && lo == 3 && pos33 == "_") {
            pos33 = "o";
        }
        else {
            System.out.println("False value!");


        }
    }
}
