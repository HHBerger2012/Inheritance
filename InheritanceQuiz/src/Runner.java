import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner
{
		static JFrame frame=new JFrame();
		static String name;
		static String number;
		static String first;
		static String correctAnswer;
		static String correctAnswer2;
		static String correctAnswer3;
		static String correctAnswer4;
		static String correctAnswer5;
		static String second;
		static String[] one=new String[4];
		static String [] two=new String[3];
		static int randNum1;
		static int randNum;
		static int counter;
		static int answerCounter;
		static int newNumber;
		public static void main(String[] args)
			{
				doIntro();
				doQuestion();
				checkAnswer();
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
				ImageIcon icon3 =  new ImageIcon("56.gif");
				number = (String)JOptionPane.showInputDialog(
	                    frame,
	                    "How Many Questions Do You Want to Answer?",
	                    "Inheritance Quiz",
	                    JOptionPane.PLAIN_MESSAGE,
	                    icon3,
	                    null,  
	                    null); 
			}
		public static void doQuestion()
			{
				one[0]="Literature x = new Literature();";
				one[1]="Literature x = new Novel();";
				one[2]="Novel x = new Literature();";
				one[3]="Novel x = new Novel();";
				two[0]="x.novelMethodOne();";
				two[1]="x.litMethodTwo();";
				two[2]="x.litMethodOne();";
			}
		public static void checkAnswer()
		{
			int newNumber = Integer.parseInt(number);
			for (int i=0;i<newNumber;i++)
				{
					
					randNum1 = (int)(Math.random()*4);
					randNum = (int)(Math.random()*3);
					if (randNum1==2||randNum1==0&&randNum==0)
						{
							correctAnswer="It Will Throw an Error";
							correctAnswer2="Novel Method One";
							correctAnswer3="Novel Method Two";
							correctAnswer4="Literature Method One";
							correctAnswer5="Literature Method Two";
						}
					if (randNum1==1&&randNum==0)
					{
						correctAnswer="Novel Method One";
						correctAnswer2="It Will Throw an Error";
						correctAnswer3="Literature Method One";
						correctAnswer4="Literature Method Two";
						correctAnswer5="Novel Method Two";
					}
					if (randNum1==0&&randNum==1)
						{
							correctAnswer="Literature Method Two";
							correctAnswer2="It Will Throw an Error";
							correctAnswer3="Literature Method One";
							correctAnswer4="Novel Method One";
							correctAnswer5="Novel Method Two";
						}
					if (randNum1==0&&randNum==2)
						{
							correctAnswer="Literature Method One";
							correctAnswer2="Literature Method Two";
							correctAnswer3="Novel Method One";
							correctAnswer4="Novel Method Two";
							correctAnswer5="It Will Throw an Error";
						}
					if (randNum1==1&&randNum==1)
						{
							correctAnswer="Novel Method Two";
							correctAnswer2="Literature Method One";
							correctAnswer3="Literature Method Two";
							correctAnswer4="Novel Method One";
							correctAnswer5="It Will Throw an Error";
						}
					if (randNum1==1&&randNum==2)
						{
							correctAnswer="Literature Method One";
							correctAnswer2="Literature Method Two";
							correctAnswer3="Novel Method One";
							correctAnswer4="Novel Method Two";
							correctAnswer5="It Will Throw an Error";
						}
					if (randNum1==3&&randNum==0)
						{
							correctAnswer="Novel Method One";
							correctAnswer2="Novel Method Two";
							correctAnswer3="Literature Method One";
							correctAnswer4="Literature Method Two";
							correctAnswer5="It Will Throw an Error";
						}
					if (randNum1==3&&randNum==1)
						{
							correctAnswer="Novel Method Two";
							correctAnswer2="Novel Method One";
							correctAnswer3="Literature Method One";
							correctAnswer4="Literature Method Two";
							correctAnswer5="It Will Throw an Error";
						}
					if (randNum1==3&&randNum==2)
						{
							correctAnswer="Literature Method One";
							correctAnswer2="Literature Method Two";
							correctAnswer3="Novel Method One";
							correctAnswer4="Novel Method Two";
							correctAnswer5="It Will Throw an Error";
						}
			int answer = (int)(Math.random()*5)+1;
			switch(answer)
			{
				case 1:
						{
							counter++;
							System.out.println("Instantiate: "+one[randNum1]);
							System.out.println("Run: "+two[randNum]);
							System.out.println();
							System.out.println("(1) "+correctAnswer);
							System.out.println("(2) "+correctAnswer2);
							System.out.println("(3) "+correctAnswer3);
							System.out.println("(4) "+correctAnswer4);
							System.out.println("(5) "+correctAnswer5);
							Scanner input = new Scanner(System.in);
							int guess = input.nextInt();
							if (guess==1)
								{
									answerCounter++;
									ImageIcon icon2 =  new ImageIcon("909090.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"Correct!", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							else
								{
									ImageIcon icon2 =  new ImageIcon("bgbg.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"That's Not Right", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							break;
						}
				case 2:
						{
							counter++;
							System.out.println("Instantiate: "+one[randNum1]);
							System.out.println("Run: "+two[randNum]);
							System.out.println();
							System.out.println("(1) "+correctAnswer2);
							System.out.println("(2) "+correctAnswer);
							System.out.println("(3) "+correctAnswer3);
							System.out.println("(4) "+correctAnswer4);
							System.out.println("(5) "+correctAnswer5);
							Scanner input = new Scanner(System.in);
							int guess = input.nextInt();
							if (guess==2)
								{
									answerCounter++;
									ImageIcon icon2 =  new ImageIcon("909090.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"Correct!", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							else
								{
									ImageIcon icon2 =  new ImageIcon("bgbg.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"That's Not Right", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							break;
						}
				case 3:
						{
							counter++;
							System.out.println("Instantiate: "+one[randNum1]);
							System.out.println("Run: "+two[randNum]);
							System.out.println();
							System.out.println("(1) "+correctAnswer2);
							System.out.println("(2) "+correctAnswer3);
							System.out.println("(3) "+correctAnswer);
							System.out.println("(4) "+correctAnswer4);
							System.out.println("(5) "+correctAnswer5);
							Scanner input = new Scanner(System.in);
							int guess = input.nextInt();
							if (guess==3)
								{
									answerCounter++;
									ImageIcon icon2 =  new ImageIcon("909090.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"Correct!", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							else
								{
									ImageIcon icon2 =  new ImageIcon("bgbg.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"That's Not Right", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							break;
						}
				case 4:
						{
							counter++;
							System.out.println("Instantiate: "+one[randNum1]);
							System.out.println("Run: "+two[randNum]);
							System.out.println();
							System.out.println("(1) "+correctAnswer2);
							System.out.println("(2) "+correctAnswer3);
							System.out.println("(3) "+correctAnswer4);
							System.out.println("(4) "+correctAnswer);
							System.out.println("(5) "+correctAnswer5);
							Scanner input = new Scanner(System.in);
							int guess = input.nextInt();
							if (guess==4)
								{
									answerCounter++;
									ImageIcon icon2 =  new ImageIcon("909090.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"Correct!", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							else
								{
									ImageIcon icon2 =  new ImageIcon("bgbg.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"That's Not Right", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							break;
						}
				case 5:
						{
							counter++;
							System.out.println("Instantiate: "+one[randNum1]);
							System.out.println("Run: "+two[randNum]);
							System.out.println();
							System.out.println("(1) "+correctAnswer2);
							System.out.println("(2) "+correctAnswer3);
							System.out.println("(3) "+correctAnswer4);
							System.out.println("(4) "+correctAnswer5);
							System.out.println("(5) "+correctAnswer);
							Scanner input = new Scanner(System.in);
							int guess = input.nextInt();
							if (guess==5)
								{
									answerCounter++;
									ImageIcon icon2 =  new ImageIcon("909090.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"Correct!", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							else
								{
									ImageIcon icon2 =  new ImageIcon("hnhbg.gif");
									JOptionPane.showMessageDialog(
											frame, 
											"That's Not Right", 
											"Inheritance Quiz", 
											JOptionPane.INFORMATION_MESSAGE, icon2); 
								}
							break;
						}
					}
				}
			ImageIcon icon2 =  new ImageIcon("tyty.gif");
			JOptionPane.showMessageDialog(
					frame, 
					"You got "+answerCounter+"/"+counter, 
					"Inheritance Quiz", 
					JOptionPane.INFORMATION_MESSAGE, icon2); 			
			}
}