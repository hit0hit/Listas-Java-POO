package lista1;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		num[0] = 5;
		num[1] = 12;
		num[2] = 4;
		num[3] = 7;
		num[4] = 10;
		num[5] = 3;
		num[6] = 2;
		num[7] = 6;
		num[8] = 23;
		num[9] = 16;
		int divis[] = new int[5];
		divis[0] = 3;
		divis[1] = 11;
		divis[2] = 5;
		divis[3] = 8;
		divis[4] = 2;

		

		int x=0, y=0;
		for (int p = 0; p < 10; p++) {
			System.out.println("\nnumero==> "+num[p]);
		for(int q=0;q<5;q++) {
			x=num[p];
			y=divis[q];
			if(x % y == 0) {
			       
				 System.out.println("e divisivel por==> "+y+" na posicao "+p);
			}
			y=0;
			x=0;
		}	
		}
}}
