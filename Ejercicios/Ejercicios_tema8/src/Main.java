public class Main
{
    public static void main(String[] args)
    {
        Persona persona = new Persona();

        persona.setNombre("Mateo Nazareno Tasso");
        persona.setEdad(26);
        persona.setTelefono(464664646);

        System.out.println("El nombre de la persona es " + persona.getNombre() + " y tiene " + persona.getEdad() + " años. Su teléfono es: " + persona.getTelefono() + ".");

    }
}

class Persona {

    private String nombre;
    private  int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}