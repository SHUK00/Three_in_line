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

    public static void main (String [] args) {


        System.out.println("Three in line: The game");
        System.out.println(" ");

        printGame();

        Scanner sc = new Scanner(System.in);

        System.out.println("Player (x) turn: ");
        System.out.print("lat:  ");
        int la = sc.nextInt();
        System.out.print("long: ");
        int lo = sc.nextInt();

        if (la == 1 && lo == 1){
            pos11 = "x";
            printGame();
        }

        System.out.println("Player (o) turn: ");
        System.out.print("lat:  ");
        int la = sc.nextInt();
        System.out.print("long: ");
        int lo = sc.nextInt();

        if (la == 1 && lo == 1){
            pos11 = "o";
            printGame();
        }


    }

    public static void printGame() {
        System.out.println("    1\"2\"3\"");
        System.out.println("1' |"+pos11+"|"+pos12+"|"+pos13+"|");
        System.out.println("2' |"+pos21+"|"+pos22+"|"+pos23+"|");
        System.out.println("3' |"+pos31+"|"+pos32+"|"+pos33+"|");

    }
}
