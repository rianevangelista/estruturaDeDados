public class Fila {
	//Atributos
	private int capacidade = 100;
	private int vetor[] = new int[capacidade];
	private int frente = 0;
	private int cauda = 0;
	private int tam = 0;
	
	//Métodos
	int front() {
		//Retornar quem está na frente da fila
		if(isEmpty() == true)
			return -1;
		else
			return vetor[frente];
	}
	
	void enqueue(int valor) {
		//Verificando se a fila está cheia
		if(tam == capacidade) return;
		//Inserindo o valor no vetor
		vetor[cauda] = valor;
		//Incrementando a posição da cauda
		cauda++;
		//Retornando a posição da cauda para o início do vetor
		cauda = cauda % 100;
		//Incrementando o valor do tamanho
		tam++;
	}

	int dequeue() {
		//Verificando se a fila está vazia
		if(isEmpty() == true) return -1;
		//Removendo o valor do vetor
		int valor = vetor[frente];
		//Incrementando a posição da frente da fila
		frente++;
		//Retornando a posição da frente para o início do vetor
		frente = frente % 100;
		//Decrementando o valor do tamanho
		tam--;
		//Retornando o valor da frente da fila
		return valor;
	}
	
	boolean isEmpty() {
		if (tam == 0)
			return true;
		else
			return false;
	}
	
	int size() {
		return tam;
	}
}