package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedDetailTypeVideoBindingImpl extends LayoutFeedDetailTypeVideoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"layout_feed_detail_author_info", "layout_feed_detail_bottom_inateraction", "layout_feed_detail_author_info"},
            new int[] {1, 2, 3},
            new int[] {com.mooc.ppjoke.R.layout.layout_feed_detail_author_info,
                com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction,
                com.mooc.ppjoke.R.layout.layout_feed_detail_author_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player_view, 4);
        sViewsWithIds.put(R.id.recycler_view, 5);
        sViewsWithIds.put(R.id.action_close, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedDetailTypeVideoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutFeedDetailTypeVideoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[6]
            , (com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) bindings[1]
            , (com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding) bindings[2]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) bindings[3]
            , (com.mooc.ppjoke.view.FullScreenPlayerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            );
        this.coordinator.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        authorInfo.invalidateAll();
        bottomInteraction.invalidateAll();
        fullscreenAuthorInfo.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (authorInfo.hasPendingBindings()) {
            return true;
        }
        if (bottomInteraction.hasPendingBindings()) {
            return true;
        }
        if (fullscreenAuthorInfo.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fullscreen == variableId) {
            setFullscreen((java.lang.Boolean) variable);
        }
        else if (BR.feed == variableId) {
            setFeed((com.mooc.ppjoke.model.Feed) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFullscreen(@Nullable java.lang.Boolean Fullscreen) {
        this.mFullscreen = Fullscreen;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fullscreen);
        super.requestRebind();
    }
    public void setFeed(@Nullable com.mooc.ppjoke.model.Feed Feed) {
        updateRegistration(1, Feed);
        this.mFeed = Feed;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.feed);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        authorInfo.setLifecycleOwner(lifecycleOwner);
        bottomInteraction.setLifecycleOwner(lifecycleOwner);
        fullscreenAuthorInfo.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFullscreenAuthorInfo((com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) object, fieldId);
            case 1 :
                return onChangeFeed((com.mooc.ppjoke.model.Feed) object, fieldId);
            case 2 :
                return onChangeBottomInteraction((com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding) object, fieldId);
            case 3 :
                return onChangeAuthorInfo((com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFullscreenAuthorInfo(com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding FullscreenAuthorInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFeed(com.mooc.ppjoke.model.Feed Feed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBottomInteraction(com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBinding BottomInteraction, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAuthorInfo(com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBinding AuthorInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Boolean fullscreen = mFullscreen;
        com.mooc.ppjoke.model.Feed feed = mFeed;

        if ((dirtyFlags & 0x30L) != 0) {
        }
        if ((dirtyFlags & 0x22L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.authorInfo.setFeed(feed);
            this.bottomInteraction.setFeed(feed);
            this.fullscreenAuthorInfo.setFeed(feed);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.authorInfo.setFullscreen(false);
            this.authorInfo.setLeftMargin(com.mooc.libcommon.utils.PixUtils.dp2px(16));
            this.fullscreenAuthorInfo.setLeftMargin(com.mooc.libcommon.utils.PixUtils.dp2px(60));
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.bottomInteraction.setFullscreen(fullscreen);
            this.fullscreenAuthorInfo.setFullscreen(fullscreen);
        }
        executeBindingsOn(authorInfo);
        executeBindingsOn(bottomInteraction);
        executeBindingsOn(fullscreenAuthorInfo);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fullscreenAuthorInfo
        flag 1 (0x2L): feed
        flag 2 (0x3L): bottomInteraction
        flag 3 (0x4L): authorInfo
        flag 4 (0x5L): fullscreen
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}