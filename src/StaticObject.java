public class StaticObject implements Object {
	
	private int x,y; 
	private static int deplasament=0;
	
	public StaticObject() {
		x=20+deplasament;
		y=20+deplasament;
		deplasament++;
	}

	public void changePosition(int a,int b) {
		x=a+3;
		y=b+3;
	}

	public Integer getPosition() {
		return x*100000+y;
	}
}