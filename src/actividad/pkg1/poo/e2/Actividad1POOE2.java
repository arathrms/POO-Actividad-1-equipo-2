/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg1.poo.e2;
import  java.util.Scanner;
/**
 *
 * @author earat
 */
public class Actividad1POOE2 {
    static class Carro {
        String marca;
        String color;
        String modelo;

        public Carro(String marca, String color, String modelo) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
        }

        public void arrancar() {
            System.out.println("El carro " + marca +" " + color + " " + modelo +" esta arrancando.");
        }

        public void atropellar() {
            System.out.println("El carro " + marca +" " + color + " " + modelo +" ha atropellado algo.");
        }

        public void frenar() {
            System.out.println("El carro  " + marca +" " + color + " " + modelo +" esta frenando.");
        }
    }

    static class Conductor {
        String nombre ;
        int edad ;
        String licencia ;

        public Conductor(String nombre, int edad, String licencia) {
            this.nombre = nombre;
            this.edad = edad;
            this.licencia = licencia;
        }

        public void conducir() {
            System.out.println("El conductor "+ nombre + "esta conduciendo el carro.");
        }

        public void encenderCarro() {
            System.out.println("El conductor " + nombre + " esta encendiendo el carro.");
        }

        public void hablar() {
            System.out.println("El conductor "+ nombre + " esta hablando.");
        }
    } 

    static class Llanta {
        String material;
        String tamanio;
        String marca;

        public Llanta(String material, String tamanio, String marca) {
            this.material = material;
            this.tamanio = tamanio;
            this.marca = marca;
        }

        public void rodar() {
            System.out.println("La llanta " + marca + " estan rodando.");
        }

        public void desinflar() {
            System.out.println("La llanta " + marca + " se han desinflado.");
        }

        public void inflar() {
            System.out.println("La llanta " + marca + " se están inflado.");
        }
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CREAR CARRO");
        System.out.print("Marca: ");
        String marcaCarro = entrada.nextLine();
        
        System.out.print("Color: ");
        String colorCarro = entrada.nextLine();
        
        System.out.println("Modelo: ");
        String modeloCarro = entrada.nextLine();
        
        Carro carro = new Carro(marcaCarro, colorCarro, modeloCarro);
        
        System.out.println("CREAR CONDUCTOR");
        System.out.println("Nombre: ");
        String nombreConductor = entrada.nextLine();
        
        System.out.println("Edad: ");
        int edadConductor = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Licencia: ");
        String licencia = entrada.nextLine();
        
        Conductor conductor = new Conductor(nombreConductor, edadConductor, licencia);
        
        System.out.println("CREAR LLANTAS");
        System.out.print("Material: ");
        String materialLlanta = entrada.nextLine();
        
        System.out.print("Tamanio: ");
        String tamanioLlanta = entrada.nextLine();
        
        System.out.print("Marca: ");
        String marcaLlanta = entrada.nextLine();
        
        Llanta llanta = new Llanta(materialLlanta,tamanioLlanta, marcaLlanta );
                
        
        conductor.encenderCarro();
        carro.atropellar();
        llanta.rodar();
        conductor.hablar();
        carro.frenar();
        
        entrada.close();
        
      
    }
}
  
