class PolicestationProgram
{
    void Area(int pincode) 
    {
	System.out.println(pincode);
    }
	
    void Area(int pincode, String post_o) 
    {
	System.out.println(pincode);
	System.out.println(post_o);
    }

    void Area(int pincode, String post_o, String city)  
    {
	System.out.println(pincode);
	System.out.println(post_o);
	System.out.println(city);
	}	

	public static void main(String[] args) 
        {
		java.util.Scanner scan = new java.util.Scanner(System.in) ;
		System.out.print("How many data you want to enter: "); 
		int num_data = scan.nextInt();
		
		PinCodeProgram ps1 =  new PinCodeProgram();
		
		switch(num_data) {
			case 1:
				ps1.Area(400070);
				break;
			case 2:
				ps1.Area(400070, "Kurla");
				break;
			case 3:
				ps1.Area(400070, "Vinobabhave", "Kurla");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}