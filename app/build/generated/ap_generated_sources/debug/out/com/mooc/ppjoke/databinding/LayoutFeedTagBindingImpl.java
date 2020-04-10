package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedTagBindingImpl extends LayoutFeedTagBinding  {

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
    private final com.google.android.material.button.MaterialButton mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedTagBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private LayoutFeedTagBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (com.google.android.material.button.MaterialButton) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.tagText == variableId) {
            setTagText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTagText(@Nullable java.lang.String TagText) {
        this.mTagText = TagText;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tagText);
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
        int textUtilsIsEmptyTagTextViewGONEViewVISIBLE = 0;
        boolean textUtilsIsEmptyTagText = false;
        java.lang.String tagText = mTagText;

        if ((dirtyFlags & 0x3L) != 0) {



                // read TextUtils.isEmpty(tagText)
                textUtilsIsEmptyTagText = android.text.TextUtils.isEmpty(tagText);
            if((dirtyFlags & 0x3L) != 0) {
                if(textUtilsIsEmptyTagText) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read TextUtils.isEmpty(tagText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyTagTextViewGONEViewVISIBLE = ((textUtilsIsEmptyTagText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView0, tagText);
            this.mboundView0.setVisibility(textUtilsIsEmptyTagTextViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tagText
        flag 1 (0x2L): null
        flag 2 (0x3L): TextUtils.isEmpty(tagText) ? View.GONE : View.VISIBLE
        flag 3 (0x4L): TextUtils.isEmpty(tagText) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}