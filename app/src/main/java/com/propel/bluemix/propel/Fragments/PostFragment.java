package com.propel.bluemix.propel.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.propel.bluemix.propel.Adapters.PostsAdapter;
import com.propel.bluemix.propel.Data.Item;
import com.propel.bluemix.propel.PostActivity;
import com.propel.bluemix.propel.R;
import com.propel.bluemix.propel.Utils.BlueListApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        final View view = inflater.inflate(R.layout.fragment_posts, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.list_posts);

        List<Item> posts = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();

        int thisYear = calendar.get(Calendar.YEAR);


        int thisMonth = calendar.get(Calendar.MONTH);

        int thisDay = calendar.get(Calendar.DAY_OF_MONTH);


        Item item = new Item(new Date(thisYear, thisMonth, thisDay), "abcd", "asd");


        posts.add(item);
        postsAdapter = new PostsAdapter(posts);

        recyclerView.setAdapter(postsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        FloatingActionButton fab_add_post = (FloatingActionButton) view.findViewById(R.id.fab_add_post);
        fab_add_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(view.getContext(), "FAB pressed", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), PostActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }


}
