# Actividad Evaluable 10 - Árboles

Se implementó un **Árbol Binario de Búsqueda (ABB)**. Se eligió este modelo porque permite aplicar directamente la propiedad de orden (izquierdo < padre < derecho) en cada inserción, lo cual facilita evidenciar los recorridos (Preorden, Inorden, Postorden) y las métricas de altura, profundidad y grado de forma clara. A diferencia de un árbol general, el ABB restringe cada nodo a máximo dos hijos, y a diferencia de un AVL, no se autobalancea, por lo que es el punto de partida más directo para mostrar los conceptos básicos de la unidad.

- **Raíz:** nodo superior sin padre (50 en el ejemplo).
- **Hojas:** nodos sin hijos.
- **Nodos internos:** nodos con al menos un hijo.
- **Padre/hijo/hermano:** relación directa entre un nodo y sus descendientes inmediatos.
- **Ancestro/descendiente:** relación indirecta a través de la ruta desde la raíz.
