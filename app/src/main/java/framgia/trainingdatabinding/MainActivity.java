package framgia.trainingdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import framgia.trainingdatabinding.databinding.ActivityMainBinding;
import framgia.trainingdatabinding.model.User;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("abc" , 2);
        Handler handler = new Handler(this);

        binding.setUser(user);
        binding.setHandler(handler);
    }

    public void updateUser(User user) {
        binding.setUser(user);
    }
}
