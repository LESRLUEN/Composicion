/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.composicionpc;
/**
 *
 * @author Viking
 */
import ico.fes.componentes.cpu;
import ico.fes.componentes.monitor;
import ico.fes.componentes.mouse;
import ico.fes.componentes.teclado;

public class composicionPc {
    
 private String marca;
    private String modelo;
    private cpu cpu;
    private monitor monitor;
    private mouse mouse;
    private teclado teclado;

    public composicionPc() {
    }

    public composicionPc(String marca, String modelo, cpu cpu, monitor monitor, mouse mouse, teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
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

    public cpu getCpu() {
        return cpu;
    }

    public void setCpu(cpu cpu) {
        this.cpu = cpu;
    }

    public monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(monitor monitor) {
        this.monitor = monitor;
    }

    public mouse getMouse() {
        return mouse;
    }

    public void setMouse(mouse mouse) {
        this.mouse = mouse;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "composicionPc{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
  
    
    
}
    

