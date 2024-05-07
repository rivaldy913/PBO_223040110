package TugasInheritance;

public class Guru extends StaffTU{
private String mapel;
public Guru (int nip, String nama, String mapel) {
super (nip, nama) ;
this. mapel = mapel;

}

public String getMapel () {
return mapel;
}
public void setMapel (String mapel) {
this. mapel = mapel;

}

}