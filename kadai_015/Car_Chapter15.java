package kadai_015;

public class Car_Chapter15 {

	private int gear = 1; // ギア
	private int speed = 10; // 速度
	
	public void changeGear(final int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		
		this.speed = switch (this.gear) {
		    case 1 -> 10;
		    case 2 -> 20;
		    case 3 -> 30;
		    case 4 -> 40;
		    case 5 -> 50;
		    default-> 10;
		};
		
		System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
