package com.company.game;

import java.awt.Color;
import java.awt.Graphics;

import com.company.game.utils.GameConstants;

public class Ball implements GameConstants{

	int x = 50;
	int y = 50;
	int speed = getRandom();
	int ySpeed = getRandom();
	int w = getRandom() * 10;
	int h = w;
	Color color = getRandomColor();
	
	int getRandom() {
		int speed = (int) ( Math.random() * 10 );
//		System.out.println("Random speed - " + speed);
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
//		g.setColor(color);
//		g.setColor(getRandomColor());
		g.setColor(color);
		g.fillOval(x, y, w, h);
//		g.fillOval(x, y, Math.abs(speed*25), Math.abs(ySpeed*25));
//		g.fillOval(x, y, getRandom()*25, getRandom()*25);
//		int red = color.getRed();  // 101
//		int green = color.getGreen();  // 151
//		int blue = color.getBlue();  // 201
//		red = red + 1 > 255 ? 0 : red + 1;
//		green = green + 2 > 255 ? 0 : green + 2;
//		blue = blue + 3 > 255 ? 0 : blue + 3;
//		color = new Color(red, green, blue);
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
}
