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
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
