package com.vietis.codinginstagram.utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final Map<Fragment, Integer> mFragments = new HashMap<>();
    private final Map<String, Integer> mFragmentNumbers = new HashMap<>();
    private final Map<Integer, String> mFragmentNames = new HashMap<>();

    public SectionStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    /**
     * add a fragment
     * @param fragment
     * @param fragmentNames
     */
    public void addFragment(Fragment fragment, String fragmentNames) {
        mFragmentList.add(fragment);
        mFragments.put(fragment, mFragmentList.size() - 1);
        mFragmentNumbers.put(fragmentNames, mFragmentList.size() - 1);
        mFragmentNames.put(mFragmentList.size() - 1, fragmentNames);
    }

    /**
     * returns the fragment with the name @param
     * @param fragmentName
     * @return
     */
    public Integer getFragmentNumber(String fragmentName) {
        if (mFragmentNumbers.containsKey(fragmentName)) {
            return mFragmentNumbers.get(fragmentName);
        }
        return null;
    }

    /**
     * returns the fragment with the name @param
     * @param fragment
     * @return
     */
    public Integer getFragmentNumber(Fragment fragment) {
        if (mFragmentNumbers.containsKey(fragment)) {
            return mFragmentNumbers.get(fragment);
        }
        return null;
    }

    /**
     * returns the fragment with the name @param
     * @param fragmentNumber
     * @return
     */
    public String getFragmentName(Integer fragmentNumber) {
        if (mFragmentNames.containsKey(fragmentNumber)) {
            return mFragmentNames.get(fragmentNumber);
        }
        return null;
    }
}
