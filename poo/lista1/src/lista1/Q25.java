package lista1;

public class Q25 {

	public static void main(String[] args) {
	//int V1[]=new int[5];
	int V1[]={4,7,10,12,3};
	int V2[]= {8,13,10,18,30};
	char op[]= {'+','-','/','+','*'};
	int resul[]=new int[5];
	for (int i=0;i<5;i++) {
		switch (op[i]) {
		case '+':
			resul[i]=V1[i]+V2[i];
			break;
		case '-':
			resul[i]=V1[i]-V2[i];
			break;
		case '/':
			resul[i]=V1[i]/V2[i];
			break;
		case '*':
			resul[i]=V1[i]*V2[i];
			break;

		default:
			break;
		}
		
		
	}
	System.out.println("V1 + OP + V2 = RESUL");
	for(int i=0;i<5;i++) {
		System.out.println(""+V1[i]+""+op[i]+""+V2[i]+"="+resul[i]);
		}
	}

}
