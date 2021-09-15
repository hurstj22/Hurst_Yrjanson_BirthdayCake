package cs301.birthdaycake;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{

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


}
