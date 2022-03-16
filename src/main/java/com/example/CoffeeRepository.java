package com.example;

import java.util.Collection;

public interface CoffeeRepository {
    
    Coffee getCoffee(long id);
    
    Coffee getCoffee(String name);
    
    Collection<Coffee> getCoffees();
}