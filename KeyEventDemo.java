import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends JFrame implements KeyListener {

    JTextField textField;
    JTextArea textArea;
    JButton button;

    KeyEventDemo() {

        setTitle("Key Event Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textArea = new JTextArea(8, 30);
        button = new JButton("Submit");

        add(new JLabel("Enter Text:"));
        add(textField);
        add(button);
        add(new JScrollPane(textArea));

        // Register KeyListener
        textField.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed: "
                + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    public void keyReleased(KeyEvent e) {
        textArea.append("Key Released\n");
    }

    public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: "
                + e.getKeyChar() + "\n");
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}

//KeyListener provides three methods:
/*
keyPressed()
keyReleased()
keyTyped()
*/