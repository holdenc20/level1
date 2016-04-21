package level1;

public class SpongeBob {
public static void main(String[] args) {
	SeaCreature spongebob=new SeaCreature("SpongeBob");
	SeaCreature squidward=new SeaCreature("Squidward");
	SeaCreature patrick=new SeaCreature("Patrick");
	spongebob.eat();
	spongebob.laugh();
	squidward.eat();
	squidward.laugh();
	patrick.eat();
	patrick.laugh();
}
}
