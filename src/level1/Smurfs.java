package level1;

//Copyright Wintriss Technical Schools 2013
/* 
* 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
* 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
* 
* 5. Make a Papa Smurf and print his name, hat color and girl or boy.
* 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurfs {
	
	private String name;

	Smurfs(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println(name + " is the name");
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(name.equalsIgnoreCase("papa smurf")){
			return name+ " wears a red hat";
		}
		else{
			return name + " wears a white hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if(name.equalsIgnoreCase("smurfette")){
		return name+" is a girl";
		}
		return name +" is a boy";
	}

}


