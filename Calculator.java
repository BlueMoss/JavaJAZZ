// Class 명 : Calculator

//p.646 관련 추가 소스코드_Calculator

//package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Eclipse에서는 소스만 입력하고  CTRL+ALT+o(알파벳)를 입력한다. 

public class Calculator extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField display;
    private JButton[] buttons;
    private String[] labels = { "Backspace", "", "", "CE", "C", "7", "8", "9",
            "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x",
            "0", "-/+", ".", "+", "=", };

    private double result = 0;
    private String operator = "=";
    private boolean startOfNumber = true;

    public Calculator() {
        display = new JTextField(35);
        panel = new JPanel();
        display.setText("0.0");
        // display.setEnabled(true);

        panel.setLayout(new GridLayout(0, 5, 3, 3));
        buttons = new JButton[25];
        int index = 0;
        for (int rows = 0; rows < 5; rows++) {
            for (int cols = 0; cols < 5; cols++) {
                buttons[index] = new JButton(labels[index]);
                if (cols >= 3)
                    buttons[index].setForeground(Color.red);
                else
                    buttons[index].setForeground(Color.yellow);
                buttons[index].setBackground(Color.black);
                panel.add(buttons[index]);
                buttons[index].addActionListener(this);
                index++;
            }
        }
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            startOfNumber = true;
            result = 0;
            operator = "=";
            display.setText("0.0");
        } else if (command.charAt(0) >= '0' && command.charAt(0) <= '9'
                || command.equals(".")) {
            if (startOfNumber == true)
                display.setText(command);
            else
                display.setText(display.getText() + command);
            startOfNumber = false;
        } else {
            if (startOfNumber) {
                if (command.equals("-")) {
                    display.setText(command);
                    startOfNumber = false;
                } else
                    operator = command;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }

    private void calculate(double n) { // 아래 가감승제 버튼 모양을 변경할 방법을 찾는다...
        if (operator.equals("+"))
            result += n;
        else if (operator.equals("-"))
            result -= n;
        else if (operator.equals("x"))
            result *= n;
        else if (operator.equals("/"))
            result /= n;
        else if (operator.equals("="))
            result = n;
        display.setText("" + result);
    }

    public static void main(String args[]) {
        Calculator s = new Calculator();
    }
}
