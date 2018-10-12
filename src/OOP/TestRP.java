package OOP;

public class TestRP {

	public static void main(String[] args) {
	RabbitPopulation bob = new RabbitPopulation();
	System.out.println("The current population: " + bob.getPopulation());
	bob.setPopulation(1000);
	System.out.println("The current population: " + bob.getPopulation());
	bob.matingSeason();
	System.out.println("The current population: " + bob.getPopulation());
	bob.huntingSeason();
	System.out.println("The current population: " + bob.getPopulation());
	RabbitPopulation jim = new RabbitPopulation(72);
	System.out.println("The current population: " + jim.getPopulation());
	

	}

}
