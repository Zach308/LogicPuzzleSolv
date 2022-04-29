import java.util.*;
public class NxN{
  //kinda works 
  Random rd = new Random(); 
  Scanner in = new Scanner(System.in); 
 DupeDe du = new DupeDe();
  int a = rd.nextInt(9)+1;
  int b = rd.nextInt(9)+1;
  int c = rd.nextInt(9)+1;
  int d = rd.nextInt(9)+1;
  int e = rd.nextInt(9)+1;
  int f=rd.nextInt(9)+1;
  int g =rd.nextInt(9)+1;
  int h =rd.nextInt(9)+1;
  int i =rd.nextInt(9)+1;
  int trys =0;
  int[] arr= {a,b,c,d,e,f,g,h,i};
  boolean solved = false;
  public void Nine(){
      while(!solved){
       arr[0]=a=rd.nextInt(9)+1;
       arr[1]=b=rd.nextInt(9)+1;
       arr[2]=c=rd.nextInt(9)+1;
       arr[3]=d=rd.nextInt(9)+1;
       arr[4]=e=rd.nextInt(9)+1;
       arr[5]=f=rd.nextInt(9)+1;
       arr[6]=g=rd.nextInt(9)+1;
       arr[7]=h=rd.nextInt(9)+1;
       arr[8]=i=rd.nextInt(9)+1;
       du.check(arr);
      if(du.good&& b+3==d && e+8==c && i+4==g && i+2==h && i+5==c && e+6==f){
        solved = true; 
      }
        trys++;
      }
    
    System.out.println(trys);
  
    System.out.println("A="+a+" B="+b+" C="+c+" D="+d+" E="+ e+" F="+f+" G="+g+" H="+h+" I="+i);
  }
}