package com.hfad.globetrotter;

public class Currency {
    private String code;
    private String symbol;
    private String thousands_separator;
    private String decimal_separator;
    private boolean symbol_on_left;
    private boolean space_between_amount_symbol;
    private int rounding_coefficient;
    private int decimal_digits;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getThousands_separator() {
        return thousands_separator;
    }

    public void setThousands_separator(String thousands_separator) {
        this.thousands_separator = thousands_separator;
    }

    public String getDecimal_separator() {
        return decimal_separator;
    }

    public void setDecimal_separator(String decimal_separator) {
        this.decimal_separator = decimal_separator;
    }

    public boolean isSymbol_on_left() {
        return symbol_on_left;
    }

    public void setSymbol_on_left(boolean symbol_on_left) {
        this.symbol_on_left = symbol_on_left;
    }

    public boolean isSpace_between_amount_symbol() {
        return space_between_amount_symbol;
    }

    public void setSpace_between_amount_symbol(boolean space_between_amount_symbol) {
        this.space_between_amount_symbol = space_between_amount_symbol;
    }

    public int getRounding_coefficient() {
        return rounding_coefficient;
    }

    public void setRounding_coefficient(int rounding_coefficient) {
        this.rounding_coefficient = rounding_coefficient;
    }

    public int getDecimal_digits() {
        return decimal_digits;
    }

    public void setDecimal_digits(int decimal_digits) {
        this.decimal_digits = decimal_digits;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", symbol='" + symbol + '\'' +
                ", thousands_separator='" + thousands_separator + '\'' +
                ", decimal_separator='" + decimal_separator + '\'' +
                ", symbol_on_left=" + symbol_on_left +
                ", space_between_amount_symbol=" + space_between_amount_symbol +
                ", rounding_coefficient=" + rounding_coefficient +
                ", decimal_digits=" + decimal_digits +
                '}';
    }
}


