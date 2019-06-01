package com.hfad.globetrotter;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FlightService {
    @Headers({"X-RapidAPI-Host: skyscanner-skyscanner-flight-search-v1.p.rapidapi.com", "X-RapidAPI-Key: e93479b8dfmsh1490814a7055c87p16be68jsn0a4ae544f400"})
    @GET("apiservices/browsequotes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
    Call<CarrierResponse> getCarrier(
            @Path("country") String country,
            @Path("currency") String currency,
            @Path("locale") String locale,
            @Path("originplace") String originplace,
            @Path("destinationplace") String destinationplace,
            @Path("outboundpartialdate") String outboundpartialdate,
            @Query("inboundpartialdate") String inboundpartialdate);

}
