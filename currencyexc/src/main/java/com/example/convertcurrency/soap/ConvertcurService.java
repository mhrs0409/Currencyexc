package com.example.convertcurrency.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.convertcurrency.bus.ConvertcurImpl;
import com.example.convertcurrency.model.Convert;

@WebService
public class ConvertcurService {
	ConvertcurImpl cc = new ConvertcurImpl();
	
	@WebMethod
	public ArrayList<Convert> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
