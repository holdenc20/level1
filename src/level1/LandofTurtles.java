package level1;

import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandofTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame frame=new JFrame();
frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		frame.setSize(1000, 1000);
		// 3. Set the background image of the panel to the Galapagos Islands 
		String image="landofturtles.jpeg";
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 
		
// 5. Add the turtle to the panel 
for(int x=0;x<9999;x++){
	Turtle mike=new Turtle();
	int b=new Random().nextInt(500);
	int y=new Random().nextInt(500);
	mike.setX(500+b);
	mike.setY(300+y);
	panel.addTurtle(mike);
	}
		// 6. Put 50 Turtles on the beach

	}
}
