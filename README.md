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
