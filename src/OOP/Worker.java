package OOP;

public class Worker {
private int hours;
private double wage;
public Worker(){
	hours = 0;
	wage = 0.0;
}
public int getHours(){
return hours;
}
public double getWage(){
	return wage;
}
public void setHours(int newHours){
	hours = newHours;
}
public void setWage(double newWage){
	wage = newWage;
}
public double payCheck(){
	return hours * wage;
}
public double raise(){
	return wage + .50;
}
}
