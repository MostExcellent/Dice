Die d1 = new Die(100, 131);
Die d2 = new Die(200, 131);
void setup()
{
	noLoop();
	rectMode(CENTER);
	size(300,300);
}
void draw()
{
	background(200);
	d1.roll();
	d1.show();
	d2.roll();
	d2.show();
	System.out.println("d1.roll: "+d1.res);
	System.out.println("d2.roll: "+d2.res);

}
void mousePressed()
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
	void roll()
	{
		res = (int)(Math.random()*6+1);
	}
	void show()
	{
		textSize(18);
		stroke(255);
		textMode(CENTER);
		stroke(0);
		fill(255);
		
		rect(x, y, 50, 50);
		fill(0);text(res, x, y+60);
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