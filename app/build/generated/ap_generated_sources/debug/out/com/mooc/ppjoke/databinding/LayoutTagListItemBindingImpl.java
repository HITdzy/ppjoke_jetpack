package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutTagListItemBindingImpl extends LayoutTagListItemBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutTagListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutTagListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.actionFollow.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tagAvtar.setTag(null);
        this.tagDesc.setTag(null);
        this.tagTitle.setTag(null);
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
        if (BR.tagList == variableId) {
            setTagList((com.mooc.ppjoke.model.TagList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTagList(@Nullable com.mooc.ppjoke.model.TagList TagList) {
        updateRegistration(0, TagList);
        this.mTagList = TagList;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tagList);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTagList((com.mooc.ppjoke.model.TagList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTagList(com.mooc.ppjoke.model.TagList TagList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.hasFollow) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        int tagListFeedNum = 0;
        com.mooc.ppjoke.model.TagList tagList = mTagList;
        java.lang.String tagListFeedNumTagDescAndroidStringTagListItemHotFeed = null;
        boolean tagListHasFollow = false;
        java.lang.String tagListIcon = null;
        java.lang.String tagListHasFollowActionFollowAndroidStringTagFollowActionFollowAndroidStringTagUnfollow = null;
        java.lang.String tagListTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (tagList != null) {
                        // read tagList.feedNum
                        tagListFeedNum = tagList.feedNum;
                        // read tagList.icon
                        tagListIcon = tagList.icon;
                        // read tagList.title
                        tagListTitle = tagList.title;
                    }


                    // read (tagList.feedNum) + (@android:string/tag_list_item_hot_feed)
                    tagListFeedNumTagDescAndroidStringTagListItemHotFeed = (tagListFeedNum) + (tagDesc.getResources().getString(R.string.tag_list_item_hot_feed));
            }

                if (tagList != null) {
                    // read tagList.hasFollow
                    tagListHasFollow = tagList.isHasFollow();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(tagListHasFollow) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
                tagListHasFollowActionFollowAndroidStringTagFollowActionFollowAndroidStringTagUnfollow = ((tagListHasFollow) ? (actionFollow.getResources().getString(R.string.tag_follow)) : (actionFollow.getResources().getString(R.string.tag_unfollow)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionFollow, tagListHasFollowActionFollowAndroidStringTagFollowActionFollowAndroidStringTagUnfollow);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.tagAvtar, tagListIcon, false, 8);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tagDesc, tagListFeedNumTagDescAndroidStringTagListItemHotFeed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tagTitle, tagListTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tagList
        flag 1 (0x2L): tagList.hasFollow
        flag 2 (0x3L): null
        flag 3 (0x4L): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
        flag 4 (0x5L): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
    flag mapping end*/
    //end
}