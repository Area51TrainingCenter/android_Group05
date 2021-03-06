package com.aea51.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;

public class NuevoListView extends ListView {

	boolean expanded = true;
	
	public NuevoListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public NuevoListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public NuevoListView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public boolean isExpanded()
    {
        return expanded;
    }
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		
		if (isExpanded()) {
			int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
					MeasureSpec.AT_MOST);
			super.onMeasure(widthMeasureSpec, expandSpec);
			ViewGroup.LayoutParams params = getLayoutParams();
	        params.height = getMeasuredHeight();
			
		}
		else {
			super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		}

	}
	
	public void setExpanded(boolean expanded)
    {
        this.expanded = expanded;
    }
	
}
