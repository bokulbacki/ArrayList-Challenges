import java.util.ArrayList;

public class ChallengeRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Double> calculator = new ArrayList<Double>();
				calculator.add(1.2);
				calculator.add(2.9);
				calculator.add(10.0);
				calculator.add(7.7);
				calculator.add(5.4);
				calculator.add(6.3);
				double sum = 0;
				
				calculator.remove(0);
				calculator.add(4.7);
				calculator.add(7.8);
				
				for (int i = 0; i<calculator.size(); i++)
					{
						System.out.println(calculator.get(i));
						sum = sum + calculator.get(i);
					}
				
				System.out.println("These numbers add up to " + sum);
				double average = sum / calculator.size();
				System.out.println(average);
			}

	}
