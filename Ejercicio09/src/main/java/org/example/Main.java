package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Pepe");
        cliente1.setEdad(20);
        cliente1.setTelefono("123456789");
        cliente1.setCredito(2000);

        System.out.println("Cliente: " + cliente1.getNombre() + "\n"
                            + "Edad: " + cliente1.getEdad() + "\n"
                            + "Teléfono: " + cliente1.getTelefono() + "\n"
                            + "Crédito: " + cliente1.getCredito() + "\n");

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Juanito");
        trabajador1.setEdad(35);
        trabajador1.setTelefono("987654321");
        trabajador1.setSalario(1200);

        System.out.println("Trabajador: " + trabajador1.getNombre() + "\n"
                + "Edad: " + trabajador1.getEdad() + "\n"
                + "Teléfono: " + trabajador1.getTelefono() + "\n"
                + "Salario: " + trabajador1.getSalario() + "\n");
    }
}

class Persona{
    private int edad;
    private String nombre, telefono;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Cliente extends Persona{
    private float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
