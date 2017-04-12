package com.example.rishabh.cichack.utils;

/**
 * Created by rishabh on 13/4/17.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

  public static FarmerApi RetrofitClient() {

      /*  OkHttpClient httpClient = new OkHttpClient();
        httpClient.networkInterceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request.Builder requestBuilder = chain.request().newBuilder();
                requestBuilder.header("Content-Type", "application/json");
                return chain.proceed(requestBuilder.build());
            }
        });*/

    Retrofit retrofit = new Retrofit.Builder()
        //.baseUrl(Api_old.BASE_URL).client(httpClient)
        .baseUrl(API.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    FarmerApi service = retrofit.create(FarmerApi.class);
    return service;
  }

  static ProgressDialog mProgressDialog = null;

  public static void ShowDialog(Context context) {
    mProgressDialog = new ProgressDialog(context);
    mProgressDialog.setIndeterminate(true);
    mProgressDialog.setMessage("Please wait...");
    mProgressDialog.show();
  }

  public static void DismissDialog() {
    if (mProgressDialog.isShowing() && mProgressDialog != null)
      mProgressDialog.dismiss();
  }

  public static void InternetError(final Context context) {
    Toast.makeText(context, "Please Check Internet Connection", Toast.LENGTH_SHORT).show();
  }

  public static void ErrorToast(final Context context) {
    Toast.makeText(context, "Some Error Occured", Toast.LENGTH_SHORT).show();
  }

  public static boolean isNetworkAvailable(final Context context) {
    final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
    return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
  }

}
