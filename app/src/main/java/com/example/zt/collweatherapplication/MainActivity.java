package com.example.zt.collweatherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zt.collweatherapplication.unit.HttpUnit;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetString();
            }
        });
    }

    public   void GetString()
    {
        HttpUnit.sendOkHttpRequest("http://guolin.tech/api/china", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG", e.getMessage().toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String  resule=response.body().string();
                 Log.i("GSON",resule);

            }
        });
    }
}
