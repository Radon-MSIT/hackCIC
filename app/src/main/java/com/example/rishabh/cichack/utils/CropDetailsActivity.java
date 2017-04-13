package com.example.rishabh.cichack.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.rishabh.cichack.R;
import com.example.rishabh.cichack.retrofit.Datum;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.ArrayList;
import java.util.List;

public class CropDetailsActivity extends AppCompatActivity {

  private PieChart mChart;
  TextView region,cost, cropOne, cropOneDetail, cropTwo, cropTwoDetail, cropThree, cropThreeDetail;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_crop_details);

    Bundle extras=getIntent().getExtras();
    String costresp= extras.getString("cost");
    String regionresp= extras.getString("region");
    String numberresp= extras.getString("number");

    region = (TextView) findViewById(R.id.region);
    cost = (TextView) findViewById(R.id.cost);
    cropOne = (TextView) findViewById(R.id.cropOne);
    cropOneDetail = (TextView) findViewById(R.id.cropOneDetail);
    cropTwo = (TextView) findViewById(R.id.cropTwo);
    cropTwoDetail = (TextView) findViewById(R.id.cropTwoDetail);
    cropThree = (TextView) findViewById(R.id.cropThree);
    cropThreeDetail = (TextView) findViewById(R.id.cropThreeDetail);

    //PieChart mChart = (PieChart) findViewById(R.id.chart);

    ArrayList<Datum> crops=getIntent().getParcelableArrayListExtra("crops");

    region.setText("Region: "+regionresp);

    cost.setText("\nTotal Cost: 2273\nNumber Of Crops: 3");

    cropOne.setText(crops.get(0).getCrop());
    cropOneDetail.setText("Cost: "+crops.get(0).getCost()+"\nIrrigation: "+crops.get(0).getIrrigation()+"\nFertilizer: "+crops.get(0).getFertilizer()+"\nSeed Cost: "+crops.get(0).getFertilizer()+"\nArea: "+crops.get(0).getArea());

    cropTwo.setText(crops.get(1).getCrop());
    cropTwoDetail.setText("Cost: "+crops.get(1).getCost()+"\nIrrigation: "+crops.get(1).getIrrigation()+"\nFertilizer: "+crops.get(1).getFertilizer()+"\nSeed Cost: "+crops.get(1).getFertilizer()+"\nArea: "+crops.get(1).getArea());

    cropThree.setText(crops.get(2).getCrop());
    cropThreeDetail.setText("Cost: "+crops.get(2).getCost()+"\nIrrigation: "+crops.get(2).getIrrigation()+"\nFertilizer: "+crops.get(2).getFertilizer()+"\nSeed Cost: "+crops.get(2).getFertilizer()+"\nArea: "+crops.get(2).getArea());


    mChart.setUsePercentValues(true);

    List<PieEntry> yvalues = new ArrayList<PieEntry>();
    yvalues.add(new PieEntry(Float.valueOf(crops.get(0).getArea()), 0));
    yvalues.add(new PieEntry(Float.valueOf(crops.get(1).getArea()), 1));
    yvalues.add(new PieEntry(Float.valueOf(crops.get(2).getArea()), 2));
    //yvalues.add(new PieEntry(15f, 1));
    //yvalues.add(new PieEntry(12f, 2));
    //yvalues.add(new PieEntry(25f, 3));
    //yvalues.add(new PieEntry(23f, 4));
    //yvalues.add(new PieEntry(17f, 5));

    PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");

    ArrayList<String> xVals = new ArrayList<String>();

    xVals.add(crops.get(0).getCrop());
    xVals.add(crops.get(1).getCrop());
    xVals.add(crops.get(2).getCrop());
    //xVals.add("February");
    //xVals.add("March");
    //xVals.add("April");
    //xVals.add("May");
    //xVals.add("June");

    PieData data = new PieData(dataSet);


  }
}
