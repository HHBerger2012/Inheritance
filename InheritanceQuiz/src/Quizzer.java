import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Quizzer
	{
		static JFrame frame=new JFrame();
		static String name;
		static String first;
		static int one;
		static String second;
		public static void main(String[] args)
			{
				doIntro();
				doQuestion();
			}
		public static void doIntro()
		{
			ImageIcon icon =  new ImageIcon("56.gif");
			name = (String)JOptionPane.showInputDialog(
                    frame,
                    "Welcome to the Inheritance Quiz. What is your name?",
                    "Inheritance Quiz",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,  
                    null); 
			ImageIcon icon2 =  new ImageIcon("tyty.gif");
			JOptionPane.showMessageDialog(
					frame, 
					"Well "+name+". Here is a multiple choice Inheritance Quiz. Goodluck", 
					"Inheritance Quiz", 
					JOptionPane.INFORMATION_MESSAGE, icon2); 
		}
		public static void doQuestion()
		{
			one = (int)(Math.random()*4+1);
			switch (one)
			{
				case 1:
						{
							first="Literature x = new Literature();";
						}
				case 2:
						{
							first="Literature x = new Novel();";
						}
				case 3:
						{
							first="Novel x = new Literature();";
						}
				case 4:
						{
							first="Novel x = new Novel();";
						}
			}
			int randNum = (int)(Math.random()*2);
			String [] two=new String[3];
			two[0]="x.novelMethodOne();";
			two[1]="x.litMethodTwo();";
			two[2]="x.litMethodOne();";
			System.out.println("Instantiate: "+first);
			System.out.println("Call: "+ two[randNum]);
			System.out.println();
			System.out.println("What will it run?");
			System.out.println("(1) "+ "Answer one");
			System.out.println("(2) "+ "Answer two");
			System.out.println("(3) "+ "Answer three");
			System.out.println("(4) "+ "Answer four");
		
		}
	}
