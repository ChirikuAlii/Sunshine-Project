package com.example.chiriku.sunshineproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 11/26/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecylcerViewHolder> {
    List<WeatherModel> weatherModelList;


    public RecyclerViewAdapter(List<WeatherModel> weatherModelList) {
        this.weatherModelList = weatherModelList;
    }

    @Override
    public RecylcerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        return new RecylcerViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecylcerViewHolder holder, int position) {
    //mengikat view
        holder.imgWeather.setId(weatherModelList.get(position).getResId());
        holder.txtViewDateDay.setText(weatherModelList.get(position).getDateDay());
        holder.txtViewWeatherInfo.setText(weatherModelList.get(position).getWeatherInfo());
        holder.txtViewTempHigh.setText(weatherModelList.get(position).getTempHigh());
        holder.txtViewTempLow.setText(weatherModelList.get(position).getTempLow());


    }

    @Override
    public int getItemCount() {
        return weatherModelList.size();
    }


    public class RecylcerViewHolder extends  RecyclerView.ViewHolder{
        ImageView imgWeather;
        TextView txtViewDateDay;
        TextView txtViewWeatherInfo;
        TextView txtViewTempHigh;
        TextView txtViewTempLow;

        public RecylcerViewHolder (View itemView){

            super(itemView);


            imgWeather = itemView.findViewById(R.id.imageViewWeather);
            txtViewDateDay = itemView.findViewById(R.id.txt_date_day);
            txtViewWeatherInfo = itemView.findViewById(R.id.txt_Weather);
            txtViewTempHigh = itemView.findViewById(R.id.txt_temperature_high);
            txtViewTempLow = itemView.findViewById(R.id.txt_temperature_low);

        }

    }

}


