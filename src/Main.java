import model.Shop;
import view.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Login login = new Login();
        // login.pack();
        // login.setSize(500, 500);
        // login.setVisible(true);
        Shop shop = new Shop("A super computer shop :)", "password",
                "Paris 9 75009 (Paris), 8 Rue De Londres");
        new MainInterface(shop);
    }
}
