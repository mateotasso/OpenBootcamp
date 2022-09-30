public class Main
{
    public static void main(String[] args)
    {

        Cliente cliente = new Cliente();
        cliente.setNombre("Mateo");
        cliente.setEdad(26);
        cliente.setTelefono(34343434334L);
        cliente.setCredito(70000);
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("La edad del cliente es: " + cliente.getEdad());
        System.out.println("El telefono del cliente es: " + cliente.getTelefono());
        System.out.println("El credito del cliente es: " + cliente.getCredito());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends  Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
