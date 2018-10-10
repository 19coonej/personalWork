package OOP;

public class RightTriangle {
private int base;
private int height;
public RightTriangle(){
	base = 0;
	height = 0;
}
public int getBase(){
	return base;
}
public int getHeight(){
	return height;
}
public void setBase(int newBase){
	base = newBase;
}
public void setHeight(int newHeight){
	height = newHeight;
}
public void hypot(){
	double hypot = Math.sqrt((base * base) + (height * height));
	System.out.println("The hypotenuse is: " + hypot);
}
}
