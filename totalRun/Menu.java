import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    Menu() {
        setTitle("메뉴 구성하기");
        makeMenu();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    void makeMenu() {
        JMenuItem item;
        KeyStroke key;

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        m1.setMnemonic(KeyEvent.VK_F);
        JMenu m2 = new JMenu("Color");
        m2.setMnemonic(KeyEvent.VK_C);

        item = new JMenuItem("New File", KeyEvent.VK_N);
        item.addActionListener(this);
        m1.add(item);
        item = new JMenuItem("File Open", KeyEvent.VK_O);
        item.addActionListener(this);
        m1.add(item);
        m1.add(new JMenuItem("File Saved"));
        m1.addSeparator();
        m1.add(new JMenuItem("End"));

        item = new JMenuItem("Blue");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("Red");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("Yellow");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new Menu();
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem mi = (JMenuItem) (e.getSource());

        switch (mi.getText()) {
            case "New File" -> System.out.println("New File");
            case "File Open" -> System.out.println("File Open");
            case "Blue" -> getContentPane().setBackground(Color.BLUE);
            case "Red" -> getContentPane().setBackground(Color.RED);
            case "Yellow" -> getContentPane().setBackground(Color.YELLOW);

        }
    }
}