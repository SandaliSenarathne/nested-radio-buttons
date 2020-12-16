package com.infinisolutions.nestedradiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Choice[] choices = new Choice[4];
        choices[0] = new Choice(1, 1, "Spider Man", "http://fakeUrl", true);
        choices[1] = new Choice(1, 2, "Bat Man", "http://fakeUrl", false);
        choices[2] = new Choice(1, 3, "Iron Man", "http://fakeUrl", false);
        choices[3] = new Choice(1, 4, "Super Man", "http://fakeUrl", false);

        View view = getLayoutInflater().inflate(R.layout.activity_main, null);

//        NestedRadioButtons nestedRadioButtons = new NestedRadioButtons(RandomQuiz.this, view, choices);
//        nestedRadioButtons.createRadioGroup();

        createRadioGroup(choices);

    }

    public void createRadioGroup(Choice[] choicess){
        Toast.makeText(this, "testing testing", Toast.LENGTH_SHORT).show();
        LinearLayout layout = (LinearLayout)findViewById(R.id.radioGroup);
        ArrayList<RadioButton> rg = new ArrayList<RadioButton>();
        for (Choice choice:choicess) {
            View child = getLayoutInflater().inflate(R.layout.choice_with_image_layout, null);

            RadioButton radio = child.findViewById(R.id.radio);
            ImageView img = child.findViewById(R.id.img);

            radio.setText(choice.getChoiceText());
            radio.setChecked(false);
            rg.add(radio);
            img.setImageResource(R.drawable.tom);

            child.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    RadioButton radioT = v.findViewById(R.id.radio);
                    for (RadioButton rb:rg) {
                        if (radioT.equals(rb)) {
                            rb.setChecked(true);
                        } else {
                            rb.setChecked(false);
                        }
                    }

                }
            });

            layout.addView(child);
        }
    }

}