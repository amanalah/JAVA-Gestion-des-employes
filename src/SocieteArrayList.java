import java.util.ArrayList;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe>{
    private ArrayList<Employe> employes;

    public SocieteArrayList(){
        employes=new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0;i<employes.size();i++){
            if (employes.get(i).getNom().equals(nom)){return true;}
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for (int i=0;i<employes.size();i++){
            System.out.println(employes.get(i));
        }

    }

    @Override
    public void trierEmployeParId() {
        employes.sort(null);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(new Employe());
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> employesDep= new ArrayList<>();
        for (int i=0;i<employes.size();i++){
            if (employes.get(i).getNomDepartement().equals(nomDepartement)){
                employesDep.add(employes.get(i));
            }
        }
        return employesDep;
    }
}
