package Lab29;

public class Android_main {

	public static void main(String args[]) {
		AndroidPhone a1 = new AndroidPhone("Redmi Note 10", "TFT-LCD", "8GB" ,"Couture Blue");
		AndroidPhone a2 = new AndroidPhone("Samsung Galaxy", "IPS-LCD","12GB", "Noir Black");
		
		AndroidPhone[] arr = new AndroidPhone [2];
		arr[0]=a1;
		arr[1]=a2;
		
		for(AndroidPhone a : arr)
		{
			System.out.println(a);
		}			
	}
}
