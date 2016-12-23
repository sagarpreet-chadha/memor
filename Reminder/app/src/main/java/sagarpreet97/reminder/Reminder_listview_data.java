package sagarpreet97.reminder;

import android.content.Intent;
import android.graphics.Bitmap;

/**
 * Created by sagarpreet chadha on 21-07-2016.
 */
    public class Reminder_listview_data {
    String title ;
    String desc ;
    Bitmap bm ;
    String date ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    // Integer key ;


    public Reminder_listview_data(String title, String desc, Bitmap bm  , String date) {
        this.title = title;
        this.desc = desc;
        this.bm = bm;
        this.date=date ;
     //   this.key=i ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }
}
