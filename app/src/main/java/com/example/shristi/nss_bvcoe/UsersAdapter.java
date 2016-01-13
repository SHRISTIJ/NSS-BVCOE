package com.example.shristi.nss_bvcoe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class UsersAdapter extends ArrayAdapter<Users> {
    public LayoutInflater mInflater;
    public int mResource;
    public  String link;


    /**
     * Constructor
     *  @param context     The current context.
     * @param resource    The resource ID for a layout file containing a TextView to use when
     *                    instantiating views.
     * @param users The objects to represent in the ListView.
     */
    public UsersAdapter(Context context, int resource, List<Users> users)
    {
        super( context, resource, users );
        mResource = resource;
        mInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public View getView( int position, View convertView, ViewGroup parent )
    {
        View view = convertView == null ? mInflater.inflate( mResource, parent, false ) : convertView;

        TextView UsersNameView = (TextView) view.findViewById( R.id.EventName);
       TextView cuisineView = (TextView) view.findViewById( R.id.Image_Link );
        TextView DescriptionView = (TextView) view.findViewById( R.id.EventDescription );

        Users item = getItem( position );

        UsersNameView.setText( item.getName1() );

        DescriptionView.setText(item.getClasses());
        //String locationsNumberTextTemplate = getContext().getResources().getQuantityString( R.plurals.Users_locations, item.getLocations().size() );
        // locationsNumberView.setText( String.format(locationsNumberTextTemplate, item.getLocations().size()) );
        link =item.getLink();
        cuisineView.setText( link );
        return view;
    }
}
