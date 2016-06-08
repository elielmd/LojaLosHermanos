package br.univel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class URLReader {

	private static final String URL = "http://www.master10.com.py/lista-txt";

	public List<String> LerUrl() {
		List<String> lista = new ArrayList<String>();

		try {

			URL oracle = new URL(URL);
			try (BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));) {
				String inputLine = null;
				while ((inputLine = in.readLine()) != null) {
					// System.out.println(inputLine);
					lista.add(inputLine);
				}
			}
		} catch (IOException e) {
			throw new RuntimeException("Deu Merda", e);
		}

		return lista;
	}

	
}
