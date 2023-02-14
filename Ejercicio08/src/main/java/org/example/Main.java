package org.example;

public class Main {
    public static void main(String[] args) {

        Persona pepe = new Persona();

        pepe.setEdad(20);
        pepe.setNombre("Pepe Rodríguez");
        pepe.setTelefono("661234567");

        Persona maria = new Persona();

        maria.setEdad(40);
        maria.setNombre("María Sánchez");
        maria.setTelefono("123456789");

        System.out.println("Nombre: " + maria.getNombre() + "\n" +
                            "Edad: " + maria.getEdad() + "\n" +
                            "Teléfono: " + maria.getTelefono() + "\n\n" +
                            "Nombre: " + pepe.getNombre() + "\n" +
                            "Edad: " + pepe.getEdad() + "\n" +
                            "Teléfono: " + pepe.getTelefono()
        );
    }
}