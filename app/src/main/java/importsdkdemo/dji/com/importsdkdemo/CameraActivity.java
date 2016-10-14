package importsdkdemo.dji.com.importsdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIBaseProduct;
import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
/**
 * Created by Administrator on 2016/10/15 0015.
 */

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //UI

        //Initialize DJI SDK Manager
        //mHandlter = new Handler(Looper.geMainLooper());
        //DJISDKManager.getInstance().initSDKManager(this, mDJISDKManagerCallback);
    }
}
