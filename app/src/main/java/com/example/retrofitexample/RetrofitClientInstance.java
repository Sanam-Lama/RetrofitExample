package com.example.retrofitexample;

/* Step 4
 * To issue network requests to a REST API with Retrofit, we need to create an instance using the
 * Retrofit.Builder class and configure it with a base URL.
 *
 * class RetrofitClientInstance.java under network package contains the instance of retrofit.
 * BASE_URL is the basic URL of our API where we will make a call.
 * */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    // declare some instances
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
