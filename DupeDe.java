import java.util.*;
public class DupeDe{
//THIS CODE IS VERY IMPORTANT 
boolean good = false;
  public boolean check(int[] arr){
    //this code sorts array least to greatest:
    for(int i =0; i< arr.length-1; i++){
      //this is needed 
      Arrays.sort(arr);
      if(arr[i]==arr[i+1]){
         good = false;
        return good;
      }
    }
    good = true;
    return good; 
  }
}