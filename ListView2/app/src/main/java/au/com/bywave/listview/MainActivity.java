package au.com.bywave.androidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int[] IMAGES = {R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,
            R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,R.drawable.waf,};


    String [] NAMES = {"Activity 1","Activity 2","Activity 3","Activity 4","Activity 5","Activity 6",
            "Activity 7","Activity 8","Activity 9","Activity 10","Activity 11","Activity 12",};

    String [] DESCRIPTIONS = {"Activity 1","Activity 2","Activity 3","Activity 4","Activity 5","Activity 6",
            "Activity 7","Activity 8","Activity 9","Activity 10","Activity 11","Activity 12",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return view;
        }
    }
}
