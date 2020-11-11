package com.bluehat.mystadion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.bluehat.mystadion.Model.StadionModel;
import com.bluehat.mystadion.Utils.StadionData;
import com.zolad.zoominimageview.ZoomInImageView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.bluehat.mystadion.Utils.Keys.*;

public class DetailActivity extends AppCompatActivity {
    TextView title, chair, location, content;
    CircleImageView img;
    ZoomInImageView img1, img2, img3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar myToolbar = findViewById(R.id.toolbar_Detail);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        title = findViewById(R.id.tvTitle_Detail);
        chair = findViewById(R.id.tvChairs_Detail);
        location = findViewById(R.id.tvLocation_Detail);
        content = findViewById(R.id.tvContent_Detail);
        img = findViewById(R.id.imgImage_Detail);
        img1 = findViewById(R.id.imgContent1_Detail);
        img2 = findViewById(R.id.imgContent2_Detail);
        img3 = findViewById(R.id.imgContent3_Detail);


        int pos = getIntent().getIntExtra(POS,0);
        StadionData data = new StadionData();
        StadionModel stadion = new StadionModel();
        stadion = data.getOnListStadion(pos);

        title.setText(stadion.getTitle());
        chair.setText(stadion.getChairs());
        location.setText(stadion.getLocation());
        content.setText(stadion.getContent());
        img.setImageResource(stadion.getImage(pos, 0));
        img1.setImageResource(stadion.getImage(pos, 0));
        img2.setImageResource(stadion.getImage(pos, 1));
        img3.setImageResource(stadion.getImage(pos, 2));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}