package Ex4_Assign3;

public class RoundedShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
      if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")){
         return new RoundedSquare();
      }	 
      return null;
    }   
}
