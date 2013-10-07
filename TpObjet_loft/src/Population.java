
public class Population {

	private int taille;
	
	Population(int n){
		this.taille=n;
	}
	
	public void augmenter(int i){
		this .taille = taille-i;
	}
	
	public void diminuer(int i){
		
		this.taille=taille-i;
	}
	
	int get_taille(){
		return taille;
	}
	
}
