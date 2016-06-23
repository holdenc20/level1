package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class loto implements ActionListener {
public static void main(String[] args) {
	int rand1=new Random().nextInt(10);
	int rand2=new Random().nextInt(10);
	int rand3=new Random().nextInt(10);
	int rand4=new Random().nextInt(10);
	loto l=new loto();
	l.makeButton();
}
void makeButton(){
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JButton b=new JButton();
	b.addActionListener(this);
	frame.add(b);
}
@Override
public void actionPerformed(ActionEvent e) {
	int rand1=new Random().nextInt(10);
	int rand2=new Random().nextInt(10);
	int rand3=new Random().nextInt(10);
	int rand4=new Random().nextInt(10);
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null,rand1+rand2+rand3+rand4);
}
}
