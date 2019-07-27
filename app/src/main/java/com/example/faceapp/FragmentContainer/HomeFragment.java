package com.example.faceapp.FragmentContainer;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.faceapp.EnrollFace;
import com.example.faceapp.EnrolmentForm;
import com.example.faceapp.HistoryActivity;
import com.example.faceapp.PresentOther;
import com.example.faceapp.R;
import com.example.faceapp.ScanFace;
import com.google.android.material.card.MaterialCardView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private View view;
    private MaterialCardView presentMe, presentOther, history, enrolment;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        presentMe = (MaterialCardView) view.findViewById(R.id.presentMe);
        presentOther = (MaterialCardView) view.findViewById(R.id.presentOther);
        history = (MaterialCardView) view.findViewById(R.id.history);
        enrolment = (MaterialCardView) view.findViewById(R.id.enrolment);


        presentMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), ScanFace.class));
            }
        });

        presentOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), PresentOther.class));
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), HistoryActivity.class));
            }
        });

        enrolment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), EnrollFace.class));
            }
        });


        return view;
    }

}
