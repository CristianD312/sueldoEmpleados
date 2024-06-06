
package sueldoempleado;


public class EmpleadoTParcial extends Empleado {
    
    public EmpleadoTParcial(String nombre, double salarioAnual) {
        super(nombre, salarioAnual);
    }
   
    @Override
    public double calcularBonificacion() {
        double total=(salarioAnual * 0.15);
        return total;
}
    
}
