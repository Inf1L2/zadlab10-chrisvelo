import java.util.Scanner;
/**
 *
 * @author krzysiek
 */
public class WprowadzZKonsoli {
    
   
    
    public void wprowadzInt() {
    Scanner calkowity = new Scanner(System.in);
    System.out.println("Podaj liczbe calkowita: ");
    String calkowita = calkowity.nextLine(); 
    
    try {
			int number = Integer.parseInt(calkowita);
			System.out.println("Wprowadzona liczba: "+calkowita);
		} catch(NumberFormatException e) {
			System.err.println("To nie jest liczba!");
}
   calkowity.close();
}
    
}
