package estrutura_de_dados00;

public class Principal {
	public Principal() {
//		Tipo  objeto		
		Pilha pilha1 = new Pilha();
		Pilha pilha2 = new Pilha();
		Pilha pilha3 = new Pilha();
		
		pilha1.push(17);
		pilha1.push(22);
		pilha1.push(26);
		pilha1.push(15);
		pilha1.push(12);
		
		// IMPRIMIR PILHA
		printPilha(pilha1);
		System.out.println();
		
		// IMPRIMIR PILHA INVERTIDA
		printPilhaInvertida(pilha1);
		System.out.println();
		
		// BUSCAR VALOR NA PILHA
		buscarPilha(pilha1, 26);
		System.out.println();
	}
	
	// IMPLEMENTANDO OS MÉTODOS

	void printPilha(Pilha pilha) {		
		Pilha aux1 = new Pilha();
		
		while(!pilha.isEmpty()) {
			System.out.println(pilha.top());
			aux1.push(pilha.pop());
		}
		
		while(!aux1.isEmpty()) {
			pilha.push(aux1.pop());
		}
	
	}
	
	void printPilhaInvertida(Pilha pilha) {
		Pilha aux2 = new Pilha();
		
		while(!pilha.isEmpty()) {
			aux2.push(pilha.pop());
		}
		
		while(!aux2.isEmpty()) {
			System.out.println(aux2.top());
			pilha.push(aux2.pop());
		}
	}
	
	int buscarPilha(Pilha pilha, int valor) {
		int y = 0;
		Pilha aux3 = new Pilha();
		
		while(!pilha.isEmpty()) {
			y++;
			if(valor == pilha.top()) {
				System.out.println(y);
				aux3.push(pilha.top());
				return y;
			}
			pilha.pop();
		}
		return -1;
	}

	
	void removerValor(Pilha pilha, int valor) {
		Pilha aux4 = new Pilha();
		
		while(!pilha.isEmpty()) {
			if(valor == pilha.top()) {
				System.out.println("Delete: " + pilha.top());
				pilha.pop();
			}
			aux4.push(pilha.pop());
		}
		
		while(!aux4.isEmpty()) {
			pilha.push(aux4.pop());
		}
	}
	
	/*void duplicarValor(Pilha pilha, int valor) {
		
	}
	
	void substituirValor(Pilha pilha, int v1, int v2) {

	}*/
	
	/*boolean compararPilhas(Pilha p1, Pilha p2) {
	
	}*/
	
	void separarParImpar(Pilha p1, Pilha p2, Pilha p3) {
		Pilha aux5 = new Pilha();
		
		while(!p1.isEmpty()) {
			if(p1.top() % 2 == 0) {
				p2.push(p1.top());
			} else {
				p3.push(p1.top());
			}
			
			aux5.push(p1.pop());
		}
		
		while(!aux5.isEmpty()) {
			p1.push(aux5.pop());
		}
	}
	
	public static void main(String[] args) {
		Principal app = new Principal();
	}
}
