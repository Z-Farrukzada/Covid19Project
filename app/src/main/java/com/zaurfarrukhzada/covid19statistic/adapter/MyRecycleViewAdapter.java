package com.zaurfarrukhzada.covid19statistic.adapter;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.zaurfarrukhzada.covid19statistic.R;
import com.zaurfarrukhzada.covid19statistic.model.Response;

import java.util.ArrayList;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {

     private ArrayList<Response> responseArrayList;



    public MyRecycleViewAdapter ( ArrayList<Response> responseArrayList) {
        this.responseArrayList = responseArrayList;
    }

    @NonNull
    @Override
    public MyRecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleViewAdapter.ViewHolder holder, int position) {
        holder.setData(responseArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return responseArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView continent,country,populs,casesNew,caseActive,caseCritical,caseRecovered,caseM_pop,caseTotal,deathsNew,
                deathsM_pop,deathsTotal,testsM_pop,testsTotal,day,time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            continent = itemView.findViewById(R.id.continentName);
            country = itemView.findViewById(R.id.countryName);
            populs =itemView.findViewById(R.id.WorldPopulation);
            casesNew = itemView.findViewById(R.id.CaseNewName);
            caseActive = itemView.findViewById(R.id.casesActiveName);
            caseCritical=itemView.findViewById(R.id.criticalName);
            caseRecovered=itemView.findViewById(R.id.recoveredName);
            caseM_pop = itemView.findViewById(R.id.M_popName);
            caseTotal = itemView.findViewById(R.id.totalCases);
            deathsNew = itemView.findViewById(R.id.deathsNewName);
            deathsM_pop = itemView.findViewById(R.id.deaths1M_pop);
            deathsTotal = itemView.findViewById(R.id.totalDeaths);
            testsM_pop = itemView.findViewById(R.id.tests1M_pop);
            testsTotal = itemView.findViewById(R.id.testsTotal);
            day = itemView.findViewById(R.id.dayName);
            time = itemView.findViewById(R.id.timeName);


        }
        private void setData(Response response){
           try {
               Response res = response;
                continent.setText(res.getContinent());
                country.setText(res.getCountry());
                populs.setText(Integer.toString(res.getPopulation()));
                casesNew.setText(res.getCases().getNew());
                caseActive.setText(Integer.toString(res.getCases().getActive()));
                caseCritical.setText(Integer.toString(res.getCases().getCritical()));
                caseRecovered.setText(Integer.toString(res.getCases().getRecovered()));
                caseM_pop.setText(res.getCases().get1MPop());
                caseTotal.setText(Integer.toString(res.getCases().getTotal()));
                deathsM_pop.setText(res.getDeaths().get1MPop());
                deathsNew.setText(res.getDeaths().getNew());
                deathsTotal.setText(Integer.toString(res.getDeaths().getTotal()));
                testsM_pop.setText(res.getTests().get1MPop());
                testsTotal.setText(Integer.toString(res.getTests().getTotal()));
                day.setText(res.getDay());
                time.setText(res.getTime());

           }catch (Exception e){
               System.out.println("SystemData"+e.getLocalizedMessage());
           }

        }

    }
}
