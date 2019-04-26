package com.vin_tourin.android.mad_galleryview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by pratiksymz on 20/04/19.
 */

public class GalleryImageAdapter extends BaseAdapter {
    private Context mContext;

    // To be shared by MainActivity as well
    public static final Integer[] mImageIds = {
            R.drawable.ic_alarm,
            R.drawable.ic_explore,
            R.drawable.ic_language,
            R.drawable.ic_lock,
            R.drawable.ic_print,
            R.drawable.ic_screen_rotation
    };

    public GalleryImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Integer getItem(int pos) {
        return mImageIds[pos];
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);

        imageView.setImageResource(mImageIds[pos]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        return imageView;
    }
}
