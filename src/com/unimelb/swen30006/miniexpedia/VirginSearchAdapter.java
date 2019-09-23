package com.unimelb.swen30006.miniexpedia;

import java.util.ArrayList;
import com.unimelb.swen30006.Virgin.VirginFlight;
import com.unimelb.swen30006.Virgin.VirginSearch;
public class VirginSearchAdapter implements IsearchAdapter {

	@Override
	public ArrayList<Flight> search(ArrayList<Flight> flights, int numPassengers) {
		VirginSearch search = new VirginSearch();
		ArrayList<VirginFlight> fl = new ArrayList<>();
		ArrayList<Flight> results = new ArrayList<>();
		for (Flight flight : flights) {
			fl = search.search(flight.getFrom(), flight.getTo(), flight.getDate(), numPassengers);
		}
		for (VirginFlight fls : fl) {
			results.add(new Flight(fls.getDeparture(), fls.getDestination(), fls.getDepartureTime()));
		}
		
		return results;
	}

}
