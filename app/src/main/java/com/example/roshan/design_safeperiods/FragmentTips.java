package com.example.roshan.design_safeperiods;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentTips extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private TipsCustomAdapter tipsCustomAdapter;
    private List<TipsItems> tipsItemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tips, container, false);

        tipsItemsList = new ArrayList<>();

        recyclerView = view.findViewById(R.id.recyclerView_tips);
        tipsCustomAdapter = new TipsCustomAdapter(tipsItemsList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(tipsCustomAdapter);
        setData();


        return view;
    }

    private void setData() {
        TipsItems tipsItems = new TipsItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases");
        tipsItemsList.add(tipsItems);

        tipsItems = new TipsItems("DoctorRita", "12/10/2015", "Safety First", "You must be aware about women diseases");
        tipsItemsList.add(tipsItems);

        tipsItems = new TipsItems("DoctorSita", "12/13/2016", "Safety First", "You must be aware about women diseases");
        tipsItemsList.add(tipsItems);

        tipsItems = new TipsItems("DoctorRamit", "05/16/2015", "Safety First", "You must be aware about women diseases");
        tipsItemsList.add(tipsItems);

        tipsItems = new TipsItems("DoctorPunit", "11/06/2018", "Safety First", "You must be aware about women diseases");
        tipsItemsList.add(tipsItems);

    }


}
