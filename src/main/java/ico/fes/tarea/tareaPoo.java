/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.tarea;
import ico.fes.composicionpc;
import ico.fes.componentes.cpu;
import ico.fes.componentes.monitor;
import ico.fes.componentes.mouse;
import ico.fes.componentes.teclado;

/**
 *
 * @author Viking
 */

public class tareaPoo {
    
     public static void main(String[] args) {
         
       composicionpc c1 = new composicionpc();
       composicionpc c2 = new composicionpc();
     
       
       cpu pro1 = new cpu("AMD","5600X", (int) 3.7f);
       cpu pro2 = new cpu ("Intel","I5", (int) 3.4f);
       
       monitor mon1 = new monitor("Yeyian","Sigurd",23);
       monitor mon2 = new monitor("Samsung","Series SR35",24);

       mouse mou1 = new mouse("Logitech","502","HERO");
       mouse mou2 = new mouse ("Razer","Viper","Mini");
  
       teclado tec1 = new teclado();
       
       c1.setCpu(pro1);
       c1.setMonitor(mon1);
       c1.setMouse(mou1);
       c1.setTeclado(tec1);
       
       c2.setCpu(pro2);
       c2.setMonitor(mon2);
       c2.setMouse(mou2);
       c2.setTeclado(tec1);
       
     
       
       
       System.out.println(c1);
       System.out.println(c2);
 
       
        /**
        cpu c =new cpu("AMD","5600X", (int) 3.7f);
        monitor m= new monitor("Yeyian","fORCE",43);
        mouse mo= new mouse("Logitech","5000g","Gamer");
        teclado tec = new teclado();
  
        System.out.println("computadora 1"+c+m+mo+tec);
        */
     }
}
