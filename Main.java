import java.util.Scanner;
import java.math.BigInteger;

class Main{

  public static final String GREEN = "\u001B[32m";
  public static final String RESET = "\u001B[0m";
  public static final String MAGENTA = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";

  public static void main(String[] args){
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
    Scanner number = new Scanner(System.in);
    System.out.print(GREEN+"Please, Enter a max number > "+RESET);
    String numberfactorial = number.nextLine();
    try{
    int numberfactorialint = Integer.parseInt(numberfactorial);

    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= numberfactorialint; i++){
    fact = fact.multiply(BigInteger.valueOf(i));
    System.out.println(GREEN+i+"!"+MAGENTA+" = "+CYAN+fact+RESET);
    }
    Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }catch(NumberFormatException e){
      System.out.println("Please write a number!");
    }
  }
}