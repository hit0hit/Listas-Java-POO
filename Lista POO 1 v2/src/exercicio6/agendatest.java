package exercicio6;

public class agendatest {

	public static void main(String[] args) {
		 agenda agendas = new agenda();

	        agendas.armazenaPessoa("kaname", 18,2.07);
	        agendas.armazenaPessoa("Yuno", 15,1.59);
	        agendas.armazenaPessoa("Akira", 50,1.78);

	        agendas.imprimirAgenda();

	        agendas.removePessoa("kaname");
	        agendas.armazenaPessoa("ayaka", 30,1.35);


	        agendas.imprimirAgenda();

	        System.out.println("Indíce do kaname: " + agendas.buscaPessoa("kaname"));
	        int i = agendas.buscaPessoa("kaname");
	        agendas.imprimePessoa(i);
	}

}
