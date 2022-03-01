
package zdarzenia.okna.windowlistener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author pawelstradomski
 */
public class ZdarzeniaOknaWindowListener extends JFrame implements WindowListener
{

    public ZdarzeniaOknaWindowListener() 
    {
        super("Zdarzenia okna");
        this.setBounds(600, 300, 300, 300);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//zmienilismy na:DoNothingOnClose==0 zeby dzialaly opcje:yes,no,cancel.Sprawdz w "go to source" JFRame/WindowConstants
        initComponent();
    }
    public void initComponent()
    {
        this.addWindowListener(this);//dodalismy sluchacza "WindowListener".this tzn metody beda sprawdzane tutaj w danej klasie.
    }
    

    
    public static void main(String[] args) {
        new ZdarzeniaOknaWindowListener().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Welcome Pawel");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int opcja = JOptionPane.showConfirmDialog(rootPane, "Potwierdz zamkniecie okna");//JOPtionPane sprawdz w"go to source" przyjmuje wartosci int=0,1,2
        if(opcja == 0) //bo int == 0 == yes
        {
            this.dispose();//tzn pozbadz sie i posprzataj po sobie
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("np zapisujemy dane na dysku");//wykonane po komendzie zamkniecia
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("minimalizuje okno");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("maksymalizuje okno");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("aktywny");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("nieaktywny");
    }
    
}
