import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Storybook extends GraphicsProgram  {
	//Constants
    final int APP_WIDTH = 800;
    final int APP_HEIGHT = 600;
    final int FLOOR_HEIGHT = APP_HEIGHT - 100;
    
    //these have to be defined here so all the different methods can use them
    GImage cat = new GImage("cat.png");
    GCompound cloud = new GCompound();
    GLabel thought = new GLabel("Z Z Z Z",450, FLOOR_HEIGHT - 250);
    GImage alien = new GImage("alien.png");
  
	public void init()
	{
        //Set size of Applet
        setSize(APP_WIDTH,APP_HEIGHT);

        //Set Background color
        setBackground(Color.GRAY);
 	}
	
	public void run(){
		setupScene();
		scene();
	}
	
	public void setupScene(){
		//add bed, cat, lamp, and floor
		GImage bed = new GImage("bed.png");
		bed.setBounds(APP_WIDTH /2, FLOOR_HEIGHT - 200, APP_WIDTH /2, 250);
		add(bed);
		//cat defined at the class level
		cat.setBounds(300, FLOOR_HEIGHT - 100, 100, 100);
		add(cat);
		GImage lamp = new GImage("lamp.png");
		lamp.setBounds(200, FLOOR_HEIGHT - 200, 80, 200);
		add(lamp);
		GRect floor = new GRect(0,APP_HEIGHT-100,APP_WIDTH,100);
		floor.setFillColor(Color.DARK_GRAY);
		floor.setFilled(true);
		floor.sendToBack();
		add(floor);
	}
	
	public void scene(){
		sceneBegin();
		sceneCresendo();
		sceneEnds();
	}
	
	public void sceneBegin(){
		pause(2000);
		//Draw thought clouds and label
		//cloud defined at the class level

		GOval cloud1 = new GOval(350, FLOOR_HEIGHT - 150, 20, 20);
		cloud1.setFilled(true);
		cloud1.setColor(Color.WHITE);
		cloud.add(cloud1);
		
		GOval cloud2 = new GOval(375, FLOOR_HEIGHT - 200, 20, 20);
		cloud2.setFilled(true);
		cloud2.setColor(Color.WHITE);
		cloud.add(cloud2);
		
		GOval cloud3 = new GOval(400, FLOOR_HEIGHT - 250, 20, 20);
		cloud3.setFilled(true);
		cloud3.setColor(Color.WHITE);
		cloud.add(cloud3);
		
		GRect cloud4 = new GRect(425, FLOOR_HEIGHT - 300, 100, 100);
		cloud4.setFilled(true);
		cloud4.setColor(Color.WHITE);
		cloud.add(cloud4);

		add(cloud, 0, 0);
		//thought defined at the class level
		add(thought);
	}
	
	public void sceneCresendo(){
		//wait 2 sec, then add alien and change label text
		pause(2000);
		//alien defined at class level
		alien.setBounds(0, FLOOR_HEIGHT - 100, 100, 100);
		add(alien);
		thought.setLabel("! ! ! !");
	}
	public void sceneEnds(){
		//wait 2 sec, remove cloud and label, start moving alien and cat
		pause(2000);
		remove(thought);
		remove(cloud);
		while(true){
			pause(90);
			cat.move(20,0);
			alien.move(20, 0);
		}
	}
}
