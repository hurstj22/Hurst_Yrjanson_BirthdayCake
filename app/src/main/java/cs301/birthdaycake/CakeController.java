package cs301.birthdaycake;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView cakeV;
    private CakeModel cakeM;

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
        cakeM.hasCandles = !cakeM.hasCandles;
        cakeV.invalidate();

    }
}
