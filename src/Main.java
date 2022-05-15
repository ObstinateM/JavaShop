import model.Shop;
import view.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // // On crée une instance de la vue AKA la fenetre
        // Login login = new Login();
        // login.pack();
        // login.setSize(500, 500);
        // login.setVisible(true);
        Shop shop = new Shop("test", "password", "address");
        new ShowComputer(shop);
    }
}
