package au.com.bywave.retrofitpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kenlogronio on 2/16/18.
 */

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();


}
