import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;

public class losowanie {
    public static void main(String[] args) {
        Random random = new Random();

        int wartosc = random.nextInt(10);

        //Scanner klawiatura = new Scanner(System.in);

        int WAR;

        do {

            //System.out.println("Podaj wartosc ");
           // war = klawiatura.nextInt();
           String war=JOptionPane.showInputDialog("Podaj liczbe od 1 d0 10: ");
            WAR=Integer.parseInt(war);
            JOptionPane.showMessageDialog(null, wartosc);

            if (WAR == wartosc) {
                //System.out.println("Zgadłeś");
                JOptionPane.showMessageDialog(null, "Brawo zgadłeś");

            } else if (WAR > wartosc) {
                //System.out.println("Podana wartosc jest wieksza od wylosowanej");
                JOptionPane.showMessageDialog(null, "Podana wartosc jest wieksza od wylosowanej");
            } else if (WAR < wartosc) {
                JOptionPane.showMessageDialog(null, "Podana wartosc jest mniejsza od wylosowanej");
            }

        } while (WAR != wartosc);

    }

}
