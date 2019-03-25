package com.gratus.biker_app.adapter;

import android.location.Address;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gratus.biker_app.R;
import com.gratus.biker_app.model.UserProfileAdapterModel;
import com.gratus.biker_app.model.UserProfileRegistrationModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserProfileNoEditAdapter extends RecyclerView.Adapter {

    private int ADDRESS = 1;
    private int DESCRIPTION = 2;
    private int IDPROOF = 3;
    private int EMAIL = 4;
    private int HEADER = 5;
    private ArrayList<UserProfileAdapterModel> userProfileAdapterModels;
    private AddressItemViewHolder addressItemViewHolder;
    private DescriptionItemViewHolder descriptionItemViewHolder;
    private IdproofItemViewHolder idproofItemViewHolder;
    private EmailItemViewHolder emailItemViewHolder;
    private HeaderItemViewHolder headerItemViewHolder;

    public UserProfileNoEditAdapter(ArrayList<UserProfileAdapterModel> userProfileAdapterModels) {
        this.userProfileAdapterModels = userProfileAdapterModels;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        if (viewType == ADDRESS){
            itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.user_profile_no_edit_item_tv, null);
            return new AddressItemViewHolder(itemView);
        }
        else if (viewType == DESCRIPTION){
            itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.user_profile_no_edit_item_tv, null);
            return new DescriptionItemViewHolder(itemView);
        }
        else if (viewType == IDPROOF){
            itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.user_profile_no_edit_item_tv, null);
            return new IdproofItemViewHolder(itemView);
        }
        else if (viewType == EMAIL){
            itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.user_profile_no_edit_item_tv, null);
            return new EmailItemViewHolder(itemView);
        }
        else{
            itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.user_profile_no_edit_item_tv, null);
            return new HeaderItemViewHolder(itemView);
        }
    }
    private class AddressItemViewHolder extends RecyclerView.ViewHolder {
        TextView address,header;
        AddressItemViewHolder(View v) {
            super(v);
            address = v.findViewById(R.id.userDetailstv);
            header = v.findViewById(R.id.headertv);
        }
    }
    private class DescriptionItemViewHolder extends RecyclerView.ViewHolder {
        TextView description,header;
        DescriptionItemViewHolder(View v) {
            super(v);
            description = v.findViewById(R.id.userDetailstv);
            header = v.findViewById(R.id.headertv);
        }
    }
    private class EmailItemViewHolder extends RecyclerView.ViewHolder {
        TextView email,header;
        EmailItemViewHolder(View v) {
            super(v);
            email = v.findViewById(R.id.userDetailstv);
            header = v.findViewById(R.id.headertv);
        }
    }
    private class IdproofItemViewHolder extends RecyclerView.ViewHolder {
        TextView iproof,header;
        IdproofItemViewHolder(View v) {
            super(v);
            iproof = v.findViewById(R.id.userDetailstv);
            header = v.findViewById(R.id.headertv);
        }
    }
    private class HeaderItemViewHolder extends RecyclerView.ViewHolder {
        TextView header;
        HeaderItemViewHolder(View v) {
            super(v);
            header = v.findViewById(R.id.headertv);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        UserProfileAdapterModel userProfileAdapterModel = userProfileAdapterModels.get(position);
        Integer layoutType = userProfileAdapterModel.getLayoutType();
        if(layoutType== HEADER){
            headerItemViewHolder = (HeaderItemViewHolder) holder;
            headerItemViewHolder.header.setText(userProfileAdapterModel.getHeader());

        }
        if(layoutType== ADDRESS){
            addressItemViewHolder = (AddressItemViewHolder) holder;
            addressItemViewHolder.header.setText(userProfileAdapterModel.getHeader());
            addressItemViewHolder.address.setText(userProfileAdapterModel.getItemString());

        }
        if(layoutType== EMAIL){
            emailItemViewHolder = (EmailItemViewHolder) holder;
            emailItemViewHolder.header.setText(userProfileAdapterModel.getHeader());
            emailItemViewHolder.email.setText(userProfileAdapterModel.getItemString());
        }
        if(layoutType== IDPROOF){
            idproofItemViewHolder = (IdproofItemViewHolder) holder;
            idproofItemViewHolder.header.setText(userProfileAdapterModel.getHeader());
            idproofItemViewHolder.iproof.setText(userProfileAdapterModel.getItemString());
        }
        if(layoutType== DESCRIPTION){
            descriptionItemViewHolder = (DescriptionItemViewHolder) holder;
            descriptionItemViewHolder.header.setText(userProfileAdapterModel.getHeader());
            descriptionItemViewHolder.description.setText(userProfileAdapterModel.getItemString());
        }
    }

    @Override
    public int getItemCount() {
        return userProfileAdapterModels.size();
    }
    @Override
    public int getItemViewType(int position) {
        return userProfileAdapterModels.get(position).getLayoutType();
    }
}
