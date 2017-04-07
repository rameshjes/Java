package objectOrientedExercises;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DisplayNameJavaApplet extends Applet {

	public void paint (Graphics g){
		g.setColor(Color.blue);
		g.drawString("Ramesh Kumar", 100, 50);
		
	}
}
