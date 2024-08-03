package com.hidayatul.loginapps;

import android.os.Bundle;
import android.widget.TextView;
import com.hidayatul.loginapps.R;
import com.hidayatul.loginapps.User;
import com.hidayatul.loginapps.BaseActivity;

public class ProfileActivity extends BaseActivity {
    private TextView nameTextView;
    private TextView phoneTextView;
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
    }

    @Override
    protected void setupViews() {
        nameTextView = findViewById(R.id.nameTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);

        // Example user
        User user = new User("Anisa Maryam", "0812-8312-9444", "anisa4@gmail.com");

        nameTextView.setText(user.getName());
        phoneTextView.setText(user.getPhone());
        emailTextView.setText(user.getEmail());
    }
}