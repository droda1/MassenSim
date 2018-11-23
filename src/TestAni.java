import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TestAni extends JPanel implements ActionListener{
	

	Timer t;
	private int x;
	private int y;
	MassenSimulation homo1 = new MassenSimulation(20,50,50,50,10,10,10,10);
	/*private int[] yo = store(homo1);
	public static int[] store(MassenSimulation obj) {
		int[] abc = new int[10];
		MassenSimulation homo = new MassenSimulation(20,50,50,50,10,10,10,10);
	for(int i = 0; i<10;i++) {
		homo.simulate(i);
		abc[i]=(int)homo.schwerpunkt;
	}
	return abc;
	}*/
	
	public TestAni() {
		x=(int)homo1.schwerpunkt;
		y=10;
		t=new Timer(5,this);
		t.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.red);
		g.fillOval(x, y, 20, 20);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
	x++;
	
	if(x>250) {
		x=0;
		
	}
	repaint();
	}
}
