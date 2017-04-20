package framgia.trainingdatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.View;

import framgia.trainingdatabinding.databinding.ActivityMainBinding;
import framgia.trainingdatabinding.model.User;

/**
 * Created by MyPC on 20/04/2017.
 */

public class Handler {
    private MainActivity mActivity;

    public Handler(MainActivity activity) {
        mActivity = activity;
    }

    public void onClickShow(){
        User user = new User("DatChiz" , 22);
        mActivity.updateUser(user);
    }
}
