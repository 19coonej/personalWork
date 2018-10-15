package OOP;

public class Employee {
	private double wage;
	private int experience;
public Employee(){
wage = 18.25;
experience = 0;
	
}
public double getWage(){
	return wage;
}
public void setWage(double newWage){
	wage = newWage;
}
public int getExp(){
	return experience;
}
public void setExp(int newExp){
	experience = newExp;
}
public void wageInc(){
	wage = wage * 1.10;
		
}
}
