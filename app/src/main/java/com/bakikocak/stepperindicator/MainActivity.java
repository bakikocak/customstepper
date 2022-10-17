package com.bakikocak.stepperindicator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bakikocak.customstepper.StepperIndicator;

public class MainActivity extends AppCompatActivity {

    StepperIndicator indicator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager pager = findViewById(R.id.pager);
        assert pager != null;
        pager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

        indicator = findViewById(R.id.stepper_indicator);
        // We keep last page for a "finishing" page
        indicator.setViewPager(pager, true);

        indicator.addOnStepClickListener(new StepperIndicator.OnStepClickListener() {
            @Override
            public void onStepClicked(int step) {
                pager.setCurrentItem(step, true);
            }
        });

       /* RemixerInitialization.initRemixer(getApplication());
        Remixer.getInstance().setSynchronizationMechanism(new LocalStorage(getApplicationContext()));

        RemixerBinder.bind(this);

        final FloatingActionButton remixerButton = findViewById(R.id.remixerButton);
        RemixerFragment.newInstance().attachToFab(this, remixerButton); */
    }
/*
    @RangeVariableMethod(minValue = 6, maxValue = 70, initialValue = 20)
    public void setLabelSize(Float fontSize) {
        indicator.setLabelSize(fontSize);
    }

    @BooleanVariableMethod(initialValue = true)
    public void showLabels(Boolean showLabels) {
        indicator.showLabels(showLabels);
    }

    @BooleanVariableMethod
    public void showStepNumberInstead(Boolean showStepNumberInstead) {
        indicator.showStepNumberInstead(showStepNumberInstead);
    }

    @BooleanVariableMethod
    public void useBottomIndicator(Boolean useBottomIndicator) {
        indicator.useBottomIndicator(useBottomIndicator);
    }

    @ColorListVariableMethod(limitedToValues = {0xFF00b47c, 0xFF3f51b5, 0xFFf44336})
    public void setIndicatorColor(Integer indicatorColor) {
        indicator.setIndicatorColor(indicatorColor);
    }

    @ColorListVariableMethod(limitedToValues = {0xFF00b47c, 0xFF3f51b5, 0xFFf44336})
    public void setLineDoneColor(Integer lineDoneColor) {
        indicator.setLineDoneColor(lineDoneColor);
    }

    @ColorListVariableMethod(limitedToValues = {Color.BLACK, Color.WHITE, 0xFF00b47c, 0xFF3f51b5, 0xFFf44336})
    public void setLabelColor(Integer labelColor) {
        indicator.setLabelColor(labelColor);
    } */

}
