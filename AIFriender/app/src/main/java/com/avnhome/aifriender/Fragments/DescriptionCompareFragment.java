package com.avnhome.aifriender.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.avnhome.aifriender.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DescriptionCompareFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DescriptionCompareFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView desc;


    public DescriptionCompareFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DescriptionCompareFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DescriptionCompareFragment newInstance(String param1, String param2) {
        DescriptionCompareFragment fragment = new DescriptionCompareFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description_compare, container, false);
        findViewByIds(view);
        return view;
    }

    private void findViewByIds(View view){
        desc = view.findViewById(R.id.desc_compare_tv);
        desc.setText(R.string.test_description);
    }

}
