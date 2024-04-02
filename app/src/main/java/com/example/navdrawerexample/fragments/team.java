package com.example.navdrawerexample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;
import com.example.navdrawerexample.ListAdapter;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;
import java.util.List;
public class team extends Fragment implements ListAdapter.ItemClickListener{

    RecyclerView rviewList;
    List<model> listdata;
    ListAdapter adapter;

    public team() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewList = view.findViewById(R.id.rvteam);
        listdata = new ArrayList<>();

        model redbul = new model();
        redbul.setName("REDBULL");
        redbul.setDesc("Verstappen / Perez");
        redbul.setImage("https://yt3.googleusercontent.com/Is_tD_7CrrFtaXucSn1cL70Uo-QiuIimGNNFA8AZlDhGJbALqR_bwhBzk1WBV7Ysi3pvWST0_wg=s176-c-k-c0x00ffffff-no-rj");
        listdata.add(redbul);

        model ferriri = new model();
        ferriri.setName("FERRARI");
        ferriri.setDesc("Leclerc / Sainz");
        ferriri.setImage("https://i.pinimg.com/originals/83/50/c3/8350c3ea38cbd97aef0c96da9460e13b.jpg");
        listdata.add(ferriri);

        model mkrere = new model();
        mkrere.setName("MCLAREN");
        mkrere.setDesc("Piastri / Norris");
        mkrere.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTC0FEER4r-GUdxgLunUPGn6HYZHiG2C3MdeIdqaibMpQ&s");
        listdata.add(mkrere);

        model mrcy = new model();
        mrcy.setName("MERCEDES");
        mrcy.setDesc("Russel / Hamilton");
        mrcy.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRccS6Ttg8J4JkWBiQVbP5DxTpQWRZZhyqkCzPEu1Q47w&s");
        listdata.add(mrcy);

        model martin = new model();
        martin.setName("ASTON MARTIN");
        martin.setDesc("Stroll / Alonso");
        martin.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQ2UTvU4-BTFqK3kWStX5b_kbPkaAPMXg6HzTAr5-vyA&s");
        listdata.add(martin);

        model rb = new model();
        rb.setName("RB");
        rb.setDesc("Ricciardo / Tsunoda");
        rb.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNqp053a6N7Rf4g3M8S3l0AptD5HwB6zJFAL14L-1wug&s");
        listdata.add(rb);

        model haas = new model();
        haas.setName("HAAS F1 TEAM");
        haas.setDesc("Hulkenberg / Magnussen");
        haas.setImage("https://cdn-5.motorsport.com/images/mgl/0ZRgKzM0/s800/haas-logo-1.jpg");
        listdata.add(haas);

        model wili = new model();
        wili.setName("WILLIAMS");
        wili.setDesc("Albon / Sargent");
        wili.setImage("https://cdn.williamsf1.tech/images/fnx611yr/production/adc59954bc768f09b192bc900e5e65c91244c2e0-1052x750.png?w=400&auto=format");
        listdata.add(wili);

        model kick = new model();
        kick.setName("KICK SAUBER");
        kick.setDesc("Zhou / Bottas");
        kick.setImage("https://www.velocitynews.co.nz/wp-content/uploads/2024/01/Stake-F1-Team.jpg");
        listdata.add(kick);

        model paroenk = new model();
        paroenk.setName("ALPINE");
        paroenk.setDesc("Gasly / Ocon");
        paroenk.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQMy80yromASBJP0iifIfM790f4MjO-yvoT6dN89972g&s");
        listdata.add(paroenk);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdata, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);
    }
    @Override
    public void onItemClick(View view, int position) {

    }
}
