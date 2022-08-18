package com.example.door_stop;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.view.Gravity;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //For Dialog pop-up
    Button mDialogButton;
    TextView okay_text, cancel_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning ID of the toolbar to a variable
        Toolbar toolbar = findViewById(R.id.toolbar);

        //using toolbar as Actionbar
        setSupportActionBar(toolbar);

        //to hide the ActionBar title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //menu buttons
        ImageButton HomeButton = (ImageButton) findViewById(R.id.button_home);
                HomeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.i("Menu Item", "Home Button selected");
                        /*Toast t=Toast.makeText(getApplicationContext(),
                                "This a toast message",
                                Toast.LENGTH_LONG);
                        //t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        t.show();*/
                    }
                });

        ImageButton SettingsButton = (ImageButton) findViewById(R.id.button_settings);
        SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Menu Item", "Settings Button selected");
            }
        });

        ImageButton UserButton = (ImageButton) findViewById(R.id.button_user);
        UserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Menu Item", "User Profile Button selected");
            }
        });

        ImageButton AddButton = (ImageButton) findViewById(R.id.button_add);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Menu Item", "Add Device Button selected");
            }
        });

        ImageButton WebButton = (ImageButton) findViewById(R.id.button_web);
        WebButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Menu Item", "Website Button selected");
            }
        });

        ImageButton SendButton = (ImageButton) findViewById(R.id.button_send);
        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Menu Item", "Send/Retrieve Keys Button selected");
            }
        });

       /* //for Dialog pop-up
        mDialogButton = findViewById(R.id.dialogBtn);
        Dialog dialog = new Dialog(MainActivity.this);

        mDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dialog.setContentView(R.layout.dialog_layout);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

                dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

                okay_text = dialog.findViewById(R.id.okay_text);
                cancel_text = dialog.findViewById(R.id.cancel_text);

                okay_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "okay clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });*/

    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked

}