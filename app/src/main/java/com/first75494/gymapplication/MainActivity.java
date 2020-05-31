package com.first75494.gymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
      private static final String TAG = "MainActivity";

      private Button btnPlans, btnAllTrainings, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        Utils.initTrainings();
        btnAllTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllTrainingsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews(){
        //Log.d(TAG, msg:"initViews -started");
        btnPlans = findViewById(R.id.btnPlanActivity);
        btnAllTrainings = findViewById(R.id.btnAllActivities);
        btnAbout = findViewById(R.id.btnAbout);
    }

    public static class Training {
        private int id;
        private String name;
        private String shortDesc;
        private String longDesc;
        private String imageUrl;

        public Training(int id, String name, String shortDesc, String longDesc, String imageUrl) {
            this.id = id;
            this.name = name;
            this.shortDesc = shortDesc;
            this.longDesc = longDesc;
            this.imageUrl = imageUrl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortDesc() {
            return shortDesc;
        }

        public void setShortDesc(String shortDesc) {
            this.shortDesc = shortDesc;
        }

        public String getLongDesc() {
            return longDesc;
        }

        public void setLongDesc(String longDesc) {
            this.longDesc = longDesc;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        @Override
        public String toString() {
            return "com.first75494.gymapplication.MainActivity.Training{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", shortDesc='" + shortDesc + '\'' +
                    ", longDesc='" + longDesc + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    '}';
        }
    }
}
