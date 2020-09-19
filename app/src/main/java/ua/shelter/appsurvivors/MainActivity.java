package ua.shelter.appsurvivors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;
import androidx.transition.TransitionInflater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
Button createButton;
Button offlineModeButton;
TextView textHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);*/

        /*mDrawerLayout.setScrimColor(getResources().getColor(android.R.color.transparent));*/

        createButton = (Button) findViewById(R.id.createButton);
        offlineModeButton = (Button) findViewById(R.id.offlineModeButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        offlineModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        InfoDialog infoDialog = new InfoDialog();
        infoDialog.show(getSupportFragmentManager(), "info dialog");
    }

}