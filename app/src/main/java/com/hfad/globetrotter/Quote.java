package com.hfad.globetrotter;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private String quote_id;
    private int min_price;
    private boolean direct;
    private List<Outboundleg> outboundleg = new ArrayList<Outboundleg>();
    private String quotedatetime;

    public String getQuote_id() {
        return quote_id;
    }

    public void setQuote_id(String quote_id) {
        this.quote_id = quote_id;
    }

    public int getMin_price() {
        return min_price;
    }

    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    public List<Outboundleg> getOutboundleg() {
        return outboundleg;
    }

    public void setOutboundleg(List<Outboundleg> outboundleg) {
        this.outboundleg = outboundleg;
    }

    public String getQuotedatetime() {
        return quotedatetime;
    }

    public void setQuotedatetime(String quotedatetime) {
        this.quotedatetime = quotedatetime;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote_id='" + quote_id + '\'' +
                ", min_price=" + min_price +
                ", direct=" + direct +
                ", outboundleg=" + outboundleg +
                ", quotedatetime='" + quotedatetime + '\'' +
                '}';
    }
}

