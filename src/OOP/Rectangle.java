package OOP;

public class Rectangle {
private int length;
private int height;
public Rectangle(){
	length = 0;
	height = 0;
}
public int getLength(){
	return length;
}
public int getHeight(){
	return height;
}
public void setLentgh(int newLength){
length = newLength;	
}
public void setHeight(int newHeight){
	height = newHeight;
}
public int area(){
	return length * height;
}
public int perimeter(){
	return (length * 2) + (height * 2);
}
}
