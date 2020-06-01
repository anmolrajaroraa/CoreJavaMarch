package com.company.game;

import javax.swing.JFrame;

import com.company.game.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants{
	
	public GameFrame() {
		setVisible(true);
		setSize(GWIDTH, GHEIGHT);
//		setLocation(100, 100);
		setLocationRelativeTo(null);
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
//		GameFrame frame2 = new GameFrame();

	}

}
