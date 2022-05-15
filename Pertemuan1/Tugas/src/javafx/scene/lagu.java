
package javafx.scene;

public class lagu {
    private String band;
private String judul;
private String pencipta;

public void IsiParam(String judul,String band) {
this.judul = judul;
this.band = band;
}
public void cetakKeLayar() {
if(judul==null && band==null) return;
System.out.println("Judul : " + judul +"\nBand : " + pencipta);
}
}
