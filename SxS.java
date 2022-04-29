import java.util.*;
public class SxS{
  //kinda works 
  Random rd = new Random(); 
  Scanner in = new Scanner(System.in); 
 DupeDe du = new DupeDe();
  int a = rd.nextInt(6)+1;
  int b = rd.nextInt(6)+1;
  int c = rd.nextInt(6)+1;
  int d = rd.nextInt(6)+1;
  int e = rd.nextInt(6)+1;
  int f=rd.nextInt(6)+1;
  int trys =0;
  int[] arr= {a,b,c,d,e,f};
  boolean solved = false;
  public void Six(){
      while(!solved){
       arr[0]=a=rd.nextInt(6)+1;
       arr[1]=b=rd.nextInt(6)+1;
       arr[2]=c=rd.nextInt(6)+1;
       arr[3]=d=rd.nextInt(6)+1;
       arr[4]=e=rd.nextInt(6)+1;
       arr[5]=f=rd.nextInt(6)+1;
       du.check(arr);
      if(du.good&& b+d ==e && a*b ==f){
        solved = true; 
      }
      }
    
    System.out.println("A="+a+" B="+b+" C="+c+" D="+d+" E="+ e+" F="+f);
  }
}