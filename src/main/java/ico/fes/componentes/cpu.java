/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Viking
 */
public class cpu {
    
    private String marca;
    private String modelo;
    private int velocidadProcesador;
    private boolean conAMD;
    public cpu() {
        
    }

    
    public cpu(String marca, String modelo, int velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
    }

    public boolean isConAMD() {
        return conAMD;
    }

    public void setConAMD(boolean conAMD) {
        this.conAMD = conAMD;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    @Override
    public String toString() {
        return "cpu{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesador=" + velocidadProcesador + '}';
    }
    
}
