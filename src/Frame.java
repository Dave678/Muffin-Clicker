import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener {
	
	// this class creates the frame for the clicker
	
	private int count = 0;
	static JFrame f;
	static JLabel l;
	static JButton b;
	
	@SuppressWarnings("deprecation")
	
	//constructor
	public Frame() {
		
		f = new JFrame("Clicker");
		l = new JLabel("Muffins: 0");
		l.setFont(new Font("Serrif", Font.BOLD, 20));
		
		Icon icon = new ImageIcon("muffin.PNG");
		
		b = new JButton(icon);
		
		JPanel p = new JPanel();
	     
		
		 p.add(l);
	     p.add(b);
	     
	
	     
	     p.setBackground(Color.WHITE);
	
	    
	     f.add(p);
	
	     
	     f.setSize(500, 550);
	     
	     f.setLocationRelativeTo(null);
	     
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	     f.show();
	     
	     f.setVisible(true);
	     
	     b.addActionListener(this);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// detects if button has been pressed
		
		if(e.getSource() == b) {
			
			count ++;
			l.setText("Muffins: " + count);
			
			Score.score(count);
			
		}
		
		
	}

}
