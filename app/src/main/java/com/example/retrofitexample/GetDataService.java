package com.example.retrofitexample;

/* STep 5
 * This is an interface that contains possible API calls
 *
 * The endpoints are defined inside of an interface using special retrofit annotations to encode details
 * about the parameters and request method.
 *
 * ("/photos") is the endpoint that has been defined in the GET annotation
 * */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
