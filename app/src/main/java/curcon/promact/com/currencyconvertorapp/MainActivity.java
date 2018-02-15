package curcon.promact.com.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1 ;
    EditText e2;
    EditText e3 ;
    EditText e4 ;
    EditText e5;
    EditText e6;
    EditText e7;
    EditText e8;

    double numInd,numUs,numSwiss,numHun,numRuss,numBah,numMal,numYer;

    // Japnese
    public void onButtonClick(View v) {
        try {

            double n1 = Double.parseDouble(e3.getText().toString());

            numInd = n1 * 0.587;
            e1.setText(Double.toString(numInd));

            numUs = n1 * 0.0091;
            e2.setText(Double.toString(numUs));

            numSwiss = n1 * 0.0085;
            e4.setText(Double.toString(numSwiss));

            numHun = n1 * 2.2851;
            e5.setText(Double.toString(numHun));

            numRuss = n1 * 0.5221;
            e6.setText(Double.toString(numRuss));

            numBah = n1 * 0.0034;
            e7.setText(Double.toString(numBah));

            numMal = n1 * 0.0358;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
        }
    }
    //US Dollar
    public void onUsButton(View v) {
        try {
            double n2 = Double.parseDouble(e2.getText().toString());

            numInd = n2 * 64.2903;
            e1.setText(Double.toString(numInd));

            numYer = n2 * 108.9071;
            e3.setText(Double.toString(numYer));

            numSwiss = n2 * 0.9339;
            e4.setText(Double.toString(numSwiss));

            numHun = n2 * 250.8708;
            e5.setText(Double.toString(numHun));

            numRuss = n2 * 57.4481;
            e6.setText(Double.toString(numRuss));

            numBah = n2 * 0.376;
            e7.setText(Double.toString(numBah));

            numMal = n2 * 3.9126;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Enter a valid number!!",Toast.LENGTH_SHORT).show();
        }
    }

    //Indian
    public void onIndButton(View v) {
        try {
            double n3 = Double.parseDouble(e1.getText().toString());

            numUs = n3 * 0.0155;
            e2.setText(Double.toString(numUs));

            numYer = n3 * 1.6032;
            e3.setText(Double.toString(numYer));

            numSwiss = n3 * 0.0145;
            e4.setText(Double.toString(numSwiss));

            numHun = n3 * 3.9019;
            e5.setText(Double.toString(numHun));

            numRuss = n3 * 0.8941;
            e6.setText(Double.toString(numRuss));

            numBah = n3 * 0.0058;
            e7.setText(Double.toString(numBah));

            numMal = n3 * 0.0608;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }

       //Swiss
    public void onSwissButton(View v) {
        try {
            double n4 = Double.parseDouble(e4.getText().toString());

            numUs = n4 * 1.0706;
            e2.setText(Double.toString(numUs));

            numYer = n4 * 116.6162;
            e3.setText(Double.toString(numYer));

            numInd = n4 * 68.7123;
            e1.setText(Double.toString(numInd));

            numHun = n4 * 267.7758;
            e5.setText(Double.toString(numHun));

            numRuss = n4 * 61.2213;
            e6.setText(Double.toString(numRuss));

            numBah = n4 * 0.4025;
            e7.setText(Double.toString(numBah));

            numMal = n4 * 4.1875;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }

    //Hun
    public void onHunButton(View v) {
        try {
            double n5 = Double.parseDouble(e5.getText().toString());

            numUs = n5 * 0.0032;
            e2.setText(Double.toString(numUs));

            numYer = n5 * 0.4344;
            e3.setText(Double.toString(numYer));

            numInd = n5 * 0.2561;
            e1.setText(Double.toString(numInd));

            numSwiss = n5 * 0.0037;
            e5.setText(Double.toString(numSwiss));

            numRuss = n5 * 0.2288;
            e6.setText(Double.toString(numRuss));

            numBah = n5 * 0.0014;
            e7.setText(Double.toString(numBah));

            numMal = n5 * 0.0156;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }

    //Russia
    public void onRussButton(View v) {
        try {
            double n1 = Double.parseDouble(e6.getText().toString());

            numUs = n1 * 0.01742;
            e2.setText(Double.toString(numUs));

            numYer = n1 * 1.8977;
            e3.setText(Double.toString(numYer));

            numInd = n1 * 1.1197;
            e1.setText(Double.toString(numInd));

            numSwiss = n1 * 0.0163;
            e4.setText(Double.toString(numSwiss));

            numHun = n1 * 4.3702;
            e5.setText(Double.toString(numHun));

            numBah = n1 * 0.0065;
            e7.setText(Double.toString(numBah));

            numMal = n1 * 0.0682;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }

    //Bah
    public void onBahButton(View v) {
        try {
            double n1 = Double.parseDouble(e7.getText().toString());

            numUs = n1 * 2.6595;
            e2.setText(Double.toString(numUs));

            numYer = n1 * 289.5963;
            e3.setText(Double.toString(numYer));

            numInd = n1 * 170.895;
            e1.setText(Double.toString(numInd));

            numSwiss = n1 * 2.4839;
            e4.setText(Double.toString(numSwiss));

            numHun = n1 * 666.9613;
            e5.setText(Double.toString(numHun));

            numRuss = n1 * 152.6183;
            e6.setText(Double.toString(numRuss));

            numMal = n1 * 10.4095;
            e8.setText(Double.toString(numMal));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }

    //Malaysian
    public void onMalButton(View v) {
        try {
            double n1 = Double.parseDouble(e8.getText().toString());

            numUs = n1 * 2.0555;
            e2.setText(Double.toString(numUs));

            numYer = n1 * 27.8328;
            e3.setText(Double.toString(numYer));

            numInd = n1 * 16.4344;
            e1.setText(Double.toString(numInd));

            numSwiss = n1 * 0.2388;
            e4.setText(Double.toString(numSwiss));

            numHun = n1 * 64.1226;
            e5.setText(Double.toString(numHun));

            numRuss = n1 * 14.6633;
            e6.setText(Double.toString(numRuss));

            numBah = n1 * 0.0961;
            e7.setText(Double.toString(numBah));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_SHORT).show();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1 = (EditText)findViewById(R.id.editTextInd);
         e2 = (EditText)findViewById(R.id.editTextUs);
         e3 = (EditText)findViewById(R.id.editTextYer);
         e4 = (EditText)findViewById(R.id.editTextSwiss);
         e5 = (EditText)findViewById(R.id.editTextHun);
         e6 = (EditText)findViewById(R.id.editTextRuss);
         e7 = (EditText)findViewById(R.id.editTextBah);
         e8 = (EditText)findViewById(R.id.editTextMal);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.del, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            // do something here
            e1.setText("");
            e2.getText().clear();
            e3.getText().clear();
            e4.getText().clear();
            e5.getText().clear();
            e6.getText().clear();
            e7.getText().clear();
            e8.getText().clear();
        }
        return super.onOptionsItemSelected(item);
    }
}
