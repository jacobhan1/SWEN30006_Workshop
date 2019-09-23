package com.unimelb.swen30006.miniexpedia;

import java.util.ArrayList;
import com.unimelb.swen30006.Qantas.QantasFlight;
import com.unimelb.swen30006.Qantas.QantasSearch;
public class QantasSearchAdapter implements IsearchAdapter {

	@Override
	public ArrayList<Flight> search(ArrayList<Flight> flights, int numPassengers) {
		QantasSearch search = new QantasSearch();
		ArrayList<QantasFlight> routes = new ArrayList<>();
		ArrayList<Flight> results = new ArrayList<>();

		for (Flight flight : flights) {
			routes.add(new QantasFlight(flight.getFrom(), flight.getTo(), flight.getDate()));
		}
		
		for (QantasFlight fl : search.search(routes, numPassengers)) {
			results.add(new Flight(fl.from(), fl.to(), fl.departAt()));
		}
		return results;
	}

}
