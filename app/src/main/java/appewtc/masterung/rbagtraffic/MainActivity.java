package appewtc.masterung.rbagtraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Create ListView
        createListView();


    }   // Main Method

    private void createListView() {

        int[] iconInts = new int[20];
        iconInts[0] = R.drawable.traffic_01;
        iconInts[1] = R.drawable.traffic_02;
        iconInts[2] = R.drawable.traffic_03;
        iconInts[3] = R.drawable.traffic_04;
        iconInts[4] = R.drawable.traffic_05;
        iconInts[5] = R.drawable.traffic_06;
        iconInts[6] = R.drawable.traffic_07;
        iconInts[7] = R.drawable.traffic_08;
        iconInts[8] = R.drawable.traffic_09;
        iconInts[9] = R.drawable.traffic_10;
        iconInts[10] = R.drawable.traffic_11;
        iconInts[11] = R.drawable.traffic_12;
        iconInts[12] = R.drawable.traffic_13;
        iconInts[13] = R.drawable.traffic_14;
        iconInts[14] = R.drawable.traffic_15;
        iconInts[15] = R.drawable.traffic_16;
        iconInts[16] = R.drawable.traffic_17;
        iconInts[17] = R.drawable.traffic_18;
        iconInts[18] = R.drawable.traffic_19;
        iconInts[19] = R.drawable.traffic_20;

        String[] titleStrings = new String[20];
        titleStrings[0] = "ป้ายที่ 1";
        titleStrings[1] = "ป้ายที่ 2";
        titleStrings[2] = "ป้ายที่ 3";
        titleStrings[3] = "ป้ายที่ 4";
        titleStrings[4] = "ป้ายที่ 5";
        titleStrings[5] = "ป้ายที่ 6";
        titleStrings[6] = "ป้ายที่ 7";
        titleStrings[7] = "ป้ายที่ 8";
        titleStrings[8] = "ป้ายที่ 9";
        titleStrings[9] = "ป้ายที่ 10";
        titleStrings[10] = "ป้ายที่ 11";
        titleStrings[11] = "ป้ายที่ 12";
        titleStrings[12] = "ป้ายที่ 13";
        titleStrings[13] = "ป้ายที่ 14";
        titleStrings[14] = "ป้ายที่ 15";
        titleStrings[15] = "ป้ายที่ 16";
        titleStrings[16] = "ป้ายที่ 17";
        titleStrings[17] = "ป้ายที่ 18";
        titleStrings[18] = "ป้ายที่ 19";
        titleStrings[19] = "ป้ายที่ 20";

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, iconInts, titleStrings);
        trafficListView.setAdapter(objMyAdapter);

    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);

    }

}   // Main Class นี่คือ คลาสหลัก
