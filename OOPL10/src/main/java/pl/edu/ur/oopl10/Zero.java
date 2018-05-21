/**
 *
 * @author krzysiek
 */
public class Zero extends Exception{
    public void dzielenie(){
        int a = 6;
        int b = 0;
        int x;
        
        try{
            x= a / b;
        }catch(ArithmeticException e){
             System.out.println("Nie można podzielić przez b, bo b= "+b);
        }
    }
}
