package level1;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	Bug bug1=new Bug();
	Bug bug2=new Bug();
	Flower flower1=new Flower();
	Flower flower2=new Flower();
	Location bloc1=new Location(1, 1);
	int x=new Random().nextInt(10);
	int y=new Random().nextInt(10);
	Location bloc2=new Location(x, y);
	Location floc1=new Location(x,y-1);
	Location floc2=new Location(x,y+1);
	world.add(bloc1,bug1);
	world.add(bloc2, bug2);
	world.add(floc1, flower1);
	world.add(floc2, flower2);
	bug2.setColor(Color.blue);
	bug2.turn();
	bug2.turn();
}
}
