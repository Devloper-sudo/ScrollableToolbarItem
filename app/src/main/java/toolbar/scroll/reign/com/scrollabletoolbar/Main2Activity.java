package toolbar.scroll.reign.com.scrollabletoolbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    private RecyclerView recycler_view;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.icons_heart, "Hii"));
        itemList.add(new Item(R.drawable.icons_lter, "Hii"));
        itemList.add(new Item(R.drawable.icons_geography, "Hii"));
        itemList.add(new Item(R.drawable.icons_rash, "Hii"));
        itemList.add(new Item(R.drawable.icons_save, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
        itemList.add(new Item(R.drawable.icons_search, "Hii"));
//        itemList.add(new Item("Hii"));
//        itemList.add(new Item("Hii"));
//        itemList.add(new Item("Hii"));
//        itemList.add(new Item("Hii"));
//        itemList.add(new Item("Hii"));
        recycler_view.setAdapter(itemAdapter = new ItemAdapter(itemList));


    }

}
