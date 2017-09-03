package com.example.movieparsing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sak on 30-Aug-17.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    ArrayList<MovieModel> mlistMovies;

    public DataAdapter(ArrayList<MovieModel> listMovies){
        mlistMovies = listMovies;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.txtViewMovieRank.setText(mlistMovies.get(position).getRank());
        holder.txtViewMovieName.setText(mlistMovies.get(position).getMov_name());
    }

    @Override
    public int getItemCount() {
        return mlistMovies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtViewMovieRank;
        TextView txtViewMovieName;

        public ViewHolder(View itemView) {
            super(itemView);

            txtViewMovieRank = (TextView) itemView.findViewById(R.id.movie_rank);
            txtViewMovieName = (TextView) itemView.findViewById(R.id.movie_name);
        }
    }
}
