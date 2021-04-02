import java.util.NoSuchElementException;

public class File<T> {
	
	private Cellule premier;
	private Cellule dernier;
	
	public File() {
		this.premier = null;
		this.dernier = null;
	}
	
	public void enfiler(T element) {
		Cellule aEnfiler = new Cellule(element, null);
		// cas de la file vide
		if (this.estVide()) {
			this.dernier = aEnfiler;
			this.premier = aEnfiler;
		}
		// cas de la file non vide
		else {
			this.dernier.suivant = aEnfiler;
			this.dernier = aEnfiler;
		}
	}
	
	public boolean estVide() {
		return (this.premier == null && this.dernier == null);
	}
	
	public int nbElements() {
		int nbElements = 0;
		Cellule curseur = this.premier;
		while (curseur != null) {
			nbElements +=1;
			curseur = curseur.suivant;
		}
		return nbElements;
	}
	
	public T défiler() {
		if (this.estVide())
			throw new NoSuchElementException("Vous ne pouvez plus consommer d'élément");
		T premier = this.premier.element;
		this.premier = this.premier.suivant;
		// cas de la file qui devient vide
		if (this.premier == null) {
			this.dernier = null;
		}
		return premier;
	}
	
	private class Cellule {
		private T element;
		private Cellule suivant;
		public Cellule(T element, Cellule suivant) {
			this.element = element;
			this.suivant = suivant; 
		}
	}

}
