package com.bluehat.mystadion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bluehat.mystadion.Model.StadionModel;
import com.bluehat.mystadion.Utils.StadionAdapter;

import java.util.ArrayList;

import static com.bluehat.mystadion.Utils.StadionData.getListStadion;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvStadion;
    ArrayList<StadionModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar_Main);
        setSupportActionBar(myToolbar);

        rvStadion = findViewById(R.id.rvStadion_Main);
        rvStadion.setHasFixedSize(true);

        list.addAll(getListStadion());
        show();
    }

    private void show() {
        rvStadion.setLayoutManager(new LinearLayoutManager(this));
        StadionAdapter stadionAdapter = new StadionAdapter(list);
        rvStadion.setAdapter(stadionAdapter);
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
}