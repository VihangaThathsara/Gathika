package GUI;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Starter {

    public static void main(String[] args) {

        FlatMacLightLaf.setup();

        new SignIn().setVisible(true);

    }
}
