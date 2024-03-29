/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

import java.util.Scanner;

/**
 * @author neo
 * @create 01/08/2019
 */
public class ex_04 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        final int TAM = 4;

        float nota[] = new float[4];
        float resultado = 0;

        System.out.println("Média bimestral");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe nota " + (i + 1) + ": ");
            nota[i] = imput.nextFloat();
            resultado += nota[i];
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Média bimestral é " + (resultado / TAM));
        }
    }
}
