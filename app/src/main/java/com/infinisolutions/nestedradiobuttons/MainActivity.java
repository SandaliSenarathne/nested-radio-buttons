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

        CustomizedRadioGroup layout = (CustomizedRadioGroup) findViewById(R.id.radioGroup);

        for (Choice choice:choices) {
            View child = getLayoutInflater().inflate(R.layout.choice_with_image_layout, null);

            RadioButton radio = child.findViewById(R.id.radio);
            ImageView img = child.findViewById(R.id.img);

            radio.setText(choice.getChoiceText());
            radio.setChecked(false);

            img.setImageResource(R.drawable.chris);

            layout.addView(child);
        }

        CustomizedRadioGroup layout2 = (CustomizedRadioGroup) findViewById(R.id.radioGroup2);

        for (Choice choice:choices) {
            View child = getLayoutInflater().inflate(R.layout.choice_with_image_layout, null);

            RadioButton radio = child.findViewById(R.id.radio);
            ImageView img = child.findViewById(R.id.img);

            radio.setText(choice.getChoiceText());
            radio.setChecked(false);

            img.setImageResource(R.drawable.tom);

            layout2.addView(child);
        }
    }

}