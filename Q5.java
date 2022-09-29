
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Q5 extends JFrame {
    public Q5() {
        JRadioButton[] pet = new JRadioButton[3];
        String[] name = { "강아지", "고양이", "금붕어" };

        setTitle("PET");

        ButtonGroup bg = new ButtonGroup();
        JPanel panel1 = new JPanel();
        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(name[i]);
            bg.add(pet[i]);
            panel1.add(pet[i]);
        }

        pet[0].setSelected(true);
        add(panel1, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q5();
    }
}