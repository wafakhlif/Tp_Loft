import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Loft l=new Loft(4,4,1);
		l.ajout_nourriture(2,"panier1");
		l.ajout_nourriture(4,"panier2");
		l.ajout_nourriture(6,"panier3");
		l.init_loft_nourriture();
		
		ArrayList <Neuneus>neuneus = new ArrayList<Neuneus>();
		neuneus.add(new Erratique("Erratique1",0,0,l));
		neuneus.add (new Lapin("Lapin1",0,1,l));
		neuneus.add (new Vorace("Vorace1",2,1,l));
		
		l.init_loft_neuneu(neuneus);
		l.affiche();
		
		for (int i=0;i<neuneus.size();i++){
		neuneus.get(i).se_deplacer();
		}
		System.out.println("************************");
		l.affiche();
	}
}
