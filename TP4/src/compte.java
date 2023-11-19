public class compte {
    private String rib ;
    private  double solde;
    private  boolean ouvert;

    public void setRib(String rib) {
        this.rib = rib;
    }

    @Override
    public String toString() {
        return "CompteTest{" +
                "rib='" + rib + '\'' +
                ", solde=" + solde +
                ", ouvert=" + ouvert +
                '}';
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public compte() {
    }

    public compte(String rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    }

    public compte(String rib, double solde, boolean ouvert) {
        this.rib = rib;
        this.solde = solde;
        this.ouvert = ouvert;
    }

    public String getRib() {
        return rib;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isOuvert() {
        return ouvert;
    }
}
