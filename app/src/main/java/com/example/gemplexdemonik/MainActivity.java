package com.example.gemplexdemonik;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.gemplexdemonik.adapter.BannerMoviesPagerAdapter;
import com.example.gemplexdemonik.adapter.MainRecyclerAdapter;
import com.example.gemplexdemonik.model.AllCategory;
import com.example.gemplexdemonik.model.BannerMovies;
import com.example.gemplexdemonik.model.CategoryItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> bannerMoviesList;
    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView mainRecycler;
    List<AllCategory> allCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tab_indicator);

        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1, "JLA", "https://external-preview.redd.it/61oHavBFJ7qzhwJSxkTFyAftRJfOsuwm4fJN1cnRls4.png?auto=webp&s=63363937f91a867566edfd0c696224d9c6c5556a", ""));
        bannerMoviesList.add(new BannerMovies(2, "Glass", "https://www.comingsoon.net/assets/uploads/2019/01/Glass.jpg", ""));
        bannerMoviesList.add(new BannerMovies(3, "Alladin", "https://images.wallpapersden.com/image/download/aladdin-2019-movie-banner-8k_a2plaGqUmZqaraWkpJRnamtlrWZpaWU.jpg", ""));

        setBannerMoviesPagerAdapter(bannerMoviesList);
    }

        private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){
            bannerMoviesViewPager=findViewById(R.id.banner_viewPager);
            bannerMoviesPagerAdapter= new BannerMoviesPagerAdapter(this,bannerMoviesList);
            bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);
            tabLayout.setupWithViewPager(bannerMoviesViewPager);
            allCategoryList=new ArrayList<>();

            List<CategoryItem> homeCatListItem1=new ArrayList<>();
            List<CategoryItem> homeCatListItem2=new ArrayList<>();


            homeCatListItem1.add(new CategoryItem(1,"Invincible","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/9f9b22843ffd1c12019a28b39b063d43873bdeaed4ec62bcd70420eae9583ad4._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem1.add(new CategoryItem(2,"The Expanse","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/f29d8f3bfea5ac2c4a8b3e368d1473abf2607d4ec2e023ab560416a1fe4ab611._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem1.add(new CategoryItem(3,"The Big Bang Theory","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/0140eaad88e12c4c6b950ee8639a33e6c23ca411c69f88de6ad99fada84085b6._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem1.add(new CategoryItem(4,"Parks and Recreation","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/f4fdfc9879216a13c40c427dfc8de3f45d53e0f4f4fa7cf9ceee7632cb2cf81c._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem1.add(new CategoryItem(5,"The Powerpuff girls","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/a7c9bfea05595c0c4d8579c901fd150b45c75bc8883fda38cc7f3b332af1a831._UR1920,1080_RI_SX356_FMwebp_.jpg",""));

            homeCatListItem2.add(new CategoryItem(1,"Mad Men","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/007c3b18e99324e8e655d85d83bb48c0308c00499b5b1bebc07eb08de1119951._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem2.add(new CategoryItem(2,"Mr.Robot","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/028f4f4221a6d7095c8995a504598a762b14c3757ad13628062f40e1a9aeab83._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem2.add(new CategoryItem(3,"The Office","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/33e5126cf1654f01894fdd4b06c3bcabca52884db23441e8dbe5f3a25bcfef2a._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem2.add(new CategoryItem(4,"Fringe","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/7b090130d99aa3309355f46aea3047a6faecab1cb41d5642269453d582b63e8d._UR1920,1080_RI_SX356_FMwebp_.jpg",""));
            homeCatListItem2.add(new CategoryItem(5,"House","https://images-eu.ssl-images-amazon.com/images/S/pv-target-images/695deafb541fdcc6354cc8db95e067594a5d2dd4082b033ae0513f753f193fab._UR1920,1080_RI_SX356_FMwebp_.jpg",""));


            allCategoryList.add(new AllCategory(1,"Watch Next",homeCatListItem1));
            allCategoryList.add(new AllCategory(2,"Tv Series",homeCatListItem2));
            //allCategoryList.add(new AllCategory(3,"Kids",));
            setMainRecycler(allCategoryList);

        }

        public void setMainRecycler(List<AllCategory> allCategoryList){
            mainRecycler=findViewById(R.id.main_recycler);
            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
            mainRecycler.setLayoutManager(layoutManager);
            mainRecyclerAdapter=new MainRecyclerAdapter(this,allCategoryList);
            mainRecycler.setAdapter(mainRecyclerAdapter);

        }
    }