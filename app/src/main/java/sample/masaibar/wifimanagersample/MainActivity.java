package sample.masaibar.wifimanagersample;

import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);

        final TextView textView = (TextView) findViewById(R.id.text);

        Button buttonCheck = (Button) findViewById(R.id.buttonCheck);
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wifiState = wifiManager.getWifiState();

                textView.setText("WiFi status : " + wifiState);
            }
        });

        Button buttonChange = (Button) findViewById(R.id.buttonChange);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager.setWifiEnabled(!wifiManager.isWifiEnabled());
            }
        });
    }
}
