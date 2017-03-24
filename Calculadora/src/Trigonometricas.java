/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class Trigonometricas {
  
     int menuPrincipal(){
        
        System.out.println("Seleccione una opción:" );
        System.out.println("1. seno");
        System.out.println("2. coseno");
        System.out.println("3. Tangente");
        System.out.println("4. secante");
        System.out.println("5. cosecante");
        System.out.println("6. cotangente");
        int opcion;
        do{
            System.out.println("Por favor ingrese una opción:");
            opcion=calculadora.nextInt();
            
        }while(opcion<1 || opcion >6);
        
        return opcion;
}
    
    double a;
    double respuesta;
    
    double Seno () {
    respuesta = Math.sin (a);
    return respuesta;
     }
    double coseno () {
    respuesta = Math.cos (a);
    return respuesta;
     }
    double Tangente () {
    respuesta = Math.tan (a);
    return respuesta;
     }
    double Secante () {
    respuesta = 1/Math.sin (a);
    return respuesta;
     }
    double Cosecante () {
    respuesta = 1/Math.cos (a);
    return respuesta;
     }
    double Cotangente () {
    respuesta = 1/Math.tan (a);
    return respuesta;
     }
 
    




}
