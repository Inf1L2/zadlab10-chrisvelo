import java.util.Random;
/**
 *
 * @author krzysiek
 */
public class Losowe {
    
    public void losuj(){
        int ilosc =0;
        Random rand = new Random();
        
        while(ilosc <3){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            System.out.println("********  wylosowane liczby to: x="+x+"   y="+y+"  *******");
            System.out.println("Dzielimy x przez y  (x/y)");
            try{
                int wynik = x / y;
                System.out.println("Poprawne dzielenie liczby: x="+x+"   y="+y+"  wynik="+wynik+"\n");
            }
            catch(ArithmeticException e){
             System.out.println("Nie można podzielić przez y, bo y= "+y+"\n");
             ilosc++;
        }
        }
         System.out.println("Koniec programu, 3 razy wystąpiło dzielenie przez 0\n");
    }
    
}
