package learning.oop;

public class Empleado extends Persona {
    private int sueldo_bruto;

    public void mostrar() {
        System.out.println("Sueldo: " + sueldo_bruto);
    }

    public int mostrar_salario_neto() {
        return sueldo_bruto*12;
    }
}
