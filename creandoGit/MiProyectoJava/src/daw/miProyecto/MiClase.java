package daw.miProyecto; // Asegúrate de que esta línea esté en la parte superior del archivo

public class MiClase {
    public static void main(String[] args) 
    {
        System.out.println("¡Hola, Mundo!");

        int [] mi_matriz= {5, 34,6,77,76,78,56,77,75};
        for (int i=0; i<mi_matriz.length; i++)
        {
        System.out.println("valor del indice " + i +" es "+  mi_matriz[i] );
        }
    }
}
