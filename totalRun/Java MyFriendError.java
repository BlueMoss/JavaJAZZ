import javax.swing.JFrame;

public class JavaMyFriendError {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("나의 2번째 WBox!");
        setSize(1000, 600);
        setVisible(true);
    }
}