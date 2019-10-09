package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			
			
//			Robot[] robots = new Robot[5];
//		
//			
//			for (int i=0;i<robots.length;i++) {
//				//3. initialize the robots
//				robots[i] = new Robot();
//
//				//4. make each robot start at the bottom of the screen, side by side, facing up
//				
//				robots[i].moveTo(40, 550);
				//https://central.jointheleague.org/levels/Level2/Mod0Recipes/arrays.html
//			}
//			boolean reachTop = false;
//			while(!reachTop) {
//			for (int i=0;i<robots.length;i++) {
//				//5. use another for loop to iterate through the array and make each robot move 
//				//   a random amount less than 50.
//				Random randy = new Random();
//				robots[i].setSpeed(100);
//				
//				
//				if(robots[i].getY() > 70) {
//					
//					robots[i].move(randy.nextInt(50));
//				} else if(robots[i].getY() < 70&&!reachTop) {
//					robots[i].move(0);
//					robots[i].sparkle();
//					reachTop = true;
//					break;
//				}
//					
//				
//			
//			 }
//			}
	Robot[] robots = new Robot[5];
		
			
			for (int i=0;i<robots.length;i++) {
				//3. initialize the robots
				robots[i] = new Robot();

				//4. make each robot start at the bottom of the screen, side by side, facing up
				
				robots[i].moveTo(40, 550);
			}
			
			boolean reachTop = false;
			while(!reachTop) {
			for (int i=0;i<robots.length;i++) {
				//5. use another for loop to iterate through the array and make each robot move 
				//   a random amount less than 50.
				Random randy = new Random();
				robots[i].setSpeed(500);
				
				
				if(robots[i].getY() > 70) {
					robots[i].turn(5);
					robots[i].move(randy.nextInt(50));
				} else if(robots[i].getY() < 70&&!reachTop) {
					robots[i].move(0);
					robots[i].sparkle();
					reachTop = true;
					break;
				}
					
				
			
			 }
			}
			
		}
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
		
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
