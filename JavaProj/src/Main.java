import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
	public static void main(String[] args) {
		JLabel label = new JLabel();
		ImageIcon image1 = new ImageIcon("FredTheChamp.png");
		label.setText("Mit navn er Frederik");
		label.setIcon(image1);
		label.setHorizontalTextPosition(0);
		
		
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Jframe title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(420, 420);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.add(label);
		
		
		//ImageIcon image = new ImageIcon("FredTheChamp.png");
		//frame.setIconImage(image.getImage()); //Picture location is project folder
		
		
	}

}
