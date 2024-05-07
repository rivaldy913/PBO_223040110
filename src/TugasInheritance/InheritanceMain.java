package TugasInheritance;


public class InheritanceMain {
	public static void main (String[] args) {
		Guru guru = new Guru (13579009, "Budi", "Biologi") ;
		System. out.println (guru.getNip() + "- "+ guru.getNama () + "- "+ guru.getMapel()) ;
		}
}