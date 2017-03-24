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
  
    import static java.lang.Math.sin;
    import static java.lang.Math.cos;
    import static java.lang.Math.tan;
    
    java.lang.Math.sin(double a);
    
    
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
