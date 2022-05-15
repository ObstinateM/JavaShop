package utils;

import java.util.ArrayList;
import java.util.Random;

import model.Employee;
import model.Shop;

public class utils {
    public int getRandomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
