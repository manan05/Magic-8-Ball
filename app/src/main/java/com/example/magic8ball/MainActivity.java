package com.example.magic8ball;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton imgBtn;
    TextView tvAnswer;


    public String[] answer =
            {"Don't count on it", "My reply is no", "My sources say no",
                    "Outlook not so good", "Very doubtful", "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
                    "You may rely on it", "As I see it, yes", "Most likely", "Yes",
                    "Signs point to yes", "Reply hazy try again", "Ask again later",
                    "Better not tell you now", "Cannot predict now", "Concentrate and ask again"
            };
    public static final String TAG = "Lame";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn = findViewById(R.id.imgBtn);
        tvAnswer = findViewById(R.id.tvAnswer);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randomNumber;
                Random rand = new Random();
                randomNumber = rand.nextInt(answer.length);
                tvAnswer.setText(answer[rand.nextInt(randomNumber)]);
                Log.d(TAG, "onClick:ded " + randomNumber);
//                    break;

            }
        });
    }
}
