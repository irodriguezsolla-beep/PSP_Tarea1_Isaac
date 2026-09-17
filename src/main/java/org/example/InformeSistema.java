package org.example;
import java.lang.Runtime;
public class InformeSistema {
    static void main(){
        Runtime runtine = Runtime.getRuntime();

        long mib = 1024 * 1024;
        int procesadores = runtine.availableProcessors();
        long reservadaAnterior = runtine.totalMemory()/mib;
        long libreAnterior = runtine.freeMemory()/mib;
        long maxAnterior = runtine.maxMemory()/mib;
        long usoAnterior = (runtine.totalMemory() - runtine.freeMemory()) / mib;
        long[] reservado = new long[8 * 1024 * 1024];

        System.out.println("PROCESADORES");
        System.out.println("=".repeat(50));
        System.out.println( "\tDisponibles JVM: "+ procesadores);
        System.out.println(" ");
        System.out.println("MEMORIA · ANTES");
        System.out.println("=".repeat(50));
        System.out.println( "\tTotal reservada: "+ reservadaAnterior +" MiB");
        System.out.println( "\tLibre:           "+ libreAnterior +" MiB");
        System.out.println( "\tEn uso:          "+ usoAnterior +" MiB");
        System.out.println( "\tMáxima ( -Xmx):  "+ maxAnterior +" MiB");
        System.out.println("MEMORIA · DESPUÉS DE RESERVAR 64 MIB");
        System.out.println("=".repeat(50));
        System.out.println( "\tTotal reservada: "+ reservadaAnterior +" MiB");
        System.out.println( "\tLibre:           "+ libreAnterior +" MiB");
        System.out.println( "\tEn uso:          "+ usoAnterior +" MiB");
        System.out.println( "\tMáxima ( -Xmx):  "+ maxAnterior +" MiB");


    }
}
