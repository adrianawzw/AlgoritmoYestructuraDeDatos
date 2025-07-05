/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3_repaso;

/**
 *
 * @author tapia
 */
public class ArbolBinario2 {
    Nodo2 raiz;

    public ArbolBinario2() {
        raiz = null;
    }
    
    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor);
    }
    
    public Nodo2 insertarRecursivo(Nodo2 raiz, int valor){
        if(raiz==null){
            return new Nodo2(valor);
        }
        
        //izq
        if(valor<raiz.valor){
            raiz.izq = insertarRecursivo(raiz.izq, valor);
        }else{
            raiz.der = insertarRecursivo(raiz.der, valor);
        }
        return raiz;
    }
    
    //recorrer inorden izq raiz der
    public String recorrerInorden(){
        StringBuilder sb = new StringBuilder();
        recorrerInordenRecursivo(raiz, sb);
        return sb.toString();
    }
    
    private void recorrerInordenRecursivo(Nodo2 nodo, StringBuilder sb){
        if(nodo!=null){
            recorrerInordenRecursivo(nodo.izq, sb);
            sb.append(nodo.valor).append("\n");
            recorrerInordenRecursivo(nodo.der, sb);
        }
    }
    
    //buscar 
    public boolean buscar(int valor){
        return buscarRecursivo(raiz, valor);
    }
    
    private boolean buscarRecursivo(Nodo2 nodo, int valor){
        //si el nodo esta vacio
        if(nodo == null){
            return false;
        }
        
        //si nodo actual contiene el nodo buscado
        if(nodo.valor == valor){
            return true;
        }
        
        return buscarRecursivo(nodo.izq, valor) || buscarRecursivo(nodo.der, valor);
    }
}
