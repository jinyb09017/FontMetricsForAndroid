package net.studymongolian.fontmetrics;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * @author jyb jyb_96@sina.com on 2017/6/23.
 * @version V1.0
 * @Description: add comment
 * @date 16-4-21 11:21
 * @copyright www.tops001.com
 */

public class TextActivity extends AppCompatActivity {
    TextView tv_normal;
    TextView tv_special;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        tv_normal = (TextView) findViewById(R.id.tv_normal);
        tv_special = (TextView) findViewById(R.id.tv_special);

        Paint.FontMetrics fontMetrics1 = tv_normal.getPaint().getFontMetrics();
        Paint.FontMetrics fontMetrics2 = tv_special.getPaint().getFontMetrics();

        Log.e("tv_normal","desent-asend="+(fontMetrics1.descent - fontMetrics1.ascent));
        Log.e("tv_normal","bottom-top="+(fontMetrics1.bottom - fontMetrics1.top));

        Log.e("tv_special","desent-asend="+(fontMetrics2.descent - fontMetrics2.ascent));
        Log.e("tv_special","bottom-top="+(fontMetrics2.bottom - fontMetrics2.top));

        tv_normal.post(new Runnable() {
            @Override
            public void run() {
                Log.e("tv_normal","height="+(tv_normal.getHeight()));
                Log.e("tv_normal","textsize="+(tv_normal.getTextSize()));
                Log.e("tv_special","height="+(tv_special.getHeight()));
                Log.e("tv_special","textsize="+(tv_special.getTextSize()));
            }
        });
    }
}
