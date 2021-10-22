//LineArt.java
// Student version of the Lab06 Line Art Graphics Program assignment.

import java.awt.*;
import java.applet.*;

public class LineArt extends Applet
	{ 
		public void paint(Graphics g)
			{ 
				int width = 980;
				int height = 630; 
				g.drawRect(10,10,width,height);
				
				int x1 = 10;
				int y1 = 10;
				int xInc = 14;
				int yInc = 9;
					
					for(int i = 0; i<=70; i++)
						{
							//Bottom Right
							g.drawLine(width + x1, y1+ i*yInc, x1 + width - i*xInc, y1+ height);
							//Bottom Left
							g.drawLine(x1, y1+ i*yInc, x1 + i*xInc, y1+ height);
							//Top Right
							g.drawLine(width + x1, height + y1 - i*yInc, x1 + width - i*xInc, y1);
							//Top Left
							g.drawLine(x1, height + y1 - i*yInc, x1 + i*xInc, y1);
						}
				int width2 = 490;
				int height2 = 315;
				g.drawRect(255,167,width2,height2);
					int x2 = 255;
					int y2 = 167;
					int xInc2 = 7;
					int yInc2 = 5;
					for(int i = 0; i<=63; i++)
						{
							//Bottom Right
							g.drawLine(width2 + x2, y2+ i*yInc2, x2 + width2 - i*xInc2, y2+ height2);
							//Bottom Left
							g.drawLine(x2, y2+ i*yInc2, x2 + i*xInc2, y2+ height2);
							//Top Right
							g.drawLine(width2 + x2, height2 + y2 - i*yInc2, x2 + width2 - i*xInc2, y2);
							//Top Left
							g.drawLine(x2, height2 + y2 - i*yInc2, x2 + i*xInc2, y2);
						}
				
			}
	}
