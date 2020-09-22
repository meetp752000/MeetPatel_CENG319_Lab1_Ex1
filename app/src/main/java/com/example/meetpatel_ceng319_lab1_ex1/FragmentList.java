package com.example.meetpatel_ceng319_lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentList extends ListFragment {


    public FragmentList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup View = (ViewGroup) inflater.inflate(R.layout.fragment_list2, container, false);
        //list
        String[] list = {getString(R.string.Activity1), getString(R.string.Activity2)};

        //adapter puts the string into simple list item 1 style.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);

        //returning the list
        return (View);
    }


    public void onListItemClick(ListView l, View V, int position, long id) {
        if (position == 0) {
            Intent intent = new Intent(getActivity(), alactivity.class);
            startActivity(intent);
        } else if (position == 1) {
            //i put a extra a by mistake :) sry
            Intent intent2 = new Intent(getActivity(), VRActivity.class);
            startActivity(intent2);
        }

    }
}

