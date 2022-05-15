package controller;

import javax.swing.JFrame;
import model.Shop;
import view.NewArticle;

public class CloseAndOpenNewArticle extends CloseAndOpen {

    public CloseAndOpenNewArticle(JFrame f, Shop s) {
        super(f, s);
    }

    @Override
    public void open(Shop shop) {
        new NewArticle(shop);
    }
}
