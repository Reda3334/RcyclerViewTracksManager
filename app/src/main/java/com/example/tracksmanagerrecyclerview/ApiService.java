package com.example.tracksmanagerrecyclerview;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("tracks")
    Call<List<Track>> getAllTracks();

    @DELETE("tracks")
    void deleteItem(@Path("/{title}") String title, Callback<Response> callback);




}
