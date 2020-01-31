public class Orang {

    public static void main(String[] args) {
        
        // field
    private String id;
    private String nama;
    private int umur;

    //Constructor
    public Orang(String id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }
    
    // deklarasi method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void kenalan(){
        System.out.println("Halo nama saya "+ this.nama);
    }
    }
    
}