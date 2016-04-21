package level1;

public class ducks {
String name;
int numberofeggs;
ducks(String name,int numberofeggs){
	this.name=name;
	this.numberofeggs=numberofeggs;
	
}
	
void quack(){
	System.out.println("Quack!");
}
void waddle(){
	System.out.println(this.name+" is waddling");
}
}

