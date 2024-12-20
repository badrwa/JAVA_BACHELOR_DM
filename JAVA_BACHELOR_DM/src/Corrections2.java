import java.util.Scanner;


public class Corrections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		/*
		Exercice 1 : Les Variables et les Op�rateurs
		�nonc� : D�clarez deux variables enti�res, a et b. Assignez-leur des valeurs et 
		affichez leur somme, diff�rence, produit, et quotient.
		*/

//		        int a = 10;
//		        int b = 5;
//		        System.out.println("Somme : " + (a + b));
//		        System.out.println("Diff�rence : " + (a - b));
//		        System.out.println("Produit : " + (a * b));
//		        System.out.println("Quotient : " + (a / b));
		    
		

	/*
	 * Exercice 2 : Lire les Entr�es Clavier
�nonc� : �crivez un programme qui demande � l'utilisateur son nom et son �ge, 
puis affiche un message de bienvenue incluant ces informations.
	 * */
		

		 
//		        Scanner scanner = new Scanner(System.in);
//		        System.out.print("Entrez votre nom : ");
//		        String nom = scanner.nextLine();
//		        System.out.print("Entrez votre �ge : ");
//		        int age = scanner.nextInt();
//		        System.out.println("Bienvenue, " + nom + ". Vous avez " + age + " ans.");

		
		
		
/*
 * Exercice 3 : Les Conditions
�nonc� : �crivez un programme qui demande un nombre entier � l'utilisateur et v�rifie 
s'il est pair ou impair.
 * */		
		
		

//		        Scanner scanner = new Scanner(System.in);
//		        System.out.print("Entrez un nombre entier : ");
//		        int nombre = scanner.nextInt();
//		        
//		        if (nombre % 2 == 0) {
//		            System.out.println("Le nombre est pair.");
//		        } else {
//		            System.out.println("Le nombre est impair.");
//		        }
		
		
	/*
	 * Exercice 4 : Les Boucles (For)
�nonc� : �crivez un programme qui affiche les nombres de 1 � 10 en utilisant une boucle for.
	 * */	
		

//		        for (int i = 1; i <= 10; i++) {
//		            System.out.println(i);
//		        }
//		

		/*
		Exercice 5 : Les Boucles (While)
		�nonc� : �crivez un programme qui affiche les nombres de 1 � 10 en utilisant une boucle while.	
		*/
		

//		        int i = 1;
//		        while (i <= 10) {
//		            System.out.println(i);
//		            i++;
//		        }
	
		/*
		Exercice 6 : Les M�thodes (Sans retour)
		�nonc� : Cr�ez une m�thode afficherMessage qui affiche un message de bienvenue. 
		Appelez cette m�thode dans le programme principal.
		*/
		
		
//		    public static void afficherMessage() {
//		        System.out.println("Bienvenue dans ce programme Java !");
//		    }
//
//		    public static void main(String[] args) {
//		        afficherMessage();
//		  

		/*
		Exercice 7 : Les M�thodes (Avec retour)
		�nonc� : Cr�ez une m�thode addition qui prend deux entiers en param�tres et 
		retourne leur somme. Utilisez cette m�thode dans le programme principal.
		*/
		
	
//		    public static int addition(int a, int b) {
//		        return a + b;
//		    }
//
//		    public static void main(String[] args) {
//		        int resultat = addition(5, 3);
//		        System.out.println("Le r�sultat de l'addition est : " + resultat);
//		    }
		

		/*
		Exercice 8 : Les Tableaux (Initialisation)
		�nonc� : D�clarez un tableau de 5 entiers. Assignez une valeur � chaque �l�ment du 
		tableau et affichez-les.	
		*/
		
		
//	
//		        int[] tableau = {1, 2, 3, 4, 5};
//		        for (int i = 0; i < tableau.length; i++) {
//		            System.out.println("�l�ment � l'index " + i + " : " + tableau[i]);
//		        }
//	

		
	/*	Exercice 9 : Les Tableaux (Somme des �l�ments)
		�nonc� : �crivez un programme qui calcule et affiche la somme des �l�ments d'un tableau d'entiers.
		
		*/
		

