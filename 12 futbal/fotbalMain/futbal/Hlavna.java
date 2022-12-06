import java.util.Scanner;

public class Hlavna {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String prikaz;
        do {
            System.out.println("Zadaj prikaz:");
            System.out.println("ukonci - ukonci app");
            prikaz = vstup.nextLine();
        } while (!prikaz.equals("ukonci"));
    }
}
