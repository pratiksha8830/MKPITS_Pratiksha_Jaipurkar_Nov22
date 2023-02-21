//write a  java program to cal a bike average consumption from the total given distance(integer value )traveeled in km and spent fuel (in liters,float number-two decimal points).
//write to cal the distance between two points.//

import java.util.*;

class average{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter distance travelled");
int distance=Sc.nextInt();

System.out.println("Enter SpentFuel");
double spent_fuel=Sc.nextDouble();

double avg=distance/spent_fuel;
System.out.println(avg);

}
}