public class Main {
    public static void main(String[] args) {

        // Δημιουργία υποψήφιου
        Ypopshfios yp = new Ypopshfios();
        yp.setOnoma("Ερευνητικό Κέντρο ΑΕ");

        // Δημιουργία έργου
        Ergo ergo = new Ergo(1, "Αναβάθμιση Συστήματος", "Περιγραφή έργου", 15000.0f, yp);
        ergo.ektyposiProtasis();

        // Δημιουργία ερευνητικής πρότασης με πλήρη constructor
        EreunitikiProtasi ep = new EreunitikiProtasi(
            2,
            "Πρόταση ΑΙ",
            "Ανάπτυξη αλγορίθμου μηχανικής μάθησης",
            25000.0f,
            yp,
            4,
            12
        );
        ep.ektyposiProtasis(); // ✅ Θα εμφανιστεί σωστά χωρίς null

        // Δημιουργία εμπειρογνώμονα
        Empeirognomonas emp = new Empeirognomonas();
        emp.setOnoma("Δρ. Παπαδόπουλος");

        // Δημιουργία αξιολόγησης
        Axiologisi ax = new Axiologisi();
        ax.setErgoPtr(ergo);
        ax.setEmpeirognomonasPtr(emp);
        ax.setVathmologia(9);
        ax.setSxolia("Πολύ καλή πρόταση.");
        ax.ektyposiAxiologisis();
    }
}
