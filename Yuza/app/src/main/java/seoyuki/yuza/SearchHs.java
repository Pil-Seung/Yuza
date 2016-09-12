package seoyuki.yuza;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2016-09-07.
 */
public class SearchHs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchhs);
    }

    final String[] arrString = getResources().getStringArray(R.array.경복궁);

}
