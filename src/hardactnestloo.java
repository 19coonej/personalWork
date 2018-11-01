
public class hardactnestloo {

	public static void main(String[] args) {
		int num = 1;
		int counter = 1;
		int divisor = 0;
		int biggestdivisor = 0;
		int biggestnumber = 0;
		for (num = 1; num <= 1000; num++)
		{
			for (counter = 1; counter <= 1000; counter++)
			{
				if (num%counter == 0)
				{
					divisor ++;
				}
			}
			
				if (divisor > biggestdivisor)
				{
					biggestdivisor = divisor;
					biggestnumber = num;
					
				}
				divisor = 0;
					
				
			}
			
		}


{
	
		System.out.println(biggestdivisor);
		System.out.println(biggestnumber);

	}

}
