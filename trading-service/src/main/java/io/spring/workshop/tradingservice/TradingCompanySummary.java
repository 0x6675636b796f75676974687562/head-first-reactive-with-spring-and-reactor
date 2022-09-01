package io.spring.workshop.tradingservice;

import io.spring.workshop.stockdetails.TradingCompany;
import io.spring.workshop.stockquotes.Quote;

public class TradingCompanySummary {

	private final Quote latestQuote;

	private final TradingCompany tradingCompany;

	public TradingCompanySummary(TradingCompany tradingCompany, Quote latestQuote) {
		this.latestQuote = latestQuote;
		this.tradingCompany = tradingCompany;
	}

	public Quote getLatestQuote() {
		return latestQuote;
	}

	public TradingCompany getTradingCompany() {
		return tradingCompany;
	}
}
