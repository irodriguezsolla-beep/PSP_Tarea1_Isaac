package org.example;

public class InformeSistema {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long mib = 1024 * 1024;
        int procesadores = runtime.availableProcessors();

        // --- MEDIR ANTES ---
        long reservadaAnterior = runtime.totalMemory() / mib;
        long libreAnterior = runtime.freeMemory() / mib;
        long maxAnterior = runtime.maxMemory() / mib;
        long usoAnterior = (runtime.totalMemory() - runtime.freeMemory()) / mib;

        // Reserva de 64 MiB (8M posiciones * 8 bytes cada long)
        long[] reservado = new long[8 * 1024 * 1024];

        // MEDIR DESPUÉS
        long reservada = runtime.totalMemory() / mib;
        long libre = runtime.freeMemory() / mib;
        long max = runtime.maxMemory() / mib;
        long uso = (runtime.totalMemory() - runtime.freeMemory()) / mib;

        System.out.println("PROCESADORES");
        System.out.println("=".repeat(50));
        System.out.println("\tDisponibles JVM: " + procesadores);
        System.out.println(" ");

        System.out.println("MEMORIA · ANTES");
        System.out.println("=".repeat(50));
        System.out.println("\tTotal reservada: " + reservadaAnterior + " MiB");
        System.out.println("\tLibre:           " + libreAnterior + " MiB");
        System.out.println("\tEn uso:          " + usoAnterior + " MiB");
        System.out.println("\tMáxima (-Xmx):   " + maxAnterior + " MiB");
        System.out.println(" ");

        System.out.println("MEMORIA · DESPUÉS DE RESERVAR 64 MiB");
        System.out.println("=".repeat(50));
        System.out.println("\tTotal reservada: " + reservada + " MiB");  // Corregido
        System.out.println("\tLibre:           " + libre + " MiB");      // Corregido
        System.out.println("\tEn uso:          " + uso + " MiB");        // Corregido
        System.out.println("\tMáxima (-Xmx):   " + max + " MiB");        // Corregido

        // Uso trivial para asegurar que la JVM no optimice la referencia
        if (reservado.length > 0) {
            reservado[0] = 1L;
        }

        //SISTEMA


        System.out.println("SISTEMA");
        System.out.println("=".repeat(50));
    }
}

