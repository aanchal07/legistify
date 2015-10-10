package com.example.aanchal.legistify;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener, CustomDialogFragment.CustomDialogListener {

ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Lawyer> lawyerArrayList=new ArrayList();

        LawyerDBHelper lawyerDBHelper=new LawyerDBHelper(this);
        SQLiteDatabase db= lawyerDBHelper.getWritableDatabase();
        ContentValues cv= new ContentValues();

        Lawyer lawyer1=new Lawyer("Sunil Sharma","Notary","9410395550","S-38, Shivalik Nagar","Mumbai","Maharashtra");
      //  cv.put(LawyerDBContract._ID,"1");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer1.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer1.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER,lawyer1.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer1.address);
        cv.put(LawyerDBContract.COLOUMN_CITY,lawyer1.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer1.state);
        db.insert(LawyerDBContract.TABLE_NAME,null,cv);

        Lawyer lawyer2=new Lawyer("Surendra Rakhashia","Notary","9130927399","H-212, Titanium City Center, Anandnagar Road","Ahmedabad","Gujrat");
       // cv.put(LawyerDBContract._ID,"1");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer2.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer2.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer2.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer2.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer2.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer2.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer3=new Lawyer("Gaurang Yadav","Property","9099018614","Minapark Society, House No 51 , 52, Ghodasar", "Ahmedabad", "Gujrat" );
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer3.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer3.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer3.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer3.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer3.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer3.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer4=new Lawyer("Jha & Associates","Property","9891286947","C-125, Tis Hazari Court", "Delhi", "Delhi");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer4.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer4.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer4.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer4.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer4.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer4.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer5=new Lawyer("AJAY ARORA & ASSOCIATES","Divorce","9717880444","530, 6th Floor, Westend Mall, Janakpuri","Delhi","Delhi");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer5.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer5.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer5.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer5.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer5.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer5.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer6=new Lawyer("JANTLI N JANTLI ADVOCATES & SONS","Divorce","9880994761","237, 14th Cross, M C Layout","Bangalore","Andhra Pradesh");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer6.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer6.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer6.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer6.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer6.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer6.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer7=new Lawyer("CNN Law Associates","Corporate","8066498340","No.24/1, Double Road, K H Road", "Bangalore","Andhra Pradesh");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer7.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer7.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer7.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer7.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer7.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer7.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer8=new Lawyer("Advocate Naveen","Criminal","44-66590378","No 341 / 2, Paper Mills Road, Perambur", "Chennai","Tamil Nadu");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer8.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer8.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer8.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer8.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer8.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer8.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer9=new Lawyer("MD Legal Consultants","Will","9836106080","Queens Mansion, 12, Park Street", "Kolkata","West Bengal");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer9.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer9.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER, lawyer9.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer9.address);
        cv.put(LawyerDBContract.COLOUMN_CITY, lawyer9.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer9.state);
        db.insert(LawyerDBContract.TABLE_NAME, null, cv);

        Lawyer lawyer10=new Lawyer("Sumit Jain","Family","72-2732397","SCO-186-188, Chandigarh Sector 17", "Chandigarh","Chandigarh");
        cv.put(LawyerDBContract.COLOUMN_NAME,lawyer10.name);
        cv.put(LawyerDBContract.COLOUMN_FIELD,lawyer10.field);
        cv.put(LawyerDBContract.COLOUMN_CONTACT_NUMBER,lawyer10.contactNumber);
        cv.put(LawyerDBContract.COLOUMN_ADDRESS,lawyer10.address);
        cv.put(LawyerDBContract.COLOUMN_CITY,lawyer10.city);
        cv.put(LawyerDBContract.COLOUMN_STATE,lawyer10.state);
        db.insert(LawyerDBContract.TABLE_NAME,null,cv);

        db.close();

        /*lawyer1.save();
        lawyer2.save();
        lawyer3.save();
        lawyer4.save();
        lawyer5.save();
        lawyer6.save();
        lawyer7.save();
        lawyer8.save();
        lawyer9.save();
        lawyer10.save();*/

        lawyerArrayList.add(lawyer1);
        lawyerArrayList.add(lawyer2);
        lawyerArrayList.add(lawyer3);
        lawyerArrayList.add(lawyer4);
        lawyerArrayList.add(lawyer5);
        lawyerArrayList.add(lawyer6);
        lawyerArrayList.add(lawyer7);
        lawyerArrayList.add(lawyer8);
        lawyerArrayList.add(lawyer9);
        lawyerArrayList.add(lawyer10);
        lawyerArrayList.add(lawyer1);
        lawyerArrayList.add(lawyer2);
        lawyerArrayList.add(lawyer3);
        lawyerArrayList.add(lawyer4);
        lawyerArrayList.add(lawyer5);
        lawyerArrayList.add(lawyer6);
        lawyerArrayList.add(lawyer7);
        lawyerArrayList.add(lawyer8);
        lawyerArrayList.add(lawyer9);
        lawyerArrayList.add(lawyer10);
        lawyerArrayList.add(lawyer1);
        lawyerArrayList.add(lawyer2);
        lawyerArrayList.add(lawyer3);
        lawyerArrayList.add(lawyer4);
        lawyerArrayList.add(lawyer5);
        lawyerArrayList.add(lawyer6);
        lawyerArrayList.add(lawyer7);
        lawyerArrayList.add(lawyer8);
        lawyerArrayList.add(lawyer9);
        lawyerArrayList.add(lawyer10);
        LawyerAdapter lawyerAdapter= new LawyerAdapter(this,lawyerArrayList, this.getLayoutInflater());
        lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(lawyerAdapter);
        Button button=(Button)findViewById(R.id.loadMore);
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if(id == R.id.action_filter){
            CustomDialogFragment customDialogFragment=new CustomDialogFragment();
            customDialogFragment.show(getFragmentManager(),"Apply Filers");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
       // int index = lv.getV
        lv.smoothScrollBy(500,1000);
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialogFragment, String field, String city, String state) {
       // Toast.makeText(this,field  + city  + state,Toast.LENGTH_LONG).show();
        LawyerDBHelper lawyerDBHelper=new LawyerDBHelper(this);
        SQLiteDatabase db= lawyerDBHelper.getReadableDatabase();
        String[] col={LawyerDBContract.COLOUMN_NAME, LawyerDBContract.COLOUMN_FIELD, LawyerDBContract.COLOUMN_CONTACT_NUMBER,
        LawyerDBContract.COLOUMN_ADDRESS, LawyerDBContract.COLOUMN_CITY, LawyerDBContract.COLOUMN_STATE};
        String selection=null;
        String[] selectionargs=null;
        Cursor c;
        if(field.equals("All") && city.equals("All") && state.equals("All")){
            String orderby=" name ";
            c=db.query(LawyerDBContract.TABLE_NAME,col,null,null,null,null,orderby);
        }
        else{
            if(field.equals("All") && city.equals("All")){
                selection= LawyerDBContract.COLOUMN_STATE + "=?";
                selectionargs= new String[]{state};
            }

            else if(field.equals("All") && !city.equals("All")){
                selection= LawyerDBContract.COLOUMN_CITcd Y + "=?";
                selectionargs= new String[]{city};
            }

            else  if(!field.equals("All") && city.equals("All") && state.equals("All")){
                selection= LawyerDBContract.COLOUMN_FIELD + "=?";
                selectionargs= new String[]{field};
            }

            else  if(!field.equals("All") && city.equals("All") && !state.equals("All")){
                selection= LawyerDBContract.COLOUMN_FIELD + "=?" +" and " + LawyerDBContract.COLOUMN_STATE + "=?";
                selectionargs= new String[]{field,state};
            }

            else  if(!field.equals("All") && !city.equals("All") ){
                selection= LawyerDBContract.COLOUMN_FIELD + "=?" + " and " + LawyerDBContract.COLOUMN_CITY + "=?";
                selectionargs= new String[]{field,city};
            }
            c=db.query(LawyerDBContract.TABLE_NAME,col,selection, selectionargs,null,null,null);

        }

        ArrayList<Lawyer> lawyerlist=new ArrayList<Lawyer>();

        while (c.moveToNext()){
            String lname=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_NAME));
            String lfield=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_FIELD));
            String lcontact=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_CONTACT_NUMBER));
            String laddress=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_ADDRESS));
            String lcity=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_CITY));
            String lstate=c.getString(c.getColumnIndex(LawyerDBContract.COLOUMN_STATE));
            Lawyer lawyer=new Lawyer(lname,lfield,lcontact,laddress,lcity,lstate);
            lawyerlist.add(lawyer);
        }

        LawyerAdapter la=new LawyerAdapter(this, lawyerlist, getLayoutInflater());
        lv.setAdapter(la);

    }
}
