package com.example.packyourbag;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    ImageView imgYoutube,imgIstgram;
    TextView txtEmail, txtWebsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About Us");
        imgIstgram=findViewById(R.id.imageInstagram);
        imgYoutube=findViewById(R.id.imageYoutube);
        txtWebsite=findViewById(R.id.txtWebsite);
        txtEmail=findViewById(R.id.txtEmail);

        imgYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtybe.com"));
                startActivity(intent);
            }
        });
        imgIstgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com"));
                startActivity(intent);
            }
        });

        txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+"said.ahmd.cs@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT,"From Back Your Bag");
                    startActivity(intent);
            }
        });
        txtWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://back.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"From Back Your Bag");
                startActivity(intent);
            }
        });

    }


    public boolean onSupportVabigatrUp(){
        onBackPressed();
        return true;
    }
}