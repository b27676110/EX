
import java.awt.*;
import java.awt.event.*;

public class Mainframe extends Frame {
	private Button btnExit = new Button("Exit");

	public Mainframe() {
		init();
	}

	public void init() {
		this.setSize(100, 100);
		this.setLocation(100, 100);
		
		

		  this.addWindowListener(new WindowAdapter() {
			     public void windowClosing(WindowEvent ev) {
				System.exit(0);

			}
		});
		this.setBackground(new Color(128,255,128));
		this.setLayout(null);
		btnExit.setLocation(200,150);
		btnExit.setSize(80,25);
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.exit(0);

			}
		});
		this.add(btnExit);
	}
}