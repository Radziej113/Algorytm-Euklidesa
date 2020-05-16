package com.algorytmeuklidesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorytmEuklidesaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmEuklidesaApplication.class, args);
    }
    {
        int a = 3850;
        int b = 49;

        AlgorithmRunner finder = new AlgorithmRunner();
        int result = finder.findNWD(a,b);
        System.out.println("NWD(" + a + "," + b + ") = " + result);
    }
}
