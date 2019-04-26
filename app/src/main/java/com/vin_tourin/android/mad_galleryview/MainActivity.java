package com.vin_tourin.android.mad_galleryview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final Context mContext = this;
    private Gallery mGallery;
    private ImageView mSelectedImage;
    private GalleryImageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGallery = (Gallery) findViewById(R.id.gallery_main);
        // Spacing between items
        mGallery.setSpacing(8);

        mSelectedImage = (ImageView) findViewById(R.id.image_view_selected);

        mAdapter = new GalleryImageAdapter(this);
        mGallery.setAdapter(mAdapter);

        mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                mSelectedImage.setImageResource(mAdapter.getItem(pos));
                Toast.makeText(mContext, mAdapter.getItem(pos).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
