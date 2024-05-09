package ex26_14GuessTheNum;

import chapter26testing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;

public class GuessTheNumber extends JFrame {

    int randomNum = (int) (Math.random() * 1001);
    private final JTextField jTextField;
    private final JLabel result;
    private int counter = 0;
    private int lastGuess = 0;
    private JButton playAgain;

    public GuessTheNumber() {

        super("Guess The Number!");
        setLayout(new FlowLayout());

        jTextField = new JTextField("enter your guess!", 20);
        add(jTextField);

        JButton button = new JButton("OK");
        //button.addActionListener(this);
        add(button);

        result = new JLabel("Enter your first guess!");
        add(result);
        getContentPane().setBackground(Color.ORANGE);
        
    playAgain = new JButton("Play Again");
     playAgain.setVisible(false);
        add(playAgain);
       

//    public void actionPerformed(ActionEvent e) {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    counter++;

                    int inputGuess = Integer.parseInt(jTextField.getText());

                    if (inputGuess == randomNum) {
                        result.setText("Correct!");
                        jTextField.setEditable(false);
                        playAgain.setVisible(true);
                         getContentPane().setBackground(Color.LIGHT_GRAY);
              
                    } else if (inputGuess < randomNum) {
                        result.setText("Too low!");
                    } else if (inputGuess > randomNum) {
                        result.setText("Too high!!");
                        result.setText(String.valueOf(randomNum));
                    }
                    if (counter > 1) {
                        if ((randomNum - inputGuess) > (randomNum - lastGuess)) {
                            getContentPane().setBackground(Color.BLUE);
                        } else if ((randomNum - inputGuess) < (randomNum - lastGuess)) {
                            getContentPane().setBackground(Color.RED);
                        }
//                         else {
//                            getContentPane().setBackground(Color.GRAY);
//
//                        }
                    }

                    lastGuess = inputGuess;
                } catch (NumberFormatException ex) {
                    System.out.println("You have entered not a number, but illegal symbols or words, try again");
                }
            }
        });
        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Random rand = new Random();
               randomNum = (int) (Math.random() * 1001);
               //playAgain.setEnabled(false);
                playAgain.setVisible(false);
                jTextField.setEditable(true);
                jTextField.setText("");
                result.setText("");
                jTextField.requestFocus();
               // playAgain.setVisible(true);
                lastGuess = 0;
            }

        });
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guessTheNumber.setSize(400, 250);
        guessTheNumber.setVisible(true);
        guessTheNumber.setLocationRelativeTo(null);
    }
}
