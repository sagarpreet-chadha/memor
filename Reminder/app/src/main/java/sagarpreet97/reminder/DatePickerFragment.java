package sagarpreet97.reminder;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by sagarpreet chadha on 24-07-2016.
 */
public  class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    Datelistener mlistener ;

    void setMlistener(Datelistener listener)
    {
        mlistener=listener ;
    }

    public DatePickerFragment() {
    }

    public  interface Datelistener{
        void getDate(int year, int month, int day);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
         DatePickerDialog db= new DatePickerDialog(getActivity(), this, year, month, day);

        return db ;
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user


        mlistener.getDate(year, month, day);

    }
}
