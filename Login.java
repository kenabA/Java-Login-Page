import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

  Color customPurpleColor = new Color(148, 87, 235);
  Color themeWhite = new Color(40, 40, 40);
  String themePurple = "#8A2BE2";

  Login() {

    JLabel login = new JLabel();
    login.setText("Login");
    login.setFont(new Font("Poppins", Font.BOLD, 24));
    login.setBounds(0, 0, 600, 100);
    login.setHorizontalAlignment(JLabel.CENTER);
    login.setOpaque(true);

    JLabel username = new JLabel();
    username.setText("Username");
    username.setForeground(Color.DARK_GRAY);
    username.setFont(new Font("Poppins", Font.PLAIN, 18));
    username.setBounds(40, 100, 600, 30);
    username.setOpaque(true);

    JTextField userField = new JTextField();
    userField.setForeground(Color.DARK_GRAY);
    userField.setFont(new Font("Poppins", Font.PLAIN, 16));
    userField.setBounds(40, 140, 520, 40);

    JLabel password = new JLabel();
    password.setText("Password");
    password.setForeground(Color.DARK_GRAY);
    password.setFont(new Font("Poppins", Font.PLAIN, 18));
    password.setBounds(40, 200, 600, 30);

    JPasswordField passField = new JPasswordField();
    passField.setForeground(Color.DARK_GRAY);
    passField.setFont(new Font("Poppins", Font.PLAIN, 16));
    passField.setBounds(40, 240, 520, 40);

    JLabel register = new JLabel();
    register.setText("<html>Don't have an account yet? <font color=" + themePurple + ">Register Here</font></html>");
    register.setFont(new Font("Poppins", Font.PLAIN, 14));
    register.setForeground(themeWhite);
    register.setBounds(265, 290, 600, 30);
    register.setOpaque(true);

    JButton loginBtn = new JButton();
    loginBtn.setText("Login");
    loginBtn.setForeground(Color.WHITE);
    loginBtn.setBackground(customPurpleColor);
    loginBtn.setOpaque(true);
    loginBtn.setBorder(BorderFactory.createEmptyBorder());
    loginBtn.setFont(new Font("Poppins", Font.BOLD, 18));
    loginBtn.setBounds(40, 350, 520, 50);

    this.setSize(600, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setTitle("KSMS - Login");

    this.add(login);
    this.add(username);
    this.add(userField);
    this.add(password);
    this.add(passField);
    this.add(register);
    this.add(loginBtn);

  }

}
