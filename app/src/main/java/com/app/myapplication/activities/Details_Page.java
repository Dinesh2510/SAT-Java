package com.app.myapplication.activities;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.app.myapplication.Adapter.AdapterClickListener;
import com.app.myapplication.Adapter.PlayerAdapter;
import com.app.myapplication.R;
import com.app.myapplication.Utlis.CommonFunctions;
import com.app.myapplication.databinding.ActivityDetailsPageBinding;
import com.app.myapplication.retrofit.Response.PlayerDataModelled;
import com.app.myapplication.retrofit.Response.ResponseGame;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Details_Page extends AppCompatActivity {
    ActivityDetailsPageBinding binding;
    ResponseGame object;
    String selected_filter_name = "";
    String str_team_one = "", str_team_two = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();

    }

    public void init() {
        Gson gson = new Gson();
        object = gson.fromJson(getIntent().getStringExtra("myjson"), ResponseGame.class);
        binding.lytTool.imgbck.setOnClickListener(view -> finish());

        //set Data to arraylist for Both Team Data dynamic keys
        ArrayList<ResponseGame.AllTeamData> allTeamsData = new ArrayList<ResponseGame.AllTeamData>(object.getTeams().values());

        binding.lytTool.toolbrLbl.setText(allTeamsData.get(0).getNameShort() + " vs " + allTeamsData.get(1).getNameShort());
        str_team_one = allTeamsData.get(0).getNameShort();
        str_team_two = allTeamsData.get(1).getNameShort();

        //FilterView
        AddFilterOnView(allTeamsData.get(0).getNameShort(), allTeamsData.get(1).getNameShort());

        //set Data to arraylist for team one
        ArrayList<PlayerDataModelled> playerList_teams_one = new ArrayList<PlayerDataModelled>(allTeamsData.get(0).getPlayers().values());

        //set Data to arraylist for team Two
        ArrayList<PlayerDataModelled> playerList_teams_two = new ArrayList<PlayerDataModelled>(allTeamsData.get(1).getPlayers().values());

        //Teams One Data Set
        binding.teamName.setText(allTeamsData.get(0).getNameFull());
        binding.rvTeamOne.setLayoutManager((new LinearLayoutManager(Details_Page.this, LinearLayoutManager.VERTICAL, false)));
        binding.rvTeamOne.setAdapter(new PlayerAdapter(playerList_teams_one, Details_Page.this, new AdapterClickListener() {
            @Override
            public void onItemClick(View view, int pos, Object object) {
                PlayerDataModelled model = (PlayerDataModelled) object;
                showDialogProject(model);
            }
        }));

        //Teams Two Data Set
        binding.teamNameTwo.setText(allTeamsData.get(1).getNameFull());
        binding.rvTeamTwo.setLayoutManager((new LinearLayoutManager(Details_Page.this, LinearLayoutManager.VERTICAL, false)));
        binding.rvTeamTwo.setAdapter(new PlayerAdapter(playerList_teams_two, Details_Page.this, new AdapterClickListener() {
            @Override
            public void onItemClick(View view, int pos, Object object) {
                PlayerDataModelled model = (PlayerDataModelled) object;
                showDialogProject(model);
            }
        }));


    }

    Dialog dialog_details;

    private void showDialogProject(PlayerDataModelled modelled) {
        dialog_details = new Dialog(this);
        dialog_details.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog_details.setContentView(R.layout.dialog_info);
        dialog_details.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog_details.setCancelable(true);

        ((TextView) dialog_details.findViewById(R.id.title)).setText(modelled.getNameFull());
        ((TextView) dialog_details.findViewById(R.id.bating_style)).setText("Batting Style: " + modelled.getBatting().getStyle());
        ((TextView) dialog_details.findViewById(R.id.ball_style)).setText("Bowling Style: " + modelled.getBowling().getStyle());

        (dialog_details.findViewById(R.id.bt_negative)).setOnClickListener(v -> dialog_details.dismiss());
        dialog_details.show();
    }

    private void AddFilterOnView(String team_one, String team_two) {
        binding.lnrrattingFilter.removeAllViews();
        ArrayList<String> rattingList = new ArrayList<>();

        rattingList.add("All");
        rattingList.add(team_one);
        rattingList.add(team_two);


        for (int i = 0; i < rattingList.size(); i++) {
            AddDataonView(rattingList.get(i), i);
        }

    }

    private void AddDataonView(String name, int position) {
        View view = CommonFunctions.CreateDynamicViews(R.layout.item_filter, binding.lnrrattingFilter, Details_Page.this);
        TextView tvrating = view.findViewById(R.id.tvrating);
        tvrating.setText("" + name);
        tvrating.setTag("" + name);
        if (position == 0) {
            onRatingClick(name);
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRatingClick(name);
            }
        });

    }

    private void onRatingClick(String name_filter) {

        for (int i = 0; i < binding.lnrrattingFilter.getChildCount(); i++) {

            View view = binding.lnrrattingFilter.getChildAt(i);

            TextView tvrating = view.findViewById(R.id.tvrating);
            View lnrBackground = view.findViewById(R.id.lnrBackground);

            if (tvrating.getTag().toString().trim().equals(name_filter)) {
                selected_filter_name = name_filter;
                Log.e("TAG_selected_name", "onRatingClick: " + selected_filter_name);
                if (CommonFunctions.checkStringisValid(selected_filter_name)) {
                    if (selected_filter_name.equals("All")) {
                        binding.cardTeamOne.setVisibility(View.VISIBLE);
                        binding.cardTeamTwo.setVisibility(View.VISIBLE);
                    } else if (selected_filter_name.equals(str_team_one)) {
                        binding.cardTeamOne.setVisibility(View.VISIBLE);
                        binding.cardTeamTwo.setVisibility(View.GONE);
                    } else {
                        binding.cardTeamOne.setVisibility(View.GONE);
                        binding.cardTeamTwo.setVisibility(View.VISIBLE);
                    }
                }

                tvrating.setTextColor(CommonFunctions.getColor(this, R.color.white));
                lnrBackground.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#15c727")));
            } else {
                tvrating.setTextColor(CommonFunctions.getColor(this, R.color.grey_60));
                final int sdk = android.os.Build.VERSION.SDK_INT;
                if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                    lnrBackground.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.d_round_corner_item));
                } else {
                    lnrBackground.setBackground(ContextCompat.getDrawable(this, R.drawable.d_round_corner_item));
                }
                lnrBackground.setBackgroundTintList(null);


            }


        }

    }

}