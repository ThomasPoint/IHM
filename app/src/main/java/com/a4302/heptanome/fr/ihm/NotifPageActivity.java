package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class NotifPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif_page);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        LinearLayout layout = (LinearLayout)findViewById(R.id.layout_for_notifs);
        CustomNotif notif1 = new CustomNotif(this,"Request","Tim","10/11/2017","Je sais pas quoi écrire");
        CustomNotif notif2 = new CustomNotif(this,"Propose","Tim","10/11/2017","Je sais pas quoi écrire de nouveau");

        layout.addView(notif2);layout.addView(notif1);

    }
}