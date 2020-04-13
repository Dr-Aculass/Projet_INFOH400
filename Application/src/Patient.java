public class Patient {
    //public int key;
    private int typebesoin;
    private Adresse adresse; // code postal
    private String nom; // + info perso (�ge, sexe)
    // + Num�ro national (NISS)
    
    public Patient(String nom, int typebesoin, Adresse adresse){
        this.nom = nom;
        this.typebesoin = typebesoin;
        this.adresse = adresse; 
    }
    
    public int gettype(){
        return typebesoin;
    }
    
    public Adresse getadresse(){
        return adresse;
    }    
}
