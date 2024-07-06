package org.example;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        final var random = UUID.randomUUID();
        do {
            System.out.println( random );
            Thread.sleep(5000);
        } while (true);

    }
}
