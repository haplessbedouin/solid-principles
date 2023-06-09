package com.cydeo.solid.openClosed.example2.good;

import com.cydeo.solid.openClosed.example2.bad.Operation;
import com.cydeo.solid.openClosed.example2.bad.OperationType;

public class Calculator {

    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        if (operation.getType().equals(OperationType.ADDITION)) {
            System.out.println(num1 + num2);
        }

        if (operation.getType().equals(OperationType.SUBTRACTION)) {
            System.out.println(num1 - num2);
        }

        if (operation.getType().equals(OperationType.MULTIPLICATION)) {
            System.out.println(num1 * num2);
        }

        if (operation.getType().equals(OperationType.DIVISION)) {
            System.out.println(num1 / num2);
        }

        // What if we need to add another operation later?

    }

}
