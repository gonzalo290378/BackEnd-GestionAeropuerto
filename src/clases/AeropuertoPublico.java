package clases;

import java.io.Serializable;


public class AeropuertoPublico extends Aeropuerto implements Serializable {

    private double financiacion;
    private int numTrabajadoresDiscapacitados;

    
    public AeropuertoPublico() {
        super();
    }

    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        super(nombre, direccion, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    
    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    
    public double getFinanciacion() {
        return financiacion;
    }

    
    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    
    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }

    
    public void setNumTrabajadoresDiscapacitados(int numTrabajadoresDiscapacitados) {
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

   
    
    public String gananciasTotales(double cantidad) {

        double ganacia = cantidad + financiacion + (numTrabajadoresDiscapacitados * 100);

        return "La cantidad ganada por cada socio es de " + ganacia;

    }

    
    public String toString() {
        return super.toString() + "El aeropuerto es publico y su financiacion por parte del estado es de " + financiacion + " y hay " + numTrabajadoresDiscapacitados + " trabajadores discapacitados";
    }

}

