package com.bridgelabz.designpattern;

// facade class.
public class ShapeMaker {
	private Circle circle;
	private Square square;
	private Rectangle rectangle;
	
	ShapeMaker()
	{
		// Create object of classes
	     this.circle = new Circle();
	     this.square = new Square();
	     this.rectangle = new Rectangle();
	}
	
	// Use different classes object to call their respective draw method
	public void drawCircle(){
	      circle.draw();
	}
	public void drawRectangle(){
	      rectangle.draw();
	}
	public void drawSquare(){
	      square.draw();
	}

}
