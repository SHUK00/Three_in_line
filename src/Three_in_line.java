import java.util.Scanner;

/**
 * Created by shse14 on 2016-09-09.
 */
public class Three_in_line {

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

    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {


        System.out.println("Three in line: The game");
        System.out.println(" ");

        printGame();

        while (running()) {
            System.out.println(" ");
            turnPlayerX();
            printGame();
            System.out.println(" ");
            turnPlayerO();
            printGame();
        }

    }

    public static boolean running() {
        if (pos11 == "x" && pos12 == "x" && pos13 == "x" || pos21 == "x" && pos22 == "x" && pos23 == "x" || pos31 == "x" && pos32 == "x" && pos33 == "x" || pos11 == "x" && pos21 == "x" && pos31 == "x" || pos12 == "x" && pos22 == "x" && pos32 == "x" || pos13 == "x" && pos23 == "x" && pos33 == "x" || pos11 == "x" && pos22 == "x" && pos33 == "x" || pos31 == "x" && pos22 == "x" && pos13 == "x") {
            System.out.println(" ");
            System.out.println("Player (x) won!");
            return false;
        }
        else if (pos11 == "o" && pos12 == "o" && pos13 == "o" || pos21 == "o" && pos22 == "o" && pos23 == "o" || pos31 == "o" && pos32 == "o" && pos33 == "o" || pos11 == "o" && pos21 == "o" && pos31 == "o" || pos12 == "o" && pos22 == "o" && pos32 == "o" || pos13 == "o" && pos23 == "o" && pos33 == "o" || pos11 == "o" && pos22 == "o" && pos33 == "o" || pos31 == "o" && pos22 == "o" && pos13 == "o") {
            System.out.println(" ");
            System.out.println("Player (o) won!");
            return false;
        }
        else if (pos11 != "_" && pos12 != "_" && pos13 != "_" && pos21 != "_" && pos22 != "_" && pos23 != "_" && pos31 != "_" && pos32 != "_" && pos33 != "_") {
            System.out.println(" ");
            System.out.println("Game Over!");
            return false;
        }
        else {
            return true;
        }
    }

    public static void turnPlayerX() {
        System.out.println("Player (x) turn: ");
        System.out.print("lat:  ");
        la = sc.nextInt();
        System.out.print("long: ");
        lo = sc.nextInt();
        gameX();
    }

    public static void turnPlayerO() {
        System.out.println("Player (o) turn: ");
        System.out.print("lat:  ");
        la = sc.nextInt();
        System.out.print("long: ");
        lo = sc.nextInt();
        gameO();
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
        else if (la == 1 && lo == 2 && pos12 == "_") {
            pos12 = "x";
        }
        else if (la == 1 && lo == 3 && pos13 == "_") {
            pos13 = "x";
        }
        else if (la == 2 && lo == 1 && pos21 == "_") {
            pos21 = "x";
        }
        else if (la == 2 && lo == 2 && pos22 == "_") {
            pos22 = "x";
        }
        else if (la == 2 && lo == 3 && pos23 == "_") {
            pos23 = "x";
        }
        else if (la == 3 && lo == 1 && pos31 == "_") {
            pos31 = "x";
        }
        else if (la == 3 && lo == 2 && pos32 == "_") {
            pos32 = "x";
        }
        else if (la == 3 && lo == 3 && pos33 == "_") {
            pos33 = "x";
        }
        else {
            System.out.println(" ");
            System.out.println("False value!");
            System.out.println(" ");
            turnPlayerX();
        }
    }

    public static void gameO() {
        if (la == 1 && lo == 1 && pos11 == "_") {
            pos11 = "o";
        }
        else if (la == 1 && lo == 2 && pos12 == "_") {
            pos12 = "o";
        }
        else if (la == 1 && lo == 3 && pos13 == "_") {
            pos13 = "o";
        }
        else if (la == 2 && lo == 1 && pos21 == "_") {
            pos21 = "o";
        }
        else if (la == 2 && lo == 2 && pos22 == "_") {
            pos22 = "o";
        }
        else if (la == 2 && lo == 3 && pos23 == "_") {
            pos23 = "o";
        }
        else if (la == 3 && lo == 1 && pos31 == "_") {
            pos31 = "o";
        }
        else if (la == 3 && lo == 2 && pos32 == "_") {
            pos32 = "o";
        }
        else if (la == 3 && lo == 3 && pos33 == "_") {
            pos33 = "o";
        }
        else {
            System.out.println(" ");
            System.out.println("False value!");
            System.out.println(" ");
            turnPlayerO();
        }
    }
}
