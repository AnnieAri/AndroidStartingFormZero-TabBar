package com.example.ariannie.tabbardemo;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RadioGroup mRg;
    List<Fragment> fragmentList = new ArrayList<> ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mRg = findViewById (R.id.rg_main);
        mRg.setOnCheckedChangeListener (new RadioGroup.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home:
                        changeFragment (HomeFragment.class.getName ());
                        break;
                    case R.id.rb_book:
                        changeFragment (PhoneBookFragment.class.getName ());
                        break;
                    case R.id.rb_find:
                        changeFragment (FindFragment.class.getName ());
                        break;
                    case R.id.rb_me:
                        changeFragment (MeFragment.class.getName ());
                        break;
                }
            }
        });
        if (savedInstanceState == null) {
            changeFragment (HomeFragment.class.getName ());
        }
    }
    public void changeFragment(String tag){
        hideFragment ();
        FragmentTransaction ft = getFragmentManager ().beginTransaction ();
        Fragment fragment = getFragmentManager ().findFragmentByTag (tag);
        if (fragment != null) {
            ft.show (fragment);
        }else{
            if (tag.equals (HomeFragment.class.getName ())){
                fragment = HomeFragment.newInstance ();
            }else if (tag.equals (PhoneBookFragment.class.getName ())) {
                fragment = PhoneBookFragment.newInstance ();
            }else if (tag.equals (FindFragment.class.getName ())) {
                fragment = FindFragment.newInstance ();
            }else if (tag.equals (MeFragment.class.getName ())) {
                fragment = MeFragment.newInstance ();
            }
            fragmentList.add (fragment);
            ft.add (R.id.fl_container,fragment,tag);
        }
        ft.commitAllowingStateLoss ();
    }
    void hideFragment(){
        FragmentTransaction ft = getFragmentManager ().beginTransaction ();
        for (Fragment fm:fragmentList) {
            ft.hide (fm);
        }
        ft.commit ();
    }
}
