import java.util.Comparator;

public class Employe implements Comparable<Employe>, Comparator<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe(){}
    public Employe(int id, String nom, String prenom, String nomDepartement,int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDepartement=nomDepartement;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public String toString(){
        return "Id: "+id+", Nom: "+nom+", Prenom: "+prenom+", Nom de département: "+nomDepartement +", Grade: "+grade;
    }

    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.id,e.id);
    }

    @Override
    public int compare(Employe e1, Employe e2) {
        int c=e1.getNomDepartement().compareTo(e2.getNomDepartement());
        if (c != 0){return c;}
        c =Integer.compare(e1.getGrade(), e2.getGrade());
        if (c != 0){return c;}
        c=e1.getNom().compareTo(e2.getNom());
        return c;


    }
}
