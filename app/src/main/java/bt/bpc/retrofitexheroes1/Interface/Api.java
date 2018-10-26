package bt.bpc.retrofitexheroes1.Interface;


import java.util.List;

import bt.bpc.retrofitexheroes1.Model.Hero;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroes();



}
