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
public class Pila{
  public Nodo primero;

  public Pila(int dato){
      primero = new Nodo(dato);
  }

  public void Apilar(int dato){
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = primero;
    primero = nuevo;
  }

  public int Desapilar(){
    int dato = primero.dato;
    primero = primero.siguiente;
    return dato;
  }

  public void Imprimir(){
    while(primero!=null){
      System.out.println(Desapilar());
    }
  }


}