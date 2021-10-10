package rob.myappcompany.backbuttontoolbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BackButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}