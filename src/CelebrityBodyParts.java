import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebrityBodyParts {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "drum.jpg";
	String secondImage = "drum2.jpg";
	String thirdImage = "drum3.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(100, 100);;	
		// Make an int variable to hold the score.
		int score=0;
		// Ask the user who this person is and store their answer
		String player1=JOptionPane.showInputDialog("Who is this person");
		// If they got the answer right:
		// -- Tell them they are correct.
		if(player1.equals("q")){
		score=score+1;
		JOptionPane.showMessageDialog(null,"Correct");
		
		}
		// -- Increase the score by 1
		
		// Otherwise:
		else{
		JOptionPane.showMessageDialog(null, "Incorrect");	
		}
		// -- Tell them they are wrong
		JOptionPane.showMessageDialog(null, "The score is "+score);
		// Use the method below to show the next image
		// Show the score
		
		// .... repeat for all your images.....
		showNextImage();
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebrityBodyParts quiz = new CelebrityBodyParts();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

