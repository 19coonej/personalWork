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
public double hypot(){
	double hypot = Math.sqrt((base * base) + (height * height));
	return hypot;
}
public double perimeter(){
	double hypot = Math.sqrt((base * base) + (height * height));
	double perimeter = base + height + hypot;
	return perimeter;
	
}
public double area(){
	double area = (.5) * base * height;
	return area;
}
}
