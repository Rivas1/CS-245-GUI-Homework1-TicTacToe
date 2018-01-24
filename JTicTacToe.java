/**
 *	Name:		Rivas, Christopher
 *	Homework:	1
 *	Due:		01/22/2018
 *	Course:		cs24501-w18
 *
 *	Description:
 *				This program creates a framework for TicTacToe
 *				When clicking one of the nine squares, button
 *				will change to either an 'X' or 'O', where X
 *				always moves first.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTicTacToe implements ActionListener
{
	int num = 0;
	private JLabel label;
	
	Font buttonFont = new Font ( "Arial", Font.BOLD, 120 );
	// Create buttons 
	JButton Button1 = new JButton("");
	JButton Button2 = new JButton("");
	JButton	Button3 = new JButton("");
	JButton	Button4 = new JButton("");
	JButton	Button5 = new JButton("");
	JButton	Button6 = new JButton("");
	JButton	Button7 = new JButton("");
	JButton	Button8 = new JButton("");
	JButton Button9 = new JButton("");

	public JTicTacToe ()
	{
		JFrame frm = new JFrame ("Tic Tac Toe framework!");
		GridLayout TTTGrid = new GridLayout( 3, 3 );
		frm.setLayout( TTTGrid );
		frm.setSize( 400, 400 );
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add buttons to content pane
		frm.add(Button1);
		frm.add(Button2);
		frm.add(Button3);
		frm.add(Button4);
		frm.add(Button5);
		frm.add(Button6);
		frm.add(Button7);
		frm.add(Button8);
		frm.add(Button9);

		// Add action listeners
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Button4.addActionListener(this);
		Button5.addActionListener(this);
		Button6.addActionListener(this);
		Button7.addActionListener(this);
		Button8.addActionListener(this);
		Button9.addActionListener(this);
		
		// Change font
		Button1.setFont( buttonFont );
		Button2.setFont( buttonFont );
		Button3.setFont( buttonFont );
		Button4.setFont( buttonFont );
		Button5.setFont( buttonFont );
		Button6.setFont( buttonFont );
		Button7.setFont( buttonFont );
		Button8.setFont( buttonFont );
		Button9.setFont( buttonFont );

		frm.setVisible(true);

	}

	public void actionPerformed( ActionEvent e )
	{		
		if ( num == 0 )
		{ 
			if (e.getSource() == Button1 )
				Button1.setText("X");
			if (e.getSource() == Button2 )
				Button2.setText("X");
			if (e.getSource() == Button3 )
				Button3.setText("X");
			if (e.getSource() == Button4 )
				Button4.setText("X");
			if (e.getSource() == Button5 )
				Button5.setText("X");
			if (e.getSource() == Button6 )
				Button6.setText("X");
			if (e.getSource() == Button7 )
				Button7.setText("X");
			if (e.getSource() == Button8 )
				Button8.setText("X");
			if (e.getSource() == Button9 )
				Button9.setText("X");
			num = 1; // set n to 1 so that next command is "O"
			
			return;
		}
		
		if ( num == 1 )
		{
			if (e.getSource() == Button1 )
				Button1.setText("O");
			if (e.getSource() == Button2 )
				Button2.setText("O");
			if (e.getSource() == Button3 )
				Button3.setText("O");
			if (e.getSource() == Button4 )
				Button4.setText("O");
			if (e.getSource() == Button5 )
				Button5.setText("O");
			if (e.getSource() == Button6 )
				Button6.setText("O");
			if (e.getSource() == Button7 )
				Button7.setText("O");
			if (e.getSource() == Button8 )
				Button8.setText("O");
			if (e.getSource() == Button9 )
				Button9.setText("O");
			
			num = 0; // set n to 0 

			return;
		}
		
	}
	public static void main (String args[])
	{
		// GraphicsEnvironment ge;
		// ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// String[] fontsList = new String[10000];
		// fontsList = ge.getAvailableFontFamilyNames();
		// System.out.println("C. Rivas' Tic Tac Toe");
		// for ( int i = 0; i < 284; i++ )
		// 	System.out.println(fontsList[i]);

		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTicTacToe();
            }
        });
	}
}