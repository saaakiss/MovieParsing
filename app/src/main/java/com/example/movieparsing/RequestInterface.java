package com.example.movieparsing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Sak on 27-Aug-17.
 */

public interface RequestInterface {

        @GET("generate")
        Call<JsonResponse> getJSON();

}
