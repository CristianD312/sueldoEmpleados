
package sueldoempleado;


public class Empleado {
    
    protected String nombre;
    protected double salarioAnual;

    // Constructor
    public Empleado(String nombre, double salarioAnual) {
        this.nombre = nombre;
        this.salarioAnual = salarioAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    
    

    // Método para calcular bonificación
    public double calcularBonificacion() {
        double total=(salarioAnual * 0.10);
        return total;
    }

    // Método para mostrar el estado del empleado
    public void mostrarEstado() {
        System.out.println("Empleado: " + nombre + ", Salario Anual: $" + salarioAnual + ", Bonificación: $" + calcularBonificacion());
    }
    
}
