package SpaceShooter;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class UIFrame extends JFrame {

	public UIFrame() {
		game();
	}
	
	private void game() {
		
		add(new Board());
		setTitle("Space Shooter");
		setSize(400, 300);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
			
		Runnable runnable = new Runnable() {
			public void run() {
				UIFrame gameFrame = new UIFrame();
				gameFrame.setVisible(true);
			}
		};
		
		EventQueue.invokeLater(runnable);
		
	}

}
