public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {50, 30, 70, 20, 40, 60, 80, 10};
        for (int v : valores) {
            arbol.insertar(v);
        }

        System.out.println("=== Representación jerárquica del árbol ===");
        arbol.imprimirArbol();

        System.out.println("\n=== Recorridos ===");
        System.out.print("Preorden:  ");
        arbol.preorden();
        System.out.print("Inorden:   ");
        arbol.inorden();
        System.out.print("Postorden: ");
        arbol.postorden();

        System.out.println("\n=== Métricas ===");
        System.out.println("Altura del árbol: " + arbol.getAltura());
        System.out.println("Cantidad de hojas: " + arbol.contarHojas());
        System.out.println("Profundidad del nodo 40: " + arbol.obtenerProfundidad(40));
        System.out.println("Grado del nodo 30: " + arbol.obtenerGrado(30));
        System.out.println("Grado del nodo 20 (hoja): " + arbol.obtenerGrado(20));
    }
}