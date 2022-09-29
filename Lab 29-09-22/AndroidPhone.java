package Lab29;

public class AndroidPhone {

	String MobileName;
	String Display;
	String RamSize;
	String Color;
	
	public AndroidPhone(String MobileName, String Display, String RamSize, String Color) {
		
		this.MobileName = MobileName;
		this.Display = Display;
		this.RamSize = RamSize;
		this.Color = Color;
	}
		
	public String toString() {
		return "AndroidPhone [MobileName=" + MobileName +",  Display=" + Display + ",  Color=" + Color +" ,RamSize=" + RamSize + "]";
	}
}
