/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //CONSTANTES
        final String COMIDA_1 = "carne";
        final String COMIDA_2 = "pescado";

        final int PUAS_0 = 0;
        final int PUAS_1 = 3;
        final int PUAS_2 = 4;

        //VARIABLES
        int puas;

        //CABECERA
        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        //Introducir el TIPO DE COMIDA
        System.out.print("Tipo de comida.: ");
        String tipoComida = SCN.nextLine().toLowerCase();

        //separador
        System.out.println("---");

        //Dependiendo de la comida, se usa un tenedor con más o menos púas
        if (tipoComida.equals(COMIDA_1)) {

            puas = PUAS_1;
            System.out.println("Tenedor con ....: " + puas + " púas");

        } else if (tipoComida.equals(COMIDA_2)) {

            puas = PUAS_2;
            System.out.println("Tenedor con ....: " + puas + " púas");

        } else {

            puas = PUAS_0;
            System.out.println("Tenedor con ....: " + puas + " púas");
        }

    }//main

}//class
