import java.util.*;

class starter {

public boolean array123(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    if(nums[i]==1){
      for(int q = 0; q< nums.length;q++){
        if(nums[q]==2){
          for(int r = 0; r<nums.length;r++){
            if(nums[r]==3){
              return true;
            }
          }
        }
      }
    }   
  }
  return false;
}

	public static void main(String args[]) {
		



	}
}
