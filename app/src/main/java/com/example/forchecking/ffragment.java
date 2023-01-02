package com.example.forchecking;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ffragment extends Fragment {
    RecyclerView recyclerView;
    List<ModelClass> modelClasses;
    ModelClass modelClassrr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.fragment_ffragment, container, false);

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        modelClasses=new ArrayList<>();

        modelClassrr = new ModelClass("FootBall", R.drawable.ic_baseline_24m);
        modelClasses.add(modelClassrr);

        AdapterTask adapterTask = new AdapterTask(getContext(), modelClasses);
        recyclerView.setAdapter(adapterTask);

        return view;
    }



    }
