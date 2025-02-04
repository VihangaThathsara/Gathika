package GUI;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.io.File;

public class Starter {

    public static void main(String[] args) {

        FlatMacLightLaf.setup();
        
        if (checkSER()) {
            new SignIn().setVisible(true);
        }else{
         new AddDB().setVisible(true);
        }
    }

    private static boolean checkSER() {
        File file = new File(System.getProperty("user.dir") + "\\homeinfo.ser");
        return file.isFile();
    }
}
