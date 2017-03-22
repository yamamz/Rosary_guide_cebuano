package com.yamamz.santosrosaryo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;
import com.yamamz.santosrosaryo.MysteryDetails;
import com.yamamz.santosrosaryo.R;
import com.yamamz.santosrosaryo.model.Mystery;

import java.util.List;

/**
 * Created by AMRI on 1/22/2017.
 */

public class mysteryAdapter extends RecyclerView.Adapter<mysteryAdapter.myViewHolder> {

    private Context context;
    private List<Mystery> mysteryList;

    private int mBackground;


    class myViewHolder extends RecyclerView.ViewHolder {
        private TextView day,mystery;
        private ImageView icon;
        final View mView;


        myViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            day=(TextView) itemView.findViewById(R.id.day);
            mystery=(TextView) itemView.findViewById(R.id.mystery);
            icon=(ImageView) itemView.findViewById(R.id.imageView);

        }
    }

    public mysteryAdapter(Context context, List<Mystery> mysteryList) {
        TypedValue mTypedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, mTypedValue, true);
        mBackground = mTypedValue.resourceId;
        this.mysteryList = mysteryList;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mystery_list, parent, false);
        itemView.setBackgroundResource(mBackground);
                return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        final Mystery mystery=mysteryList.get(position);
        holder.day.setText(mystery.getDay());
       holder.day.setTypeface(EasyFonts.robotoBlack(context));
        holder.mystery.setTypeface(EasyFonts.robotoMedium(context));
        holder.mystery.setText(mystery.getMystery());
        holder.icon.setImageResource(mystery.getImage());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MysteryDetails.class);
                intent.putExtra("misteryo", mystery.getMystery());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mysteryList.size();
    }


}
