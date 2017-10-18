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
public class ListaDoble{
  public Nodo primero;
 
  public ListaDoble(int dato){
      primero = new Nodo(dato);
      primero.siguiente= primero;
  }

  public void InsertarAlFrente(int dato){
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = primero;
    primero.anterior=nuevo;
    primero=nuevo; 
  }

  public void Imprimir(){
    Nodo auxiliar = primero;
    while(auxiliar!=null){
      auxiliar.Imprimir();
      auxiliar = auxiliar.siguiente;
    }
  }
}