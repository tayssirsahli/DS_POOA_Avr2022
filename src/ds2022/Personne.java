package ds2022;

import java.util.ArrayList;
import java.util.Objects;

public class Personne {
	private String nomPrenom;
	private String pseudo;

	public Personne(String nomPrenom, String pseudo) {
		this.nomPrenom = nomPrenom;
		this.pseudo = pseudo;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Override
	public String toString() {
		return "personne [nomPrenom=" + nomPrenom + ", pseudo=" + pseudo +

				"]";
	}

	public boolean equals(Personne p) {
		if (this.getNomPrenom().equals(p.getNomPrenom()) && (this.getPseudo().equals(p.getPseudo()))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomPrenom, pseudo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nomPrenom, other.nomPrenom) && Objects.equals(pseudo, other.pseudo);
	}
	

	
	
	
}