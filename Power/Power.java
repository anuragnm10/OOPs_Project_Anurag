import java.util.Scanner;

public class Power {
  Scanner in = new Scanner(System.in);
  public int pow(){
    int a = in.nextInt();
    int b = in.nextInt();
    int result = 1; 
    for(int i=1;i<=b;i++){ 
      result=result*a; 
    }
    return result;

  }

  public static void main(String[] args){
    Power p1 = new Power();
    int Result = p1.pow();
    System.out.println(Result);
  }
}
