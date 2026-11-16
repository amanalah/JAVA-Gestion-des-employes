import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement(){}
    public Departement(int id, String nomDepartement,  int nombreEmploye){
        this.id=id;
        this.nomDepartement=nomDepartement;
        this.nombreEmployes=nombreEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) {return true;}
        if(!(o instanceof Departement)) {return false;}
        Departement d=(Departement) o;
        return id==d.id && Objects.equals(nomDepartement,d.nomDepartement);
    }
    @Override
    public String toString(){
        return "{Id de Departement :" + id +", Nom de Departement:"+ nomDepartement+ ", Nombre des Employes:"+nombreEmployes  + "}";
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id,o.getId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }
}
