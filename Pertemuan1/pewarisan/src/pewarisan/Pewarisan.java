package pewarisan;
    class Dosen extends lainnya {
            Dosen (String namados){
            nama = namados;
}
    Dosen (String namados, int umur){   
            nama = namados;
            this.umur = umur;
}
    public void namaSaya(){
             System.out.println("nama saya: "+nama);
        }
}
public class Pewarisan {
    public static void main(String[] args) {
        Dosen d = new Dosen ("yodi", 20);
        d.namaSaya();

    }
}
