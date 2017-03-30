import java.util.Random;


public class Level {

  public Integer difficulty;
  private static Random a = new Random();

    public Enviroment  myEnviroment;
    
    public Level(Integer dif) {
    	difficulty=dif;
    	myEnviroment= new Enviroment(a.nextInt(100),a.nextInt(100),"bla",dif);
    }
    
    public void changeEnviroment(int x,int y) {
    	myEnviroment.ifExistChange(x,y);
    }
 
}