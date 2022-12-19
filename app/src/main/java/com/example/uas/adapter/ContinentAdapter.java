package com.example.uas.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uas.R;
import com.example.uas.retrofitAPI.ContinentsResult;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ViewHolder> {

    private final ArrayList<ContinentsResult> continentsResults;
    private final Context context;

    public ContinentAdapter(ArrayList<ContinentsResult> continentsResults, Context context) {
        this.continentsResults = continentsResults;
        this.context = context;
    }


    @NonNull
    @Override
    public ContinentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindItem(continentsResults.get(position), context);
    }

    @Override
    public int getItemCount() {
        return continentsResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtContinent,txtCases,txtDeath,txtRecovered;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtContinent=itemView.findViewById(R.id.datContinent);
            txtCases=itemView.findViewById(R.id.datCases);
            txtDeath=itemView.findViewById(R.id.datDeath);
            txtRecovered=itemView.findViewById(R.id.datRecovered);
        }

        void bindItem(ContinentsResult continent, Context context){
            setHtmlText(txtContinent, continent.getContinent());
            setHtmlText(txtCases, String.valueOf(continent.getCases()));
            setHtmlText(txtDeath, String.valueOf(continent.getDeaths()));
            setHtmlText(txtRecovered, String.valueOf(continent.getRecovered()));

//            itemView.setOnClickListener(v -> {
//                Intent continentDetail = new Intent(context, ContinentDetailActivity.class);
//                continentDetail.putExtra("tipe", "continent");
//                continentDetail.putExtra("continent_name", continent.getContinent());
//                context.startActivity(continentDetail);
//            });
        }
    }

    private void setHtmlText(TextView tv, String textValue){
        tv.setText(HtmlCompat.fromHtml("<b>" + textValue + "</b>", HtmlCompat.FROM_HTML_MODE_LEGACY));
    }
}
