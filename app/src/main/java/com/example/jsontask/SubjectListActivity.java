package com.example.jsontask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SubjectListActivity extends AppCompatActivity {

    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    RecycleAdapter recycleAdapter;
    RecyclerView recyclerView;
    ArrayList<CustomModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        json_string= getIntent().getStringExtra("json_data");

        recyclerView = findViewById(R.id.recyckleView);


        try {
            jsonObject = new JSONObject(json_string);
            jsonArray = jsonObject.getJSONArray("server_response");

            int count = 0;
            String name,english,urdu,maths,chemistry,physics,biology;
            while (count<jsonArray.length()){
                JSONObject JO = jsonArray.getJSONObject(count);   //initilize if index of array
                name = JO.getString("name");
                english = JO.getString("english");
                urdu = JO.getString("urdu");
                maths = JO.getString("maths");
                chemistry = JO.getString("chemistry");
                physics = JO.getString("physics");
                biology = JO.getString("biology");

                String a,b,c,d,e,f;
                a="english=    ";
                b="urdu=    ";
                c="maths=   ";
                d="chemistry=   ";
                e="physics=     ";
                f="biology=    ";

              CustomModel customModel = new CustomModel(name,english,b+urdu,c+maths,d+chemistry,e+physics,f+biology);
                arrayList.add(customModel);
                count++;

            }
            recycleAdapter = new RecycleAdapter(this,arrayList);
            recyclerView.setAdapter(recycleAdapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}