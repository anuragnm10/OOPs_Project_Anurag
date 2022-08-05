import java.util.ArrayList;

public class VendingMachine {
  Product[] prodarray = new Product[5];
  String[] productname = new String[5];
  static int stock = 5;
  int size = 0;
  double totalprice = 0.0;
  ArrayList<Product> l1 = new ArrayList<Product>();
  public VendingMachine(){
    prodarray[0] = new Product("Biscuit", 45);
    prodarray[1] = new Product("Wafers", 110);
    prodarray[2] = new Product("Oil", 250);
    prodarray[3] = new Product("Facewash", 160);
    prodarray[4] = new Product("Perfume", 182);
    for(int l=0;l<prodarray.length;l++){
      l1.add(prodarray[l]);
    }
  }

  public void cart(String productselected){
    if(stock == 0){
      System.out.println("No products available.");
    }else{
      for(int i=0;i<stock;i++){
        if(prodarray[i].getName().equalsIgnoreCase(productselected)){
          productname[size++] = prodarray[i].getName();
          stock--;
          for(int j=i+1;j<=stock;j++){
            prodarray[i] = prodarray[j];
          }
          break;
        }
      }
    }
  }

  public double calbill(){
    for(int i = 0;i<size;i++){
      for(int j = 0;j<l1.size();j++){
        if(productname[i].equals(l1.get(j).getName())){
          System.out.println(l1.get(j).getPrice());
          totalprice=totalprice+l1.get(j).getPrice();
          
        }
      }
    }
    return totalprice;
  }
}


