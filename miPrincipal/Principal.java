package miPrincipal;
import pila.Pila;
import java.util.Stack;


public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
       // System.out.println(new Principal().getGreeting()); 
       //Crear una nueva pilla de Enteros
       Pila<Integer> pila1 = new Pila<Integer>();
       //apilar datos Enteros
       pila1.apilar(2);
       pila1.apilar(5);
       pila1.apilar(7);
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar();//7
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar();//5
       System.out.println("El tope de la pila  es "+pila1.cima());
       //se desapila
       pila1.retirar(); //2
       System.out.println("El tope de la pila  es "+pila1.cima());
       System.out.println("Pila Vacia? "+pila1.esVacia());

       pila1.apilar(8);
       pila1.apilar(10);
       pila1.apilar(20);

       if (pila1.buscar(8) != -1)
          System.out.println("el elemento buscado esta en la posición "+pila1.buscar(8));
       else
          System.out.println("elemento no encontrado");

       if (pila1.buscar(80) != -1)
          System.out.println("el elemento buscado esta en la posición "+pila1.buscar(80));
       else
          System.out.println("elemento no encontrado");



      
       try{
            //  USO DE LA CLASE STACK
            //crear una pila de Enteros
            Stack<Integer> pila = new Stack<Integer>();
            //apilar elementos
            pila.push(2);
            pila.push(5);
            pila.push(7);
            System.out.println("El tope de la pila;"+pila.peek());
            //desapilamos elementos
            pila.pop();
            System.out.println("El tope de la pila;"+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila;"+pila.peek());

            pila.pop();
            //System.out.println("El tope de la pila;"+pila.peek()); //pendiente tratar la excepcion
            pila.push(10);
            pila.push(8);
            pila.push(20);
            System.out.println("El elemento 8 se encuentra en la poscion: "+pila.search(8));
            System.out.println("El elemento 10 se encuentra en la poscion: "+pila.search(10));
            System.out.println("El elemento 20 se encuentra en la poscion: "+pila.search(20));
            if ((pila.search(100)) == -1)
               System.out.println("Elemento no encontrado");
            else
                System.out.println("El elemento 100 se encuentra en la posicion: "+pila.search(100));
           
       } catch (Exception e) {
            System.out.println(e.getMessage());
       }
       






    }
}