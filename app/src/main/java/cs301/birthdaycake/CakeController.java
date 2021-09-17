package cs301.birthdaycake;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import java.util.Random;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener{

    private CakeView cakeV;
    private CakeModel cakeM;
    static public Random rand = new Random();

    public CakeController(CakeView cakeView){
        cakeV = cakeView;
        cakeM = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        cakeM.candlesLit = !cakeM.candlesLit;
        cakeV.invalidate();
        Log.d("blowOutButton", "Pressed!");
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch(compoundButton.getId()) {
            case (R.id.candleSwitch):
                cakeM.hasCandles = !cakeM.hasCandles;
                cakeV.invalidate();
                break;
            case (R.id.frostingSwitch):
                cakeM.frostingColor.setARGB(255, rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
                cakeV.invalidate();
                break;
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeM.candlesNum = i; //change the number of candles to be equal to the seek bars progress
        cakeV.invalidate(); //redraw cakeView

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
