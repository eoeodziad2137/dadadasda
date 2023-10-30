import javax.swing.JOptionPane;
import java.util.Random;

public class kosci {

    public static void main(String[] args) {
        int gracz = 0;
        int komputer = 0;
        int liczba_rzutow = 5;

        Random random = new Random();


        for (int i = 0; i < liczba_rzutow; i++) {
            
            JOptionPane.showMessageDialog(null, "Nacisnij enter aby rzucic koscia...");

            int rzut_gracza = random.nextInt(6)+ 1;
            int rzut_komputera = random.nextInt(6)+ 1;

            JOptionPane.showMessageDialog(null, "Rzut gracza: " + rzut_gracza + "; Rzut komputera: "+ rzut_komputera);

            gracz = gracz + rzut_gracza;
            komputer = komputer + rzut_komputera;

        }

        JOptionPane.showMessageDialog(null, "Wynik gracza: " + gracz+ "Wynik komputera: " +komputer );

    }
}
