package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        saisie_note();
    }


    public static void saisie_note(){
        //Ensemble de valeur
        // 0,1,2,3,4,5,6,7,8,9
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre d'eleve : ");
        int nombreEleve = sc.nextInt(); // 2

        //boucle for : quand vous savez le nombre de fois que vous voulez iterer
        //boucle while : vous ne savez pas combien de fois vous voulez iterer
            // de ce fait, vous donnez une condition, et tant qu'elle est vrai, on continu
        //boucle do while : d'abord on fait, ensuite on vérifie

        // for(compteur initialisé; condition d'entrée; increment ){}
        // i++ => i = i+1

        double sum = 0.0;

        for(int i = 0; i<nombreEleve; i++){
            System.out.print("Entrez votre note : ");
            sum = sum + sc.nextFloat();
        }

        double resultat = sum / nombreEleve;

        System.out.println(resultat);
    }

    // somme de deux valeurs
    public static void sumTwoValues(int valueOne, int valueTwo){
        // + , - , / , % , * -> operateur arithmétique
        int sum = valueOne + valueTwo;
        System.out.println(sum);
    }

    public static void showMaxValue(int valueOne, int valueTwo){

        // > , < , <= , >= , == -> operateur de comparaison
        if (valueOne > valueTwo){
            System.out.println("value One est la plus elevé");
        } else if (valueTwo > valueOne){
            System.out.println("value Two est la plus elevé");
        } else {
            System.out.println("equivalent");
        }
    }
}
