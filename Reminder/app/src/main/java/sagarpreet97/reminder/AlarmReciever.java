package sagarpreet97.reminder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class AlarmReciever extends BroadcastReceiver {
    public AlarmReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        Toast.makeText(context, "DTU MESS FOOD", Toast.LENGTH_LONG).show();

        Intent notificationIntent = new Intent(context, MainActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent iintent = PendingIntent.getActivity(context, 0,
                notificationIntent, 0);



        NotificationCompat.Builder builder=new NotificationCompat.Builder(context) ;
        builder.setContentText("You have set a Notificaion on for today . Check it out .").setTicker("Alarm")
        .setContentTitle("memor Notification")
        .setAutoCancel(true)
                .setSmallIcon(R.drawable.faq)
        .setDefaults(NotificationCompat.DEFAULT_ALL).setContentIntent(iintent);

        NotificationManager manager=(NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE) ;
        manager.notify(1 , builder.build());

    }
}
