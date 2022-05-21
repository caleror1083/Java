// Robert Calero
// Phoneword app - Android Studio - Java

package com.example.phoneword;

import android.app.*;
import android.app.Activity;
import android.os.Bundle;
import android.*;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
    {
        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);

                // Set our view from the "main" layout resource
                setContentView(R.layout.activity_main);
                EditText phoneNumberText = findViewById(R.id.PhoneNumberText);
                Button translateButton = findViewById(R.id.TranslateButton);
                TextView translatedPhoneWord = findViewById(R.id.TranslatedPhoneword);

                // Add code to translate number
                String translatedNumber;

                    // Translate user's alphanumeric phone number to numeric

                    Boolean.parseBoolean(translatedNumber = PhoneTranslator.ToNumber(phoneNumberText.getText()));
                    if (IsNullOrWhiteSpace(translatedNumber))
                    {
                        translatedPhoneWord.setText(translatedNumber);
                    }
                    else
                    {
                        translatedPhoneWord.setText(translatedNumber);
                    }

            }

        private boolean IsNullOrWhiteSpace(String translatedNumber)
            {
                return false;
            }
    }