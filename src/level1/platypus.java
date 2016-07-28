package level1;

public class platypus {
	static platypus a = new platypus("perry",15);
	static platypus b = new platypus("sneaky",9);
	static platypus c = new platypus("h",10);
	private String name;
	int lengthofbill;//inches
	void compare(platypus platypus1,platypus platypus2){
		if(platypus1.lengthofbill>platypus2.lengthofbill){
			int dif=platypus1.lengthofbill-platypus2.lengthofbill;
			System.out.println(platypus1.name+"'s bill is "+dif+" inches longer than "+platypus2.name+"'s bill");
		}
		if(platypus2.lengthofbill>platypus1.lengthofbill){
			int dif=platypus2.lengthofbill-platypus1.lengthofbill;
			System.out.println(platypus2.name+"'s bill is "+dif+" inches longer than "+platypus1.name+"'s bill");
		}
	}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		a.compare(a,b);
		//1. Make an instance of your new pet platypus

		//2. Call the sayHi method
		a.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
	public platypus(String name,int length){
		this.name=name;
		this.lengthofbill=length;
	}
}

