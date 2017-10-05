package com.example.acaron0608.acassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lblName = (TextView)findViewById(R.id.txtName);
        TextView lblMotto = (TextView)findViewById(R.id.txtMotto);
        TextView lblGenre = (TextView)findViewById(R.id.txtGenre);
        TextView lblPlatform = (TextView)findViewById(R.id.txtPlatform);
        TextView lblTag = (TextView)findViewById(R.id.txtTag);
        Intent get = getIntent();
        String name = get.getStringExtra(EditActivity.EXTRA_NAME);
        String motto = get.getStringExtra(EditActivity.EXTRA_MOTTO);
        String genre = get.getStringExtra(EditActivity.EXTRA_GENRE);
        String platform = get.getStringExtra(EditActivity.EXTRA_PLAT);
        String tag = get.getStringExtra(EditActivity.EXTRA_TAG);
        lblName.setText(name);
        lblMotto.setText(motto);
        lblGenre.setText(genre);
        lblPlatform.setText(platform);
        lblTag.setText(tag);

    }

    public void editProfile (View view){
        Intent edit = new Intent(this, EditActivity.class);
        startActivity(edit);
    }
    public void logOut (View view) {
        Intent logOut = new Intent(this, LoginActivity.class);
        startActivity(logOut);
    }
}
