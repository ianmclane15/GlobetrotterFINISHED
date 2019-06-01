package com.hfad.globetrotter;

        import java.util.List;

public class QuoteResponse {
    private List<Quote> Quote;

    public QuoteResponse(List<Quote> quote) {
        this.Quote = quote;
    }

    public List<Quote> getQuote() {
        return Quote;
    }

    public void setQuote(List<Quote> quote) {
        this.Quote = quote;
    }
}

