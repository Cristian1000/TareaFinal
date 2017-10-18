package ef5;

/**
 *
 * @author crist
 */
public class Nodo{

  public Nodo siguiente;
  public Nodo anterior;
  public int dato;

  public Nodo(int dato){
    this.dato = dato;
  }

  public void Imprimir(){
    System.out.println(dato);
  }
}