//		        int[] tableau = {1, 2, 3, 4, 5};
//		        int somme = 0;
//		        for (int i = 0; i < tableau.length; i++) {
//		            somme += tableau[i];
//		        }
//		        System.out.println("La somme des �l�ments du tableau est : " + somme);
//		

		/*
		Exercice 10 : Les Boucles et Tableaux (Recherche d'un �l�ment)
				�nonc� : �crivez un programme qui demande un nombre � l'utilisateur et 
				v�rifie si ce nombre est pr�sent dans un tableau pr�d�fini.
		*/
		
		

//		        int[] tableau = {1, 2, 3, 4, 5};
//		        Scanner scanner = new Scanner(System.in);
//		        System.out.print("Entrez un nombre � rechercher : ");
//		        int nombre = scanner.nextInt();
//		        boolean trouve = false;
//		        
//		        for (int i = 0; i < tableau.length; i++) {
//		            if (tableau[i] == nombre) {
//		                trouve = true;
//		                break;
//		            }
//		        }
//		        
//		        if (trouve) {
//		            System.out.println("Le nombre est pr�sent dans le tableau.");
//		        } else {
//		            System.out.println("Le nombre n'est pas pr�sent dans le tableau.");
//		        }
//		
		
		/*
		Exercice 11 : Tri d'un Tableau
		�nonc� : �crivez un programme qui trie un tableau d'entiers en utilisant 
		l'algorithme de tri par s�lection (Selection Sort).
		*/
//		 int[] tableau = {64, 25, 12, 22, 11};
//	        
//	        for (int i = 0; i < tableau.length - 1; i++) {
//	            int indexMin = i;
//	            for (int j = i + 1; j < tableau.length; j++) {
//	                if (tableau[j] < tableau[indexMin]) {
//	                    indexMin = j;
//	                }
//	            }
//	            int temp = tableau[indexMin];
//	            tableau[indexMin] = tableau[i];
//	            tableau[i] = temp;
//	        }
//
//	        System.out.println("Tableau tri� : ");
//	        for (int i : tableau) {
//	            System.out.print(i + " ");
//	        }
		
		
		/*
		Exercice 12 : Calcul de la Moyenne et des Notes
		�nonc� : �crivez un programme qui demande � l'utilisateur de saisir
		 les notes de plusieurs �tudiants (le nombre d'�tudiants est donn� par 
		 l'utilisateur) et calcule la moyenne des notes, la note maximale et la note minimale.
		*/
		
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Entrez le nombre d'�tudiants : ");
//        int nombreEtudiants = scanner.nextInt();
//        
//        double[] notes = new double[nombreEtudiants];
//        double somme = 0;
//        double max = Double.MIN_VALUE;
//        double min = Double.MAX_VALUE;
//        
//        for (int i = 0; i < nombreEtudiants; i++) {
//            System.out.print("Entrez la note de l'�tudiant " + (i + 1) + " : ");
//            notes[i] = scanner.nextDouble();
//            somme += notes[i];
//            if (notes[i] > max) {
//                max = notes[i];
//            }
//            if (notes[i] < min) {
//                min = notes[i];
//            }
//        }
//        
//        double moyenne = somme / nombreEtudiants;
//        System.out.println("Moyenne des notes : " + moyenne);
//        System.out.println("Note maximale : " + max);
//        System.out.println("Note minimale : " + min);
 
/*		Exercice 13 : Jeu de Deviner un Nombre
		�nonc� : Cr�ez un jeu o� l'utilisateur doit deviner un nombre choisi 
		al�atoirement par le programme entre 1 et 100. Le programme doit 
		indiquer si le nombre devin� est trop grand ou trop petit jusqu'� ce 
		que l'utilisateur trouve la bonne r�ponse.
		
		*/

