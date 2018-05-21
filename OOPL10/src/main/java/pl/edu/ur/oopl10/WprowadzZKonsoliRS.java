import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
/**
 *
 * @author krzysiek
 */

public class WprowadzZKonsoliRS {     
     public void ReadInt(){
        // File plik = new File("plik_int.txt");
         //int calkowita;
         try{
         FileReader fr = new FileReader("czytaj_int.txt");
         BufferedReader br = new BufferedReader(fr);
         int number = Integer.parseInt(br.readLine());
         System.out.println("Odczytana liczba:\t"+number);
         br.close();
         }catch(FileNotFoundException e){
            System.out.println("Plik czytaj_int.txt nie istnieje");
        }
        catch(NumberFormatException e){
            System.out.println("To nie liczba");
        }
        catch(IOException e){
            System.out.println("IOException");
        }   
}
     
     public void Save(){
    
    try{
        PrintWriter wpisz = new PrintWriter("zapis.txt");
     
       wpisz.println("przykladowy tekst");  
       wpisz.close();
    }catch(IOException e){
        System.out.println("IOException");
    }
}
}
