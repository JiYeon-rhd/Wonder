package org.tensorflow.lite.examples.detection.AR;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.tensorflow.lite.examples.detection.MainActivity;
import org.tensorflow.lite.examples.detection.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_ar#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_ar extends Fragment {
    MainActivity activity;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_ar() {
        // Required empty public constructor
    }
    public void onAttach(Context context){
        super.onAttach(context);
        activity=(MainActivity) getActivity();
    }
    public void onDetach(){
        super.onDetach();
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_ar.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_ar newInstance(String param1, String param2) {
        Fragment_ar fragment = new Fragment_ar();
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
        //return inflater.inflate(R.layout.fragment_ar, container, false);


        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_ar, container, false);


        Button arBtn = (Button) rootview.findViewById(R.id.ar_btn);

        arBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getActivity(),
                        AR_select_item.class
                );

                startActivity(intent);
            }


        });
        return rootview;


    }
}

