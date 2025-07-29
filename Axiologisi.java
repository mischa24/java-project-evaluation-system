public class Axiologisi {

    private int vathmologia;
    private String sxolia;
    private Ergo ergoPtr;
    private Empeirognomonas empeirognomonasPtr;

    public Axiologisi() {
    }

    public Axiologisi(int vathmologia, String sxolia, Ergo ergoPtr, Empeirognomonas empeirognomonasPtr) {
        this.vathmologia = vathmologia;
        this.sxolia = sxolia;
        this.ergoPtr = ergoPtr;
        this.empeirognomonasPtr = empeirognomonasPtr;
    }

    public int getVathmologia() {
        return vathmologia;
    }

    public void setVathmologia(int vathmologia) {
        this.vathmologia = vathmologia;
    }

    public String getSxolia() {
        return sxolia;
    }

    public void setSxolia(String sxolia) {
        this.sxolia = sxolia;
    }

    public Ergo getErgoPtr() {
        return ergoPtr;
    }

    public void setErgoPtr(Ergo ergoPtr) {
        this.ergoPtr = ergoPtr;
    }

    public Empeirognomonas getEmpeirognomonasPtr() {
        return empeirognomonasPtr;
    }

    public void setEmpeirognomonasPtr(Empeirognomonas empeirognomonasPtr) {
        this.empeirognomonasPtr = empeirognomonasPtr;
    }

    public boolean orismosVathmologias(int vathmos) {
        this.vathmologia = vathmos;
        return true;
    }

    public void ektyposiAxiologisis() {
        // Ενδεικτική εκτύπωση
        System.out.println("Αξιολόγηση: " + vathmologia + " - Σχόλια: " + sxolia);
    }
}

class Empeirognomonas {
    private String onoma;

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }
}
