package com.teamcow.wheresmystuff.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.teamcow.wheresmystuff.R;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Button homepageLogoutButton = (Button) findViewById(R.id.logout_button);
        Button itemRegButton = (Button) findViewById(R.id.homepage_item_button);
        Button itemSearchButton = (Button) findViewById(R.id.homepage_search_button);
        homepageLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogout();
            }
        });
        itemRegButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                goToItemReg();
            }
        });
    }

    private void attemptLogout() {
        finish();
    }

    private void goToItemReg() {
        Intent intent = new Intent(HomepageActivity.this, ItemRegActivity.class);
        startActivity(intent);
    }
}
