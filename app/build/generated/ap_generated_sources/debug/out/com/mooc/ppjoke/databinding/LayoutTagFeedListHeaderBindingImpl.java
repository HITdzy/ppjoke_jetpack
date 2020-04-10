package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutTagFeedListHeaderBindingImpl extends LayoutTagFeedListHeaderBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutTagFeedListHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutTagFeedListHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.headerBackground.setTag(null);
        this.headerFollow.setTag(null);
        this.headerIntro.setTag(null);
        this.headerTagWatcher.setTag(null);
        this.headerTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        else if (BR.owner == variableId) {
            setOwner((androidx.lifecycle.LifecycleOwner) variable);
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
    public void setOwner(@Nullable androidx.lifecycle.LifecycleOwner Owner) {
        this.mOwner = Owner;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.owner);
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
        com.mooc.ppjoke.model.TagList tagList = mTagList;
        int textUtilsIsEmptyTagListIntroViewGONEViewVISIBLE = 0;
        java.lang.String tagListBackground = null;
        int tagListEnterNumInt0ViewVISIBLEViewGONE = 0;
        java.lang.String tagListHasFollowHeaderFollowAndroidStringTagFollowHeaderFollowAndroidStringTagUnfollow = null;
        java.lang.String tagListIntro = null;
        java.lang.String tagListTitle = null;
        boolean tagListEnterNumInt0 = false;
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        boolean textUtilsIsEmptyTagListIntro = false;
        boolean tagListHasFollow = false;
        int tagListEnterNum = 0;
        java.lang.String stringConvertConvertTagFeedListTagListEnterNum = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (tagList != null) {
                        // read tagList.background
                        tagListBackground = tagList.background;
                        // read tagList.intro
                        tagListIntro = tagList.intro;
                        // read tagList.title
                        tagListTitle = tagList.title;
                        // read tagList.enterNum
                        tagListEnterNum = tagList.enterNum;
                    }


                    // read TextUtils.isEmpty(tagList.intro)
                    textUtilsIsEmptyTagListIntro = android.text.TextUtils.isEmpty(tagListIntro);
                    // read tagList.enterNum > 0
                    tagListEnterNumInt0 = (tagListEnterNum) > (0);
                    // read StringConvert.convertTagFeedList(tagList.enterNum)
                    stringConvertConvertTagFeedListTagListEnterNum = com.mooc.ppjoke.utils.StringConvert.convertTagFeedList(tagListEnterNum);
                if((dirtyFlags & 0x9L) != 0) {
                    if(textUtilsIsEmptyTagListIntro) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0x9L) != 0) {
                    if(tagListEnterNumInt0) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read TextUtils.isEmpty(tagList.intro) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyTagListIntroViewGONEViewVISIBLE = ((textUtilsIsEmptyTagListIntro) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read tagList.enterNum > 0 ? View.VISIBLE : View.GONE
                    tagListEnterNumInt0ViewVISIBLEViewGONE = ((tagListEnterNumInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (tagList != null) {
                    // read tagList.hasFollow
                    tagListHasFollow = tagList.isHasFollow();
                }
            if((dirtyFlags & 0xdL) != 0) {
                if(tagListHasFollow) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
                tagListHasFollowHeaderFollowAndroidStringTagFollowHeaderFollowAndroidStringTagUnfollow = ((tagListHasFollow) ? (headerFollow.getResources().getString(R.string.tag_follow)) : (headerFollow.getResources().getString(R.string.tag_unfollow)));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.headerBackground, tagListBackground, false, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerIntro, tagListIntro);
            this.headerIntro.setVisibility(textUtilsIsEmptyTagListIntroViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerTagWatcher, stringConvertConvertTagFeedListTagListEnterNum);
            this.headerTagWatcher.setVisibility(tagListEnterNumInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerTitle, tagListTitle);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.headerFollow.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerFollow, tagListHasFollowHeaderFollowAndroidStringTagFollowHeaderFollowAndroidStringTagUnfollow);
        }
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
        flag 0 (0x1L): tagList
        flag 1 (0x2L): owner
        flag 2 (0x3L): tagList.hasFollow
        flag 3 (0x4L): null
        flag 4 (0x5L): TextUtils.isEmpty(tagList.intro) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): TextUtils.isEmpty(tagList.intro) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): tagList.enterNum > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): tagList.enterNum > 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
        flag 9 (0xaL): tagList.hasFollow ? @android:string/tag_follow : @android:string/tag_unfollow
    flag mapping end*/
    //end
}