package com.company.billing.user;

import java.awt.Color;
import java.awt.Font;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserID;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Login frame = new Login();
		frame.setVisible(true);
		frame.requestFocusInWindow();
	}
	
	void showPlaceholderForTextField() {
		textFieldUserID.setForeground(Color.GRAY);
    	textFieldUserID.setText("Enter UserID here");
	}
	
	void showPlaceholderForPasswordField() {
		passwordField.setText("Enter Password here");
		passwordField.setEchoChar((char) 0);
		passwordField.setForeground(Color.GRAY);
	}
	
	void loginCheck() {
		String userid = textFieldUserID.getText();
		String password = new String(passwordField.getPassword());
		UserDAO userDAO = new UserDAO();
		userDAO.loginCheck(userid, password);
	}
	
	void register() {
		this.dispose();
		Register register = new Register();
		register.setVisible(true);
		register.requestFocusInWindow();
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.WHITE);
		contentPane.requestFocusInWindow();
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Apple Color Emoji", Font.BOLD, 20));
		lblLogin.setForeground(Color.RED);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(150, 50, 100, 25);
		contentPane.add(lblLogin);
		
		JLabel lblUserID = new JLabel("UserId");
		lblUserID.setFont(new Font("Kokonor", Font.PLAIN, 15));
		lblUserID.setBounds(50, 150, 61, 16);
		contentPane.add(lblUserID);
		
		textFieldUserID = new JTextField("Enter UserID here");
		textFieldUserID.setForeground(Color.GRAY);
		textFieldUserID.setBounds(150, 143, 150, 26);
		contentPane.add(textFieldUserID);
		textFieldUserID.setColumns(10);
		textFieldUserID.addFocusListener(new FocusListener() {
			
			@Override
		    public void focusGained(FocusEvent e) {
		        if (textFieldUserID.getText().equals("Enter UserID here")) {
		        	textFieldUserID.setText("");
		        	textFieldUserID.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (textFieldUserID.getText().isEmpty()) {
		        	showPlaceholderForTextField();
		        }
		    }
		});
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Kokonor", Font.PLAIN, 15));
		lblPassword.setBounds(50, 188, 61, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField("Enter Password here");
		passwordField.setForeground(Color.GRAY);
		passwordField.setEchoChar((char) 0);
		passwordField.setBounds(150, 181, 150, 26);
		contentPane.add(passwordField);
		passwordField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getPassword().length == 0) {
					showPlaceholderForPasswordField();
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
//				System.out.println(passwordField.getPassword().toString());
				String password = String.valueOf(passwordField.getPassword());
				if(password.equals("Enter Password here")) {
					passwordField.setText("");
					passwordField.setEchoChar('*');
					passwordField.setForeground(Color.BLACK);
				}
			}
		});
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginCheck();
			}
		});
		btnLogin.setBounds(150, 250, 100, 29);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnRegister.setBounds(262, 250, 100, 29);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(38, 250, 100, 29);
		contentPane.add(btnReset);
		btnReset.addActionListener((e) -> {
			showPlaceholderForTextField();
			showPlaceholderForPasswordField();
		});
	}
}
