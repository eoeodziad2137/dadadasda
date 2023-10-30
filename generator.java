import javax.swing.JOptionPane;

import java.util.Random;

public class generator {
    public static void main(String[] args) 
    {
        Random random = new Random();

        int wartosc = random.nextInt(1001);




        int WAR;
        int a = 1;
   

        do {

           String war=JOptionPane.showInputDialog("Podaj liczbe z przedzialu od 0 do 1000: ");
            WAR=Integer.parseInt(war);

            if (WAR == wartosc) {
                
                JOptionPane.showInternalMessageDialog(null, "Brawo zgadłeś. Zgadłeś za: " + a + " razem");

            } else if (WAR > wartosc) {
                
                JOptionPane.showInternalMessageDialog(null, "Podana wartosc jest wieksza od wylosowanej");
            } else if (WAR < wartosc) {
                JOptionPane.showInternalMessageDialog(null, "Podana wartosc jest mniejsza od wylosowanej");
            }
            a ++;
        } while (WAR != wartosc);
    }
}
