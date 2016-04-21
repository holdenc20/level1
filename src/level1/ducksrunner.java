package level1;

public class ducksrunner {
public static void main(String[] args) {
	ducks quack=new ducks("Quack",21);
	ducks chicken=new ducks("Chicken",40);
	ducks rooster=new ducks("Rooster", 0);
	ducks feathers = new ducks("Feathers",900);
	ducks dog=new ducks("dog",-52);
	rooster.quack();
	dog.waddle();
	feathers.waddle();
}
}
	