package my.com.itrain.bigcar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import my.com.itrain.bigcar.R;


/**
 * Created by iTrain on 30-Nov-17.
 */

public class ContentAdapter extends RecyclerView.Adapter<ProfileContentFragment.ViewHolder> {

    private static final int LENGTH = 5;
    private final String[] profieItem;
    private final Drawable[] profileIcon;

    public ContentAdapter(Context context) {

        Resources resources = context.getResources();
        profieItem = resources.getStringArray(R.array.profileOption);
        TypedArray typedArray = resources.obtainTypedArray(R.array.profileIcon);
        profileIcon = new Drawable[typedArray.length()];
        for (int i =0; i < profileIcon.length; i++){
            profileIcon[i] = typedArray.getDrawable(i);
        }
        typedArray.recycle();
    }

    @Override
    public ProfileContentFragment.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProfileContentFragment.ViewHolder(LayoutInflater.from(parent.getContext()),parent);
    }

    @Override
    public void onBindViewHolder(ProfileContentFragment.ViewHolder holder, int position) {
        holder.icon.setImageDrawable(profileIcon[position%profileIcon.length]);
        holder.item.setText(profieItem[position%profieItem.length]);
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }
}
