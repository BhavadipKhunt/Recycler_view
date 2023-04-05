package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    String loveshayri[]={"मैं बन जाऊं रेत सनम, "+"\n" +
            "तुम लहर बन जाना…" +"\n"+
            "भरना मुझे अपनी बाहों में " +"\n"+
            "अपने संग ले जाना..!!",
            "मोहब्बत की कहूँ देवी या तुमको बंदगी कह दूँ,"+"\n" +
                    "बुरा मानो न गर हमदम तो तुमको ज़िन्दगी कह दूँ।❤",
            "अच्छा लगता हैं तेरा नाम मेरे नाम के साथ," +"\n"+
                    "जैसे कोई खूबसूरत जगह हो हसीन शाम के साथ।",
            "जी चाहे कि दुनिया की हर एक फ़िक्र भुला कर," +"\n"+
                    "दिल की बातें सुनाऊं तुझे मैं पास बिठाकर।",
            "जी चाहे कि दुनिया की हर एक फ़िक्र भुला कर,"+"\n" +
                    "दिल की बातें सुनाऊं तुझे मैं पास बिठाकर।",
            "ये लकीरें ये नसीब ये किस्मत,सब फ़रेब के आईने हैं," +"\n"+
                    "हाथों में तेरा हाथ होने से ही,मुकम्मल ज़िन्दगी के मायने हैं।",
            "जब तलक तेरा सहारा है मुझे," +"\n"+
                    "गहरा पानी भी किनारा है मुझे,"+"\n" +
                    "ना भी चमके तो कोई बात नही,"+"\n" +
                    "तू तो वैसे भी सितारा है मुझे।",
            "मुसाफर इश्क़ का हूं मैंमेरी मंज़िल मुहब्बत है,"+"\n" +
                    "तेरे दिल में ठहर जाऊंअगर तेरी इजाज़त है।",
            "कर दे नजरे करम मुझ पर,"+"\n" +
                    "मैं तुझपे ऐतबार कर दूं," +"\n"+
                    "दीवाना हूं तेरा ऐसा," +"\n"+
                    "कि दीवानगी की हद को पार कर दूं।",
            "मिल जाओ ऐसे जैसे अंधेरे से उजाले, " +"\n"+
                    "में सवेरा हो जाऊं," +"\n"+
                    "बस जाओ मुझ में रूह बन कर," +"\n"+
                    " में सुनहरा हो जाऊं।।",
            "मेरी इबादत का कोई वक्त,मुकर्रर नही होता…"+"\n" +
                    "तुम ख्यालों में आते हो.." +"\n"+
                    "हम सजदे में बैठ जाते हैं..!!!",
            "अल्फाज़ की शक्ल में एहसास लिखा जाता है," +"\n"+
                    "यहाँ पर पानी को प्यास लिखा जाता है," +"\n"+
                    "मेरे जज़्बात से वाकिफ है मेरी कलम भी,"+"\n"+
                    "प्यार लिखूं तो तेरा नाम लिखाजाता है।"};
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        swipeRefreshLayout=findViewById(R.id.swipe);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuffle();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

    }
    public void shuffle() {
        //Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        Recycler_Adapter recycler_adapter = new Recycler_Adapter(this, loveshayri);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recycler_adapter);

    }
}