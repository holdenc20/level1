package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicke implements ActionListener{
	JButton joke = new JButton();
		JButton punchline = new JButton();
	
	public static void main(String[] args) {
		
		ChuckleClicke n = new ChuckleClicke();
		n.buttons();

}
	void buttons(){
		JFrame frame = new JFrame();
		frame.setSize(300, 100);
		JPanel panel = new JPanel();
		joke.setText("Joke");
		punchline.setText("Punchline");
		frame.add(panel);
		
		panel.add(joke);
		panel.add(punchline);
		frame.setVisible(true);
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==joke){
		JOptionPane.showMessageDialog(null, "Why are there no tests in zoos?");
		
	}
	if(e.getSource()==punchline){
		JOptionPane.showMessageDialog(null, "Because there are too many cheatas");
	}
	
}
}
