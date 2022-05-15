package controller;

import javax.swing.JFrame;
import model.Shop;
import view.ShowArticle;

public class CloseAndOpenShowArticle extends CloseAndOpen {

    public CloseAndOpenShowArticle(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new ShowArticle(shop);
    }
}
