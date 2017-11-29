package my.com.itrain.bigcar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class ExploreContentFragment extends Fragment {

    public ExploreContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore_content, container, false);

        CarouselPicker carouselPicker = (CarouselPicker) view.findViewById(R.id.trend);
        List<CarouselPicker.PickerItem> itemsImages = new ArrayList<>();
        itemsImages.add(new CarouselPicker.DrawableItem(R.drawable.johor));
        itemsImages.add(new CarouselPicker.DrawableItem(R.drawable.melaka));
        itemsImages.add(new CarouselPicker.DrawableItem(R.drawable.penang));
        CarouselPicker.CarouselViewAdapter imageAdapter = new CarouselPicker.CarouselViewAdapter(this.getContext(),itemsImages,0);
        carouselPicker.setAdapter(imageAdapter);

        return view;
    }

}
