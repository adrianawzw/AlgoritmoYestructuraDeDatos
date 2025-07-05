package sem14;

public class Arbol {

    Nodo raiz;

    public void agregarMiembro(String nom, boolean esHom) {
        raiz = agregarMiembroRecursivo(raiz, nom, esHom);
    }

    private Nodo agregarMiembroRecursivo(Nodo nodo, String nom, boolean esHom) {
        if (nodo == null) {
            return new Nodo(nom);
        }

        if (esHom) {
            nodo.derhom = agregarMiembroRecursivo(nodo.derhom, nom, esHom);
        } else {
            nodo.izqmuj = agregarMiembroRecursivo(nodo.izqmuj, nom, esHom);
        }

        return nodo;
    }

    public String recorridoInorden() {
        StringBuilder resultado = new StringBuilder();
        recorrerInorden(raiz, resultado);
        return resultado.toString();
    }

    private void recorrerInorden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            recorrerInorden(nodo.izqmuj, resultado);
            resultado.append(nodo.nombre).append("\n");
            recorrerInorden(nodo.derhom, resultado);
        }
    }
}
