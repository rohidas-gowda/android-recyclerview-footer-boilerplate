/res/layout/activity_main.xml :

```xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.recyclerview.widget.RecyclerView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/recyclerView"
    tools:context=".MainActivity">

</androidx.recyclerview.widget.RecyclerView>

```

/res/layout/normal_item.xml :

```xml

<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.card.MaterialCardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:layout_marginBottom="5dp">

    <TextView
        android:id="@+id/normal_item_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="Recycler View Item"
        android:textStyle="bold"/>

</com.google.android.material.card.MaterialCardView>

```

/res/layout/footer_item.xml :

```xml

<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.card.MaterialCardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:layout_marginTop="5dp"
    android:background="@color/teal_700">

    <TextView
        android:id="@+id/footer_item_text"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:text="Footer View"
        android:textAllCaps="true"
        android:textSize="24sp"
        android:textStyle="bold" />

</com.google.android.material.card.MaterialCardView>

```

MainActivity.java :

```java

package com.andromojo.recyclerviewfooter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> data = new ArrayList<>();
        data.add("Apple");
        data.add("Microsoft");
        data.add("Google");
        data.add("Amazon");
        data.add("HP");
        data.add("Dell");
        data.add("Tesla");
        data.add("Samsung");
        data.add("Sony");
        data.add("Intel");
        data.add("IBM");
        data.add("LG");
        data.add("Panasonic");
        data.add("Facebook");
        data.add("Cisco");
        data.add("Lenovo");

        recyclerView.setAdapter(new FooterAdapter(data, this));
    }
}

```

FooterAdapter.java :

```java

package com.andromojo.recyclerviewfooter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FooterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int FOOTER_VIEW = 1;
    private ArrayList<String> data;
    private Context context;

    public FooterAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public class FooterViewHolder extends ViewHolder{
        public FooterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == FOOTER_VIEW){
            view = LayoutInflater.from(context).inflate(R.layout.footer_item, parent, false);
            FooterAdapter.FooterViewHolder footerViewHolder = new FooterAdapter.FooterViewHolder(view);
            return footerViewHolder;
        }

        view = LayoutInflater.from(context).inflate(R.layout.normal_item, parent, false);
        FooterAdapter.NormalViewHolder normalViewHolder = new FooterAdapter.NormalViewHolder(view);
        return  normalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        try {
            if (holder instanceof FooterAdapter.NormalViewHolder) {
                FooterAdapter.NormalViewHolder normalViewHolder = (FooterAdapter.NormalViewHolder) holder;
                normalViewHolder.bindView(position);
            } else if (holder instanceof FooterAdapter.FooterViewHolder) {
                FooterAdapter.FooterViewHolder footerViewHolder = (FooterAdapter.FooterViewHolder) holder;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        if (data == null) {
            return 0;
        }

        if (data.size() == 0) {
            return 1;
        }
        return data.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == data.size()) {
            return FOOTER_VIEW;
        }
        return super.getItemViewType(position);
    }

    private class ViewHolder extends RecyclerView.ViewHolder{
        TextView normal_item;
        public ViewHolder(View itemView) {
            super(itemView);
            normal_item = (TextView) itemView.findViewById(R.id.normal_item_text);
        }

        public void bindView(int position) {
            normal_item.setText(data.get(position));
        }
    }
}

```
