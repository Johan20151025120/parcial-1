/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */
public class Calculadora {
    
  float Valor1;
  float Valor2;
  float resultado;
  
  void imprimir(float resultado){
        
        System.out.println("El resultado es:"+resultado);
     }
  
    
   public float getValor1() {
        return Valor1;
    }

    public void setValor1(float Valor1) {
        this.Valor1 = Valor1;
    }

    public float getValor2() {
        return Valor2;
    }

    public void setValor2(float Valor2) {
        this.Valor2 = Valor2;
}
  float suma () {
      resultado = Valor1 + Valor2;
      return resultado;        
  }
  
  float resta () {
      resultado = Valor1 - Valor2;
      return resultado;        
  }
  
  float multiplicacion () {
      resultado = Valor1 * Valor2;
      return resultado;        
  }
  
  float division () {
      resultado = Valor1 / Valor2;
      return resultado;        
  }
  
}
