package com.example.movies.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.model.MovieModel;
import com.example.movies.DetailMovieView;
import com.example.movies.R;

import java.util.List;

/**
 * Author by Alif Ayatulloh Ar-Rizqy, Time 8:10 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class RecyclerViewAdapter<C> extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<MovieModel> mData;

    public RecyclerViewAdapter(Context mContext, List<MovieModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_movie, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, final int position) {
        holder.tv_titleMovie.setText(mData.get(position).getTitle());
        holder.img_movie.setImageResource(mData.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailMovieView.class);

                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Genre", mData.get(position).getGenre());
                intent.putExtra("Sinopsis", mData.get(position).getSinopsis());
                intent.putExtra("Image", mData.get(position).getImage());
                intent.putExtra("VideoURL", mData.get(position).getVideoURL());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_titleMovie;
        ImageView img_movie;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_titleMovie = itemView.findViewById(R.id.movie_title);
            img_movie = itemView.findViewById(R.id.movie_img);
            cardView = itemView.findViewById(R.id.cardView_item);
        }
    }
}
