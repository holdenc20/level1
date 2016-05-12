package level1;

// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fithButton, sixthButton,seventhButton,eightButton,ninthButton;
	
	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = -10
			;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		
		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel name=createHeader("Quesions of impossible answers:");
		JPanel name2=createHeader("Riddles:");
		JPanel name3=createHeader("Logic Puzzels:");
		// 4. Add the header component to the quizPanel
		quizPanel.add(name);
		quizPanel.add(name2);
		quizPanel.add(name3);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		
		// 6. Use the createButton method to set the value of firstButton 
		firstButton=createButton("$200");
		secondButton=createButton("$200");
		thirdButton=createButton("$200");
		fourthButton=createButton("$400");
		fithButton=createButton("$400");
		sixthButton=createButton("$400");
		seventhButton=createButton("$600");
		eightButton=createButton("$600");
		ninthButton=createButton("$600");
	// 7. Add the firstButton to the quizPanel
	quizPanel.add(firstButton);
	quizPanel.add(secondButton);
	quizPanel.add(thirdButton);
	quizPanel.add(fourthButton);
	quizPanel.add(fithButton);
	quizPanel.add(sixthButton);
	quizPanel.add(seventhButton);
	quizPanel.add(eightButton);
	quizPanel.add(ninthButton);
		// 8. Write the code inside the createButton() method below. Check that your game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		
		// 9. Use the secondButton variable to hold a button using the createButton method
		
		// 10. Add the secondButton to the quizPanel
		
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fithButton.addActionListener(this);
		sixthButton.addActionListener(this);
		seventhButton.addActionListener(this);
		eightButton.addActionListener(this);
		ninthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below
				
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount+1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music 
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question 
	 */
	
	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton button1=new JButton();
		// Set the text of the button to the dollarAmount
		button1.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button
		
		return new JButton(dollarAmount);
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		// Use the method that plays the jeopardy theme music.
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed==firstButton){
			askQuestion("What is your favorite color?","It is not what you think it is",200);
			firstButton.removeActionListener(this);
			firstButton.setText("-----");
		}
		if(buttonPressed==thirdButton){
			askQuestion("The human body holds nine quarts of blood. Suppose you were alone in the desert and accidently cut a major artery. If you bleed at one cup a minute, how long will it take you to bleed to death?","Apply a tourniquet, and you won't.",200);
			thirdButton.removeActionListener(this);
			thirdButton.setText("-----");
		}
		if(buttonPressed==fourthButton){
			askQuestion("What is the answer?","",400);
			fourthButton.removeActionListener(this);
			fourthButton.setText("-----");
		}
		if(buttonPressed==fithButton){
			askQuestion("In a one-story pink house, there was a pink person, a pink cat, a pink fish, a pink computer, a pink chair, a pink table, a pink telephone, a pink shower– everything was pink! What color were the stairs?","It did not have stairs",400);
			fithButton.removeActionListener(this);
			fithButton.setText("-----");
		}
		if(buttonPressed==sixthButton){
			askQuestion("What's the largest amount of money you can have in change and still not have change for a dollar?","$1.19",400);
			sixthButton.removeActionListener(this);
			sixthButton.setText("-----");
		}
		if(buttonPressed==seventhButton){
			askQuestion("Why are pizza boxes square when the pizza is round?","Because why not",600);
			seventhButton.removeActionListener(this);
			seventhButton.setText("-----");
		}
		if(buttonPressed==eightButton){
			askQuestion("Who makes it, has no need of it.Who buys it, has no use for it.  uses it can neither see nor feel it. What is it?","a coffin",600);
			eightButton.removeActionListener(this);
			eightButton.setText("-----");
		}
		if(buttonPressed==ninthButton){
			askQuestion("A certain five letter word becomes shorter when you add two letters to it. What is the word?","short",600);
			ninthButton.removeActionListener(this);
			ninthButton.setText("-----");
		}
		
			// Call the askQuestion() method
			
			// Fill in the askQuestion() method. When you play the game, the score should change.
		
		// Or if the buttonPressed was the secondButton
		if(buttonPressed==secondButton){
			askQuestion("I’m tall when I’m young and I’m short when I’m old. What am I?","a candle",400);
			secondButton.removeActionListener(this);
			secondButton.setText("-----");
		}

			// Call the askQuestionRecipe with a harder question
			
		
		// Clear the button text (set the button text to nothing)
		
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		String answer=JOptionPane.showInputDialog( question);
		// Use a pop up to ask the user the question
		
		// If the answer is correct
		if(answer.equalsIgnoreCase(correctAnswer)){
			score=score+prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null,"correct!");
		}
			// Increase the score by the prizeMoney
			
			// Call the updateScore() method
			
			// Pop up a message to tell the user they were correct
			
		// Otherwise
		else{
			score=score-prizeMoney;
			JOptionPane.showMessageDialog(null,"INCORRECT, the correct answer is: "+ correctAnswer);
			updateScore();
		}
			// Decrement the score by the prizeMoney
			
			// Pop up a message to tell the user the correct answer
			
			// Call the updateScore() method
			
		
	}


public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}

