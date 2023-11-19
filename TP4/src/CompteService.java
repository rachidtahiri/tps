import java.util.ArrayList;

public class CompteService {

    public int fermer(String rib, ArrayList<compte> comptes) {
        compte c = findByRib(rib, comptes);
        if (c == null)
            return -1;
        else if (c.isOuvert() == false) {
            return -2;
        } else {
            c.setOuvert(false);
            return 1;
        }
    }

    public compte findByRib(String rib, ArrayList<compte> comptes) {
        for (compte compte : comptes) {
            if (compte.getRib().equals(rib)) {
                return compte;
            }
        }
        return null;
    }

    public int transferer(String ribSource, String ribDestination, double montant, ArrayList<compte> comptes) {
        compte compteSource = findByRib(ribSource, comptes);
        compte compteDestination = findByRib(ribDestination, comptes);
        if (compteSource == null || compteSource.isOuvert() == false)
            return -1;
        if (compteDestination == null || compteDestination.isOuvert() == false)
            return -2;
        else if (compteSource.getSolde() < montant)
            return -3;
        else {
            compteSource.setSolde(compteSource.getSolde() - montant);
            compteDestination.setSolde(compteDestination.getSolde()+montant);
            return 1;
        }


    }
}
