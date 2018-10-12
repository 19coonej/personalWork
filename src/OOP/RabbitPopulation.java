package OOP;

public class RabbitPopulation {
private int population;
public RabbitPopulation(){
	population = 0;
}
public RabbitPopulation(int xPopulation){
	population = xPopulation;
}
public int getPopulation(){
	return population;
}
public void setPopulation(int newPopulation){
	population = newPopulation;
}
public int matingSeason(){
	population = population * 3;
	return population;
}
public int huntingSeason(){
	population = (int) ((int)population * .43);
	return population;
}
}
