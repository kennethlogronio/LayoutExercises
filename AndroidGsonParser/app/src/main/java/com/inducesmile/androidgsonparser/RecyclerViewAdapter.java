package com.inducesmile.androidgsonparser;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.gymIdentification.setText("gym_id: " + itemList.get(position).getGymIdentification());
        holder.gymName.setText("name: " + itemList.get(position).getGymName());
        holder.gymVersion.setText("version: " + itemList.get(position).getGymVersion());
        holder.gymSchedules.setText("schedules: " + itemList.get(position).getGymSchedules());
        holder.gymWeek.setText("week: " + itemList.get(position).getGymWeek());
        holder.gymWeekday.setText("weekday: " + itemList.get(position).getGymWeekday());
        holder.gymPauses.setText("pauses: " + itemList.get(position).getGymPauses());
        holder.gymAutostartcount.setText("auto_start_count: " + itemList.get(position).getGymAutostartcount());
        holder.gymFailedsessioncount.setText("failed_session_count: " + itemList.get(position).getGymFailedsessioncount());
        holder.gymNumberofdays.setText("number_of_days_modified_in_seven_days: " + itemList.get(position).getGymVersion());
        holder.gymStartedthismonth.setText("started_this_month: " + itemList.get(position).getGymStartedthismonth());
        holder.gymLastonline.setText("last_online: " + itemList.get(position).getGymLastonline());
        holder.gymIosVersion.setText("ios_version: " + itemList.get(position).getGymIosVersion());
        holder.gymDevice.setText("Device: " + itemList.get(position).getGymdevice());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
