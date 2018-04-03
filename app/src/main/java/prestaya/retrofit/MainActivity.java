package prestaya.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ProductService productService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productService = ApiClient.getApiClient().create(ProductService.class);
        Call<Product> call = productService.getProduct();
        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                Log.e("Response", response.body().getTotalElements() + " - "
                        + response.body().getTotalPages()
                +response.code());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });

    }
}
