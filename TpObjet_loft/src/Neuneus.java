
public class Neuneus {
	
	//l'énergie nécessaire au croisement
	final int min_energie=20;
	//l'énergie minimal pour vivre
	final int energie_vie=2;
	float energie;
	int x,y;
	String nom;
	Loft loft;
	
	void se_deplacer(){	
	}
	void manger(){
	}
	
	Neuneus(){
	}
	
	Neuneus(String n,int x, int y,Loft l){
		this.nom=n;
		this.x=x;
		this.y=y;
		this.energie=0;
		this.loft=l;
	}
	
	
}
