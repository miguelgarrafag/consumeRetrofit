package prestaya.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 8470P on 01/04/2018.
 */

public class ApiClient {
    public static final String URL = "http://tenrest.sudtechnologies.site/rest/v1/public/";
    public static Retrofit retrofit;

    public static  Retrofit getApiClient(){
        if (retrofit==null){
            retrofit  = new Retrofit.Builder().baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
