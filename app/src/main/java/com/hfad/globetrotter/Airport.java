
package com.hfad.globetrotter;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "lat",
        "lon",
        "name",
        "city",
        "state",
        "country",
        "woeid",
        "tz",
        "phone",
        "type",
        "email",
        "url",
        "runway_length",
        "elev",
        "icao",
        "direct_flights",
        "carriers"
})
public class Airport {

    @JsonProperty("code")
    private String code;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("woeid")
    private String woeid;
    @JsonProperty("tz")
    private String tz;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("type")
    private String type;
    @JsonProperty("email")
    private String email;
    @JsonProperty("url")
    private String url;
    @JsonProperty("runway_length")
    private Object runwayLength;
    @JsonProperty("elev")
    private Object elev;
    @JsonProperty("icao")
    private String icao;
    @JsonProperty("direct_flights")
    private String directFlights;
    @JsonProperty("carriers")
    private String carriers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Airport() {
    }


    /**
     *
     * @param lon
     * @param phone
     * @param elev
     * @param woeid
     * @param state
     * @param code
     * @param type
     * @param url
     * @param city
     * @param country
     * @param carriers
     * @param tz
     * @param runwayLength
     * @param email
     * @param icao
     * @param name
     * @param lat
     * @param directFlights
     */
    public Airport(String code, String lat, String lon, String name, String city, String state, String country, String woeid, String tz, String phone, String type, String email, String url, Object runwayLength, Object elev, String icao, String directFlights, String carriers) {
        super();
        this.code = code;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.woeid = woeid;
        this.tz = tz;
        this.phone = phone;
        this.type = type;
        this.email = email;
        this.url = url;
        this.runwayLength = runwayLength;
        this.elev = elev;
        this.icao = icao;
        this.directFlights = directFlights;
        this.carriers = carriers;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("woeid")
    public String getWoeid() {
        return woeid;
    }

    @JsonProperty("woeid")
    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("runway_length")
    public Object getRunwayLength() {
        return runwayLength;
    }

    @JsonProperty("runway_length")
    public void setRunwayLength(Object runwayLength) {
        this.runwayLength = runwayLength;
    }

    @JsonProperty("elev")
    public Object getElev() {
        return elev;
    }

    @JsonProperty("elev")
    public void setElev(Object elev) {
        this.elev = elev;
    }

    @JsonProperty("icao")
    public String getIcao() {
        return icao;
    }

    @JsonProperty("icao")
    public void setIcao(String icao) {
        this.icao = icao;
    }

    @JsonProperty("direct_flights")
    public String getDirectFlights() {
        return directFlights;
    }

    @JsonProperty("direct_flights")
    public void setDirectFlights(String directFlights) {
        this.directFlights = directFlights;
    }

    @JsonProperty("carriers")
    public String getCarriers() {
        return carriers;
    }

    @JsonProperty("carriers")
    public void setCarriers(String carriers) {
        this.carriers = carriers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}