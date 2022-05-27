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
