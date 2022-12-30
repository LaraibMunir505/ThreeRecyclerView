package com.example.three_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.three_recyclerview.Adapter.MyPlayerAdapter;
import com.example.three_recyclerview.Adapter.MySportsAdapter;
import com.example.three_recyclerview.Adapter.MyTeamAdapter;
import com.example.three_recyclerview.Model.MyPlayerModel;
import com.example.three_recyclerview.Model.MySportsModel;
import com.example.three_recyclerview.Model.MyTeamModel;
import com.example.three_recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<MySportsModel> mySportslist;
    ArrayList<MyTeamModel>  myTeamlist;
    ArrayList<MyPlayerModel> myPlayerlist;
    MySportsAdapter mySportsAdapter;
    MyTeamAdapter myTeamAdapter;
    MyPlayerAdapter myPlayerAdapter;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.rcvsport.setLayoutManager(layoutManager1);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.rcvteam.setLayoutManager(layoutManager2);

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.rcvplayer.setLayoutManager(layoutManager3);



        mySportslist.add(new MySportsModel("Soccer",R.drawable.ic_soccer));
        mySportslist.add(new MySportsModel("Hockey",R.drawable.ic_hockey));
        mySportslist.add(new MySportsModel("BasketBall",R.drawable.ic__basketball));
        mySportslist.add(new MySportsModel("Cricket",R.drawable.ic_cricket));




        mySportsAdapter=new MySportsAdapter(mySportslist,MainActivity.this);
        binding.rcvsport.setAdapter(mySportsAdapter);


        myTeamlist.add(new MyTeamModel("Paris Saint_German","#FF6200EE",R.drawable.img_3));
       myTeamlist.add(new MyTeamModel("Bayren Munchen","#F81111",R.drawable.img_4));
        myTeamlist.add(new MyTeamModel("Borussia dortmund","#F3C40B",R.drawable.img_5));
        myTeamlist.add(new MyTeamModel("Pakistan","#2A5008",R.drawable.img_6));



        myTeamAdapter=new MyTeamAdapter(myTeamlist,MainActivity.this);
        binding.rcvteam.setAdapter(myTeamAdapter);

        myPlayerlist.add(new MyPlayerModel("Girarad","", R.drawable.img_8));
        myPlayerlist.add(new MyPlayerModel("Antoine","",R.drawable.img_9));
        myPlayerlist.add(new MyPlayerModel("Babar Azam","",R.drawable.img_10));
        myPlayerlist.add(new MyPlayerModel("Shahid Afridi","",R.drawable.img_11));

        myPlayerAdapter=new MyPlayerAdapter(myPlayerlist,MainActivity.this);
        binding.rcvplayer.setAdapter(myPlayerAdapter);


    binding.search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                filters(editable.toString());
                filters2(editable.toString());
                filters3(editable.toString());

            }
        });
    }

    private void filters3(String text) {

        ArrayList<MyPlayerModel> filteredList3=new ArrayList<>();
        for (MyPlayerModel item3 : myPlayerlist){
            if (item3.getTv1().contains(text.toLowerCase()))
            {
                filteredList3.add(item3);
            }
        }
       myPlayerAdapter.filterList(filteredList3);
    }

    private void filters2(String text) {

        ArrayList<MyTeamModel> filteredList2=new ArrayList<>();
        for (MyTeamModel item2 : myTeamlist){
            if (item2.getTxt1().contains(text.toLowerCase()))
            {
                filteredList2.add(item2);
            }
        }
        myTeamAdapter.filterList(filteredList2);

    }

    private void filters(String text) {

        ArrayList<MySportsModel> filteredList=new ArrayList<>();
        for (MySportsModel item : mySportslist)
        {
            if (item.getTv1().contains(text.toLowerCase()))
            {
                filteredList.add(item);
            }
        }
        mySportsAdapter.filterList(filteredList);
    }

}