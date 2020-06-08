package com.company.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.company.game.utils.GameConstants;

public class Board extends JPanel implements GameConstants{    // white sheet
	
	int x = 100;
	int y = 100;
	int w = 50;
	int h = 50;
	int speed = 2;
	int ySpeed = 1;
	Timer timer;
	
	public Board() {
		setBackground(Color.BLACK);
		
		timer = new Timer(10, (e) -> repaint());
		timer.start();
		
//		ActionListener a = (e) -> repaint();
	}
	
	int getRandom() {
		int speed = (int) ( Math.random() * 10 );
		System.out.println("Random speed - " + speed);
		return speed == 0 ? 10 : speed;
	}
	
	Color getRandomColor() {
		return new Color((int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ));
	}
	
	void move() {
		x += speed;
		y += ySpeed;
	}
	
	void drawBall(Graphics g) {
		g.setColor(getRandomColor());
//		g.setColor(Color.YELLOW);
		g.fillOval(x, y, w, h);
//		g.fillOval(x, y, Math.abs(speed*25), Math.abs(ySpeed*25));
//		g.fillOval(x, y, getRandom()*25, getRandom()*25);
	}
	
	void changeDirection() {
		if( x + w  > GWIDTH) {
			speed = -getRandom();
		}
		if( x < 0) {
			speed = getRandom();
		}
		if( y + h > GHEIGHT) {
			ySpeed = -getRandom();
		}
		if( y < 0 ) {
			ySpeed = getRandom();
		}
	}

	@Override
	public void paintComponent(Graphics g) {     // paintComponent knows how to paint
//		// graphics is the pen / paint brush which is used to paint things
//		// updates the screen automatically so that older drawings are removed and new objects are printed
		super.paintComponent(g);
//		System.out.println("Paint component called...");
		drawBall(g);
		move();
		changeDirection();
	}
	
}
