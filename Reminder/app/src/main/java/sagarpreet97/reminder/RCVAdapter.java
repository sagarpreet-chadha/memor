package sagarpreet97.reminder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sagarpreet chadha on 24-07-2016.
 */
public class RCVAdapter extends RecyclerView.Adapter<RCVAdapter.ourHolder> {
        Context mcontext ;
        ArrayList<Reminder_listview_data>  mdata ;
//        listener mlistener ;

public class ourHolder extends RecyclerView.ViewHolder{

    TextView title ;
    TextView desc ;
    ImageView imageView;
    TextView adate ;
    public ourHolder(View v) {
        super(v);
         imageView=(ImageView)v.findViewById(R.id.imageView) ;
         title=(TextView)v.findViewById(R.id.mtitle) ;
        desc=(TextView)v.findViewById(R.id.mdescription) ;
        adate=(TextView)v.findViewById(R.id.maddedon) ;
    }
}

public interface listener{
   // void BatchClick(Batch b) ;
}

    public RCVAdapter(Context context , ArrayList<Reminder_listview_data> batches) {
        mdata=batches ;
        mcontext=context ;
    //    mlistener=l ;
    }

    @Override
    public RCVAdapter.ourHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mcontext).inflate(R.layout.listview_layout , parent , false) ;
        return  (new ourHolder(v)) ;
    }



    @Override
    public void onBindViewHolder(RCVAdapter.ourHolder holder , final int position) {
        final Reminder_listview_data b=mdata.get(position) ;
        holder.title.setText(b.getTitle());
        holder.desc.setText(b.getDesc()+"");
        Bitmap bm=b.getBm() ;
        holder.adate.setText("DATE : "+b.getDate()+" "); ;
        if(bm!=null) {
            holder.imageView.setImageBitmap(bm);
        }

        holder.imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                /* DatabaseHelper helper = new DatabaseHelper(mcontext);
                SQLiteDatabase db = helper.getWritableDatabase();

                //db.delete(DatabaseHelper.DB_TABLE, DatabaseHelper.KEY + "=" +position , null);
                db.delete(DatabaseHelper.DB_TABLE, DatabaseHelper.KEY_TITLE + "=? and " + DatabaseHelper.KEY_DESC + "=?", new String[] { b.getTitle(), b.getDesc()});
                notifyItemRemoved(position);
                   mdata.remove(position) ; */
                return  true ;
            }
        });

    }

    @Override
    public int getItemCount() {
        return mdata.size() ;
    }

}
