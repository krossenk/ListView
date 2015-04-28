package com.krk.exercise3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

import com.krk.exercise3.Adapters.GenbrugAdapter;
import com.krk.exercise3.Model.GenbrugItem;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private GenbrugAdapter mGenbrugAdapter;
    private ListView mListView;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<GenbrugItem> genbrugList = new ArrayList<GenbrugItem>();
        for(int i = 0; i < 1000; i++){
            genbrugList.add(new GenbrugItem("Genbrug #" + (i+1), "Genbrug #" + (i+1) + " is an interesting item", R.drawable.img+i));
        }

        /*
        demoList.set(0, new GenbrugItem("Picker", "This is a demo of using Pickers", "com.leafcastlelabs.demoui.DEMO_PICKER", REQUEST_CODE_DEMO_PICKER));
        demoList.set(1, new GenbrugItem("EditText", "Shows verious EditText inputs", "com.leafcastlelabs.demoui.DEMO_EDIT_TEXT", REQUEST_CODE_DEMO_EDIT_TEXT));
        demoList.set(2, new GenbrugItem("Sliders&Color", "Demonstrates sliders and color", "com.leafcastlelabs.demoui.DEMO_SLIDERS_COLOR", REQUEST_CODE_DEMO_DEMO_SLIDERS_COLOR));
        demoList.set(3, new GenbrugItem("WebView", "Showcasing a web view", "com.leafcastlelabs.demoui.DEMO_WEB", REQUEST_CODE_DEMO_DEMO_WEB));
        */
        mGenbrugAdapter = new GenbrugAdapter(this, genbrugList);
        mListView = (ListView) findViewById(R.id.lv_genbrug);
        mListView.setAdapter(mGenbrugAdapter);
    }

}
