import java.util.Random;


public class Erratique extends Neuneus{

	Random rd=new Random();
	
	Erratique(String n,int x, int y,Loft l) {
		super(n, x, y, l);
	}
	
	public void se_deplacer(){
		//récupérer la position 
		Case c= loft.cases[this.x][this.y];	
		//supprimer le neuneu de la case actuelle
		c.contenu.remove(c.contenu.indexOf(this.nom));
		//générer deux entiers aléatoires 
		this.x=rd.nextInt(this.loft.cases.length);
		this.y=rd.nextInt(this.loft.cases[0].length);
		loft.placer_neuneu(this);
		manger();
	}
	
	public void manger(){
		
		Case c=loft.cases[x][y];
		for (int i=0;i<c.contenu.size();i++){		
			String ch=c.contenu.get(i);
				//si c' un neuneu du meme type, et ils ont l'energie suffisante
				if(ch.indexOf(nom)!=0 && (energie > min_energie)){	
					System.out.println("en reproduction");
					loft.P.augmenter(1);
					System.out.println("new neuneu");
					}
				
				else {
					//on cherche l'element dans le stock pour voir la qté d'énergie
					int j=0;
					
					while (j<loft.stock.size()){
						if (loft.stock.get(j).nom.equals(ch)){
							energie+=loft.stock.get(j).val_energitique;
							c.contenu.remove(i);}
						j++;
					}
					
				}	
				
				
		}
	}

}
