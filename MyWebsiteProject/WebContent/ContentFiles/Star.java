//Star.java
//This program outputs randomly colored and sized stars in an applet.
import java.awt.*; 
import java.applet.*; 
import java.util.Random;
import java.util.Arrays;
import java.awt.color.*;
public class Star extends Applet
	{

		public void paint (Graphics g)
			{
				Random rand = new Random();
				
				int red = 0;
				int green = 0;
				int blue = 0;
				
				
				for(int i = 0; i < 10; i++)
				{
					int x = rand.nextInt(900) + 150;
					int y = rand.nextInt(400) + 50;
			
					int xArray [] = new int [10];
					int yArray [] = new int [10];
					
					int scale = rand.nextInt(10) + 1;
					
					
					xArray[0] = x;
					xArray[1] = x - (scale * 5);
					xArray[2] = x - (scale * 20);
					xArray[3] = x - (scale * 7);
					xArray[4] = x - (scale * 15);
					xArray[5] = x;
					xArray[6] = x + (scale * 15);
					xArray[7] = x + (scale * 7);
					xArray[8] = x + (scale * 20);
					xArray[9] = x + (scale * 5);
					
					yArray[0] = y;
					yArray[1] = y + (scale * 20);
					yArray[2] = y + (scale * 20);
					yArray[3] = y + (scale * 30);
					yArray[4] = y + (scale * 45);
					yArray[5] = y + (scale * 33);
					yArray[6] = y + (scale * 45);
					yArray[7] = y + (scale * 30);
					yArray[8] = y + (scale * 20);
					yArray[9] = y + (scale * 20);
	
					red = rand.nextInt(256);
					green = rand.nextInt(256);
					blue = rand.nextInt(256);
					
					
					Color background  = new Color(red, green, blue);
					g.setColor(background);
					g.fillPolygon(xArray, yArray, 10);
				}
				
		
			}

	}
