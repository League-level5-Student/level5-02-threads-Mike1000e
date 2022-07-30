package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	
	public static void main(String[] args) {
		Robot topLeft = new Robot(100,100);
		Robot topMid = new Robot(100,100);
		Robot topRight = new Robot(100,100);
		Robot bottomLeft = new Robot(100,100);
		Robot bottomRight = new Robot(100,100);
		
		topLeft.setSpeed(10);
		topMid.setSpeed(10);
		topRight.setSpeed(10);
		bottomLeft.setSpeed(10);
		bottomRight.setSpeed(10);
		
		Thread tl = new Thread(()->topLeft.moveTo(100, 100));
		Thread tm = new Thread(()->topMid.moveTo(200, 100));
		Thread tr = new Thread(()->topRight.moveTo(300, 100));
		Thread bl = new Thread(()->bottomLeft.moveTo(150, 200));
		Thread br = new Thread(()->bottomRight.moveTo(250, 200));
		
		Thread tl2 = new Thread(()->topLeft.move(0)
		
		tl.start();
	}
}

