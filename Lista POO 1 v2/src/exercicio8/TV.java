package exercicio8;

public class TV {
	 public static void main(String[] args) {
	        controleremoto controle = new controleremoto();

	        System.out.println("volume: " + controle.getVolume()+"\ncanal: " + controle.getCanal());
	     

	        for (int i = 0; i < 43; i++) {
	            controle.aumentaVolume();
	        }
	        for (int i = 0; i < 5436; i++) {
	            controle.diminuiCanal();
	        }

	        System.out.println("volume: " + controle.getVolume()+"\ncanal: " + controle.getCanal());
		     

	        for (int i = 0; i < 70; i++) {
	            controle.diminuiVolume();
	        }
	        for (int i = 0; i < 43; i++) {
	            controle.aumentaCanal();
	        }

	        System.out.println("volume: " + controle.getVolume()+"\ncanal: " + controle.getCanal());
		     
	    }
}
