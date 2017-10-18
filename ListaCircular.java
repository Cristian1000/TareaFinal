/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef5;

/**
 *
 * @author crist
 */
public class ListaCircular{
  public Nodo primero;
  public Nodo ultimo;

  public ListaCircular(int dato){
      primero = new Nodo(dato);
      primero.siguiente = primero;
      ultimo = primero;
  }

  public void InsertarAlFinal(int dato){
      Nodo nuevo = new Nodo(dato);
      ultimo.siguiente = nuevo;
      ultimo = nuevo;
      ultimo.siguiente= primero;
  }

  public void Imprimir(){
      Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
        auxiliar = auxiliar.siguiente;
      } while (auxiliar!=primero);
  }

}

