public class SalleCinema {
    
 private int numsalle;
 public String titrefilm;
 public int nbClasse;
 public float PrixUn;
 public int nbClasseVendueTraiN;
 public int nbClasseVendueTraiR;





 
    public SalleCinema (String titre, int Prix,  int nbp) {
    
    titrefilm =titre;
    nbClasse =nbp;
    PrixUn = Prix;
    
    
    }

public int nbPlacesDisponibles() {

    int res ;
     
    res = nbClasse-(nbClasseVendueTraiN+ nbClasseVendueTraiR);
    return res;
}
public void vendrePlaces(int nbre, boolean tarifReduit){
    
 
 int nbdis;
  nbdis = nbPlacesDisponibles() ;

  if (nbre > nbdis){
    System.out.println("la vente n'est pas possible") ; }
   
  if (tarifReduit = false  ){
    nbClasseVendueTraiN=nbClasseVendueTraiN+nbre;
    
  Float  res1=nbre*PrixUn;
   
    System.out.println("Salle"+numsalle+":"+"Place vendues"+":"+nbClasseVendueTraiN+"prix="+res1+"à Tarif Normale");
    
  }else {
    nbClasseVendueTraiR=nbClasseVendueTraiR+nbre;
 Float   res2= (nbre*(PrixUn*(float)0.8));
 System.out.println("Salle"+numsalle+":"+"Place vendues"+":"+nbClasseVendueTraiR+"prix="+res2+"à Tarif Reduite");
 }
}
public void remiseAZero(){
    nbClasseVendueTraiN =0;
    nbClasseVendueTraiR=0;
}
public double chiffreAffaires(){
   float res ;
    res = (nbClasseVendueTraiN*PrixUn)+(nbClasseVendueTraiR*(PrixUn*(float)0.8));
    return res;
}
public double tauxRemplissage(){
    double res = ((nbClasseVendueTraiN+nbClasseVendueTraiR)/nbClasse)*100;
    return res;

}
public String toString(){
    return("Film joué :"+titrefilm+", Nombre de places  :" +nbClasse+
    ",Prix d'une place :"+PrixUn+"places vendues au tarif normal ,"
   +"places vendues au tarif réduit."+", Nombre de places  :"+nbClasse+
   ",Prix d'une place :"+PrixUn+"places vendues au tarif reduit ,");
}
public static void main(String[] args) {
    SalleCinema s1 = new SalleCinema ("chat blac,chat noir",8,120);
    SalleCinema s2 = new SalleCinema ("La vie est belle",7,50);
     s1.vendrePlaces(2,false);
     s2.vendrePlaces(3, true);
    s1.nbPlacesDisponibles();
     s2.nbPlacesDisponibles();
     s1.chiffreAffaires();
     s2.chiffreAffaires();
     System.out.println(s1);
     System.out.println(s2);
     
} 



}
