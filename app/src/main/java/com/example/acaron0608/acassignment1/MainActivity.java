package com.example.acaron0608.acassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private User user;
    private AppDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lblUser = (TextView)findViewById(R.id.txtUser);
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

        //database testing
       database = AppDatabase.getDatabase(getApplicationContext());
      //  database.userDao().removeAllUsers();
        List<User> users = database.userDao().getAllUser();
      //  if (users.size()==0) {
        //   database.userDao().addUser(new User(2, "Jhin", "Whisper"));
           user = database.userDao().getAllUser().get(0);
         //   Toast.makeText(this, String.valueOf(user.userName), Toast.LENGTH_SHORT).show();
      //  }
        lblUser.setText(String.valueOf(user.userName));

    }

    public void editProfile (View view){
        Intent edit = new Intent(this, EditActivity.class);
        startActivity(edit);
    }
    public void logOut (View view) {
        Intent logOut = new Intent(this, LoginActivity.class);
        startActivity(logOut);
    }
    public void newsPage (View view) {
        Intent news = new Intent(this, NewsActivity.class);
        startActivity(news);
    }
}
