package com.libreoffice.id.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.libreoffice.id.R;
import com.libreoffice.id.contracts.HomeContract;

/**
 * Created by rhony on 11/27/16.
 */

public class BookmarksFragment extends BaseFragment{

    private HomeContract.View homeViews;

    public static BookmarksFragment newInstance(HomeContract.View homeViews,@NonNull String fragmentTitle){
        BookmarksFragment fragment = new BookmarksFragment();
        fragment.homeViews = homeViews;
        fragment.fragmentTitle = fragmentTitle;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bookmarks, container, false);
    }
}
