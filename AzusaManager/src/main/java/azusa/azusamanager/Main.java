package azusa.azusamanager;
import javax.swing.SwingUtilities;
/**
 * Maini josta ohjelma käynnistyy
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Pelipoyta poyta = new Pelipoyta();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(poyta);
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
