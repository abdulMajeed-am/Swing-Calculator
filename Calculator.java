package Project;		//project name

import java.awt.Color;		//displayLabel.setBackground+enter
import java.awt.Font;		//font size inside button
import java.awt.event.ActionEvent;		//action after error
import java.awt.event.ActionListener;		//action 1(implements) ~implements ActionListener+(Ctrl+space) to public class Calculator
import javax.swing.JButton;		//Buttons
import javax.swing.JFrame;		//JFram+(Ctrl+space) 	~(Swing)
import javax.swing.JLabel;		//JLabel+(Ctrl+space)
import javax.swing.SwingConstants;		//displayLabel.setHorizontalAlignment+enter  

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=true;	//3x false   
	boolean flg_DotinDisplay=false; //4x added
	
	float Result;		//13x added
	int OperationIdentifier=0; 		//15x added	// 1-> Addition 2->Multiplication 3->Division 4-> Subtraction 5-> Equal
	float F_Value=0f;		//18x added
	float S_Value=0f;		//19x added
	boolean ActionPerformed=false;

	
	public JLabel result;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton multiButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	JButton backButton;
	JButton darkButton;

	
	public Calculator() {
		JFrame jf=new JFrame("Calculator");		//frame
		jf.setLayout(null);
		jf.setSize(375,600);		//frame size
		jf.setLocation(300,70);		//frame exact location
		
		displayLabel=new JLabel();		//calculating using mouse 
		displayLabel.setBounds(30, 40, 300, 60);		//for calculator screen
		displayLabel.setBackground(Color.lightGray);		//calculator screen background color
		displayLabel.setOpaque(true);		//for color fix 
		displayLabel.setHorizontalAlignment(SwingConstants.CENTER);	//from Align text in JLabel to the right(Stack overflow)
		displayLabel.setForeground(Color.BLACK);		//font color for calculator screen
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		jf.add(displayLabel);		//adding to jf
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 140, 60, 60);		//button size
	    sevenButton.setFont(new Font("Arial", Font.PLAIN, 20));		//font size
	    sevenButton.addActionListener(this);		//seven button on screen (this is using for global)
		jf.add(sevenButton);		//adding to jf
		
		eightButton=new JButton("8");
		eightButton.setBounds(110, 140, 60, 60);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 20));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(190, 140, 60, 60);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 20));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 220, 60, 60);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 20));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(110, 220, 60, 60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 20));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(190, 220, 60, 60);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 20));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 300, 60, 60);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 20));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(110, 300, 60, 60);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(190, 300, 60, 60);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 20));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 380, 60, 60);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setFont(dotButton.getFont().deriveFont(Font.BOLD));		//font size bold
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(110, 380, 60, 60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(190, 380, 60, 60);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 25));
		equalButton.setFont(equalButton.getFont().deriveFont(Font.BOLD));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("%");
		divButton.setBounds(270, 140, 60, 60);
		divButton.setFont(new Font("Arial", Font.PLAIN, 25));
		divButton.setFont(divButton.getFont().deriveFont(Font.BOLD));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multiButton=new JButton("x");
		multiButton.setBounds(270, 220, 60, 60);
		multiButton.setFont(new Font("Arial", Font.PLAIN, 25));
		multiButton.setFont(multiButton.getFont().deriveFont(Font.BOLD));
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(270, 300, 60, 60);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(270, 380, 60, 60);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 25));
		plusButton.setFont(plusButton.getFont().deriveFont(Font.BOLD));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(270, 460, 60, 60);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 10));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		backButton=new JButton("Back");
		backButton.setBounds(190, 460, 60, 60);
		backButton.setFont(new Font("Arial", Font.PLAIN, 10));
		backButton.addActionListener(this);
		jf.add(backButton);
		
		darkButton=new JButton("Dark");
		darkButton.setBounds(110, 460, 60, 60);
		darkButton.setFont(new Font("Arial", Font.PLAIN, 10));
		darkButton.addActionListener(this);
		jf.add(darkButton);
		
		jf.setVisible(true);		//like print
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//for closing calculator running screen
		
	//2x
		//JButton jb= new JButton();

	}
	
	public static void main(String[] args) {
		/* Calculator c= */ 
		new Calculator();		//calculator class&object.
	}
	
	
	
	
	@Override //digit buttons
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	
		
		if(e.getSource()== sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"7");	}	//if we enter key it shows to display screen and add
		
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"8");	}	
		
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"9");	}	
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"4");	}	
		
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"5");	}	
		
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"6");	}	
		
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"1");	}	
		
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"2");	}	
		
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else{ displayLabel.setText(displayLabel.getText()+"3");	}	
		
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
			//1x	isOperatorClicked=false;
			}else{
				if(flg_DotinDisplay || isOperatorClicked==false); //5x added 
				displayLabel.setText(displayLabel.getText()+"0");	
				}	//if we enter key it shows to display screen and add
		
		}else if(e.getSource()== dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0.");
				isOperatorClicked=false;
				flg_DotinDisplay=true; //6x added
			}else{ 
				if(!flg_DotinDisplay) {		//7x added
				displayLabel.setText(displayLabel.getText()+".");
				flg_DotinDisplay=true;		//8x added
				}
			}	
		}else if(e.getSource()== backButton) {
			displayLabel.setText (displayLabel.getText ().substring (0, displayLabel.getText ().length () - 1));
		} if(e.getSource()== darkButton) {
			
		      displayLabel.setText("Dark mode");
		     // darkButton.setBackground(Color.CYAN);
		      
		     displayLabel.setBackground(Color.white);
		     
		
		}else if(e.getSource()== clearButton) {
			
			displayLabel.setText("0");		//9x "0" added	//we don't use get text.bcoz we don't want to add,we want to set only
			isOperatorClicked=true;		//10x added
			flg_DotinDisplay=false;		//11x added
			Result=0f;		//12x added
			OperationIdentifier=0;		//14x added
			F_Value=0;		//16x added
			S_Value=0;		//17x added

  //Operator Buttons	
		}else if(e.getSource()== plusButton) {		//addition
			if(OperationIdentifier!=1&&F_Value!=0 && !isOperatorClicked)		//20x added
			 Func_FinalResultMaker();		//21x added  and create this from left wrong x
			
			OperationIdentifier=1;		//22x added
			if(!isOperatorClicked)		//23x added
			Func_FinalResultMaker();		//24x added
			
		}else if(e.getSource()== minusButton) {		//Subtraction
			if(OperationIdentifier!=4 && F_Value!=0 && !isOperatorClicked)		//30x added
				Func_FinalResultMaker();		//31x added
			
			OperationIdentifier=4;		//32x added
			if(!isOperatorClicked)		//33x added
				Func_FinalResultMaker();		//34x added
				
		}else if(e.getSource()== multiButton) {		//Multiplication
			if(OperationIdentifier!=2 && F_Value!=0 && !isOperatorClicked)		//25x added
				Func_FinalResultMaker();		//26x added	
			
			OperationIdentifier=2;		//27x added
			if(!isOperatorClicked)		//28x added
				Func_FinalResultMaker();		//29x added
			
		}else if(e.getSource()== divButton) {		//Division
			 if(OperationIdentifier!=3 && F_Value!=0 && !isOperatorClicked)		//35x added
				  Func_FinalResultMaker();		//36x added
			  
				OperationIdentifier=3;		//37x added
				if(!isOperatorClicked)		//38x added
					Func_FinalResultMaker();		//39x added
			
		}else if(e.getSource()== equalButton) {		//Equal
			 Func_FinalResultMaker();		//40x added
			 OperationIdentifier=5;		//41x added
		}
	}
	
		
	
	//Main Calculation function
	private void Func_FinalResultMaker() {
		// TODO Auto-generated method stub
		
		switch(OperationIdentifier) {		//42x added
		case 1:		//addition
			if(Result!=0)		//43x added 
				F_Value = Result;		//44x added, etc...
			
			if(F_Value ==0)
				F_Value = Float.parseFloat(displayLabel.getText());
			else
				S_Value = Float.parseFloat(displayLabel.getText());
			
			if(S_Value!=0) {
				ActionPerformed=true;
				Result=F_Value + S_Value;
				displayLabel.setText(""+fmt(Result));		//fmt added  and create this from left wrong x
			}else {
				ActionPerformed=false;
				displayLabel.setText(""+fmt(F_Value));
			}
		
			S_Value=0f;
			break;
			
			
		case 2:		//Multiplication
			if (Result != 0)
	  			F_Value = Result;
	  		
	  		if (F_Value ==0)
	  			F_Value = Float.parseFloat(displayLabel.getText());
	  		else
	  			S_Value = Float.parseFloat(displayLabel.getText());
	  		

	  		if(S_Value !=0.0f) // To avoid Multiplication with 0 at initial stage
	  			Result=F_Value * S_Value;
	  		else
	  			Result=F_Value;

	  		if (S_Value!=0) {
	  			ActionPerformed=true;
	  			Result=F_Value*S_Value;
	  			displayLabel.setText("" + fmt(Result));
	  		}
	  		else {
	  			ActionPerformed=false;
	  			displayLabel.setText("" + fmt(F_Value));
	  		}
	  		S_Value=0;
	  		break;

		case 3:		//Division
			if (Result != 0)
	  			F_Value = Result;
	  		
	  		if (F_Value ==0)
	  			F_Value = Float.parseFloat(displayLabel.getText());
	  		else
	  			S_Value = Float.parseFloat(displayLabel.getText());
	  		

  		
	  		
	  		if (F_Value!=0 && S_Value!=0) {
	  			Result=F_Value/S_Value;
	  			displayLabel.setText("" + fmt(Result));

	  	  		if (S_Value!=0) {
	  	  			ActionPerformed=true;
	  	  		}
	  	  		else
	  	  			ActionPerformed=false;

	  		}
	  		S_Value=0f;
	  		break;
	  		
			
		case 4:		//Subtraction
			if (Result != 0)
	  			F_Value = Result;
	  		
	  		if (F_Value ==0)
	  			F_Value = Float.parseFloat(displayLabel.getText());
	  		else
	  			S_Value = Float.parseFloat(displayLabel.getText());

	  		if (S_Value!=0) {
	  			ActionPerformed=true;
	  			Result=F_Value-S_Value;
	  			displayLabel.setText("" + fmt(Result));
	  		}
	  		else {
	  			ActionPerformed=false;
	  			displayLabel.setText("" + fmt(F_Value));
	  		}

	  		S_Value=0f;
	  		break;

		}
		isOperatorClicked=true;
		flg_DotinDisplay=false;
	}
	
	
	//Function for Formatting , unwanted decimal Zeros if required (for eg, 5+2 = will be 5.0, this modifies as 5 )
public String fmt(double d) { 		//last
	// TODO Auto-generated method stub
	
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	  }
   }	
}