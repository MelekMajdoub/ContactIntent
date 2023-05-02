package com.example.epicontactintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ContactIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_itent);

        ListView intentListView = (ListView) findViewById(R.id.listview1);

        // Définir, Un ArrayList Pour Sauvegarder une Liste de type ContactOject
        final ArrayList<ContactObject> list = new ArrayList<ContactObject>();

        //Remplir, 1'ArrayList aveg des objets de type ContactObject
        list.add(new ContactObject("Epi-Tec", "73296860", "contactflepisousse.com", "https://www.www.episousse.com.tn/"));
        list.add(new ContactObject("Epi-MA", "73296060", "contact@episousse.com", "https://www.www.episousse.com.tn/"));

        //Résupirer. les noms des £lénents déja ajoutés
        List<String> listName = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            listName.add(list.get(i).getName());

        }

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(ContactIntentActivity.this, android.R.layout.simple_list_item_1, listName);
        intentListView.setAdapter(adapter);

        intentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
                Intent i = new Intent(ContactIntentActivity.this, ContactPage.class);
                i.putExtra("Object", list.get(position));
                startActivityForResult(i, 0);
            }
        });
    }
}