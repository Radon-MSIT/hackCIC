package com.example.rishabh.cichack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.rishabh.cichack.retrofit.CropStock;
import com.example.rishabh.cichack.utils.FarmerApi;
import com.example.rishabh.cichack.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FarmerActivity extends AppCompatActivity {


  EditText etArea, etBudget;
  Spinner splocation;

  Button btnSubmit;

  public static final String[] districts = {
      "Alvar", "Alahabad", "kanpur", "AKOLA"
  };

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_farmer);

    etArea= (EditText) findViewById(R.id.etArea);
    etBudget= (EditText) findViewById(R.id.etBudget);
    splocation = (Spinner) findViewById(R.id.splocation);

    btnSubmit = (Button) findViewById(R.id.btnSubmit);

    btnSubmit.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {

          getCropInfo();
      }
    });

  }

  private void getCropInfo() {
    RetrofitUtil.ShowDialog(FarmerActivity.this);

    //Call<CropStock> call =null;
    Call<CropStock> call =RetrofitUtil.RetrofitClient().getAlResp();

    //switch (splocation.getSelectedItem().toString()){
    //
    //  case "Alwar":
    //    call=RetrofitUtil.RetrofitClient().getAlResp();
    //    break;
    //
    //  case "kanpur":
    //    call= RetrofitUtil.RetrofitClient().getKaResp();
    //    break;
    //
    //  case  "Alahabad":
    //    call= RetrofitUtil.RetrofitClient().getAlvResp();
    //    break;
    //  default:
    //    call= RetrofitUtil.RetrofitClient().getAlResp();
    //    break;
    //}

    //Executing Call
    call.enqueue(new Callback<CropStock>() {
      @Override
      public void onResponse(Call<CropStock> call, Response<CropStock> response) {
        RetrofitUtil.DismissDialog();
        try {
          if (response.body().getStutus().equalsIgnoreCase("OK")) {


          }
          Toast.makeText(FarmerActivity.this, response.body().getStutus(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
          RetrofitUtil.ErrorToast(FarmerActivity.this);
        }
      }

      @Override
      public void onFailure(Call<CropStock> call, Throwable t) {
        RetrofitUtil.DismissDialog();
        RetrofitUtil.ErrorToast(FarmerActivity.this);
      }
    });
  }
  }

