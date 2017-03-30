public class Bird implements Object {
	
	private int x,y; 
	private static int deplasament=0;
	
	Bird() {
		x=deplasament;
		y=deplasament;
		deplasament++;
	}

	public void changePosition(int a,int b) {
		x=a+1;
		y=b+1;
	}

	public Integer getPosition() {
		return x*100000+y;
	}


	
	
}