package mathOperators;
import java.util.Scanner;
public class CuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  length = -999.99;
		double width = -999.99;
		double radius = -999.99;
		double areaRec = -999.99;
		double areaCirc = -999.99;
		double whatWeCut = -999.99;
		double cost = -999.99;
		double ugh = -999.99;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the lawn?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn?");
		width = input.nextDouble();
		areaRec = length * width;
		System.out.println("What is the radius of the fountain?");
		radius = input.nextDouble();
		areaCirc = Math.PI * (radius * radius);
		whatWeCut = areaRec - areaCirc;
		ugh = whatWeCut/100;
		cost = ugh * 1.25;
		System.out.println("you owe this many monies: " + cost);
	}

}
