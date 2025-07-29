public class EreunitikiProtasi extends Ergo {

    private int arithmosMelonOmadas;
    private int etiEreunitikisEmpeirias;

    public EreunitikiProtasi() {
        super();
    }

    public EreunitikiProtasi(int id, String onomasia, String perigrafi, float kostos,
                              Ypopshfios ypopshfiosPtr,
                              int arithmosMelonOmadas, int etiEreunitikisEmpeirias) {
        super(id, onomasia, perigrafi, kostos, ypopshfiosPtr);
        this.arithmosMelonOmadas = arithmosMelonOmadas;
        this.etiEreunitikisEmpeirias = etiEreunitikisEmpeirias;
    }

    public int getArithmosMelonOmadas() {
        return arithmosMelonOmadas;
    }

    public void setArithmosMelonOmadas(int arithmosMelonOmadas) {
        this.arithmosMelonOmadas = arithmosMelonOmadas;
    }

    public int getEtiEreunitikisEmpeirias() {
        return etiEreunitikisEmpeirias;
    }

    public void setEtiEreunitikisEmpeirias(int etiEreunitikisEmpeirias) {
        this.etiEreunitikisEmpeirias = etiEreunitikisEmpeirias;
    }
}
