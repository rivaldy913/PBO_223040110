package TugasInheritance;

public class StaffTU {
	protected String nama;
	protected int nip;

	public StaffTU (int nip, String nama) {
		this.nama = nama;
		this.nip = nip;
	} 	 	
	public String getNama () {
		return nama;
	}

	public void setNama (String nama) {
	this.nama = nama;
	}

	public int getNip() {
		return nip;
	}
	public void setNip (int nip) {
		this.nip = nip;
	}
}