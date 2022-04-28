package sg.edu.np.mad.test1mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    private User user = new User("me", "description", 1, true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!");
        TextView username = findViewById(R.id.profileName);
        username.setText(user.name);
        TextView description = findViewById(R.id.description);
        description.setText(user.description);
        Button followBtn = findViewById(R.id.followBtn);
        if (user.followed){
            followBtn.setText("Unfollow");
        }
        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Pressed!");
                if (user.followed){
                    followBtn.setText("Follow");
                    user.followed = false;
                }
                else {
                    followBtn.setText("Unfollow");
                    user.followed = true;
                }
            }
        });

    }
}