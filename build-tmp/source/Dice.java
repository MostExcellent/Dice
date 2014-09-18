import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die d1 = new Die(100, 131);
Die d2 = new Die(200, 131);
public void setup()
{
	noLoop();
	textAlign(CENTER,CENTER);
	rectMode(CENTER);
	size(300,300);
}
public void draw()
{
	background(200);
	d1.roll();
	d1.show();
	d2.roll();
	d2.show();
	text(d1.res+d2.res, 150, 131);
}
public void mousePressed()
{
	redraw();
}
class Die//models one single dice cube
{
	int res;
	int x, y;
	Die(int dieX, int dieY) //constructor
	{
		x = dieX;
		y = dieY;
	}
	public void roll()
	{
		res = (int)(Math.random()*6+1);
	}
	public void show()
	{
		textSize(18);
		stroke(255);
		textMode(CENTER);
		stroke(0);
		fill(255);
		rect(x, y, 50, 50);
		fill(0);
		text(res, x, y+60);
		if(res == 1){
			ellipse(x, y, 5, 5);
		}else if(res == 2){
			ellipse(x+12, y-12, 5, 5);
			ellipse(x-12, y+12, 5, 5);
		}else if(res == 3){
			ellipse(x, y, 5, 5);
			ellipse(x+12, y-12, 5, 5);
			ellipse(x-12, y+12, 5, 5);
		}else if(res == 4){
			ellipse(x+12, y+12, 5, 5);
			ellipse(x-12, y-12, 5, 5);
			ellipse(x+12, y-12, 5, 5);
			ellipse(x-12, y+12, 5, 5);
		}else if(res == 5){
			ellipse(x, y, 5, 5);
			ellipse(x+12, y+12, 5, 5);
			ellipse(x-12, y-12, 5, 5);
			ellipse(x+12, y-12, 5, 5);
			ellipse(x-12, y+12, 5, 5);
		}else{
			ellipse(x+12, y+12, 5, 5);
			ellipse(x-12, y-12, 5, 5);
			ellipse(x+12, y-12, 5, 5);
			ellipse(x-12, y+12, 5, 5);
			ellipse(x+12, y, 5, 5);
			ellipse(x-12, y, 5, 5);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
