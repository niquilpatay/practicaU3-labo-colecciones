package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args)
    {
        //Arreglos---------------------------------------------------
        //Arreglos unidimensionales---------------------------------------------------
        System.out.println("-----ARREGLOS-----");

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int[] numeros2 = {10, 20, 30, 40, 50};

        //Arreglos multidimensionales---------------------------------------------------
        //3 filas, 4 columnas
        int[][] mi_arreglo = new int[3][4];
        //Elemento ubicado en fila 1 columna 2
        int elemento = mi_arreglo[1][2];

        //Arreglos tridimensionales
        //2 capas, 3 filas, 4 columnas
        int[][][] mi_arreglo2 = new int[2][3][4];
        //Elemento ubicado en capa 0, fila 1, columna 2
        int elemento2 = mi_arreglo2[0][1][2];

        //Listas---------------------------------------------------
        System.out.println("-----LISTAS-----");
        //Crear una lista de tipo String llamada miLista usando la clase ArrayList
        ArrayList<String> miLista = new ArrayList<>();

        //Agregar elementos a la lista usando el método .add
        miLista.add("elemento1");
        miLista.add("elemento2");
        miLista.add("elemento3");

        //Obtener elementos de la lista usando el método .get
        System.out.println(miLista.get(0)); // Output: elemento1

        //Eliminar elementos de la lista usando el método .remove()
        miLista.remove(1); // Elimina el elemento en el índice 1 (elemento2)

        //Mapas---------------------------------------------------
        System.out.println("-----MAPAS-----");
        //HashMap---------------------------------------------------
        System.out.println("-----HashMap-----");
        //Crear un objeto HashMap que mapea nombres de países a sus códigos ISO
        HashMap<String, String> codigosPaises = new HashMap<>();

        //Agregar elementos al HashMap usando el método put
        codigosPaises.put("Estados Unidos", "USA");
        codigosPaises.put("Canadá", "CAN");
        codigosPaises.put("México", "MEX");
        codigosPaises.put("Brasil", "BRA");
        codigosPaises.put("Argentina", "ARG");

        //Imprimir el HashMap completo
        System.out.println("HashMap completo: " + codigosPaises);

        //Obtener el valor asociado a una clave usando el método get
        String codigoMexico = codigosPaises.get("México");
        System.out.println("Código ISO de México: " + codigoMexico);

        //Verificar si una clave está presente en el HashMap usando el método containsKey
        boolean contieneArgentina = codigosPaises.containsKey("Argentina");
        System.out.println("El HashMap contiene Argentina? " + contieneArgentina);

        //Eliminar un elemento del HashMap usando el método remove
        codigosPaises.remove("Brasil");
        System.out.println("HashMap después de eliminar Brasil: " + codigosPaises);

        //Iterar sobre los elementos del HashMap usando un bucle for-each
        System.out.println("Iterando sobre los elementos del HashMap:");
        for (String pais : codigosPaises.keySet())
        {
            String codigo = codigosPaises.get(pais);
            System.out.println(pais + ": " + codigo);
        }

        //TreeMap---------------------------------------------------
        System.out.println("-----TreeMap-----");
        //<Clave, Valor>
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        //Insertar elementos en el TreeMap
        treeMap.put("Juan", 25);
        treeMap.put("Ana", 30);
        treeMap.put("Pedro", 20);
        treeMap.put("Sofia", 28);

        //Obtener el tamaño del TreeMap
        int size = treeMap.size();
        System.out.println("Tamaño del TreeMap: " + size);

        //Obtener un valor asociado a una llave
        int edadAna = treeMap.get("Ana");
        System.out.println("Edad de Ana: " + edadAna);

        //Verificar si una llave existe en el TreeMap
        boolean existeJuan = treeMap.containsKey("Juan");
        System.out.println("¿Existe Juan? " + existeJuan);

        //Remover un elemento del TreeMap
        treeMap.remove("Pedro");
        System.out.println("TreeMap después de remover a Pedro: " + treeMap);

        //Obtener el primer elemento del TreeMap
        String primerNombre = treeMap.firstKey();
        System.out.println("Primer nombre en el TreeMap: " + primerNombre);

        //Obtener el último elemento del TreeMap
        String ultimoNombre = treeMap.lastKey();
        System.out.println("Último nombre en el TreeMap: " + ultimoNombre);

        //LinkedHashMap---------------------------------------------------
        System.out.println("-----LinkedHashMap-----");
        // Crear un objeto LinkedHashMap
        //<Clave, Valor>
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        //Agregar elementos al mapa
        map.put(1, "uno");
        map.put(2, "dos");
        map.put(3, "tres");

        //Obtener un elemento del mapa
        String value = map.get(2);
        System.out.println("El valor de la clave 2 es: " + value);

        //Remover un elemento del mapa
        map.remove(1);
        System.out.println("El tamaño del mapa es: " + map.size());

        //Iterar sobre los elementos del mapa
        for (Integer key : map.keySet()) {
            System.out.println("Clave: " + key + ", Valor: " + map.get(key));
        }

        // Limpiar el mapa
        map.clear();
        System.out.println("El mapa está vacío: " + map.isEmpty());

        //ConcurrentHashMap---------------------------------------------------
        System.out.println("-----ConcurrentHashMap-----");
        //<Valor, Clave>
        ConcurrentHashMap<String, Integer> map2 = new ConcurrentHashMap<>();

        //Agregar elementos al mapa
        map2.put("Juan", 25);
        map2.put("María", 30);
        map2.put("Pedro", 40);

        //Obtener el valor asociado a una clave
        Integer edadMaria = map2.get("María");
        System.out.println("La edad de María es: " + edadMaria);

        //Remover un elemento del mapa
        map2.remove("Pedro");

        //Verificar si el mapa contiene una clave
        if (map2.containsKey("Juan")) {
            System.out.println("El mapa contiene la clave 'Juan'");
        }

        //Obtener una vista del mapa como conjunto de pares (clave, valor)
        Set<Map.Entry<String, Integer>> entrySet = map2.entrySet();

        //Iterar sobre las entradas del mapa y mostrar cada clave y valor
        for (Map.Entry<String, Integer> entry : entrySet) {
            String nombre = entry.getKey();
            Integer edad = entry.getValue();
            System.out.println(nombre + " tiene " + edad + " años.");
        }

        //Conjuntos---------------------------------------------------
        System.out.println("-----CONJUNTOS-----");
        //HashSet---------------------------------------------------
        System.out.println("-----HashSet-----");
        //Crear un nuevo HashSet
        HashSet<String> set = new HashSet<String>();

        // Agregar elementos al HashSet
        set.add("uno");
        set.add("dos");
        set.add("tres");

        //Obtener el tamaño del HashSet
        int size2 = set.size();
        System.out.println("Tamaño del HashSet: " + size);

        //Verificar si un elemento existe en el HashSet
        boolean contieneUno = set.contains("uno");
        System.out.println("¿El HashSet contiene el elemento 'uno'? " + contieneUno);

        //Eliminar un elemento del HashSet
        set.remove("tres");

        //Iterar sobre los elementos del HashSet
        System.out.println("Elementos del HashSet:");
        for (String elemento3 : set) {
            System.out.println(elemento3);
        }

        //Vaciar el HashSet
        set.clear();

        //Verificar si el HashSet está vacío
        boolean estaVacio = set.isEmpty();
        System.out.println("¿El HashSet está vacío? " + estaVacio);

        //TreeSet---------------------------------------------------
        System.out.println("-----TreeSet-----");
        //Crear un objeto TreeSet
        TreeSet<Integer> numeros3 = new TreeSet<>();

        //Agregar elementos al TreeSet
        numeros3.add(5);
        numeros3.add(10);
        numeros3.add(1);
        numeros3.add(8);
        numeros3.add(3);

        //Mostrar el contenido del TreeSet
        System.out.println("Contenido del TreeSet: " + numeros3);

        //Obtener el primer elemento del TreeSet
        System.out.println("Primer elemento: " + numeros3.first());

        //Obtener el último elemento del TreeSet
        System.out.println("Último elemento: " + numeros3.last());

        //Eliminar un elemento del TreeSet
        numeros3.remove(8);
        System.out.println("Contenido del TreeSet después de eliminar 8: " + numeros3);

        //Obtener un subconjunto del TreeSet
        System.out.println("Subconjunto de 1 a 5: " + numeros3.subSet(1, 5));

        //LinkedHashSet---------------------------------------------------
        System.out.println("-----LinkedHashSet-----");
        //Crear un LinkedHashSet de tipo String
        LinkedHashSet<String> set3 = new LinkedHashSet<>();

        //Agregar elementos al set
        set3.add("apple");
        set3.add("banana");
        set3.add("orange");
        set3.add("grape");
        set3.add("pear");

        //Mostrar los elementos del set
        System.out.println("Elementos del set: " + set3);

        //Obtener el tamaño del set
        System.out.println("Tamaño del set: " + set3.size());

        // Remover un elemento del set
        set3.remove("grape");

        //Mostrar los elementos del set después de remover "grape"
        System.out.println("Elementos del set después de remover 'grape': " + set3);

        //Verificar si un elemento existe en el set
        System.out.println("¿'banana' existe en el set? " + set3.contains("banana"));

        //Vaciar el set
        set3.clear();

        //Mostrar los elementos del set después de vaciarlo
        System.out.println("Elementos del set después de vaciarlo: " + set3);

    }
}