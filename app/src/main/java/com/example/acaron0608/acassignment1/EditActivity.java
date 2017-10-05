package com.example.acaron0608.acassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.ACAssignment1.NAME";
    public static final String EXTRA_MOTTO = "com.example.ACAssignment1.MOTTO";
    public static final String EXTRA_PLAT = "com.example.ACAssignment1.PLAT";
    public static final String EXTRA_GENRE = "com.example.ACAssignment1.GENRE";
    public static final String EXTRA_TAG = "com.example.ACAssignment1.TAG";
    public static final String EXTRA_EDIT = "com.example.ACAssignment1.EXTRA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    public void saveProfile(View view) {
       Intent save = new Intent(this, MainActivity.class);
        EditText txtName = (EditText) findViewById(R.id.txtName);
        String name= txtName.getText().toString();
        EditText txtMotto = (EditText) findViewById(R.id.txtMotto);
        String motto = txtMotto.getText().toString();
        EditText txtPlatform = (EditText) findViewById(R.id.txtPlatform);
        String platform = txtPlatform.getText().toString();
        EditText txtGenre = (EditText) findViewById(R.id.txtGenre);
        String genre = txtGenre.getText().toString();
        EditText txtTag = (EditText) findViewById(R.id.txtTag);
       String tag = txtTag.getText().toString();
        Toast t = Toast.makeText(this, "Profile changes saved!!", Toast.LENGTH_SHORT);
        save.putExtra(EXTRA_NAME, name);
        save.putExtra(EXTRA_MOTTO, motto);
        save.putExtra(EXTRA_PLAT, platform);
        save.putExtra(EXTRA_GENRE, genre);
        save.putExtra(EXTRA_TAG, tag);
        t.show();
        startActivity(save);
    }
    public void cancel(View view) {
        Intent cancel = new Intent(this, MainActivity.class);
        startActivity(cancel);
    }
}
