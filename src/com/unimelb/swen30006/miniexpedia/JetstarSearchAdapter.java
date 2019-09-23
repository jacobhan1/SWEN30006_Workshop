package com.unimelb.swen30006.miniexpedia;
import com.unimelb.swen30006.Jetstar.JetstarFlight;
import com.unimelb.swen30006.Jetstar.JetstarSearch;
import java.util.ArrayList;

public class JetstarSearchAdapter implements IsearchAdapter {
	@Override
	public ArrayList<Flight> search(ArrayList<Flight> flights, int numPassengers) throws Exception {
		JetstarSearch js = new JetstarSearch();
		ArrayList<Flight> results = new ArrayList<Flight>();
		
		for (Flight f : flights) {
			js.setNumPassengers(numPassengers);
			js.startInputFlights();
			js.inputFlight(f.getFrom(), f.getTo(), f.getDate());
			js.endInputFlights();
			js.search();
			for(JetstarFlight fl : js.getSearchResult(0)) {
				results.add(new Flight(fl.from(),fl.to(),fl.arriveAt()));
			}
			js.clearSearchResults();
			
		}
		return results;
		
		
		
	}
}
