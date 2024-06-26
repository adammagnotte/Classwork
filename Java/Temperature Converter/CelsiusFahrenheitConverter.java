package ex26_13FarenheitConverterTwo;

import chapter26testing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CelsiusFahrenheitConverter extends JFrame implements ActionListener {
    private final JTextField jTextField;
    private final JLabel result;

    public CelsiusFahrenheitConverter() {
        super("Fahrenheit to Celsius converter");
        setLayout(new FlowLayout());

        jTextField = new JTextField("enter the value of Fahrenheit", 20);
        add(jTextField);

        JButton button = new JButton("OK");
        button.addActionListener(this);
        add(button);

        result = new JLabel("Enter Fahrenheit value, and click OK");
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            double inputFahrenheit = Double.parseDouble(jTextField.getText());
            double answer = 0.0;
            double kelvin = 0.0;

            answer = ((5.0 / 9.0) * (inputFahrenheit - 32.0));
            kelvin = answer + 273.15;

            result.setText(String.valueOf(decimalFormat.format(answer)));
            jTextField .setText("Kelvin value: " + String.valueOf(kelvin));
        } catch (NumberFormatException ex) {
            System.out.println("You have entered not a number, but illegal symbols or words, try again");
        }
    }
}