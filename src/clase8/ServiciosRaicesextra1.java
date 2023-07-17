
package clase8;

import java.util.Scanner;

public class ServiciosRaicesextra1 {
     Scanner leer = new Scanner(System.in);
    
     public Raicesextra1 crear(){
        System.out.println("ingrese el valor de a");
        double a = leer.nextDouble();
        System.out.println("ingrese el valor de b");
        double b = leer.nextDouble();
        System.out.println("ingrese el valor de c");
        double c = leer.nextDouble();
        
        return new Raicesextra1(a, b, c);
     }
    
    public double getDiscriminante(Raicesextra1 x){
        double rdo = (x.getB()*x.getB())-4*x.getA()*x.getC();
        return rdo ;
    }
    
    public boolean tieneRaices(Raicesextra1 x){
        return (getDiscriminante(x)>0);
          
    }
     public boolean tieneRaiz(Raicesextra1 x){
        return (getDiscriminante(x)==0);
         
    }
     
     public void obtenerRaices(Raicesextra1 x){
         if(tieneRaices(x)== true){
            double r1 = (-x.getB()+Math.sqrt(x.getB()*x.getB()-4*x.getA()*x.getC()))/2*x.getA();
            double r2 =(-x.getB()-Math.sqrt(x.getB()*x.getB()-4*x.getA()*x.getC()))/2*x.getA();
            
             System.out.println("tu primera raiz es :"+ r1);
                    
             System.out.println("tu segunda raiz es :"+ r2);
            
         }
     }
        public void obtenerRaiz(Raicesextra1 x){
         if(tieneRaiz(x)== true){
            double r1 = (-x.getB()+Math.sqrt(x.getB()*x.getB()-4*x.getA()*x.getC()))/2*x.getA();
             System.out.println("tu primera raiz es :"+ r1);
        }
     }
      
          public void calcular(Raicesextra1 x){
            if(tieneRaices(x)){
                obtenerRaices(x);
            }else if(tieneRaiz(x)) {
                obtenerRaiz(x);
            }else{
                System.out.println("incorrecto");
            }
            
        }
}
