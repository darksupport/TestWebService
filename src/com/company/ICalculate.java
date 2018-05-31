package com.company;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Brainacad4 on 31.05.2018.
 */
@WebService
public interface ICalculate {
  @WebMethod
  int add(int a, int b);
  @WebMethod
  int mult(int a, int b);
}
