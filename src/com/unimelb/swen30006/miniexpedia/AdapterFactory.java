package com.unimelb.swen30006.miniexpedia;

public class AdapterFactory {
	private static AdapterFactory factory;
	//new AdapterFactory();
	private IsearchAdapter searchAdapter = null;
	private AdapterFactory() {}
	public static AdapterFactory getInstance() {
		if(factory == null) factory = new AdapterFactory();
		return factory;
	}
	public IsearchAdapter getSearchAdapter(String airline) {
		if (airline.equals("Jetstar")) {
			searchAdapter = new JetstarSearchAdapter();
		} else if (airline.equals("Qantas")) {
			searchAdapter = new QantasSearchAdapter();
		} else if (airline.equals("Virgin")) {
			searchAdapter = new VirginSearchAdapter();
		}
		return searchAdapter;
	}
}
