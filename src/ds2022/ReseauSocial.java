package ds2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ReseauSocial {

	HashMap<Personne, ArrayList<Personne>> reseau;

	// pour chaque personne on associe une liste de suiveurs
	public ReseauSocial() {
		reseau = new HashMap<Personne, ArrayList<Personne>>();
	}
	public void ajouterUtilisateur(Personne p) {
		if(!reseau.containsKey(p)) {
			reseau.put(p,new ArrayList <>());
		}
		else {
			System.out.println("cette personne existe dans le reseau");
		}
	}
	void AjouterSuiveur(Personne p , Personne p1) {
		
		if(reseau.containsKey(p)) {
			ArrayList<Personne> A= reseau.get(p);
			if(A.contains(p1)){

					System.out.println("le suiveur existe déjà.");
			}
			else {
				A.add(p1);
				}	
			}else {
				ajouterUtilisateur(p);
				AjouterSuiveur(p,p1);
			}
   }
	
	public HashSet<Personne> ListeUtilisateursSuivis()
	{
		HashSet<Personne> utilisateursSuivis =new HashSet<>();
		for (Personne p:reseau.keySet()) {
			if (!reseau.get(p).isEmpty()) {
                utilisateursSuivis.add(p);
            }
		}
		return utilisateursSuivis;
	}
	 public HashSet<Personne> listeUtilisateursSuiveurs() {
	        HashSet<Personne> utilisateursSuiveurs = new HashSet<Personne>();
	        for (ArrayList<Personne> suiveurs : reseau.values()) {
	            utilisateursSuiveurs.addAll(suiveurs);
	        }
	        return utilisateursSuiveurs;
	    }
	 
	 public void trierListeSuiveurs() {
	        for (ArrayList<Personne> suiveurs : reseau.values()) {
	            Collections.sort(suiveurs, (p1, p2) -> p1.getPseudo().compareTo(p2.getPseudo()));
	        }
	        System.out.println("Liste des suiveurs triés : ");
	        for (ArrayList<Personne> suiveurs : reseau.values()) {
	            System.out.println(suiveurs);
	        }
	    }
	 public Personne MaxSuiveurs()
	 {
		 int max = 0 ;
		 Personne e = null;
		 for(Personne p:reseau.keySet())
		 {
			 if(reseau.get(p).size()>max) {
				 max=reseau.get(p).size();
				 e=p;
			 }
		 }
		 return e;
	 }
}
