package cs301.birthdaycake;

import android.content.Context;
import android.util.AttributeSet;

public class CakeController{

    private CakeView cakeV;
    private CakeModel cakeM;

    public CakeController(CakeView cakeView){
        cakeV = cakeView;
        cakeM = cakeView.getCakeModel();
    }
}
