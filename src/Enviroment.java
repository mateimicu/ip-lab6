import java.util.Vector;

public class Enviroment {

  public Integer dimensiunex;

  public Integer dimensiuney;

  public String fundalColour;

    public Vector<Object>  myObject;
    
    public Enviroment(Integer x,Integer y,String color,Integer number_of_objects) {
    	dimensiunex=x;
    	dimensiuney=y;
    	fundalColour=color;
    	myObject= new Vector<Object>();
    	myObject.add(new Bird());
    	myObject.add(new Pig());
    	myObject.add(new Pig());
    	for (int i=3;i<number_of_objects;++i)
    		myObject.add(new StaticObject());	
    }

  public void objectAction(int index,int x,int y) {
	  ((Object) myObject.elementAt(index)).changePosition(((Object) myObject.elementAt(index)).getPosition()/100000+x, ((Object) myObject.elementAt(index)).getPosition()%100000+y);
  }
  
  public void ifExistChange(int x,int y) {
	  for (int i=0;i<myObject.size();++i) 
		  if (myObject.elementAt(i).getPosition()==x*100000+y){
			  objectAction(i, x, y);
		  }
  }

}