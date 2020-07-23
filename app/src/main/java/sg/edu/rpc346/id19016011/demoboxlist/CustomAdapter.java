package sg.edu.rpc346.id19016011.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;


    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivColor = rowView.findViewById(R.id.colorView);
        // Obtain the Android Version information based on the position
        Box currentItem = boxList.get(position);

        // Set values to the TextView to display the corresponding information

        if (currentItem.getColor() == "blue") {
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if (currentItem.getColor() == "orange") {
            ivColor.setImageResource(R.drawable.orange_box);
        }
        else {
            ivColor.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
