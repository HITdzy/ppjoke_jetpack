package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedTextBindingImpl extends LayoutFeedTextBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private LayoutFeedTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.TextView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.lines == variableId) {
            setLines((java.lang.Integer) variable);
        }
        else if (BR.feedText == variableId) {
            setFeedText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLines(@Nullable java.lang.Integer Lines) {
        this.mLines = Lines;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.lines);
        super.requestRebind();
    }
    public void setFeedText(@Nullable java.lang.String FeedText) {
        this.mFeedText = FeedText;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.feedText);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer lines = mLines;
        int androidxDatabindingViewDataBindingSafeUnboxLines = 0;
        java.lang.String feedText = mFeedText;
        boolean textUtilsIsEmptyFeedText = false;
        int textUtilsIsEmptyFeedTextViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(lines)
                androidxDatabindingViewDataBindingSafeUnboxLines = androidx.databinding.ViewDataBinding.safeUnbox(lines);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read TextUtils.isEmpty(feedText)
                textUtilsIsEmptyFeedText = android.text.TextUtils.isEmpty(feedText);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyFeedText) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read TextUtils.isEmpty(feedText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyFeedTextViewGONEViewVISIBLE = ((textUtilsIsEmptyFeedText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setMaxLines(androidxDatabindingViewDataBindingSafeUnboxLines);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView0, feedText);
            this.mboundView0.setVisibility(textUtilsIsEmptyFeedTextViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lines
        flag 1 (0x2L): feedText
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(feedText) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(feedText) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}