package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLayoutTagFeedListBindingImpl extends ActivityLayoutTagFeedListBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"layout_refresh_view"},
            new int[] {4},
            new int[] {com.mooc.ppjoke.R.layout.layout_refresh_view});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 5);
        sViewsWithIds.put(R.id.action_back, 6);
        sViewsWithIds.put(R.id.top_line, 7);
    }
    // views
    @NonNull
    private final com.mooc.libcommon.view.WindowInsetsFrameLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLayoutTagFeedListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityLayoutTagFeedListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[6]
            , (com.mooc.ppjoke.databinding.LayoutRefreshViewBinding) bindings[4]
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.view.View) bindings[7]
            );
        this.mboundView0 = (com.mooc.libcommon.view.WindowInsetsFrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tagLogo.setTag(null);
        this.tagTitle.setTag(null);
        this.topBarFollow.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        refreshLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (refreshLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.owner == variableId) {
            setOwner((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.tagList == variableId) {
            setTagList((com.mooc.ppjoke.model.TagList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOwner(@Nullable androidx.lifecycle.LifecycleOwner Owner) {
        this.mOwner = Owner;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.owner);
        super.requestRebind();
    }
    public void setTagList(@Nullable com.mooc.ppjoke.model.TagList TagList) {
        updateRegistration(1, TagList);
        this.mTagList = TagList;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tagList);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        refreshLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRefreshLayout((com.mooc.ppjoke.databinding.LayoutRefreshViewBinding) object, fieldId);
            case 1 :
                return onChangeTagList((com.mooc.ppjoke.model.TagList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRefreshLayout(com.mooc.ppjoke.databinding.LayoutRefreshViewBinding RefreshLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTagList(com.mooc.ppjoke.model.TagList TagList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.hasFollow) {
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
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        java.lang.String tagListHasFollowTopBarFollowAndroidStringTagFollowTopBarFollowAndroidStringTagUnfollow = null;
        com.mooc.ppjoke.model.TagList tagList = mTagList;
        boolean tagListHasFollow = false;
        java.lang.String tagListIcon = null;
        java.lang.String tagListTitle = null;

        if ((dirtyFlags & 0x1aL) != 0) {



                if (tagList != null) {
                    // read tagList.hasFollow
                    tagListHasFollow = tagList.isHasFollow();
                }
            if((dirtyFlags & 0x1aL) != 0) {
                if(tagListHasFollow) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
                tagListHasFollowTopBarFollowAndroidStringTagFollowTopBarFollowAndroidStringTagUnfollow = ((tagListHasFollow) ? (topBarFollow.getResources().getString(R.string.tag_follow)) : (topBarFollow.getResources().getString(R.string.tag_unfollow)));
            if ((dirtyFlags & 0x12L) != 0) {

                    if (tagList != null) {
                        // read tagList.icon
                        tagListIcon = tagList.icon;
                        // read tagList.title
                        tagListTitle = tagList.title;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.tagLogo, tagListIcon, false, 8);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tagTitle, tagListTitle);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.topBarFollow.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.topBarFollow, tagListHasFollowTopBarFollowAndroidStringTagFollowTopBarFollowAndroidStringTagUnfollow);
        }
        executeBindingsOn(refreshLayout);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // owner
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        // tagList
        com.mooc.ppjoke.model.TagList tagList = mTagList;




        com.mooc.ppjoke.ui.InteractionPresenter.toggleTagLike(owner, tagList);
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): refreshLayout
        flag 1 (0x2L): tagList
        flag 2 (0x3L): owner
        flag 3 (0x4L): tagList.hasFollow
        flag 4 (0x5L): null
        flag 5 (0x6L): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
        flag 6 (0x7L): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
    flag mapping end*/
    //end
}