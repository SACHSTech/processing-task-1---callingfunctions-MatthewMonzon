import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    background(135,206,235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  //ground
	fill(86,125,70);
  rect(0,350,400,50);
	// red square
  fill(203,65,84);
  rect(175, 150, 200, 200);
  // door
  fill(150,75,0);
  rect(225,225,50,125);
  // door knob
  fill(172, 140, 24);
  ellipse(260,300,10,10);
  // window
  fill(135,206,235);
  rect(300,225,50,50);
  line(325,225,325,275);
  line(300,250,350,250);
  // roof
  fill(0,0,128);
  triangle(150,150,275,50,400,150);
  // tree trunk
  fill(114,92,66);
  rect(50,200,50,200);
   //branch
  line(100,275,150,260);
  // leaves
  fill(0, 85, 2);
  ellipse(75,200,175,75);
  fill(0, 85, 2);
  ellipse(80,170,130,75);
  fill(0, 85, 2);
  ellipse(65,235,75,50);
  fill(0, 85, 2);
  ellipse(100,230,80,40);
  fill(0, 85, 2);
  ellipse(150,250,60,40);

  }
  
  // define other methods down here.
}