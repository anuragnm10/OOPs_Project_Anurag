public class LargestNumber {
  public static void main(String[] args){
    int[] arr = {12,20,21,5,7,10};
    int temp = 0;
    for(int i=0;i<arr.length;i++){
      for(int k=i+1;k<arr.length;k++){
        if(arr[i]<arr[k]){
          temp = arr[i];
          arr[i]=arr[k];
          arr[k]=temp;
        }
      }
    }

    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]);
    }


  }
}
