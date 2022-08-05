import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    VendingMachine v1 = new VendingMachine();
    Scanner input = new Scanner(System.in);
    int flag = 0;
    String ScanInput;
    do{
      System.out.println("Please select the products from below:");
      for(int i=0;i<VendingMachine.stock;i++){
        System.out.println("Product : "+v1.prodarray[i].getName()+"--> Price : "+v1.prodarray[i].getPrice());
      }
      System.out.println("To add product to your cart please type the product name from above mentioned products:");
      System.out.println("Press 0 to add products :");
      System.out.println("Press 1 to exit :");
      flag = input.nextInt();
      if(flag == 0){
        input.nextLine();
        ScanInput = input.nextLine();
        v1.cart(ScanInput);
      }

    }while(flag == 0);

    int payment = 1;

    if(flag == 1){
      System.out.println("Please select your payment method :");
      System.out.println("Cash : press 1 || Card : press 2");
      payment = input.nextInt();
    }

    if(payment == 1){
      System.out.println("Your bill is : "+v1.calbill()+" for "+v1.size+" products");
    }else{
      System.out.println("Your bill is : "+2*v1.calbill()+" for "+v1.size+" products");
    }


  }



}
