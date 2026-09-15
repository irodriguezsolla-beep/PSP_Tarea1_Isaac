package org.example;
import java.lang.Runtime;
public class InformeSistema {
    static void main(){
        Runtime runtine = Runtime.getRuntime();

        int procesadores = runtine.availableProcessors();
        System.out.println("PROCESADORES");
        System.out.println("=".repeat(50));
        System.out.println( "Disponibles JVM: "+ procesadores);
    }
}
