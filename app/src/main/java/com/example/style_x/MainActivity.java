package com.example.style_x;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeThemeButton = findViewById(R.id.button_theme);
        changeThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentTheme = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
                if (currentTheme == Configuration.UI_MODE_NIGHT_YES) {
                    setTheme(R.style.LightTheme);
                } else {
                    setTheme(R.style.DarkTheme);
                }
                recreate();
            }
        });
    }
}