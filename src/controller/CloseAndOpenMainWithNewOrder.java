package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Computer;
import model.Keyboard;
import model.OrderList;
import model.Screen;
import model.Shop;
import view.MainInterface;

public class CloseAndOpenMainWithNewOrder extends CloseAndOpen {
    private OrderList orderList;

    public CloseAndOpenMainWithNewOrder(JFrame f, Shop s, OrderList orderList) {
        super(f, s);
        this.orderList = orderList;
    }

    @Override
    public void open(Shop shop) {
        int totalOrderedComputer = 0;
        for (Computer computer : orderList.getComputerList()) {
            totalOrderedComputer += computer.getInventory();
            ;
        }

        for (Computer computer : orderList.getComputerList()) {
            if (shop.getComputerByName(computer.getName()).getInventory() >= totalOrderedComputer) {
                shop.getComputerByName(computer.getName()).setInventory(
                        shop.getComputerByName(computer.getName()).getInventory() -
                                computer.getInventory());
                shop.getComputerByName(computer.getName())
                        .setNumberOfSell(
                                shop.getComputerByName(computer.getName()).getNumberOfSell()
                                        + computer.getNumberOfSell());
                ;

            } else {
                JOptionPane.showMessageDialog(null,
                        "Stock manquant, veuillez re-passez commande" + computer.getName() + " en stock", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }

            ;
        }
        int totalOrderedKeyboard = 0;
        for (Keyboard keyboard : orderList.getKeyboardList()) {
            totalOrderedKeyboard += keyboard.getInventory();
            ;
        }
        for (Keyboard keyboard : orderList.getKeyboardList()) {
            if (shop.getKeyboardByName(keyboard.getName()).getInventory() >= totalOrderedKeyboard) {
                shop.getKeyboardByName(keyboard.getName()).setInventory(
                        shop.getKeyboardByName(keyboard.getName()).getInventory() -
                                keyboard.getInventory());
                shop.getKeyboardByName(keyboard.getName())
                        .setNumberOfSell(
                                shop.getKeyboardByName(keyboard.getName()).getNumberOfSell()
                                        + keyboard.getNumberOfSell());
                ;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Stock manquant, veuillez re-passez commande" + keyboard.getName() + " en stock", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }

            ;
        }

        int totalOrderedScreen = 0;
        for (Screen screen : orderList.getScreenList()) {
            totalOrderedScreen += screen.getInventory();
            ;
        }
        for (Screen screen : orderList.getScreenList()) {
            if (shop.getScreenByName(screen.getName()).getInventory() >= totalOrderedScreen) {
                shop.getScreenByName(screen.getName()).setInventory(
                        shop.getScreenByName(screen.getName()).getInventory() -
                                screen.getInventory());
                shop.getScreenByName(screen.getName())
                        .setNumberOfSell(
                                shop.getScreenByName(screen.getName()).getNumberOfSell() + screen.getNumberOfSell());
            } else {
                JOptionPane.showMessageDialog(null,
                        "Stock manquant, veuillez re-passez commande" + screen.getName() + " en stock", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }

            ;
        }
        shop.addOrderList(orderList);
        new MainInterface(shop);
    }
}
