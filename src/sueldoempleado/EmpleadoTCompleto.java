
package sueldoempleado;


public class EmpleadoTCompleto extends Empleado{
    
private String horario;

    public EmpleadoTCompleto(String horario, String nombre, double salarioAnual) {
        super(nombre, salarioAnual);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    


    
    @Override
    public double calcularBonificacion() {
        double total=(salarioAnual * 0.30);
        return total;
    }
    
    @Override
    public void mostrarEstado() {
        System.out.println("Empleado Completo: " + nombre + ", Salario Anual: $" + salarioAnual + ", Bonificación: $" + calcularBonificacion());
    }
    }
    

    

