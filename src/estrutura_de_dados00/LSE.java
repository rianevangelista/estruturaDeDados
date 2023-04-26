public class LSE {
  //Cabeça (início) da lista: referencia o primeiro node
  Node head;

  //Método construtor: chamado no momento da criação (new)
  LSE() {
    head = new Node();
    head.next = null;
  }

  void inserirFinal(int valor) {
    Node novo = new Node();
    novo.info = valor;
    novo.next = null;

    //Referência auxiliar para percorrer a lista
    Node aux = head;

    //Percorre a lista procurando o último node
    //Enquanto o aux não for o último, avanço na lista
    while(aux.next != null) {
      aux = aux.next;
    }

    aux.next = novo;
  }

  public void printLista() {
    Node ultimo = head;

    while(ultimo.next != null) {
      ultimo = ultimo.next;
      System.out.println(ultimo.info);
    }
  }

  void inserirEmPos(int valor, int pos) {
    //Obs.: pos = 1, primeiro elemento após o head;
    //pos = 2, segundo elemento após o head, etc. 
  }

  void inserirInicio(int valor) {

  }

  boolean isEmpty() {
    if(head.next == null) return true;
    return false;
  }
}