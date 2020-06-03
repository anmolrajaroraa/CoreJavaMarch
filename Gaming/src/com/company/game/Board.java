package com.company.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel{    // white sheet
	
	public Board() {
		setBackground(Color.BLACK);
	}

//	@Override
//	public void paintComponent(Graphics g) {     // paintComponent knows how to paint
//		// graphics is the pen / paint brush which is used to paint things
//		// updates the screen automatically so that older drawings are removed and new objects are printed
//		super.paintComponent(g);
//		System.out.println("Paint component called...");
//	}
	
}
