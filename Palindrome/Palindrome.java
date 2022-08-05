import java.util.Scanner;

class Palindrome{

  public boolean chkPalindrome(String word, int start, int end){
    if(start == end)
      return true;
    else if(word.charAt(start) != word.charAt(end))
      return false;
    else{
        start++;
        end--;
        chkPalindrome(word, start, end);
      }
      return true;
  }


  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word : ");
    String word = in.nextLine();
    Palindrome p1 = new Palindrome();
    System.out.println(p1.chkPalindrome(word, 0, word.length()-1));

  }

}