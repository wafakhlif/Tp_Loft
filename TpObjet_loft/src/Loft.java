import java.util.ArrayList;
import java.util.Random;


public class Loft {
	
		//h et w : nombres de cases à la verticale et l'horisontale
		int h,w;
		//le loft est une matrice de cases
		Case[][]cases;
		//le loft contient un stock de nourriture
		ArrayList <Nourriture>stock= new ArrayList<Nourriture>();;
		//le loft contient une population
		Population P;
		
		public void ajout_nourriture(int v,String nom){
			//insertion d'uune nouvelle nourriture
			Nourriture n=new Nourriture (v,nom);
			stock.add(n);
		}
				
		
		//création du loft
		public Loft(int h,int w,int p){
			this.h=h;
			this.w=w;
			cases =new Case [h][w];
			P=new Population(p);
			for(int i=0;i<h;i++)
				for (int j=0;j<w;j++)
					cases [i][j]= new Case();
		}
		
		
		/*initialisation du loft*/
		public void init_loft_neuneu(ArrayList neuneus){
			//placer tout les neuneus crées dans le loft dans leurs positions
			for (int i=0;i<neuneus.size();i++){
				Neuneus n= (Neuneus)neuneus.get(i);
				cases[n.x][n.y].contenu.add(n.nom);
			}	
		}
		
	
		public void placer_neuneu(Neuneus n){
			cases[n.x][n.y].contenu.add(n.nom);
		}
		
		//placer la nourriture d'une façon aléatoire 
		int X,Y,K;
		
		public void init_loft_nourriture(){
			Random rd = new Random();
			for (int i=0;i<10;i++)
			{
				X=rd.nextInt(h);
				Y=rd.nextInt(w);
				K=rd.nextInt(stock.size());
				cases[X][Y].contenu.add(stock.get(K).nom);
			}
		}

		public void affiche(){
			for (int i=0;i<h;i++)
				for (int j=0;j<w;j++){
					System.out.print("loft["+i+","+j+"] :");
					for (int k=0;k< cases[i][j].contenu.size();k++){
						System.out.print(cases[i][j].contenu.get(k)+",");
					}
					System.out.print("\n");
				}
			System.out.print("\n");
		}

		public boolean Contient_nourriture(int i , int j){
			for (int k =0;k<cases[i][j].contenu.size();k++){
				String ch=cases[i][j].contenu.get(k);
				while (j<stock.size()){
					if (stock.get(j).nom.equals(ch))
						return true;
				}
			}
			return false;	
		}
}
