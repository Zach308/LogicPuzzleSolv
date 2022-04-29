import java.util.*; 
class FxF {
  DupeDe du = new DupeDe();
    Random rd = new Random();
    int a = rd.nextInt(5)+1;
    int b = rd.nextInt(5)+1;
    int c = rd.nextInt(5)+1;
    int d = rd.nextInt(5)+1;
    int e = rd.nextInt(5)+1;
    int trys= 0;
    int[] arr= {a,b,c,d,e};
    boolean solved = false;
  public void x5(){
    /*THIS CODE WILL RETURN FALSE OR TRUE DEPENDING ON 
      Duplications*/
    
    while(!solved){
      arr[0]=a = rd.nextInt(5)+1;
       arr[1]=b = rd.nextInt(5)+1;
       arr[2] = c= rd.nextInt(5)+1;
       arr[3] = d =rd.nextInt(5)+1;
       arr[4]= e =rd.nextInt(5)+1;
       du.check(arr);
      if(du.good && d+e==b && c+d==a  && b+e==a &&b+d ==c){
        solved = true; 
      }
      }
    System.out.println("A="+a+" B="+b+" C="+c+" D="+d+" E="+ e);
  }
}