package com.cognizant.shapes;

public class Shapes {
	int numberOfSides;
	
	
	// private int numberOfSides;
	// private static int sqr;
	// public Shapes (int shape) {
	// this.numberOfSides = shape;
	//
	// }
	Shapes(int shape){
		this.numberOfSides=shape;
	}
	
	public void calculateShapeArea(int sideLength) {
		

		switch (numberOfSides) {
		case 1:
			//numberOfSides = 1;
			circle c = new circle();
			c.calculateArea(numberOfSides);
			break;
		case 2:
			//numberOfSides = 3;
			Triangle t = new Triangle();
			t.calculateArea(numberOfSides);
			break;
		case 3:
			//numberOfSides = 4;
			Square s = new Square();
			s.calculateArea(numberOfSides);
			break;
			
		default:
			System.out.println("No shapes present");
		}
		
	}
	
	 public static void main(String[] args) {


		 Shapes s = new Shapes (3);
		 s.calculateShapeArea(12);
		 }
	
}
// if (this.numberOfSides == 1 ) {
// circle c = new circle();
// c.calculateArea(sideLength);
// }
// else if (this.numberOfSides == 3) {
// Triangle t = new Triangle();
// t.calculateArea(sideLength);
// }
//
// else if (this.numberOfSides == 4) {
// Square s = new Square();
// s.calculateArea(sideLength);
// }
// else {
// System.out.println("No shapes present");


// int x= 1;
// boolean didStop = false;
// while(x <= 150) {
// x++;
// int sqr = (int) Math.floor(Math.sqrt(x));
//
// if (x % 2 == 0) {
// continue;
// }
// for (int i = 2; i <= sqr; i++) {
// if (x % i == 0) {
// didStop = true;
// break;
// }
// }
// if(!didStop == false || x==1) {
// didStop = false;
// System.out.println(x);
//
// }
//// System.out.println(x);
//// x++;
// }
//
