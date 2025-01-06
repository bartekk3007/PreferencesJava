import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class Main
{
    public static void main(String[] args) throws BackingStoreException, IOException
    {
        Preferences node = Preferences.userNodeForPackage(Main.class);
        node.put("name", "Bartek");
        for (String key : node.keys())
        {
            System.out.println(key);
        }

        OutputStream os = new FileOutputStream("preferencje.txt");
        node.exportNode(os);
    }
}