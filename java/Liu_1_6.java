/****************************************************
* Un ejemplo de un applet sencillo.
* M. Liu 1/8/02 
* ***************************************************/

import java.applet.Applet; 
import java.awt.*;

@SuppressWarnings("serial")
public class Liu_1_6 extends Applet{
	public void paint(Graphics g){ 
		setBackground(Color.blue );
		Font Claude = new Font("Arial", Font.BOLD, 40); 
		g.setFont(Claude);
		g.setColor(Color.yellow);
		g.drawString("Hola Mundo", 100, 100);
	}
	
}
