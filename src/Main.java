import model.Shop;
import view.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.pack();
        login.setSize(500, 500);
        login.setVisible(true);
        // Shop shop = new Shop("test", "password", "address");
        // new MainInterface(shop);
    }
}
