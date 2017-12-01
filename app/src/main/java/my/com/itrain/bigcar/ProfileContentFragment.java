package my.com.itrain.bigcar;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileContentFragment extends Fragment {

    private String[] profileItem;

    public ProfileContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_profile_content, container, false);

        ContentAdapter adapter = new ContentAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView icon;
        public TextView item;


        public ViewHolder(LayoutInflater layoutInflater, ViewGroup parent) {

            super(layoutInflater.inflate(R.layout.profile_listview, parent, false));

            icon = (ImageView)itemView.findViewById(R.id.profileIcon);
            item = (TextView) itemView.findViewById(R.id.profileItem);

        }
    }

}
