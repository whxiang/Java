package java8.methodReference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by whxiang on 2017/11/27.
 */

public class FlightTest {

    @Test
    public void filghtTest() {

        //1.
        final Flight flight = Flight.create(Flight::new);
        flight.setDcity("beijing");
        flight.setAcity("shanghai");
        flight.setFlightNo("Mu9852");

        final Flight flight1 = Flight.create(Flight::new);
        flight1.setDcity("shanghai");
        flight1.setAcity("beijing");
        flight1.setFlightNo("Mu9853");


        final List<Flight> flights = Arrays.asList(flight,flight1);

        //2.
        flights.forEach(Flight::collide);

        //3.
        flights.forEach(Flight::repair);

        //4.
        flights.forEach(flight::follow);

    }

}
