package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fortuneCookie2 implements ActionListener{
	JButton button = new JButton();
public static void main(String[] args) {
	fortuneCookie2 cookie=new fortuneCookie2();
	cookie.showbutton();
}
void showbutton(){
	JFrame frame = new JFrame();
	frame.add(button);
	button.setText("Open Cookie");
	frame.setVisible(true);
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Woohoo");
	int rand = new Random().nextInt(5);
	if(rand==0){
		System.out.println("You will become lucky");
	}
	if(rand==1){
		System.out.println("You will die");
	}
	if(rand==2){
		System.out.println("You will fail at everything");
	}
	if(rand==3){
		System.out.println("You will eat another fortune cookie");
	}
	if(rand==3){
		System.out.println("The world will end");
	}
}
}
