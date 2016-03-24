

import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
			String small="60";
			String medium="120";
			String large="200";
			String x;
			for(int i=0;i<9;i++){
				if(i%3==1){
					 x=small;
					 Tortoise.setPenColor(Color.blue);
				}
				else if(i%3==0){
					x=medium;
					Tortoise.setPenColor(Color.RED);
				}
				else{
					 x=large;
					 Tortoise.setPenColor(Color.YELLOW);
				}
			drawhouse(x,i);
			}
	}
	private static void drawpointyroof(){
		Tortoise.turn(45);
		Tortoise.move(10);
		Tortoise.turn(90);
		Tortoise.move(10);
		Tortoise.turn(45);
	}
	private static void drawflatroof(){
		Tortoise.turn(90);
		Tortoise.move(15);
		Tortoise.turn(90);
	}
	private static void drawhouse(String heightt,int i){
		int height=Integer.parseInt(heightt);
		Tortoise.setSpeed(10);
		Tortoise.move(height);
		int d=new Random().nextInt(2);
		if(i%3==2){
		d=0;	
		}
		if(d==1){
			drawpointyroof();
		}
		else{
			drawflatroof();
		}
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(10);
		Tortoise.setPenColor(Color.BLACK);
		Tortoise.turn(-90);
		}
}
