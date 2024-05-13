package miPrincipal;
import arbolBinarioOrdenado.ArbolBinario;
import arbolBinarioOrdenado.Entero;
import java.util.Scanner;
public class AppArbolBinarioBusqueda{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                   insertarNodos();
                   break;
                    
                case 2:
                   buscarNodos();
                   break;
                case 3:
                   eliminarNodos();
                   break;
                case 0:
                   System.out.println("Hasta luego");
                   break;
    
                default:
                    System.out.println("Opción inválida");
            }
            } while (opc != 0);
       
    }
      
    public static void insertarNodos(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try {
            arbol.insertar(new  Entero(10));
            arbol.insertar(new  Entero(20));
            arbol.insertar(new  Entero(5));
            System.out.println();
            arbol.inorden();
            System.out.println();
            arbol.preorden();
            System.out.println();
            arbol.preorden();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");

    }
    public static void buscarNodos(){
        System.out.println("**** BUSCAR NODOS ****");

    }
}