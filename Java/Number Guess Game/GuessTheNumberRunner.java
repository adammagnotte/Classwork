package ex26_14GuessTheNum;

import chapter26testing.*;
import javax.swing.*;

public class GuessTheNumberRunner {
    public static void main(String[] args) {
    GuessTheNumber guessTheNumber = new GuessTheNumber();
    guessTheNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    guessTheNumber.setSize(400, 250);
    guessTheNumber.setVisible(true);
    guessTheNumber.setLocationRelativeTo(null);
    }
}