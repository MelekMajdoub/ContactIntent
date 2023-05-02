package com.example.epicontactintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactPage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_page);
        TextView contactName= (TextView)findViewById(R.id.contactName);
        TextView contactEmail= (TextView)findViewById(R.id.contactEmail);
        TextView contactPhone= (TextView)findViewById(R.id.contactPhone);
        TextView contactWebsite= (TextView)findViewById(R.id.contactWebsite);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;

        }

        ContactObject co = (ContactObject) getIntent().getSerializableExtra("Object");
        contactName. setText(co.getName());
        contactEmail.setText("Email: "+ co.getEmail());
        contactPhone.setText("Phone: "+ co.getPhone());
        contactWebsite.setText("Website: "+ co.getWebsite());



        }



}
