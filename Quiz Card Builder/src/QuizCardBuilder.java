import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;


//__________________________________________________________

public class QuizCardBuilder {
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame,frame1;
	String Copy1,Copy2 = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardBuilder B = new QuizCardBuilder();
		B.go();
	}
	
	void go() {
		frame = new JFrame("Quiz Card Builder..");
		JPanel mainPanel = new JPanel();
		//mainPanel.setBackground(Color.BLUE);
		Font BigFont = new Font("sanserif",Font.BOLD,24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(BigFont);
		
		JScrollPane qScroll = new JScrollPane(question);
		qScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(BigFont);
		
		JScrollPane aScroll = new JScrollPane(answer);
		aScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card..");
		
		cardList = new ArrayList<QuizCard>();
		
		JLabel qlabel = new JLabel("Question:");
		JLabel alabel = new JLabel("Answer");
		
		
		
		
		mainPanel.add(qlabel);
		mainPanel.add(qScroll);
		mainPanel.add(alabel);
		mainPanel.add(aScroll);
		mainPanel.add(nextButton);
		
		nextButton.addActionListener(new NextCardListener());
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");

		JMenuItem copyMenuItem1 = new JMenuItem("Copy");
		JMenuItem pasteMenuItem1 = new JMenuItem("Paste");
		JMenuItem openMenuItem1 = new JMenuItem("Open");

		newMenuItem.addActionListener(new NewMenuListener());
		copyMenuItem1.addActionListener(new copyCardListener());
		pasteMenuItem1.addActionListener(new pasteCardListener());
		openMenuItem1.addActionListener(new openCardListener());

		
		saveMenuItem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		editMenu.add(copyMenuItem1);
		editMenu.add(pasteMenuItem1);
		fileMenu.add(openMenuItem1);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
		
		
		frame1.setSize(200,300);
		frame1.setVisible(true);
		
	}
	
	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardList.add(card);
			clearCard();
			}	
	}
	
	public class SaveMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardList.add(card);
			
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
			
		}
	}
	
	public class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			cardList.clear();
			clearCard();
		}
	}
	
	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	private void saveFile(File file) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			for(QuizCard card:cardList) {
				writer.write(card.getQustion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public class copyCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			Copy1 = question.getText();
			Copy2 = answer.getText();
		}
	}
	
	public class pasteCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			String Copy3 = Copy1 + " ";
			String Copy4 = Copy2 + " ";

			question.setText(Copy3);
			answer.setText(Copy4);
		}
	}
	
	public class openCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame1);
			loadFile(fileOpen.getSelectedFile());
		}
	}
	
	private void loadFile(File file) {
		cardList = new ArrayList<QuizCard>();
		try {
			BufferedReader B = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = B.readLine()) != null) {
				makeCard(line);
				for(QuizCard card:cardList) {
					System.out.println(card);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void makeCard(String lineToParse) {
		String[] result = lineToParse.split("/");
		question.setText(result[0]);
		answer.setText(result[1]);
		QuizCard card = new QuizCard(result[0],result[1]);
		cardList.add(card);
		System.out.println("Made A Card..!");
	}
	
	

}
