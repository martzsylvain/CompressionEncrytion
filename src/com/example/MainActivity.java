package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Person person = new Person("Martinez", "Sylvain", "0553490732", "6 Allee du clot de pelle bourrut", "0987654321", "1234567890");
            Base64.encodeBytes((person.getTel() + person.getAddress() + person.getNumBlueCard() + person.getNumHealthCard()).getBytes());
    }
}
