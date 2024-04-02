package com.example.navdrawerexample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;
import com.example.navdrawerexample.ListAdapter;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.model;

import java.util.ArrayList;
import java.util.List;
public class driver extends Fragment implements ListAdapter.ItemClickListener {
    RecyclerView rviewList;
    List<model> listdata;
    ListAdapter adapter;

    public driver() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rviewList = view.findViewById(R.id.rvList2);
        listdata = new ArrayList<>();

        model max = new model();
        max.setName("Max Verstappen");
        max.setDesc("RedBull Racing");
        max.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/2col/image.png");
        listdata.add(max);

        model charles = new model();
        charles.setName("Charles Leclerc");
        charles.setDesc("Ferrrari");
        charles.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/2col/image.png");
        listdata.add(charles);

        model cekco = new model();
        cekco.setName("Sergio Perez");
        cekco.setDesc("RedBull Racing");
        cekco.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/2col/image.png");
        listdata.add(cekco);

        model sainz = new model();
        sainz.setName("Carlos Sainz");
        sainz.setDesc("Ferrari");
        sainz.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/2col/image.png");
        listdata.add(sainz);

        model oscar = new model();
        oscar.setName("Oscar Piastri");
        oscar.setDesc("Mclaren");
        oscar.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png.transform/2col/image.png");
        listdata.add(oscar);

        model lando = new model();
        lando.setName("Lando Norris");
        lando.setDesc("Mclaren");
        lando.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png.transform/2col/image.png");
        listdata.add(lando);

        model rusli = new model();
        rusli.setName("George Russell");
        rusli.setDesc("Mercedes");
        rusli.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png.transform/2col/image.png");
        listdata.add(rusli);

        model analso = new model();
        analso.setName("Fernando Alonso");
        analso.setDesc("Aston Martin");
        analso.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/2col/image.png");
        listdata.add(analso);

        model troll = new model();
        troll.setName("Lance Stroll");
        troll.setDesc("Aston Martin");
        troll.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANSTR01_Lance_Stroll/lanstr01.png.transform/2col/image.png");
        listdata.add(troll);

        model hitam = new model();
        hitam.setName("Lewis Hamilton");
        hitam.setDesc("Mercedes");
        hitam.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png.transform/2col/image.png");
        listdata.add(hitam);

        model smoll = new model();
        smoll.setName("Yuki Tsunoda");
        smoll.setDesc("RB");
        smoll.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png.transform/2col/image.png");
        listdata.add(smoll);

        model nico = new model();
        nico.setName("Nico Hulkenberg");
        nico.setDesc("HAAS F1 Team");
        nico.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/N/NICHUL01_Nico_Hulkenberg/nichul01.png.transform/2col/image.png");
        listdata.add(nico);

        model kepin = new model();
        kepin.setName("Kevin Magnussen");
        kepin.setDesc("HAAS F1 Team");
        kepin.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/K/KEVMAG01_Kevin_Magnussen/kevmag01.png.transform/2col/image.png");
        listdata.add(kepin);

        model albono = new model();
        albono.setName("Alexander Albon");
        albono.setDesc("Williams");
        albono.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ALEALB01_Alexander_Albon/alealb01.png.transform/2col/image.png");
        listdata.add(albono);

        model china = new model();
        china.setName("Zhou Guanyu");
        china.setDesc("Kick Sauber");
        china.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GUAZHO01_Guanyu_Zhou/guazho01.png.transform/2col/image.png");
        listdata.add(china);

        model ricci = new model();
        ricci.setName("Daniel Ricciado");
        ricci.setDesc("RB");
        ricci.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/D/DANRIC01_Daniel_Ricciardo/danric01.png.transform/2col/image.png");
        listdata.add(ricci);

        model fivesc = new model();
        fivesc.setName("Esteban Ocon");
        fivesc.setDesc("Alpine");
        fivesc.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png.transform/2col/image.png");
        listdata.add(fivesc);

        model gass = new model();
        gass.setName("Pierre Gasly");
        gass.setDesc("Alpine");
        gass.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png.transform/2col/image.png");
        listdata.add(gass);

        model botAss = new model();
        botAss.setName("Valtteri Bottas");
        botAss.setDesc("Kick Sauber");
        botAss.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/V/VALBOT01_Valtteri_Bottas/valbot01.png.transform/2col/image.png");
        listdata.add(botAss);

        model amrik = new model();
        amrik.setName("Logan Sargent");
        amrik.setDesc("Williams");
        amrik.setImage("https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LOGSAR01_Logan_Sargeant/logsar01.png.transform/2col/image.png");
        listdata.add(amrik);

        rviewList.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ListAdapter(listdata, getContext());
        rviewList.setAdapter(adapter);
        adapter.setClickListener(this);

    }
    @Override
    public void onItemClick(View view, int position) {

    }
}
