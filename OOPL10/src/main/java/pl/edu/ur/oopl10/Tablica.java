import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author krzysiek
 */
public class Tablica {
    
    
    
    public void wprowadzTab(){
        Scanner calkowity = new Scanner(System.in);
        int array[]={8,9,10};
    BufferedReader tab = new BufferedReader(new InputStreamReader(System.in));
    int i=0;
    System.out.println("Podaj nr elementu tablicy do wypisania: ");
    i = calkowity.nextInt();
  
  try{
      System.out.println(array[i]);
      }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Podano zły rozmiar, tablica ma rozmiar: "+array.length);
      }
    }
}
