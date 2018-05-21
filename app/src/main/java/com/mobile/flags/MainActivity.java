package com.mobile.flags;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.mobile.countryflag.CountryFlag;

public class MainActivity extends AppCompatActivity {

    ImageView ivFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFlag = (ImageView) findViewById(R.id.main_flag);

        final EditText countryCode = (EditText) findViewById(R.id.txt_flag) ;
        Button btnAddFlag = (Button) findViewById(R.id.btn_add_flag);

        btnAddFlag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (countryCode.getText() != null && !countryCode.getText().equals("")){
                    int flagId = new CountryFlag(MainActivity.this).getFlagByCountryCode(countryCode.getText().toString());

                    if (flagId > 0){
                        ivFlag.setImageResource(flagId);
                    }else{
                        Toast.makeText(MainActivity.this, "Tip a valid country code", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}
