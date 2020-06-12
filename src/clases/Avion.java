package clases;

import java.io.Serializable;
import java.util.Objects;

public class Avion implements Activable, Serializable {

    private static final long serialVersionUID = 1L;
    // Atributos
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;
    private boolean activado;

    
    public Avion() {
        this("", 0, 0);
    }

    
    public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.activado = false;
    }

    
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public int getnAsientos() {
        return nAsientos;
    }

   
    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public boolean isActivado() {
        return activado;
    }

    
    public void setActivado(boolean value) {
        this.activado = value;
    }
    
    
public boolean equals(Object obj) { //LO CREAMOS PARA QUE NO AGREGUE EL MISMO AVION EN EL AEROPUERTO
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    
    
    public String toString() {
        return "Avion{" + "Modelo=" + modelo + ", Asientos=" + nAsientos + ", Velocidad Maxima=" + velocidadMaxima + '}';
    }

}

