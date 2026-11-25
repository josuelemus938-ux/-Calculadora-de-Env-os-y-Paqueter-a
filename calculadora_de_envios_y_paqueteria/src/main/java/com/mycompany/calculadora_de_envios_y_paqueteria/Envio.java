/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_de_envios_y_paqueteria;

/**
 *
 * @author Josue Enoc
 */
public class Envio {
     private double pesoFisico;
    private double largo;
    private double ancho;
    private double alto;
    private double distancia;

    private double pesoVolumetrico;
    private double pesoDefinitivo;
    private double costoPeso;
    private double recargoDistancia;
    private double totalPagar;

    private final double tarifaKg = 25.00;
    private final double tarifaKm = 2.00;

    // Constructor
    public Envio() {
    }

    // Metodos SET
    public void setPesoFisico(double pesoFisico) {
        if (pesoFisico <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero");
        }
        this.pesoFisico = pesoFisico;
    }

    public void setLargo(double largo) {
        if (largo <= 0) {
            throw new IllegalArgumentException("El largo debe ser mayor que cero");
        }
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho debe ser mayor que cero");
        }
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto debe ser mayor que cero");
        }
        this.alto = alto;
    }

    public void setDistancia(double distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("La distancia debe ser mayor que cero");
        }
        this.distancia = distancia;
    }

    // Metodos GET
    public double getPesoFisico() {
        return pesoFisico;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPesoVolumetrico() {
        return pesoVolumetrico;
    }

    public double getPesoDefinitivo() {
        return pesoDefinitivo;
    }

    public double getCostoPeso() {
        return costoPeso;
    }

    public double getRecargoDistancia() {
        return recargoDistancia;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    // Calcular peso volumetrico
    public void calcularPesoVolumetrico() {
        pesoVolumetrico = (largo * ancho * alto) / 5000;
    }

    // Calcular peso definitivo
    public void calcularPesoDefinitivo() {
        pesoDefinitivo = Math.max(pesoFisico, pesoVolumetrico);
    }

    // Calcular costo por peso
    public void calcularCostoPeso() {
        costoPeso = pesoDefinitivo * tarifaKg;
    }

    // Calcular recargo por distancia
    public void calcularRecargoDistancia() {
        recargoDistancia = distancia * tarifaKm;
    }

    // Calcular total a pagar
    public void calcularTotal() {
        totalPagar = costoPeso + recargoDistancia;
    }

    // Ejecutar todos los calculos
    public void calcularEnvio() {
        calcularPesoVolumetrico();
        calcularPesoDefinitivo();
        calcularCostoPeso();
        calcularRecargoDistancia();
        calcularTotal();
    }
}
