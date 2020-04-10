package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFeedDetailTypeImageBindingImpl extends ActivityFeedDetailTypeImageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_feed_detail_bottom_inateraction"},
            new int[] {3},
            new int[] {com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction});
        sIncludes.setIncludes(1, 
            new String[] {"layout_feed_detail_author_info"},
            new int[] {2},
            new int[] {com.mooc.ppjoke.R.layout.layout_feed_detail_author_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.action_close, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.recycler_view, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFeedDetailTypeImageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityFeedDetailTypeImageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[4]
            , (com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) bindings[2]
            , (com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.FrameLayout) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        authorInfoLayout.invalidateAll();
        interactionLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (authorInfoLayout.hasPendingBindings()) {
            return true;
        }
        if (interactionLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.feed == variableId) {
            setFeed((com.mooc.ppjoke.model.Feed) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFeed(@Nullable com.mooc.ppjoke.model.Feed Feed) {
        updateRegistration(0, Feed);
        this.mFeed = Feed;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.feed);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        authorInfoLayout.setLifecycleOwner(lifecycleOwner);
        interactionLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFeed((com.mooc.ppjoke.model.Feed) object, fieldId);
            case 1 :
                return onChangeAuthorInfoLayout((com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) object, fieldId);
            case 2 :
                return onChangeInteractionLayout((com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFeed(com.mooc.ppjoke.model.Feed Feed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAuthorInfoLayout(com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding AuthorInfoLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInteractionLayout(com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding InteractionLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        com.mooc.ppjoke.model.Feed feed = mFeed;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.authorInfoLayout.setFeed(feed);
            this.interactionLayout.setFeed(feed);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.authorInfoLayout.setFullscreen(false);
            this.authorInfoLayout.setLeftMargin(com.mooc.libcommon.utils.PixUtils.dp2px(60));
            this.interactionLayout.setFullscreen(false);
        }
        executeBindingsOn(authorInfoLayout);
        executeBindingsOn(interactionLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): authorInfoLayout
        flag 2 (0x3L): interactionLayout
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}