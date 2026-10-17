/*
JFrame
│
├── BorderLayout
│
├── NORTH
│    └── JLabel "User Login"
│
└── CENTER
     └── JPanel
          │
          └── GridLayout (3 × 2)
               ├── Email
               ├── JTextField
               ├── Password
               ├── JPasswordField
               ├── Login Button
               └── Clear Button
*/
/*
import javax.swing.*;
import java.awt.*;

public class LoginGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BorderLayout for the main frame
        frame.setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("User Login", JLabel.CENTER);
        frame.add(title, BorderLayout.NORTH);

        // GridLayout for login fields
        JPanel panel = new JPanel(); //JPanel is like a container inside the main window.
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Email:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
*/
/*
BorderLayout divides the main frame into regions such as 
NORTH, SOUTH, EAST, WEST, and CENTER.
GridLayout arranges components in rows and columns of equal size.
JLabel displays text.
JTextField accepts username input.
JPasswordField accepts password input.
JButton creates clickable buttons.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("User Login", JLabel.CENTER);
        frame.add(title, BorderLayout.NORTH);

        // Panel for login fields
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Email:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);

        // Event handling for Login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String email = userField.getText();
                String password = new String(passField.getPassword());

                if (email.equals("admin@gmail.com")
                        && password.equals("12345")) {

                    JOptionPane.showMessageDialog(
                            frame, "Login Successful!");

                } else {
                    JOptionPane.showMessageDialog(
                            frame, "Invalid Email or Password!");
                }
            }
        });

        // Event handling for Clear button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passField.setText("");
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
//JOptionPane is a Java Swing class 
//used to display popup dialog boxes for messages, 
//user input, and confirmation.

/*--------------------------------------------------------------------
1. ActionEvent — JButton:
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Button Clicked!");
    }
});

2. ItemEvent — JCheckBox
checkBox.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        JOptionPane.showMessageDialog(frame, "Checkbox State Changed!");
    }
});

3. MouseEvent — MouseListener
button.addMouseListener(new MouseListener() {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
});

4. KeyEvent — KeyListener
textField.addKeyListener(new KeyListener() {
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed!");
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
});

5. WindowEvent — WindowListener
frame.addWindowListener(new WindowListener() {
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing!");
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
});

*