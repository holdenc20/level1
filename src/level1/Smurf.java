package level1;

public class Smurf {
	public static void main(String[] args) {

		Smurfs Bob = new Smurfs("bob");
		Smurfs PapaSmurf=new Smurfs("Papa Smurf");
		Smurfs Smurfette=new Smurfs("Smurfette");
		Bob.eat();
		Bob.getName();
		String hatcolor=Bob.getHatColor();
		System.out.println(hatcolor);
		String gender=Bob.isGirlOrBoy();
		System.out.println(gender);
		PapaSmurf.getName();
		String hatcoloR=PapaSmurf.getHatColor();
		System.out.println(hatcoloR);
		String Gender=PapaSmurf.isGirlOrBoy();
		System.out.println(Gender);
		Smurfette.getName();
		String hatcolOR=Smurfette.getHatColor();
		System.out.println(hatcolOR);
		String GendeR=Smurfette.isGirlOrBoy();
		System.out.println(GendeR);
	}
}