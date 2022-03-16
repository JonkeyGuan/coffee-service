package com.example;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.PathParam;

@ApplicationScoped
public class SimpleCoffeeResource implements CoffeeResource {
 
    @Inject
    private CoffeeRepository coffeeRepo;

    public Collection<Coffee> getCoffees() {
        System.out.println("Getting coffees");
        return coffeeRepo.getCoffees();
    }

    public Coffee getCoffee(@PathParam("name") String name) {
        return coffeeRepo.getCoffee(name);
    }


}