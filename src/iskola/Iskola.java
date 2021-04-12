package iskola;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Iskola {

    public static ArrayList<Tanulok> lista = new ArrayList<>();
    
    public boolean intE(String s){
        
    
    public static void beolvasas(){
        try{
        RandomAccessFile file = new RandomAccessFile("nevek.txt", "r");
        while(file.getFilePointer()<file.length()){
            lista.add(new Tanulok(file.readLine()));
        }
        int rekordSzam = Integer.parseInt(file.readLine()); 
                
        file.close();
            System.out.println("Sikeres beolvasás: "+ lista.size() +" fájl.");
            System.out.println("");
        }
        catch(IOException e){
            System.out.println(e);}
    }
    
    public static void main(String[] args) {
        beolvasas();
    }

}
class Tanulok{
    private int kezdEv;
    private char osztaly;
    private String nev;
    
        public int getKezdEv(){
            return kezdEv;
        }
        
        public char getOsztaly(){
            return osztaly;
        }
        
        public String getNev(){
            return nev;
        }
        
    public Tanulok(String sor){
        String[] adatok = sor.split(";");
            this.kezdEv = Integer.parseInt(adatok[0]);
            this.osztaly = adatok[1].charAt(0);
            this.nev = adatok[2];           //adatszerk. rész
        }
    }
