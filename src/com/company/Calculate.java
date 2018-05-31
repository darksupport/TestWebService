package com.company;

import javax.jws.WebService;

/**
 * Created by Brainacad4 on 31.05.2018.
 */
@WebService(endpointInterface = "com.company.ICalculate")
public class Calculate implements ICalculate {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mult(int a, int b) {
        return a*b;
    }
}
