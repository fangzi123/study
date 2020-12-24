package com.wangff.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ErpServiceFactory {
    private Map<String,ErpService> serviceMap = new ConcurrentHashMap<String,ErpService>(32);

    public   ErpService getInstance(String type){
        return serviceMap.get(type);
    }

    @Autowired
    private void init(ErpService[] services) {
        for (ErpService service : services) {
//            serviceMap.put(service.support(), service);
          MyType myType= service.getClass().getDeclaredAnnotation(MyType.class);
          MyType myType1= service.getClass().getAnnotation(MyType.class);
            serviceMap.put(myType.value(), service);
        }
    }
}