/*
 * Copyright (c) 1996-2016, Construx Software, Inc., All Rights Reserved.
 *
 * This code is the exclusive property of Construx Software, Inc. It may ONLY
 * be used by learners during Construx's workshops or by individuals who are
 * being coached by Construx on a project.
 *
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 */

package com.construx.codesamples.triangle;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Triangle Classifier");
        System.out.println("Enter the length of the three sides of the triangle you want to classify.");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();

        System.out.println(String.valueOf(TriangleType.classify(a, b, c)));
    }
}
