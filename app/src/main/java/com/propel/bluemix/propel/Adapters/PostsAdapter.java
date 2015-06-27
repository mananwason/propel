package com.propel.bluemix.propel.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.propel.bluemix.propel.Data.Item;
import com.propel.bluemix.propel.R;

import java.util.List;

/**
 * Created by MananWason on 27-06-2015.
 */
public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.Viewholder> {

    List<Item> items;

    public PostsAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_items_posts, viewGroup, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(Viewholder viewholder, int i) {
        Item current = items.get(i);
        viewholder.title.setText(current.getGoal());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {
        TextView title;

        public Viewholder(View itemView) {
            super(itemView);
            itemView.setClickable(true);
            title = (TextView) itemView.findViewById(R.id.goal_title);
        }

    }
}
