package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimpleCoffeeRepository implements CoffeeRepository {

    public static Map<Long, Coffee> coffeesById;
    public static Map<String, Coffee> coffeesByName;

    static {
        coffeesByName = new HashMap<>();
        coffeesById = new HashMap<>();
        Coffee espressoArabica = new Coffee(1, "espresso-arabica", "arabica beans", 2.00);
        Coffee espressoRobusta = new Coffee(2, "espresso-robusta", "robusta beans", 2.00);
        Coffee latteArabica = new Coffee(3, "latte-arabica", "arabica beans, full fat bio milk", 3.00);
        coffeesByName.put(espressoArabica.getName(), espressoArabica);
        coffeesById.put(espressoArabica.getId(), espressoArabica);
        coffeesByName.put(espressoRobusta.getName(), espressoRobusta);
        coffeesById.put(espressoRobusta.getId(), espressoRobusta);
        coffeesByName.put(latteArabica.getName(), latteArabica);
        coffeesById.put(latteArabica.getId(), latteArabica);
    }

    @Override
    public Coffee getCoffee(long id) {
        return coffeesById.get(id);
    }

    @Override
    public Coffee getCoffee(String name) {
        return coffeesByName.get(name);
    }

    @Override
    public Collection<Coffee> getCoffees() {
        return new ArrayList<Coffee>(coffeesById.values());
    }
    
}