package com.infinisolutions.nestedradiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class Method03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method03);

        Choice[] choices = new Choice[4];
        choices[0] = new Choice(1, 1, "Spider Man", "http://fakeUrl", true);
        choices[1] = new Choice(1, 2, "Bat Man", "http://fakeUrl", false);
        choices[2] = new Choice(1, 3, "Iron Man", "http://fakeUrl", false);
        choices[3] = new Choice(1, 4, "Super Man", "http://fakeUrl", false);

        View view = getLayoutInflater().inflate(R.layout.activity_main, null);

        MyRadioGroup layout = (MyRadioGroup) findViewById(R.id.radioGroup);

        for (Choice choice:choices) {
            View child = getLayoutInflater().inflate(R.layout.choice_with_image_layout, null);

            RadioButton radio = child.findViewById(R.id.radio);
            ImageView img = child.findViewById(R.id.img);

            radio.setText(choice.getChoiceText());
            radio.setChecked(false);

            img.setImageResource(R.drawable.chris);

            layout.addView(child);
        }
    }
}