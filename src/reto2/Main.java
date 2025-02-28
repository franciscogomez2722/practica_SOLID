/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;


/**
 *
 * @author vasit
 */
// Clase ComunicacionSatellital
class ComunicacionSatellital {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por satelite: " + mensaje);
    }
}

// Clase ComunicacionRadio
class ComunicacionRadio {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por radio: " + mensaje);
    }
}

// Clase ComunicacionInternet
class ComunicacionInternet {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por Internet: " + mensaje);
    }
}

// Interfaz VehiculoRescate (obligando a los vehículos a implementar los métodos)
interface VehiculoRescate {
    void rociarAgua();
    void navegarEnAgua();
    void volar();
}

// Implementación concreta: CamionBomberos
class CamionBomberos implements VehiculoRescate {
    @Override
    public void rociarAgua() {
        System.out.println("Rociando agua para apagar el fuego.");
    }

    @Override
    public void navegarEnAgua() {
        // No tiene esta funcionalidad.
    }

    @Override
    public void volar() {
        // No tiene esta funcionalidad.
    }
}

// Implementación concreta: Lancha
class Lancha implements VehiculoRescate {
    @Override
    public void rociarAgua() {
        // No tiene esta funcionalidad.
    }

    @Override
    public void navegarEnAgua() {
        System.out.println("Navegando en el agua.");
    }

    @Override
    public void volar() {
        // No tiene esta funcionalidad.
    }
}

// Implementación concreta: Helicoptero
class Helicoptero implements VehiculoRescate {
    @Override
    public void rociarAgua() {
        // No tiene esta funcionalidad.
    }

    @Override
    public void navegarEnAgua() {
        // No tiene esta funcionalidad.
    }

    @Override
    public void volar() {
        System.out.println("Volando para rescatar personas.");
    }
}

// Clase VehiculoRescateOperacion sin principios de SOLID
class VehiculoRescateOperacion {
    private VehiculoRescate vehiculoRescate2;
    private VehiculoRescate vehiculoRescate;
    private ComunicacionSatellital comunicacionSatellital;
    private ComunicacionRadio comunicacionRadio;
    private ComunicacionInternet comunicacionInternet;

    public VehiculoRescateOperacion() {
        this.vehiculoRescate = new Helicoptero();  // Dependencia directa
        this.vehiculoRescate2 = new CamionBomberos();  // Dependencia directa
        this.comunicacionSatellital = new ComunicacionSatellital();  // Dependencia directa
        this.comunicacionRadio = new ComunicacionRadio();  // Dependencia directa
        this.comunicacionInternet = new ComunicacionInternet();  // Dependencia directa
    }

    public void realizarMision() {
        vehiculoRescate.rociarAgua();  // Invoca método específico
        vehiculoRescate.navegarEnAgua();  // Invoca método específico
        vehiculoRescate.volar();  // Invoca método específico
        
        vehiculoRescate2.rociarAgua();  // Invoca método específico
        vehiculoRescate2.navegarEnAgua();  // Invoca método específico
        vehiculoRescate2.volar();  // Invoca método específico

        comunicacionSatellital.enviarMensaje("Mision iniciada via Satelite");
        comunicacionRadio.enviarMensaje("Mision iniciada via Radio");
        comunicacionInternet.enviarMensaje("Mision iniciada via Internet");
    }
}

// Clase Principal (código mal hecho)
public class Main {
    public static void main(String[] args) {
        VehiculoRescateOperacion operacion = new VehiculoRescateOperacion();
        operacion.realizarMision();
    }
}
