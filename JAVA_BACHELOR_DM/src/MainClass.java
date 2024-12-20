import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		
		/*
		 * Type primitifs:
		 * Numérique: int - float - double  ...
		 * Binaire: bolean ( True ou False )
		 * Chaine de caractère: String - char
		 * 
		 * 
		 * Type Complexe: 
		 * Integer, Double, Float, String, Scanner, ...
		 */
		
		System.out.println("----+----+-Variables-----+---");

		int age=18;
		double nombre2 = 30.3;
		String nom = "Mohammed";
		char caractere = 'A';
		boolean isIn = true;
		
		System.out.println(age);
		System.out.println(nombre2);
		System.out.println(nom);
		System.out.println(caractere);
		System.out.println(isIn);
		
		/* Opérateurs:
		 * 
		 * Arithmétique : Addition + , Soustraction - , Division / 
		 *                Multiplication * , Modulo %
		 * 
		 * Logiques : Egale == , Différent != , Strictement inférieur < , Strictement supérieur > ,
		 *           inférieur ou égal <= ,  supérieur ou égal >= 
		 *           ET && , OU || ,  Négation !
		 */
		
		System.out.println("----+----+-Opérateurs-----+---");

		int nombre1 = 12 , nombre4 = 6 , nombre3 = 40, resultat ; 
		
		resultat = (nombre1 - nombre4 + nombre3) % 3; 
		
		System.out.println(resultat*3);
		
		
		
		/*
		 * Conditions: 
		 * 
		 * if - else
		 * if - else if - else
		 * Switch Case
		 * Térnaire
		 * 
		 */
		System.out.println("--------+-----if else------+-----------");
		
		
		if (!isIn) {
			System.out.println("La condition est vrai");
		} else {
			System.out.println("La condition est fausse");
		}
		
		
		if (age>18 || !isIn) {
			System.out.println("Majeur");
		} else {
			System.out.println("Mineur");
		}
		
		System.out.println("--------/------if - else if - else-----/-----------");

		if (isIn) {
			System.out.println("La condition est vrai");
		}else if (age>18){
			System.out.println("Majeur");
		}else {
			System.out.println("Erreur");
		}
		
		
		System.out.println("--------+-----SwitchCase------+-----------");

		switch (age) {
		case 18:
			System.out.println("Majeur");
			break;
		case 15:
			System.out.println("Mineur");
			break;

		default:
			System.out.println("Default");
			break;
		}
		
		System.out.println("--------+-----Térnaire------+-----------");

		String message = age >= 18 
				? "La personne est illigible" 
				: "Personne refusée" ;
		
		System.out.println(message);
		
	
		/*
		 * Tableau : 1D - 2D 
		 * 
		 */
		
		System.out.println("--------+-----1D------+-----------");

		String nom2[] = {"Amira","Badr","Achraf","Houda",
						  "Kawtar","Nouhaila"};
		
		System.out.println(nom2[1]);
		
		String nom3 = "Zakaria,Mouhcine,Souhail,Warda";
		
		System.out.println(nom3);
		
		String decomposerNom[] = nom3.split(",");
		
		System.out.println(decomposerNom[1]);
		
		System.out.println("--------+-----2D------+-----------");

		int suite[][] = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		
		
		System.out.println(suite[1][1]);
		
		
		/*
		 * 
		 * Boucles :
		 * for 
		 * do-while 
		 * while 
		 * foreach
		 * 
		 */
		
		System.out.println("--------+-----for------+-----------");

		
		for (int i = 0; i < decomposerNom.length; i++) {
			
			System.out.println(decomposerNom[i]);
		}
		
		
		
		for (int e = 0; e < suite.length; e++) {
			
			for (int j = 0; j < suite[e].length; j++) {
				
				System.out.println(suite[e][j]);
			}
		}
	
		
		System.out.println("--------+-----do/while------+-----------");

		
	int f=0;
	do {
		
		System.out.println(decomposerNom[f]);
		f++;
	} while (f<decomposerNom.length);
		
	
	System.out.println("--------+-----while------+-----------");
	
	int g=0;
	while (g<decomposerNom.length) {
		
		System.out.println(decomposerNom[g]);
		g++;
	}
	
	System.out.println("--------+-----foreach------+-----------");
	for (String is : decomposerNom) {
		
		System.out.println(is);
	}	
		
	
	/*
	 *  Exeption:
	 *  
	 *  try - catch
	 *  
	 */
	
	
	System.out.println("--@--+---@-Exeption---@---+--@-");
	
	try {
		
		int h=0;
		while (h<=decomposerNom.length) {
			
			System.out.println(decomposerNom[h]);
			h++;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception déclanchée");
		
	}
	
	try {
		
		int m=0;
		while (m<nom2.length) {
			
			System.out.println(nom2[m]);
			m++;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception déclanchée");
		
	}
		
		
	/*
	 * Lecture clavier
	
	
	System.out.println("--------+-----Lecture clavier------+-----------");

	System.out.println("Merci de saisir une valeur: ");
	
	Scanner scanner = new Scanner(System.in) ;
	
	String  valeurSaisie = scanner.nextLine();
	
	System.out.println("La valeur saisie est: " + valeurSaisie);
		
 */
	
	String resultatString = retournerNom();
	
	System.out.println(resultatString);

	int somme = retournerSomme(45,54);
	System.out.println(somme);
	
	methodeSansRetour();
	
	}
	
	
	
	
/*
 * Fonctions et méthodes
 */
	
	static String retournerNom(){
		
		String retour = "Ceci est la liste des noms à retourner: ";
		
		return retour;
	}
	
	static int retournerSomme (int a , int b){
		
		int reultat=a+b;
		
		return reultat;
	}
	
	static void methodeSansRetour(){
		
		System.out.println("Méthode sans retour !");
		
	}

	
	
}
