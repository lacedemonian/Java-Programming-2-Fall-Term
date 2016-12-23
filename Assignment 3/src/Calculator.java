import javax.swing.*;
import java.awt.*;

/**
 * Created by nnaghibolhosseini on 10/14/2016.
 */
public class Calculator extends JFrame
{
	boolean recalling = false;
	boolean positive = true;
	double memory = 0.0;
	double ram = 0.0;
	String operation;
	
    public Calculator()
    {
        super("Calculator");

        /*
        JButton colorSwitchButton = new JButton("CLEAR CURRENT DISPLAY");
        colorSwitchButton.addActionListener( e ->
        {
            Color c = colorSwitchButton.getBackground();
            c = new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256));
            colorSwitchButton.setBackground(c);
        } );

        add(colorSwitchButton, BorderLayout.SOUTH);
        */

//        JButton randomGenerator = new JButton("Generate");
//        randomGenerator.addActionListener(
//                e -> randomGenerator.setText(Math.random()+""));
//
//        add(randomGenerator, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(5,4,5,5));
        add(buttonPanel, BorderLayout.CENTER);

        JButton oneButton = new JButton("1");
        oneButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton twoButton = new JButton("2");
        twoButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton threeButton = new JButton("3");
        threeButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton fourButton = new JButton("4");
        fourButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton sixButton = new JButton("6");
        sixButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton eightButton = new JButton("8");
        eightButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton nineButton = new JButton("9");
        nineButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton zeroZeroButton = new JButton("00");
        zeroZeroButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton addButton = new JButton("+");
        addButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton subButton = new JButton("-");
        subButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton multButton = new JButton("x");
        multButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton divButton = new JButton("/");
        divButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton mAddButton = new JButton("M+");
        mAddButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton mSubButton = new JButton("M-");
        mSubButton.setFont(new Font("Arial",Font.BOLD,32));
        JButton mrcButton = new JButton("MRC");
        mrcButton.setFont(new Font("Arial",Font.BOLD,32));
        mrcButton.setMargin(new Insets(0,0,0,0));
        JButton negButton = new JButton("+/-");
        negButton.setFont(new Font("Arial",Font.BOLD,32));
        
        
        buttonPanel.add(mAddButton);
        buttonPanel.add(mSubButton);
        buttonPanel.add(mrcButton);
        buttonPanel.add(negButton);
        buttonPanel.add(oneButton);
        buttonPanel.add(twoButton);
        buttonPanel.add(threeButton);
        buttonPanel.add(addButton);
        buttonPanel.add(fourButton);
        buttonPanel.add(fiveButton);
        buttonPanel.add(sixButton);
        buttonPanel.add(subButton);
        buttonPanel.add(sevenButton);
        buttonPanel.add(eightButton);
        buttonPanel.add(nineButton);
        buttonPanel.add(multButton);
        buttonPanel.add(zeroButton);
        buttonPanel.add(zeroZeroButton);
        buttonPanel.add(dotButton);
        buttonPanel.add(divButton);







        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial",Font.BOLD,32));

        textField.addActionListener( e -> System.out.println(textField.getText()));

        add(textField, BorderLayout.NORTH);
        
        JPanel southButtons = new JPanel(new GridLayout(1,2,5,5));
        southButtons.setPreferredSize(new Dimension(360,60));
        
        JButton clearButton = new JButton("CE");
        clearButton.addActionListener( e -> {
        	textField.setText("");
        	recalling = false;
        });
        clearButton.setPreferredSize(new Dimension(180,60));
        clearButton.setFont(new Font("Arial",Font.BOLD,32));
        clearButton.setMargin(new Insets(0,0,0,0));
        
        JButton enterButton = new JButton("=");
        enterButton.addActionListener( e -> {
        	switch(operation){
        	case "+":
        		textField.setText(Double.toString(ram + Double.parseDouble(textField.getText())));
        		break;
        	case "-":
        		textField.setText(Double.toString(ram - Double.parseDouble(textField.getText())));
        		break;
        	case "*":
        		textField.setText(Double.toString(ram * Double.parseDouble(textField.getText())));
        		break;
        	case "/":
        		textField.setText(Double.toString(ram / Double.parseDouble(textField.getText())));
        		break;
        	}
        });
        enterButton.setPreferredSize(new Dimension(180,60));
        enterButton.setFont(new Font("Arial",Font.BOLD,32));

        southButtons.add(clearButton);
        southButtons.add(enterButton);
        add(southButtons, BorderLayout.SOUTH);

        textField.setHorizontalAlignment( SwingConstants.RIGHT);

        oneButton.addActionListener(
                e -> textField.setText( textField.getText() + 1));
        twoButton.addActionListener(
                e -> textField.setText( textField.getText() + 2));
        threeButton.addActionListener(
                e -> textField.setText( textField.getText() + 3));
        fourButton.addActionListener(
                e -> textField.setText( textField.getText() + 4));
        fiveButton.addActionListener(
                e -> textField.setText( textField.getText() + 5));
        sixButton.addActionListener(
                e -> textField.setText( textField.getText() + 6));
        sevenButton.addActionListener(
                e -> textField.setText( textField.getText() + 7));
        eightButton.addActionListener(
                e -> textField.setText( textField.getText() + 8));
        nineButton.addActionListener(
                e -> textField.setText( textField.getText() + 9));
        zeroButton.addActionListener(
                e -> textField.setText( textField.getText() + 0));
        zeroZeroButton.addActionListener(
                e -> textField.setText( textField.getText() + "00"));
        dotButton.addActionListener(
                e -> {
                	if(!textField.getText().contains(".")){
                		textField.setText( textField.getText() + '.');	
                	}
                });
        negButton.addActionListener(
                e -> {
                	if(positive){
                		textField.setText( '-' + textField.getText()); //Add a Negative to the front
                		positive = false; //Indicates Negation
                	}else{
                		textField.setText( textField.getText().substring(1)); // Remove the Negative from the front
                		positive = true;
                	}
                });
        mAddButton.addActionListener(
        		e -> {memory += Double.parseDouble(textField.getText());
        			  mrcButton.setBackground(new Color(0,255,0));});
        mSubButton.addActionListener(
        		e -> memory -= Double.parseDouble(textField.getText()));
        mrcButton.addActionListener(
        		e -> {
        			if(!recalling){
        				textField.setText(Double.toString(memory));
        				recalling = true; //Pressing the button twice without clearing the display will clear the memory.
        			}else{
        				memory = 0.0;
        				textField.setText("");
        				mrcButton.setBackground(new Color(255,0,0));
        			}
        		});
        addButton.addActionListener(
        		e -> {
        			ram = Double.parseDouble(textField.getText());
        			textField.setText("");
        			operation = "+";
        		});
        subButton.addActionListener(
        		e -> {
        			ram = Double.parseDouble(textField.getText());
        			textField.setText("");
        			operation = "-";
        		});
        multButton.addActionListener(
        		e -> {
        			ram = Double.parseDouble(textField.getText());
        			textField.setText("");
        			operation = "*";
        		});
        divButton.addActionListener(
        		e -> {
        			ram = Double.parseDouble(textField.getText());
        			textField.setText("");
        			operation = "/";
        		});

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 400);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}