package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   public ArrayList<Gizmo> purchases;
   
   public void add(String a, boolean b, double c){
      Gizmo one = new Gizmo(a,b,c);
      purchases.add(one);
   }

   public int countElectronicsByMaker(String mkr){
      int a = 0;
      for(int q = 0; q <purchases.size(); q++ ){
            Gizmo gizmo = purchases.get(q);
            if(gizmo.getMaker().equals(mkr) && gizmo.isElectronic()){
               a++;
            }
         }
      return a;
   }
   
   public boolean hasAdjacentEqualPair(){
      for(int c = 1; c < purchases.size(); c++){
         if (purchases.get(c).equals(purchases.get(c-1))){
            return true;
         }
      }
      return false;
   }
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	for(int x = 0; x <purchases.length;x++){
   	   int r = purchases.get(x);
   	   if(r>purchases.get(x+1)){
   	      r = purchases.get(x+1);
   	   }
   	}
   	return r;
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
