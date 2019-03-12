package com.example.edictionary;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DictionaryFragment extends Fragment {
    private String value= "Hello!!";

    private ListView listView;

    private FragmentListener listener;
    public DictionaryFragment(){

    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dictionary,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

   //     Button myButton = (Button)view.findViewById(R.id.ButtonId);
     //   myButton.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View v) {
           //     if(listener!=null)
             //   listener.onItemClick(value);

           // }
        //});

        ListView listView = view.findViewById(R.id.ListId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,getListOfWords());
        listView.setAdapter(adapter);
    }
    String[] getListOfWords() {
        String[] source = new String[]{
                "Alphabet"
                , "A"
                , "B"
                , "C"
                , "D"
                , "E"
                , "F"
                , "G"
                , "H"
                , "I"
                , "J"
                , "K"
                ,"L"
        };
        return source;
    }

    public void setOnFragmentListener(FragmentListener listener){
        this.listener= listener;
    }
}
