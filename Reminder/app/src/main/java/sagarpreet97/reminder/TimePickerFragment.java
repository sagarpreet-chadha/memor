package sagarpreet97.reminder;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

/**
 * Created by sagarpreet chadha on 24-07-2016.
 */
public  class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

TimeListener mlistener ;

    public TimePickerFragment() {
    }

    public void setMlistener(TimeListener listener){
        mlistener=listener ;
    }

    public interface TimeListener
    {
        void getTime(int hour  , int minute) ;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        mlistener.getTime(hourOfDay , minute);

    }
}
