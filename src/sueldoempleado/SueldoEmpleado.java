
package sueldoempleado;


public class SueldoEmpleado {

  
    public static void main(String[] args) {
 
    EmpleadoTCompleto empleado1 = new EmpleadoTCompleto("Juan", 50000);

    EmpleadoTParcial empleado2 = new EmpleadoTParcial("María", 20000);
        
 

        empleado1.mostrarEstado();
        empleado2.mostrarEstado();    
        
        
    }
    
}
