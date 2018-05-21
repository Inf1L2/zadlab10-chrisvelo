import java.util.Scanner;
/**
 *
 * @author krzysiek
 */
public class Main {

    
    public static void main(String[] args) {
        //ZAD 1
       WprowadzZKonsoli cal= new WprowadzZKonsoli();
       
       cal.wprowadzInt();
       //ZAD 2
       Tablica tab = new Tablica();
       tab.wprowadzTab();
       //ZAD 3
      Zero dziel = new Zero();
     dziel.dzielenie();
       spr();
       //ZAD 4
       Losowe dzielimy = new Losowe();
       dzielimy.losuj();
      //ZAD 5
      WprowadzZKonsoliRS czytaj = new WprowadzZKonsoliRS();
      czytaj.ReadInt();
      WprowadzZKonsoliRS zapisz = new WprowadzZKonsoliRS();
              zapisz.Save();
       
    }
    public static void spr(){
            Zero dziel = new Zero();
       
           try{ 
               dziel.dzielenie();
               System.out.println("Poprawne przechwycenie wyjątku");
           }
       catch(ArithmeticException e){
             System.out.println("Nie przechwycono wyjątku ArithmeticException");
        }
       

     }  
    
    
    
}
