package Hilos_Cetreria;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Avance_thread extends Thread {
    
    Random aleatorio = new Random(); //System.currentTimeMillis() 
    String nombre;
    JLabel L;
    
    public Avance_thread() {}    
    
    public Avance_thread(String nombre, JLabel L) { // Constructor de la clase Avance_thread
        this.nombre = nombre;
        this.L = L;
    }    
    
    @Override
    public void run() {         
        int coordenada_y = L.getY();
        int coordenada_x = L.getX();
        
        // Movimiento horizontal hacia el vértice inferior derecho (primer checkpoint)
        while (coordenada_x < 1020) { 
            int valor_x = aleatorio.nextInt(20); // Valores entre 0 y 9
            
            coordenada_x = L.getX();
            coordenada_y = L.getY();
            
            L.setLocation(coordenada_x + valor_x, coordenada_y);
            
            System.out.println(nombre + ": x=" + (coordenada_x + valor_x) + ", y=" + coordenada_y);
            
            try {
                Thread.sleep(50); // Duerme el hilo por 100 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Movimiento vertical hacia el segundo checkpoint
        while (coordenada_y >= 70) { 
            int valor_y = aleatorio.nextInt(20); // Valores entre 0 y 9
            
            coordenada_x = L.getX();
            coordenada_y = L.getY();
            
            L.setLocation(coordenada_x, coordenada_y - valor_y);
            
            System.out.println(nombre + ": x=" + coordenada_x + ", y=" + (coordenada_y - valor_y));
            
            try {
                Thread.sleep(50); // Duerme el hilo por 100 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Movimiento horizontal hacia el tercer checkpoint (vértice superior izquierdo)
        while (coordenada_x > 100) { 
            int valor_x = aleatorio.nextInt(20); // Valores entre 0 y 9
            
            coordenada_x = L.getX();
            coordenada_y = L.getY();
            
            L.setLocation(coordenada_x - valor_x, coordenada_y);
            
            System.out.println(nombre + ": x=" + (coordenada_x - valor_x) + ", y=" + coordenada_y);
            
            try {
                Thread.sleep(50); // Duerme el hilo por 100 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Movimiento vertical hacia el cuarto checkpoint (vértice inferior derecho)
        while (coordenada_y < 530) { 
            int valor_y = aleatorio.nextInt(20); // Valores entre 0 y 9
            
            coordenada_x = L.getX();
            coordenada_y = L.getY();
            
            L.setLocation(coordenada_x, coordenada_y + valor_y);
            
            System.out.println(nombre + ": x=" + coordenada_x + ", y=" + (coordenada_y + valor_y));
            
            try {
                Thread.sleep(50); // Duerme el hilo por 100 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Movimiento horizontal hacia la línea de salida
        while (coordenada_x < 590) { 
            int valor_x = aleatorio.nextInt(20); // Valores entre 0 y 9
            
            coordenada_x = L.getX();
            coordenada_y = L.getY();
            
            L.setLocation(coordenada_x + valor_x, coordenada_y);
            
            System.out.println(nombre + ": x=" + (coordenada_x + valor_x) + ", y=" + coordenada_y);
            
            try {
                Thread.sleep(50); // Duerme el hilo por 100 milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
