package oop.pset4;

import oop.pset4.controller.Airport;
import oop.pset4.model.Luggage;
import oop.pset4.parse.LuggageParser;
import oop.pset4.view.SummaryReporter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Pset4Main {

    public static void main(String[] args) {

        LuggageParser luggageParser = new LuggageParser();

        List<Luggage> departureLuggage = luggageParser.asList("src\\main\\java\\oop\\pset4\\data\\luggage");

        Airport airport = new Airport();
        List<Luggage> arrivalLuggage = airport.travel(departureLuggage);

        SummaryReporter summaryReporter = new SummaryReporter();
        summaryReporter.reportAccepted(arrivalLuggage);


        // Returning the list of arrival luggage will be very useful
        // when we learn about unit testing to be able to test the behaviour
        // of the Airport class automatically
    }
}
