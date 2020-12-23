package learning.oop;

public class Cliente extends  Persona{
    private String nombre_empresa;
    private int telefono_de_contacto;

    public void mostrar() {
        System.out.println("Nombre: " + nombre_empresa + "Telefono: " + telefono_de_contacto);
    }
}
