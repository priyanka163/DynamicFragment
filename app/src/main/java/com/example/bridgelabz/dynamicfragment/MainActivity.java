package com.example.bridgelabz.dynamicfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
public void click(View v){
    Fragment frag=null;
    if (v==findViewById(R.id.button_red)){

        frag=new Red();
    }
    else  if (v==findViewById(R.id.button_green)){
        frag=new Green();

    }
    else  if (v==findViewById(R.id.button_yellow)){
        frag=new yellow();
    }
    FragmentManager mng=getFragmentManager();
    FragmentTransaction ft=mng.beginTransaction();
    ft.replace(R.id.fragment,frag);
    ft.commit();

}





}
