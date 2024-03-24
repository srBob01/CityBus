package ru.arsentiev.factories;

import ru.arsentiev.entities.DayInRoute;
import ru.arsentiev.entities.Route;

import java.time.LocalDate;
import java.util.Collection;
import java.util.function.Supplier;

public class DaysInRouteFactory {
    public static <T extends Collection<DayInRoute>, D extends Collection<LocalDate>>
    T generateDaysInRoute(Supplier<T> factory, Route route, D localDateList) {
        return localDateList.stream()
                .map(date -> new DayInRoute(route, date))
                .collect(factory, Collection::add, Collection::addAll);
    }
}
