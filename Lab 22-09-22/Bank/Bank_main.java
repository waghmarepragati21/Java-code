package lab;

public class Bank_main {
public static void main(String args[])
{
	Axis a1 = new Axis();
	 a1.BankName();
	 a1.Location();
	 
	 Bank bankref = new Axis();
		int rateOfInterest = bankref.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by Axis bank :" + rateOfInterest);
	 
	 City a2 = new City();
	 a2.BankName();
	 a2.Location();
	 
	 bankref = new City();
		rateOfInterest = bankref.getRateOfInterest();
		System.out.println("Rate of Interest provided by City bank :" + rateOfInterest);

}
}