package top.v4vlviv.evey.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import top.v4vlviv.evey.remindme.fragment.ExampleFragment;

/**
 * Created by Evey on 28.07.2017.
 */

public class TabPagesFragmentAdapter extends FragmentPagerAdapter{

    private String [] tabs;

    public  TabPagesFragmentAdapter(FragmentManager fm)
    {
        super(fm);
        tabs = new String[]{
                "Tab 1","Notification","Tab 2"
        };

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }



    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return ExampleFragment.getInstance();
            case 1: return ExampleFragment.getInstance();
            case 2: return ExampleFragment.getInstance();
           }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
