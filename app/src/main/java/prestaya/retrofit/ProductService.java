package prestaya.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by 8470P on 01/04/2018.
 */

public interface ProductService {
    @GET("product")
    Call<Product> getProduct();
}
