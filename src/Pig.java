public class Pig implements Object {
	
	private int x,y; 
	private static int deplasament=0;
	
	Pig() {
		x=10+deplasament;
		y=10+deplasament;
		deplasament++;
	}

	public void changePosition(int a,int b) {
		x=a+2;
		y=b+2;
	}

	public Integer getPosition() {
	   return x*100000+y;
	}
}