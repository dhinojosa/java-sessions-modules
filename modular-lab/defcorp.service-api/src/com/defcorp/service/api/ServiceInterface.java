package com.defcorp.service.api;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface ServiceInterface {
    static List<ServiceInterface> getInstances() {
        ServiceLoader<ServiceInterface> services =
            ServiceLoader.load(ServiceInterface.class);
        ArrayList<ServiceInterface> list = new ArrayList<>();
        for (ServiceInterface serviceInterface : services) {
            list.add(serviceInterface);
        }
        return list;
    }

    public void execute();
}
