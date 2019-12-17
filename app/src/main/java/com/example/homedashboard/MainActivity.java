package com.example.homedashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements CardView.OnClickListener{
    private CardView bankCard,ideasCard,addcard,LinksCard,wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bankCard = (CardView) findViewById(R.id.bankCard);
        ideasCard = (CardView) findViewById(R.id.ideasCard);
        addcard = (CardView) findViewById(R.id.addCard);
        LinksCard = (CardView) findViewById(R.id.LinksCard);
        wifiCard = (CardView) findViewById(R.id.wifiCard);


        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addcard.setOnClickListener(this);
        LinksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.bankCard : i = new Intent(this,bank.class); startActivity(i); break;
            case R.id.ideasCard : i = new Intent(this,ideas.class);startActivity(i); break;
            case R.id.addCard : i = new Intent(this,adds.class); startActivity(i);break;
            case R.id.LinksCard : i = new Intent(this,Links.class); startActivity(i);break;
            case R.id.wifiCard : i = new Intent(this,wifi.class);startActivity(i); break;
           default: break;
        }
    }
}
