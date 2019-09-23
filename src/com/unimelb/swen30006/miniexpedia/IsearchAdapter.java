package com.unimelb.swen30006.miniexpedia;

import java.util.ArrayList;

public interface IsearchAdapter {
	public ArrayList<Flight> search(ArrayList<Flight> flights, int numPassengers) throws Exception;
}
