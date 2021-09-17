package cs301.birthdaycake;

import android.graphics.Paint;

public class CakeModel {

    //instance vars
    public boolean candlesLit; //if they are lit or not
    public int candlesNum; //how many are on cake
    public boolean hasFrosting; //if the cake has frosting or not
    public boolean hasCandles; //if the cake has candles or not
    public Paint frostingColor;

    //constructor for CakeModel
    public CakeModel(){
        candlesLit = true;
        candlesNum = 2;
        hasFrosting = true;
        hasCandles = true;
        frostingColor = new Paint();
        frostingColor.setStyle(Paint.Style.FILL);
        frostingColor.setColor(0xFFFFFACD);  //pale yellow
    }

}
