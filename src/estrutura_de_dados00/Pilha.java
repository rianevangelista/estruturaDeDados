package estrutura_de_dados00;

public class Pilha {
	//Atributos
	private int capacidade = 100;
	private int vetor[] = new int[capacidade];
	private int i = 0;
	
	//Métodos
	void push(int valor) {
		//Se a pilha não atingiu a capacidade 
		if (i < capacidade)
			vetor[i++] = valor;
	}
	
	int pop() {
		//Se a pilha não estiver vazia
		if(i > 0)
			return vetor[--i];
		//Se a pilha estiver vazia
		else
			return -1;
	}
	
	int top() {
		//Se a pilha não estiver vazia
		if(i > 0)
			return vetor[i-1];
		//Se a pilha estiver vazia
		else
			return -1;
	}
	
	boolean isEmpty() {
		if (i == 0)
			return true;
		else
			return false;
	}
	
	int size() {
		return i;
	}
}
