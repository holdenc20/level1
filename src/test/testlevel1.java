package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testlevel1 implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	
public static void main(String[] args) {
	testlevel1 setup = new testlevel1();
	setup.setup();
}
public void setup(){
	frame.setTitle("Color Teacher");
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 500);
	panel.add(b1);
	b1.setBackground(Color.YELLOW);
	b1.setOpaque(true);
	b1.addActionListener(this);
	panel.add(b2);
	b2.setBackground(Color.RED);
	b2.setOpaque(true);
	b2.addActionListener(this);
	panel.add(b3);
	b3.setBackground(Color.BLUE);
	b3.setOpaque(true);
	b3.addActionListener(this);
	panel.add(b4);
	b4.setBackground(Color.GREEN);
	b4.setOpaque(true);
	b4.addActionListener(this);
	frame.pack();
}
public void speak(String words){
	try{
		Runtime.getRuntime().exec("say "+ words);
	} catch(IOException e){
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	testlevel1 talker = new testlevel1();
	if(b1==e.getSource()){
		talker.speak("Yellow");
	}
	if(b2==e.getSource()){
		talker.speak("Red");
	}
	if(b3==e.getSource()){
		talker.speak("Blue");
	}
	if(b4==e.getSource()){
		talker.speak("Green");
	}
}
}
