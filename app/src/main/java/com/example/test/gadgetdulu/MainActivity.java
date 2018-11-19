package com.example.test.gadgetdulu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
        inputData("Huawei P20 Pro","artikel_1.html");
        inputData("Asus Zenfone Max Pro M1","artikel_2.html");
        inputData("Xiaomi Redmi Note 5","artikel_3.html");
        inputData("Xiaomi MI A2","artikel_4.html");
        inputData("Samsung Galaxy j7 pro","artikel_5.html");
        inputData("Honor 9 Lite","artikel_7.html");
        inputData("Realme C1","artikel_8.html");
        inputData("Vivo V11 Pro","artikel_9.html");
        inputData("Iphone 7 Plus","artikel_10.html");
        inputData("Samsung Galaxy J7 Prime","artikel_11.html");
        inputData("Xiaomi Redmi 5","artikel_12.html");
        inputData("Redmi S2","artikel_13.html");
        inputData("Razer Phone","artikel_14.html");
        inputData("Asus Zenfone 5","artikel_15.html");


        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}