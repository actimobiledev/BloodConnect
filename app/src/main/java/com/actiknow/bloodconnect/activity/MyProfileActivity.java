package com.actiknow.bloodconnect.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.actiknow.bloodconnect.R;
import com.actiknow.bloodconnect.utils.Constants;
import com.actiknow.bloodconnect.utils.TypefaceSpan;


/**
 * Created by actiknow on 12/1/16.
 */

public class MyProfileActivity extends AppCompatActivity {
    EditText etFirstName;
    EditText etEmail;
    EditText etMobile;
    TextView tvRegisterNewCar;
    TextView tvAddAddress;
    ImageView ivName;
    ImageView ivEmail;
    ImageView ivMobile;
    LinearLayout llRegisteredCars;
    Toolbar toolbar;



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile);
        initView ();
        setUpNavigationDrawer ();
        initData ();
        initListener ();
    }

    private void initView () {
        etFirstName = (EditText) findViewById (R.id.etName);
        etEmail = (EditText) findViewById (R.id.etEmail);
        etMobile = (EditText) findViewById (R.id.etMobile);
        tvRegisterNewCar = (TextView) findViewById (R.id.tvRegisterNewCar);
        ivName = (ImageView) findViewById (R.id.ivName);
        ivEmail = (ImageView) findViewById (R.id.ivEmail);
        ivMobile = (ImageView) findViewById (R.id.ivMobile);
        tvAddAddress = (TextView) findViewById (R.id.tvAddAddress);
        toolbar = (Toolbar) findViewById (R.id.toolbar);
        llRegisteredCars = (LinearLayout) findViewById (R.id.llRegisteredCars);
    }

    private void initData () {

    }

    private void initListener () {
        ivName.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                if (etFirstName.isEnabled ()) {
                    etFirstName.setEnabled (false);
                    ivName.setImageResource (R.drawable.ic_edit);
                } else {
                    etFirstName.setEnabled (true);
                    ivName.setImageResource (R.drawable.ic_cancel);
                }

            }
        });


        ivEmail.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                if (etEmail.isEnabled ()) {
                    etEmail.setEnabled (false);
                    ivEmail.setImageResource (R.drawable.ic_edit);
                } else {
                    etEmail.setEnabled (true);
                    ivEmail.setImageResource (R.drawable.ic_cancel);
                }
            }
        });

        ivMobile.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                if (etMobile.isEnabled ()) {
                    etMobile.setEnabled (false);
                    ivMobile.setImageResource (R.drawable.ic_edit);
                } else {
                    etMobile.setEnabled (true);
                    ivMobile.setImageResource (R.drawable.ic_cancel);
                }
            }
        });

        tvRegisterNewCar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
//                Intent registerIntent = new Intent(MyProfileActivity.this,RegisterUrCarActivity.class);
//                startActivity(registerIntent);
            }
        });
    }

    private void setUpNavigationDrawer () {
        toolbar = (Toolbar) findViewById (R.id.toolbar1);
        toolbar.showOverflowMenu ();
        SpannableString s = new SpannableString ("My Profile");
        s.setSpan (new TypefaceSpan (MyProfileActivity.this, Constants.font_name), 0, s.length (), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        setSupportActionBar (toolbar);
        ActionBar actionBar = getSupportActionBar ();
        try {
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled (false);
            actionBar.setHomeButtonEnabled (false);
            actionBar.setDisplayShowTitleEnabled (true);
            actionBar.setTitle (s);
        } catch (Exception ignored) {
        }
    }
}
