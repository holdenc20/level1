package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton b1=new JButton();
	JButton b2=new JButton();
	int jokenumb=1;
	int punchnumb=1;
public static void main(String[] args) {
	ChuckleClicker m=new ChuckleClicker();
	
	m.makeButtons();
	
}
void makeButtons(){
	JFrame frame=new JFrame();
	JPanel p=new JPanel();
	frame.setVisible(true);
	frame.setSize(200, 70);
	
	b1.setText("joke");
	b1.addActionListener(this);
	
	b2.setText("punchline");
	b2.addActionListener(this);
	p.add(b1);
	p.add(b2);
	frame.add(p);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e);
	if(e.getSource()==b1 && jokenumb==1){
	JOptionPane.showMessageDialog(null,"Why are there no tests in zoos","joke", 0);
	jokenumb++;
}
	if(e.getSource()==b2 && jokenumb==2){
		JOptionPane.showMessageDialog(null, "Because there are too many cheatas", "punchline",0);
		punchnumb++;
			}
	if(e.getSource()==b1 && jokenumb==2){
		JOptionPane.showMessageDialog(null,"","joke", 0);
		jokenumb--;
}
	
	if(e.getSource()==b2 && punchnumb==1){
	JOptionPane.showMessageDialog(null, "Because there are too many cheatas", "punchline",0);
	punchnumb++;
		}
	if(e.getSource()==b1 && punchnumb==2){
		JOptionPane.showMessageDialog(null,"Why are there no tests in zoos","joke", 0);
		punchnumb--;
	}
	}
}
