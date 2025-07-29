public class Ergo {

    private int id;
    private String onomasia;
    private String perigrafi;
    private float kostos;
    private Ypopshfios ypopshfiosPtr;

    public Ergo() {
    }

    public Ergo(int id, String onomasia, String perigrafi, float kostos, Ypopshfios ypopshfiosPtr) {
        this.id = id;
        this.onomasia = onomasia;
        this.perigrafi = perigrafi;
        this.kostos = kostos;
        this.ypopshfiosPtr = ypopshfiosPtr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOnomasia() {
        return onomasia;
    }

    public void setOnomasia(String onomasia) {
        this.onomasia = onomasia;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public float getKostos() {
        return kostos;
    }

    public void setKostos(float kostos) {
        this.kostos = kostos;
    }

    public Ypopshfios getYpopshfiosPtr() {
        return ypopshfiosPtr;
    }

    public void setYpopshfiosPtr(Ypopshfios ypopshfiosPtr) {
        this.ypopshfiosPtr = ypopshfiosPtr;
    }

    public boolean orismosKostous(float poso) {
        this.kostos = poso;
        return true;
    }

    public void ektyposiProtasis() {
        // Ενδεικτική εκτύπωση
        System.out.println("Έργο: " + onomasia + " - Κόστος: " + kostos);
    }
} 

class Ypopshfios {
    private String onoma;

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }
}
