package ru.arsentiev.factories;

import ru.arsentiev.entities.Route;

public class RouteFactory {
    public static Route generateRoute() {
        return new Route();
    }

}
