package com.example.rishabh.cichack.utils;

import com.example.rishabh.cichack.retrofit.CropStock;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rishabh on 13/4/17.
 */

public interface FarmerApi {

  @GET(API.al)
  Call<CropStock> getAlResp();

  @GET(API.ka)
  Call<CropStock> getKaResp();

  @GET(API.alv)
  Call<CropStock> getAlvResp();
}
