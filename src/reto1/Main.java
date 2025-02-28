/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

/**
 *
 * @author vasit
 */
class NaveEspacial {
    private double nivelDeCombustible;
    private double velocidad;
    private String canalDeComunicacion;
    private boolean motorEncendido;
    private boolean estaEnOrbita;

    // Constructor de la nave espacial
    public NaveEspacial() {
        this.nivelDeCombustible = 100.0;
        this.velocidad = 0.0;
        this.canalDeComunicacion = "Alpha";
        this.motorEncendido = false;
        this.estaEnOrbita = false;
    }

    // Responsabilidad de encender el motor
    public void encenderMotor() {
        if (nivelDeCombustible <= 0) {
            System.out.println("No hay suficiente combustible para encender el motor.");
            return;
        }
        motorEncendido = true;
        System.out.println("Motor encendido.");
    }

    // Responsabilidad de apagar el motor
    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor apagado.");
    }

    // Responsabilidad de ajustar la velocidad
    public void ajustarVelocidad(double nuevaVelocidad) {
        if (motorEncendido) {
            velocidad = nuevaVelocidad;
            System.out.println("Velocidad ajustada a " + velocidad + " km/h.");
        } else {
            System.out.println("El motor esta apagado. No puedes ajustar la velocidad.");
        }
    }

    // Responsabilidad de manejar las comunicaciones
    public void enviarMensaje(String mensaje) {
        System.out.println("Comunicando en canal " + canalDeComunicacion + ": " + mensaje);
    }

    // Responsabilidad de gestionar el combustible
    public void reabastecerCombustible(double cantidad) {
        if (nivelDeCombustible + cantidad > 100.0) {
            nivelDeCombustible = 100.0;
        } else {
            nivelDeCombustible += cantidad;
        }
        System.out.println("Nave reabastecida con " + cantidad + " litros de combustible.");
    }

    // Responsabilidad de gestionar la órbita
    public void cambiarOrbita() {
        estaEnOrbita = !estaEnOrbita;
        if (estaEnOrbita) {
            System.out.println("Nave ha entrado en orbita.");
        } else {
            System.out.println("Nave ha salido de orbita.");
        }
    }

    // Gran método que realiza muchas tareas diferentes
    public void realizarMision() {
        encenderMotor();
        ajustarVelocidad(1000);
        enviarMensaje("Nave en camino hacia el planeta.");
        reabastecerCombustible(20);
        cambiarOrbita();
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una nueva nave espacial
        NaveEspacial nave = new NaveEspacial();
        
        // Realizar misión, el código está ordenado y listo para ejecutarse
        nave.realizarMision();  // Ejecuta toda la misión, pero el código aún puede ser mejorado en términos de responsabilidad
    }
}
