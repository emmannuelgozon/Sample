import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		Box<Integer> box = new Box<Integer>();
		box.setObject(1);
		Box<String> box2 = new Box<String>();
		box2.setObject("Emman");
		System.out.println(box.getObject());
		System.out.println(box2.getObject());
		
	}
}
