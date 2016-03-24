import java.awt.Component;
import java.awt.Frame;

import java.net.MalformedURLException;

import java.net.URL;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {

		Frame quizWindow = new Frame();

		quizWindow.setVisible(true);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String imageUrl = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSl-6FUy548ZnqUt_Bsrtv8Y3d9Djq4zwmgStCk8KLg_KqvrUoUsQ";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(imageUrl);
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		int score = 0;
		String answer = JOptionPane.showInputDialog(null, "Is this a tree");

		if (answer.equalsIgnoreCase("no")) {
			// 7. print "CORRECT" if the user gave the right answer
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		} else {
			// 8. print "INCORRECT" if the answer is wrong
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
		String ImageUrl = "http://i.ebayimg.com/00/s/MTM0MVgxMDgw/z/4bkAAOSwzrxUwDkU/$_35.JPG";
		// 11. add the second image to the quiz window

		Component comp2;
		comp2 = createImage(ImageUrl);
		quizWindow.add(comp2);
		quizWindow.pack();
		// 12. pack the quiz window
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog(null, "Is this one a tree");

		if (answer2.equalsIgnoreCase("no")) {
			// 7. print "CORRECT" if the user gave the right answer
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		} else {
			// 8. print "INCORRECT" if the answer is wrong
			JOptionPane.showMessageDialog(null, "wrong");
		}
		quizWindow.remove(comp2);
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException

	{

		URL url = new URL(imageUrl);

		Icon icon = new ImageIcon(url);

		JLabel imageLabel = new JLabel(icon);

		return imageLabel;

	}

	private static Component createImages(String ImageUrl) throws MalformedURLException

	{

		URL url = new URL(ImageUrl);

		Icon icon = new ImageIcon(url);

		JLabel imageLabel = new JLabel(icon);

		return imageLabel;

	}

	/* OPTIONAL */

	// *14. add scoring to your quiz

	// *15. make something happen when mouse enters
	// image(imageComponent.addMouseMotionListener())

}
