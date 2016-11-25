package g3;

public class Car {
	public void KeyIn(){
		System.out.println("KeyIn");
	}
	public void PowerOn(){
		System.out.println("PowerOn");
	}
	public void smartkeyon(){
		this.KeyIn();
		this.PowerOn();
	}
}
