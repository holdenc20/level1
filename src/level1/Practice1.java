package level1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practice1 implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
JLabel label = new JLabel();

JTextField text = new JTextField(20);

int riddlenum = 0;
public static void main(String[] args)  {
	Practice1 riddle = new Practice1();
	riddle.riddle();
}
private void riddle() {
	frame.setSize(1000,1000);
	frame.add(panel);
	frame.setVisible(true);
	panel.add(b1);
	b1.addActionListener(this);
	b1.setText("Answer");
	panel.add(b2);
	b2.addActionListener(this);
	b2.setText("Clue");
	panel.add(label);
	panel.add(text);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(b1 == e.getSource()){
		
		if(text.getText()=="An apple"){
			JOptionPane.showMessageDialog(null,"Correct");
		}
		else{
			JOptionPane.showMessageDialog(null,"Incorrect");
		}
	}
	if(b2 == e.getSource()){
		label.setText("It is an apple");
	}
}
}
