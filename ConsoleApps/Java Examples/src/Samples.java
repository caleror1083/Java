import java.util.Scanner;

public class Samples
	{
		private static final Scanner input = new Scanner(System.in);
		public static void main(String[] args)
			{		
				String city1;
				String city2;
				
				// Prompt user to enter two cities
				System.out.print("Enter the first city: ");
				city1 = input.nextLine();
		
				System.out.print("Enter the second city: ");
				city2 = input.nextLine();
		
				//Get values for Latitude and Longitude
				// Scanner console = new Scanner(System.in);
				
				System.out.print("Enter the latitude and longitude of the first city separated by a space (example 28.8 81.2): ");
				String lat1, long1 = input.nextLine();
				System.out.print("Enter the latitude and longitude of the second city separated by a space (example 28.8 81.2): ");
				String lat2, long2 = input.nextLine();
			}
		
		// Calculate distance between two cities
		public static double finalAnswer(double lat1, double long1, double lat2, double long2)
			{
				double radiusOfEarth = 6372.795; //radius of Earth in km
				double distance = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long2-long1)) * radiusOfEarth;
				
				System.out.println("The distance is " + distance);
				return finalAnswer (lat1, long1, lat2, long2);
			}
	}