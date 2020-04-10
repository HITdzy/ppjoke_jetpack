package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLayoutPublishBindingImpl extends ActivityLayoutPublishBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 1);
        sViewsWithIds.put(R.id.action_close, 2);
        sViewsWithIds.put(R.id.title, 3);
        sViewsWithIds.put(R.id.action_publish, 4);
        sViewsWithIds.put(R.id.input_view, 5);
        sViewsWithIds.put(R.id.input_line, 6);
        sViewsWithIds.put(R.id.action_add_tag, 7);
        sViewsWithIds.put(R.id.action_add_file, 8);
        sViewsWithIds.put(R.id.file_container, 9);
        sViewsWithIds.put(R.id.cover, 10);
        sViewsWithIds.put(R.id.video_icon, 11);
        sViewsWithIds.put(R.id.action_delete_file, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLayoutPublishBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityLayoutPublishBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.mooc.ppjoke.view.PPImageView) bindings[10]
            , (android.widget.FrameLayout) bindings[9]
            , (android.view.View) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.ImageView) bindings[11]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}