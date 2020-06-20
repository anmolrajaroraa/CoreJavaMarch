package com.company.billing.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
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

public class Register extends JFrame {
	
	private JTextField textFieldUserID;
	private JTextField textFieldEmailID;
	private JPasswordField passwordField;
	
	void showPlaceholderForTextField() {
			textFieldUserID.setForeground(Color.GRAY);
			textFieldUserID.setText("Enter UserID here");
	    	textFieldEmailID.setForeground(Color.GRAY);
	    	textFieldEmailID.setText("Enter Email here");
	}
	
	void showPlaceholderForPasswordField() {
		passwordField.setText("Enter Password here");
		passwordField.setEchoChar((char) 0);
		passwordField.setForeground(Color.GRAY);
	}
	
	void back() {
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
		login.requestFocusInWindow();
	}
	
	void register() {
		String userid = textFieldUserID.getText();
		String email = textFieldEmailID.getText();
		String password = new String(passwordField.getPassword());
		UserDAO userDAO = new UserDAO();
		userDAO.register(userid, email, password);
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Register frame = new Register();
		frame.setVisible(true);
		frame.requestFocusInWindow();
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		requestFocusInWindow();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Apple Color Emoji", Font.BOLD, 20));
		lblRegister.setForeground(Color.RED);
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(150, 50, 100, 25);
		contentPane.add(lblRegister);
		
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
		
		JLabel lblEmailID = new JLabel("EmailId");
		lblEmailID.setFont(new Font("Kokonor", Font.PLAIN, 15));
		lblEmailID.setBounds(50, 190, 61, 16);
		contentPane.add(lblEmailID);
		
		textFieldEmailID = new JTextField("Enter Email here");
		textFieldEmailID.setForeground(Color.GRAY);
		textFieldEmailID.setBounds(150, 183, 150, 26);
		contentPane.add(textFieldEmailID);
		textFieldEmailID.setColumns(10);
		textFieldEmailID.addFocusListener(new FocusListener() {
			
			@Override
		    public void focusGained(FocusEvent e) {
				if (textFieldEmailID.getText().equals("Enter Email here")) {
		        	textFieldEmailID.setText("");
		        	textFieldEmailID.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		    	if (textFieldEmailID.getText().isEmpty()) {
		    		showPlaceholderForTextField();
		    	}
		    }
		});
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Kokonor", Font.PLAIN, 15));
		lblPassword.setBounds(50, 230, 61, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField("Enter Password here");
		passwordField.setForeground(Color.GRAY);
		passwordField.setEchoChar((char) 0);
		passwordField.setBounds(150, 223, 150, 26);
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
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnRegister.setBounds(150, 290, 100, 29);
		contentPane.add(btnRegister);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnBack.setBounds(262, 290, 100, 29);
		contentPane.add(btnBack);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(38, 290, 100, 29);
		contentPane.add(btnReset);
		btnReset.addActionListener((e) -> {
			showPlaceholderForTextField();
			showPlaceholderForPasswordField();
		});

	}

}
