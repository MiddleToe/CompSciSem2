package pkg;

public class Gizmo
{ 
   String Maker;
   boolean Electronic;
   double Cost;
   
   public Gizmo(String a, boolean b, double c){
      Maker = a;
      Electronic = b;
      Cost = c;
   }
   
   public String getMaker(){
      return Maker;
   }
   
   public boolean isElectronic(){
      if (Electronic = true){
         return true;
      }
      else return false;
   }
   
   public int getCost(){
      return Cost;
   }
   
  
}
