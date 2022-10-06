package lab_06oct;

public class Bank_main {
	
	public static void main(String[] args) {
    
	SBI sbi= new SBI();
	sbi.interest();

	AxisBank axis = new AxisBank();
	axis.interest();
  
   ICICI icici= new ICICI();
    icici.interest();
}
}