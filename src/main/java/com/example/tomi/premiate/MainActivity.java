package com.example.tomi.premiate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Sorteo sorteo1 = new Sorteo("Sorteo 1", "Descripcion del sorteo 1", R.drawable.sorteopanacom, this);
        Sorteo sorteo2 = new Sorteo("Sorteo 2", "Descripcion del sorteo 2", R.drawable.sorteopanacom, this);
        Sorteo sorteo3 = new Sorteo("Sorteo 3", "Descripcion del sorteo 3", R.drawable.sorteopanacom, this);
        Sorteo sorteo4 = new Sorteo("Sorteo 4", "Descripcion del sorteo 4", R.drawable.sorteopanacom, this);

        LinearLayout sorteosLayout = (LinearLayout) findViewById(R.id.sorteosLayout);


        sorteosLayout.addView(sorteo1.getView());
        sorteosLayout.addView(sorteo2.getView());
        sorteosLayout.addView(sorteo3.getView());
        sorteosLayout.addView(sorteo4.getView());
    }

}
