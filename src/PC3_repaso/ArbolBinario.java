package PC3_repaso;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }
    
    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor); 
    }
    
    public Nodo insertarRecursivo(Nodo raiz, int valor){
        if(raiz == null){
            return new Nodo(valor);
        }
        
        if(valor<raiz.valor){
            raiz.izq = insertarRecursivo(raiz.izq, valor);
        }else{
            raiz.der = insertarRecursivo(raiz.der, valor);
        }
        
        return raiz;
    }
    
    //preorden: raiz izq der
    public String recorrerPreorden(){
        StringBuilder sb = new StringBuilder();
        recorrerPreordenRecursivo(raiz, sb);
        return sb.toString();
    }
    
    public void recorrerPreordenRecursivo(Nodo nodo, StringBuilder sb){
        if(nodo!=null){
            sb.append(nodo.valor).append("\n");
            recorrerPreordenRecursivo(nodo.izq, sb);
            recorrerPreordenRecursivo(nodo.der, sb);
        }
    }
  
    //postorden izq - der - raiz
    public String recorrerPostOrden(){
        StringBuilder sb = new StringBuilder();
        recorrerPostOrdenRecursivo(raiz, sb);
        return sb.toString();
    }
    
    public void recorrerPostOrdenRecursivo(Nodo nodo, StringBuilder sb){
        if(nodo != null){
            recorrerPostOrdenRecursivo(nodo.izq, sb);
            recorrerPostOrdenRecursivo(nodo.der, sb);
            sb.append(nodo.valor).append("\n");
        }
    }
    
    //inorden: izq raiz der
    public String recorrerInorden(){
        StringBuilder sb = new StringBuilder();
        recorrerInordenRecursivo(raiz, sb);
        return sb.toString();
    }
    
    public void recorrerInordenRecursivo(Nodo nodo, StringBuilder sb){
        if(nodo !=null){
            recorrerInordenRecursivo(nodo.izq, sb);
            sb.append(nodo.valor).append("\n");
            recorrerInordenRecursivo(nodo.der, sb);
        }
    }
    
    //representar
    public String representar(){
        StringBuilder sb = new StringBuilder();
        representarRecursivo(raiz, sb, 0);
        return sb.toString();
    }

    private void representarRecursivo(Nodo nodo, StringBuilder sb, int nivel) {
        if (nodo != null) {
            representarRecursivo(nodo.der, sb, nivel + 1);
            sb.append("   ".repeat(nivel)).append(nodo.valor).append("\n");
            representarRecursivo(nodo.izq, sb, nivel + 1);
        }
    }
    
}
