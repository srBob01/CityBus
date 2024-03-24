package ru.arsentiev.other;

import ru.arsentiev.entities.DayInRoute;
import ru.arsentiev.entities.Route;

import java.util.Collection;

public class Profit {
    private static int countProfitPerDay(DayInRoute dayInRoute, Route route) {
        int amountOneBusPerPath = route.getNumberOfStops()
                * dayInRoute.getAvgNewCustomerAtStop()
                * Route.getPriceInRubles();
        int amountOneBusPerDay = amountOneBusPerPath * dayInRoute.getNumberOfPath();
        int profit = amountOneBusPerDay * dayInRoute.getNumberOfBus();
        dayInRoute.setProfit(profit);
//      System.out.println(dayInRoute);
        return profit;
    }

    public static <T extends Collection<DayInRoute>> long countProfit(T dayInRouteCollection, Route route) {
        return dayInRouteCollection.stream()
                .mapToInt(day -> countProfitPerDay(day, route))
                .sum();
    }
}
