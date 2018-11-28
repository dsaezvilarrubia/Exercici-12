/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12_1_saezv;

/**
 *
 * @author Dani
 */
import java.util.Scanner;
public class E12_1_SaezV {
    public static final int VALOR_MINIM = 0;
    public static final int VALOR_MAXIM = 1000;

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        //Variables inicials
        String contrasenya;
        int codiUsuari,numPersones = 0;
        boolean dadaCorrecte;
        System.out.println("Quantes persones vols entrar? ");
        //Comprobem tipus de dada
        dadaCorrecte = lector.hasNextInt();
        if(dadaCorrecte || numPersones > 0){
            numPersones = lector.nextInt();
            //Creació array
            lector.nextLine();
            String[] noms = new String [numPersones];
            //Demanem valors de usuari
            for(int i = 0; i < numPersones; i++){
                int numUsuari = i + 1;
                System.out.println("Entra el nom " + numUsuari);
                noms[i] = lector.nextLine();
                contrasenya = noms[i].replace('A','4');
                contrasenya = contrasenya.replace('a','4');
                contrasenya = contrasenya.replace('E','4');
                contrasenya = contrasenya.replace('e','4');
                contrasenya = contrasenya.replace('I','4');
                contrasenya = contrasenya.replace('i','4');
                contrasenya = contrasenya.replace('O','4');
                contrasenya = contrasenya.replace('o','4');
                contrasenya = contrasenya.replace('U','4');
                contrasenya = contrasenya.replace('u','4');
                System.out.println("La seva contrasenya és "+contrasenya+"\n");
            }
            //Imprimim els codis ordenats.
            System.out.println("Llistat de noms ordenats");
            for(int g = 0; g < noms.length;g++){
                System.out.println(noms[g] + "");
            }
        }else{
            //No s'ha introduit un enter.
            System.out.println("Dada incorrecte");            
        }
    }
    
}