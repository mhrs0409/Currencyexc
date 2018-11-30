package com.example.convertcurrency.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;

import com.example.convertcurrency.model.*;


public class ConvertcurImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvertcurImpl() {
		Convert currencyMalaysia1= new Convert( "MXN", 4.84);
		Convert currencyMalaysia2 = new Convert( "IQD", 4.84);
		Convert currencyMalaysia3 = new Convert( "JPY",3454.78);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		list.add(currencyMalaysia3);
		currenciesMap.put("RM", list);
		
		Convert currencyMexican1= new Convert( "RM", 0.21 );
		Convert currencyMexican2 = new Convert( "IQD", 58.77 );
		Convert currencyMexican3 = new Convert( "JPY", 5.60 );
		
		list = new ArrayList<>();
		list.add(currencyMexican1);
		list.add(currencyMexican2);
		list.add(currencyMexican3);
		currenciesMap.put("MXN", list);
		
		Convert currencyIraqi1= new Convert( "RM", 0.0035 );
		Convert currencyIraqi2 = new Convert( "MXN", 0.017);
		Convert currencyIraqi3 = new Convert( "JPY", 0.095);
		
		list = new ArrayList<>();
		list.add(currencyIraqi1);
		list.add(currencyIraqi2);
		list.add(currencyIraqi3);
		currenciesMap.put("IQD", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
