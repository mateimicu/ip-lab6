import java.util.Vector;

public class Game {
 
	
	
  public Level currentLevel=null;

    public Vector<Level>  myLevels;
    
    public Game() {
    	myLevels = new Vector<Level>();
    	for (int i=0;i<5;++i){
    		myLevels.add(new Level(i));
    	}
    }

  public void chooseLevel(int i) {
	  
  }

}