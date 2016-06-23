package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
public static void main(String[] args) {
	FortuneCookie cooky =new FortuneCookie();
	cooky.showButton();
	
}
void showButton(){
	JFrame frame=new JFrame();
	frame.setSize(800,800);
	JButton button = new JButton();
	frame.setVisible(true);
	frame.add(button);
	
	button.setText("button");
	button.addActionListener(this);
	System.out.println("HI");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String fortune="";
	int rand = new Random().nextInt(5);
	if (rand==1){
	fortune="You will die";
	}
	if (rand==2){
	fortune ="You will become rich!"	;
	}
	if(rand==3){
	fortune="You will fail at everything";
	}
	if(rand==4){
	fortune	="you will become lucky";
	}
	if(rand == 0){
	fortune="the world will end";	
	}

	JOptionPane.showMessageDialog(null, fortune);
	}
}
