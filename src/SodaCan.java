
public class SodaCan {
	private double radius;
	private double height;
	private final double costOfAluminum = 2.60;
public SodaCan() {
	radius = 1;
	height = 1;
}
public SodaCan(double newRadius, double newHeight){
	if (newRadius > 0)
	{
		radius = newRadius;
	}
	else
	{
		radius = 10;
	}
	if (newHeight > 0)
	{
		height = newHeight;
	}
	else
	{
		height = 10;
	}
}
public double getRadius(){
	return radius;
}
public double getHeight(){
	return height;
}
public double getCost(){
	return costOfAluminum;
}
public void setRadius(double newRadius){
	if (newRadius > 0)
	{
		radius = newRadius;
	}
	else
	{
		radius = 10;
	}
}
public void setHeight(double newHeight){
	if (newHeight > 0)
	{
		height = newHeight;
	}
	else
	{
		height = 10;
	}
}
public double surfaceArea(){
	return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius)); 
}
public double volume(){
	return Math.PI * (radius * radius) * height;
}
}
