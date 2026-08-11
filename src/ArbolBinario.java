public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public void preorden() {
        preordenRecursivo(raiz);
        System.out.println();
    }

    private void preordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRecursivo(nodo.izquierdo);
            preordenRecursivo(nodo.derecho);
        }
    }

    public void inorden() {
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.derecho);
        }
    }

    public void postorden() {
        postordenRecursivo(raiz);
        System.out.println();
    }

    private void postordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postordenRecursivo(nodo.izquierdo);
            postordenRecursivo(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    public int getAltura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null) {
            return -1;
        }
        int alturaIzq = calcularAltura(nodo.izquierdo);
        int alturaDer = calcularAltura(nodo.derecho);
        return 1 + Math.max(alturaIzq, alturaDer);
    }

    public int contarHojas() {
        return contarHojasRecursivo(raiz);
    }

    private int contarHojasRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.izquierdo == null && nodo.derecho == null) {
            return 1;
        }
        return contarHojasRecursivo(nodo.izquierdo) + contarHojasRecursivo(nodo.derecho);
    }

    public int obtenerProfundidad(int valor) {
        return profundidadRecursiva(raiz, valor, 0);
    }

    private int profundidadRecursiva(Nodo nodo, int valor, int nivelActual) {
        if (nodo == null) {
            return -1;
        }
        if (nodo.valor == valor) {
            return nivelActual;
        }
        if (valor < nodo.valor) {
            return profundidadRecursiva(nodo.izquierdo, valor, nivelActual + 1);
        } else {
            return profundidadRecursiva(nodo.derecho, valor, nivelActual + 1);
        }
    }

    public int obtenerGrado(int valor) {
        Nodo nodo = buscarNodo(raiz, valor);
        if (nodo == null) return -1;
        int grado = 0;
        if (nodo.izquierdo != null) grado++;
        if (nodo.derecho != null) grado++;
        return grado;
    }

    private Nodo buscarNodo(Nodo actual, int valor) {
        if (actual == null || actual.valor == valor) {
            return actual;
        }
        if (valor < actual.valor) {
            return buscarNodo(actual.izquierdo, valor);
        }
        return buscarNodo(actual.derecho, valor);
    }

    public void imprimirArbol() {
        imprimirArbol(raiz, "", true);
    }

    private void imprimirArbol(Nodo nodo, String prefijo, boolean esUltimo) {
        if (nodo == null) {
            return;
        }
        System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.valor);
        String nuevoPrefijo = prefijo + (esUltimo ? "    " : "│   ");

        boolean tieneDerecho = nodo.derecho != null;
        if (nodo.izquierdo != null) {
            imprimirArbol(nodo.izquierdo, nuevoPrefijo, !tieneDerecho);
        }
        if (nodo.derecho != null) {
            imprimirArbol(nodo.derecho, nuevoPrefijo, true);
        }
    }
}