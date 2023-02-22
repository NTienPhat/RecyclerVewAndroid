package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Window;

import com.example.recycler.adapters.CategoryAdapter;
import com.example.recycler.adapters.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private FragmentStateAdapter fragmentStateAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = HomeActivity.this.getWindow();

        window.setStatusBarColor(ContextCompat.getColor(HomeActivity.this, R.color.background));

        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_Pager);
        ViewPageAdapter viewPagerAdapter = new ViewPageAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("FEATURED");
                    break;
                case 1:
                    tab.setText("DEALS");
                    break;
                case 2:
                    tab.setText("CATEGORIES");
                    break;
            }
        }).attach();
    }
}