package com.xyzcorp;

import com.abccorp.Calculator;
import com.defcorp.service.api.ServiceInterface;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<ServiceInterface> instances = ServiceInterface.getInstances();
        instances.forEach(ServiceInterface::execute);
        System.out.println(calculator.add(20, 10));
    }
}
