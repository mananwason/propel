package com.propel.bluemix.propel.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.propel.bluemix.propel.Adapters.PostsAdapter;
import com.propel.bluemix.propel.Data.Item;
import com.propel.bluemix.propel.R;
import com.propel.bluemix.propel.Utils.BlueListApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MananWason on 27-06-2015.
 */
public class PostFragment extends Fragment {
    BlueListApplication blApplication;
    RecyclerView recyclerView;
    PostsAdapter postsAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_posts, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.list_posts);

        List<Item> posts = new ArrayList<>();
        Item item = new Item("abcd");
        Item item1 = new Item("manan");

        posts.add(item);
        posts.add(item1);
        postsAdapter = new PostsAdapter(posts);

        recyclerView.setAdapter(postsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }


}
