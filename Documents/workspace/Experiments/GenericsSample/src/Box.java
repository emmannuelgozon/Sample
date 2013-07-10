
public class Box<T> {

	private T t;
	private int a;
	
	public void setObject(T t){
		this.t = t;
	}
	
	public Object getObject(){
		return t;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
}
