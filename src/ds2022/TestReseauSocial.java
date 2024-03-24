package ds2022;

public class TestReseauSocial {

	public static void main(String[] args) {
	
		Personne p1 = new Personne("Alice", "alice123");
		Personne p2 = new Personne("Bob", "bob456");
		Personne p3 = new Personne("Charlie", "charlie789");
		Personne p4 = new Personne("tayssir", "tayssir1233");


	
		ReseauSocial reseau = new ReseauSocial();

	
		reseau.ajouterUtilisateur(p1);
		reseau.ajouterUtilisateur(p2);

		
		reseau.AjouterSuiveur(p1, p3);
		reseau.AjouterSuiveur(p2, p4); 
		reseau.AjouterSuiveur(p2, p2); 


		
		System.out.println("Liste des utilisateurs suivis : ");
		System.out.println(reseau.ListeUtilisateursSuivis());

		System.out.println("Liste des utilisateurs suiveurs : ");
		System.out.println(reseau.listeUtilisateursSuiveurs());

		
		reseau.trierListeSuiveurs();

		
		System.out.println("Utilisateur avec le plus grand nombre de suiveurs : ");
		System.out.println(reseau.MaxSuiveurs());
	}
}