//		        Random random = new Random();
//		        int nombreADeviner = random.nextInt(100) + 1;
//		        Scanner scanner = new Scanner(System.in);
//		        int essai;
//		        
//		        do {
//		            System.out.print("Devinez le nombre (entre 1 et 100) : ");
//		            essai = scanner.nextInt();
//		            if (essai < nombreADeviner) {
//		                System.out.println("Trop petit !");
//		            } else if (essai > nombreADeviner) {
//		                System.out.println("Trop grand !");
//		            }
//		        } while (essai != nombreADeviner);
//		        
//		        System.out.println("Bravo ! Vous avez trouv� le nombre : " + nombreADeviner);
	
// 	Exercice 14 : Palindrome
//		�nonc� : �crivez un programme qui demande � l'utilisateur d'entrer une cha�ne 
//		de caract�res et v�rifie si cette cha�ne
//		est un palindrome (se lit de la m�me mani�re � l'envers qu'� l'endroit).
//		
//		System.out.println("saisir un mot: ");
//		
//		
//		String  palindrome = scanner.nextLine();
//		
//		String reverse= "";
//		
//		for (int i = palindrome.length()-1; i >= 0 ; i--) {
//			reverse += palindrome.charAt(i);
//		}
//		if (palindrome.equals(reverse)) {
//			System.out.println("palindrome ");
//		} else {
//			System.out.println("non palindrome ");
//
//		}
		

		
		

//		//		Exercice 15 : Calculatrice interactive
//		�nonc� : Impl�mentez une calculatrice interactive en Java qui lit deux nombres et un op�rateur (+, -, *, /)
	//	depuis le clavier. G�rez les erreurs avec des exceptions (ex. division par z�ro, op�rateur invalide).. 
//		Utilisez des m�thodes pour chaque op�ration et affichez le r�sultat.	
//		
//		
//		try {
//			System.out.println("entrez deux nombre: ");
//		    int nombre1= scanner.nextInt();
//		    int nombre2= scanner.nextInt();
//		    
//		    System.out.println("choisir un operateur: + / * - ");
//		    
//		    char operateur = scanner.next().charAt(0);
//		    
//		    
//		    switch (operateur) {
//			case '+' :
//			int somme =somme(nombre1, nombre2); 
//				System.out.println("la somme est: " + somme );
//				break;
//			case '-' :
//				int soustraction =soustraction(nombre1, nombre2); 
//					System.out.println("la soustraction est: " + soustraction );
//					break;
//					
//			case '*' :
//				int multiplication =multiplication(nombre1, nombre2); 
//					System.out.println("la multiplication est: " + multiplication );
//					break;
//					
//			case '/' :
//				if (nombre2 == 0)
//					throw new ArithmeticException("division par 0 ");
//					
//					
//				int division =division(nombre1, nombre2); 
//					System.out.println("la division est: " + division );
//					break;
//			default:
//				throw new IllegalArgumentException("operrateur invalide");
//				
//			}
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		
		
////		Exercice 16 : Validation de mot de passe
//	    �crivez un programme qui demande � l'utilisateur de saisir un mot de passe. 
//	    V�rifiez que le mot de passe respecte ces r�gles : 
//	    Au moins 8 caract�res, un chiffre, une lettre majuscule. 
//	    Utilisez des boucles, des conditions et des exceptions.
	    
	    
//			System.out.println("entrer password : ");
//			String passord = scanner.nextLine();
//			if (verifierMotDePasse(passord)) {
//				System.out.println("mot de passe correct ");
//			}else {
//				System.out.println(" mot de passe incorrect ");
//
//			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static int somme(int nombre1, int nombre2){
		
		return nombre1 + nombre2;
		
		
	}
	public static int multiplication(int nombre1, int nombre2){
		
		return nombre1 * nombre2;
		
		
	}
	
	public static int division(int nombre1, int nombre2){
		
		return nombre1 / nombre2;
		
		
	}
	public static int soustraction(int nombre1, int nombre2){
		
		return nombre1 - nombre2;
		
		
	}
	public static boolean verifierMotDePasse(String password){
		boolean lenght =true, isDigit=false, isUpper=false;
		if (password.length()<8) {
			lenght=false;
			return lenght;
		}
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) 
				isDigit=true;
			
			if (Character.isUpperCase(password.charAt(i))) 
				isUpper = true;
		}
		
		return lenght && isDigit && isUpper;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

