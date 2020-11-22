public class trab {
     public void empilhar(Object o) {
     pilha[topo++] = o;
     
     }
     public Object desempilhar() {
     return pilha[--topo];
     }
     public int getQtdeElementos() {
     return topo;
     }
     private final Object[] pilha = new Object[1000];
     private int topo = 0;
     }