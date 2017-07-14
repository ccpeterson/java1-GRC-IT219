package tester;

import java.awt.Color;

import acm.graphics.GLine;

public class fire {

	public void run()
	{
		GLine fireLine = new GLine(400,375,500,100);
		fireLine.setColor(Color.ORANGE);
		fireLine.scale(.1);
		add(fireLine);
		pause(100);
		fireLine.scale(.2);
		pause(100);
		fireLine.scale(.4);
		pause(100);
		fireLine.scale(.6);
		pause(100);
		fireLine.scale(1);
}
