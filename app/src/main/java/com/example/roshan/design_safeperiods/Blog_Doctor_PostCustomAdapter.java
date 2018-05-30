package com.example.roshan.design_safeperiods;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Blog_Doctor_PostCustomAdapter extends RecyclerView.Adapter<Blog_Doctor_PostCustomAdapter.MyCustomViewHolder> {
    private List<Blog_Doctor_PostItems> blog_doctor_postItemsList;


    public Blog_Doctor_PostCustomAdapter(List<Blog_Doctor_PostItems> blog_doctor_postItemsList) {
        this.blog_doctor_postItemsList = blog_doctor_postItemsList;
    }

    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_blogpost,parent,false);
        return new MyCustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {
        Blog_Doctor_PostItems blogDoctorPostItems = blog_doctor_postItemsList.get(position);
        holder.uname.setText(blogDoctorPostItems.getUsername());
        holder.date1.setText(blogDoctorPostItems.getDate());
        holder.title1.setText(blogDoctorPostItems.getTitle());
        holder.description1.setText(blogDoctorPostItems.getDescription());
        holder.comment.setText(blogDoctorPostItems.getComment());
        holder.commentby.setText(blogDoctorPostItems.getCommentby());
    }

    @Override
    public int getItemCount() {
        return blog_doctor_postItemsList.size();
    }

    public class MyCustomViewHolder extends RecyclerView.ViewHolder {
        private TextView uname;
        private TextView date1;
        private TextView title1;
        private TextView description1;
        private EditText comment;
        private TextView commentby;

        public MyCustomViewHolder(View itemView) {
            super(itemView);
            uname = itemView.findViewById(R.id.blog_userid);
            date1 = itemView.findViewById(R.id.blog_postDate);
            title1 = itemView.findViewById(R.id.blog_postTitle);
            description1 = itemView.findViewById(R.id.blog_postDescription);
            comment = itemView.findViewById(R.id.blog_postCommentEditText);
            commentby = itemView.findViewById(R.id.blog_CommentTextView);

        }
    }
}
