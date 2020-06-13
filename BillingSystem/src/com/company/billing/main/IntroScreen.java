package com.company.billing.main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import com.company.billing.user.Login;

public class IntroScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		IntroScreen frame = new IntroScreen();
		frame.setVisible(true);
		frame.doProgress();
	}

	Timer timer;
	int counter = 0;
	JProgressBar progressBar = new JProgressBar();
	
	private void doProgress() {
		timer = new Timer(50, (e) -> {
			progressBar.setValue(counter);
			counter++;
			if(counter == 100) {
				timer.stop();
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
			}
		});
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public IntroScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(157, 223, 219));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon( IntroScreen.class.getResource("/com/company/billing/main/intro_bg.png") ));
		lblNewLabel.setBounds(0, 0, 1000, 400);
		contentPane.add(lblNewLabel);
	
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 400, 1000, 20);
		contentPane.add(progressBar);
		
	}
}
