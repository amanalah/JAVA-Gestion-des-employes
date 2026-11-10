//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();
        //les  employes
        Employe e1= new Employe(3,"Salah","Ben Hmida","IT",1);
        Employe e2= new Employe(2,"Wijden","Dalhoumi","RH",3);
        Employe e3=new Employe(5,"Amine","Ksiksi","PRODUCTION",2);
        Employe e4= new Employe(1,"Chaima","Aouinet","IT",2);
        Employe e5= new Employe(4,"Nour","Ben Hmida","PRODUCTION",4);
        //ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);
        //tri id
        System.out.println("*****TRI PAR ID*****");
        societe.trierEmployeParId();
        societe.displayEmploye();
        //tri personnalise
        System.out.println("*****TRI PERSONNALISE*****");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        //Recherche
        System.out.println("*****RECHERCHE PAR DEPARTEMENT*****");
        System.out.println("Les emplyes de departement IT: " + societe.rechercherParDepartement("IT"));
        System.out.println("Les employes de departement Production: "+societe.rechercherParDepartement("PRODUCTION"));
        System.out.println("Les employes de departement RH: "+societe.rechercherParDepartement("RH"));

    }
}