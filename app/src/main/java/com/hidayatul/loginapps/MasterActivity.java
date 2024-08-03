package com.hidayatul.loginapps;

import android.os.Bundle;
import android.widget.TextView;
import com.hidayatul.loginapps.R;
import com.hidayatul.loginapps.User;
import com.hidayatul.loginapps.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends BaseActivity {

    private TextView masterInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    @Override
    protected void setupViews() {
        masterInfo = findViewById(R.id.masterInfo);

        List<User> userList = getUsers();
        StringBuilder info = new StringBuilder();

        for (User user : userList) {
            info.append("Name: ").append(user.getName()).append("\n")
                    .append("Email: ").append(user.getEmail()).append("\n")
                    .append("Phone: ").append(user.getPhone()).append("\n\n");
        }

        masterInfo.setText(info.toString());
    }

    private List<User> getUsers() {
        // Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("Anisa", "anisa5@gmail.com", "081283129444"));
        users.add(new User("Maryam", "maryam12@gmail.com", "123456789"));
        users.add(new User("Bayu", "bayu456@gmail.com", "0987654321"));
        return users;
    }
}