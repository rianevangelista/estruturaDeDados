package estrutura_de_dados00;

public class Principal {
	public Principal() {		
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
		// DUPLICAR VALOR NA PILHA
		duplicarValor(pilha1, 17);
		System.out.println();
		
		printPilha(pilha1);
		System.out.println();

		// FILA
		System.out.println("FILA");
		
		Fila fila = new Fila();
		fila.enqueue(14);
		fila.enqueue(23);
		fila.enqueue(35);
		fila.enqueue(27);
		
		// IMPRIMIR FILA
		printFila(fila);
		System.out.println();
		// BUSCAR VALOR NA FILA
		buscarFila(fila, 23);
		System.out.println();

		// REMOVER VALOR DA FILA **
		removerValorF(fila, 14);
		System.out.println();


		// LISTA
		System.out.println("LISTA");
		LSE lista = new LSE();
		lista.inserirFinal(14);
		lista.inserirFinal(12);
		lista.inserirFinal(52);
		lista.inserirFinal(76);
		lista.inserirFinal(83);
		lista.inserirFinal(15);
		lista.printLista();

	}
	
	// IMPLEMENTANDO OS MÉTODOS
	void printFila(Fila fila) {	
		
		Fila auxFila1 = new Fila();
		
		while(!fila.isEmpty()) {
			System.out.println(fila.front());
			auxFila1.enqueue(fila.dequeue());
		}
		while(!auxFila1.isEmpty()) {
			fila.enqueue(auxFila1.dequeue());
		}
		
	}

	boolean buscarFila(Fila fila, int valor) {
				
		Fila auxFila2 = new Fila();
		
		while(!fila.isEmpty()) {
			if(valor == fila.front()) {
				System.out.println(fila.front());
				auxFila2.enqueue(fila.front());
				return true;
			} 	
			fila.dequeue();
		}
		
		
		return false;
	}
	
	void removerValorF(Fila fila, int valor) {
		//Remove todas as ocorrências de valor da fila
		Fila auxFila4 = new Fila();
		
		while(!fila.isEmpty()) {
			if(valor == fila.front()) {
				System.out.println("Delete: " + fila.front());
				fila.dequeue();
			}
			else {
				auxFila4.enqueue(fila.dequeue());
			}
		}
		
		while(!auxFila4.isEmpty()) {
			fila.enqueue(auxFila4.dequeue());
		}
	}

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

	void printRecursivo(Pilha p) {
		if(p.isEmpty()) return;
		int x = p.pop();
		System.out.print(x + "-");
		printRecursivo(p);
		p.push(x);
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
	
	void duplicarValor(Pilha pilha, int valor) {
		Pilha aux5 = new Pilha();
		
		while(!pilha.isEmpty()) {
			if (valor == pilha.top()) {
				aux5.push(pilha.top());
			}
			aux5.push(pilha.pop());
		}
		
		while(!aux5.isEmpty()) {
			pilha.push(aux5.pop());
		}		
	}

	
	/*void substituirValor(Pilha pilha, int v1, int v2) {

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
