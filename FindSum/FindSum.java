import java.util.Scanner;

public class FindSum {

  public int[] sum(){

    Scanner in = new Scanner(System.in);
    int[] inputArray = {4,4,5,8,2,1};
    int[] indices = new int[2];
    System.out.println("Please enter the target value : ");
    int target = in.nextInt();
    int size  = inputArray.length;
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if((inputArray[i]+inputArray[j])==target){
          indices[0] = i;
          indices[1] = j;
        }
      }
    }
    return indices;
  }

  public static void main(String[] args){
    FindSum f1 = new FindSum();
    int[] result = f1.sum();
    if(result[0]==result[1])
      System.out.println("Cannot find sum in the given array.");
    else  
      System.out.println("Sum of given target's indices are : "+result[0]+", "+result[1]);
  }
    
    
}

