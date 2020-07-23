package sg.edu.rpc346.id19016011.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ListView lvColor;
        ImageView color;
        ArrayList<Box> alBoxList;
        CustomAdapter caBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor= findViewById(R.id.listViewBox);
        color =findViewById(R.id.colorView);
        alBoxList  = new ArrayList<>();
        alBoxList.add(new Box("blue"));
        alBoxList.add(new Box("orange"));
        alBoxList.add(new Box("brown"));

        caBox= new CustomAdapter(this, R.layout.row,alBoxList);
        lvColor.setAdapter(caBox);


    }
}
