import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement> departements=new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for(Departement d: departements){
            if(Objects.equals(d.getNomDepartement(),nomDepartement)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);

    }

    @Override
    public void afficherDepartements() {
        for(Departement d : departements){
            System.out.println(d);
        }

    }

    @Override
    public void trierDepartementsParId() {
        TreeSet<Departement>tri= new TreeSet<>(departements);
        for(Departement d: tri){
            System.out.println(d);
        }

    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {

        ArrayList<Departement> liste = new ArrayList<>(departements);

        liste.sort(new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {

                int c = d1.getNomDepartement()
                        .compareTo(d2.getNomDepartement());

                if (c != 0) {
                    return c;
                }

                return Integer.compare(
                        d1.getNombreEmployes(),
                        d2.getNombreEmployes()
                );
            }
        });

        liste.forEach(System.out::println);
    }

    }
