package view;
import controller.VetPares;
public class Principal {

	public static void main(String[] args) {
		int a []  = {2, 5, 12, 6, 8, 11};
		int size = a.length;
		
		VetPares vp = new VetPares();
		int VetP = vp.parvet(a, size);
		System.out.println(VetP);
	}

}
