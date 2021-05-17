package com.example.discover.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.discover.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_cse, "Computer Science", "The Department of Computer Science and Engineering at the Indian Institute of Technology Guwahati was formed in the year 1995 and provides an outstanding research environment complemented by excellence in teaching."));
        list.add(new BranchModel(R.drawable.ic_math, "Mathematics And Computing","The Department of Mathematics at IIT Guwahati, since its very inception in 1995, has strived to be a centre of excellence in mathematics and computing, and it has been vigorously engaged in research, teaching and training."));
        list.add(new BranchModel(R.drawable.ic_ee, "Electrical Engineering", "The department was established during the inception of the institute in 1995 as the department of Electronics and Communication Engineering (ECE). Since its commencement, the primary objective of the department has been to impart quality education, training and research at the undergraduate, postgraduate and doctoral levels in various areas of Electronics and Communication Engineering with broad emphasis on design aspects of electronic systems."));
        list.add(new BranchModel(R.drawable.ic_mech, "Mechanical Engineering", "The department of mechanical engineering, being one of the largest and oldest departments of the institute, caters to its students with class tutorial and state-of-the-art laboratories. The department is continuously striving to achieve excellence in education, academic and industry oriented research as well as consultancy work with service to the society."));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/discover-app-299cd.appspot.com/o/IITG.jpg?alt=media&token=ec4e923a-4a51-4c3d-8961-78f55e2574a6")
                .into(imageView);

        return view;
    }
}