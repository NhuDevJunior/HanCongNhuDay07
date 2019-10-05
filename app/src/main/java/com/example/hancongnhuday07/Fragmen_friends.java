package com.example.hancongnhuday07;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class Fragmen_friends extends Fragment {
    List<Contact> contact;
    ListView ivContact;
    AdapterContact adapterContact;
    LinearLayout addfriend;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_friends,container,false);
        ivContact=view.findViewById(R.id.rvlist);
        addfriend=view.findViewById(R.id.addpersion);
        contact=new ArrayList<>();
        contact.add(new Contact("MRA",""));
        contact.add(new Contact("MRB",""));
        contact.add(new Contact("MRC",""));
        contact.add(new Contact("MRD",""));
        contact.add(new Contact("MRE",""));
        contact.add(new Contact("MRF",""));
        contact.add(new Contact("MRG",""));
        contact.add(new Contact("MRH",""));
        contact.add(new Contact("MRP",""));
        contact.add(new Contact("MRK",""));
        adapterContact=new AdapterContact(contact);
        ivContact.setAdapter(adapterContact);
        addfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),AddorUpdate.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
