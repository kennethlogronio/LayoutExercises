package com.inducesmile.androidgsonparser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView gymIdentification;
    public TextView gymName;
    public TextView gymVersion;
    public TextView gymSchedules;
    public TextView gymWeek;
    public TextView gymWeekday;
    public TextView gymPauses;
    public TextView gymAutostartcount;
    public TextView gymFailedsessioncount;
    public TextView gymNumberofdays;
    public TextView gymStartedthismonth;
    public TextView gymLastonline;
    public TextView gymIosVersion;
    public TextView gymDevice;


    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        gymIdentification = (TextView)itemView.findViewById(R.id.gym_identification);
        gymName = (TextView)itemView.findViewById(R.id.gym_name);
        gymVersion = (TextView)itemView.findViewById(R.id.gym_version);
        gymSchedules = (TextView) itemView.findViewById(R.id.gym_schedules);
        gymWeek = (TextView) itemView.findViewById(R.id.gym_week);
        gymWeekday = (TextView) itemView.findViewById(R.id.gym_weekday);
        gymPauses = (TextView) itemView.findViewById(R.id.gym_pauses);
        gymAutostartcount = (TextView) itemView.findViewById(R.id.gym_autostartcount);
        gymFailedsessioncount = (TextView) itemView.findViewById(R.id.gym_failedsessioncount);
        gymNumberofdays = (TextView) itemView.findViewById(R.id.gym_numberofdays);
        gymStartedthismonth = (TextView) itemView.findViewById(R.id.gym_startedthismonth);
        gymLastonline = (TextView) itemView.findViewById(R.id.gym_lastonline);
        gymIosVersion = (TextView) itemView.findViewById(R.id.gym_iosversion);
        gymDevice = (TextView) itemView.findViewById(R.id.gym_device);


    }

    @Override
    public void onClick(View view) {

    }
}
