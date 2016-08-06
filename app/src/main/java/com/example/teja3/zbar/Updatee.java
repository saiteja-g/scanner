package com.example.teja3.zbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Updatee extends Activity {


    private DBHelper mydb ;

    TextView result5;
    TextView product5 ;
    TextView company5;
    TextView latlong5;
    ProgressBar Pbar;

    int id_To_Update = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Toast.makeText(getApplicationContext(), "1one", Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        /*Toast.makeText(getApplicationContext(), "one2", Toast.LENGTH_LONG).show();

        result5 = (TextView) findViewById(R.id.textView5);
        product5 = (TextView) findViewById(R.id.editTextProduct);
        company5 = (TextView) findViewById(R.id.editTextCompany);
        latlong5 = (TextView) findViewById(R.id.textView7);
        Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_LONG).show();

        mydb = new DBHelper(this);

        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            String Value = extras.getString("resu");
            Toast.makeText(getApplicationContext(), "two", Toast.LENGTH_LONG).show();

            //if(Value>0){
            //means this is the view part not the add contact part.
            Cursor rs = mydb.getDataU(Value);
            //id_To_Update = Value;
            rs.moveToFirst();
            Toast.makeText(getApplicationContext(), "three", Toast.LENGTH_LONG).show();

            String result3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_RESULT));
            String product3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRODUCT));
            String company3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_COMPANY));
            String latlong3 = "Latitude : "+rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_LATITUDE))+"\n"+"Longitude : "+rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_LONGITUDE));
            //latitude3  = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_COMPANY));


            if (!rs.isClosed())
            {
                rs.close();
            }
            //Button b = (Button)findViewById(R.id.button1);
            //b.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(), "four", Toast.LENGTH_LONG).show();

            Pbar = (ProgressBar)findViewById(R.id.progressBar1);
            Pbar.setVisibility(View.INVISIBLE);

            result5.setText((CharSequence)result3);
            result5.setFocusable(false);
            result5.setClickable(false);

            product5.setText((CharSequence)product3);
            product5.setFocusable(false);
            product5.setClickable(false);

            company5.setText((CharSequence)company3);
            company5.setFocusable(false);
            company5.setClickable(false);

            latlong5.setText(latlong3);
            latlong5.setFocusable(false);
            latlong5.setClickable(false);


            //}
        }*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_update, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
