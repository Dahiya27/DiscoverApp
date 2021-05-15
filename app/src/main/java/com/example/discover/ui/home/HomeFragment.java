package com.example.discover.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.discover.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(3);


        setSliderViews();

        map = view.findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Indian Institute of Technology Guwahati");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {
        for (int i=0; i<5; i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/HomeImagesUserApp%2F10430403956010fa94a1669.png?alt=media&token=b78e1551-d719-4485-a285-e054f2c475bb");
                    sliderView.setDescription("72nd Republic Day Celebration at IIT Guwahati");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/HomeImagesUserApp%2F10024780115eeb104c741d9.png?alt=media&token=1d3beaf4-f5ac-4d9b-b305-e748f543a70c");
                    sliderView.setDescription("IIT Guwahati developed high quality and affordable Sterile SPILD VTM kits, RT-PCR kits and RNA isolation kits");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/HomeImagesUserApp%2F5269390555edc8616c963c.png?alt=media&token=503b4b63-6f8a-4355-ac1a-70d540bb25f7");
                    sliderView.setDescription("IIT Guwahati ranked 350th in the Overall World Category and 6th in Overall India Category in the Nature Index Annual Ranking 2020");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/HomeImagesUserApp%2F19896464925ee3408bc8be4.png?alt=media&token=05be8b41-4d53-4498-bf9d-f3d28301fe95");
                    sliderView.setDescription("NIRF - 2020 List");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/HomeImagesUserApp%2F13125047805eafa5284c557.png?alt=media&token=13ad60c0-6a62-4b32-b5bf-94a307109ef6");
                    sliderView.setDescription("IIT Guwahati's COVID Initiatives");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY);

            sliderLayout.addSliderView(sliderView);
        }

    }
}