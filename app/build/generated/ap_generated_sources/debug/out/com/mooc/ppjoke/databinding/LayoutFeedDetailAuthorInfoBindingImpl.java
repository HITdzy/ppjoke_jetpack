package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedDetailAuthorInfoBindingImpl extends LayoutFeedDetailAuthorInfoBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.button.MaterialButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedDetailAuthorInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutFeedDetailAuthorInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.authorAvatar.setTag(null);
        this.authorInfo.setTag(null);
        this.authorName.setTag(null);
        this.createTime.setTag(null);
        this.mboundView4 = (com.google.android.material.button.MaterialButton) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.fullscreen == variableId) {
            setFullscreen((java.lang.Boolean) variable);
        }
        else if (BR.feed == variableId) {
            setFeed((com.mooc.ppjoke.model.Feed) variable);
        }
        else if (BR.leftMargin == variableId) {
            setLeftMargin((java.lang.Integer) variable);
        }
        else if (BR.owner == variableId) {
            setOwner((androidx.lifecycle.LifecycleOwner) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFullscreen(@Nullable java.lang.Boolean Fullscreen) {
        this.mFullscreen = Fullscreen;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fullscreen);
        super.requestRebind();
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
    public void setLeftMargin(@Nullable java.lang.Integer LeftMargin) {
        this.mLeftMargin = LeftMargin;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.leftMargin);
        super.requestRebind();
    }
    public void setOwner(@Nullable androidx.lifecycle.LifecycleOwner Owner) {
        this.mOwner = Owner;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.owner);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFeed((com.mooc.ppjoke.model.Feed) object, fieldId);
            case 1 :
                return onChangeFeedAuthor((com.mooc.ppjoke.model.User) object, fieldId);
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
        else if (fieldId == BR.author) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFeedAuthor(com.mooc.ppjoke.model.User FeedAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.hasFollow) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        int androidxDatabindingViewDataBindingSafeUnboxLeftMargin = 0;
        java.lang.String feedAuthorHasFollowMboundView4AndroidStringHasFollowMboundView4AndroidStringUnfollow = null;
        java.lang.Integer leftMargin = mLeftMargin;
        long feedCreateTime = 0;
        java.lang.String timeUtilsCalculateFeedCreateTime = null;
        int fullscreenAuthorNameAndroidColorColorWhiteAuthorNameAndroidColorColor000 = 0;
        java.lang.String feedAuthorName = null;
        int fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorTransparent = 0;
        java.lang.String feedAuthorAvatar = null;
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        int fullscreenMboundView4AndroidColorTransparentMboundView4AndroidColorColorTheme = 0;
        int fullscreenCreateTimeAndroidColorColorWhiteCreateTimeAndroidColorColor000 = 0;
        com.mooc.ppjoke.model.User feedAuthor = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxFullscreen = false;
        boolean feedAuthorHasFollow = false;

        if ((dirtyFlags & 0x44L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen)
                androidxDatabindingViewDataBindingSafeUnboxFullscreen = androidx.databinding.ViewDataBinding.safeUnbox(fullscreen);
            if((dirtyFlags & 0x44L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
                fullscreenAuthorNameAndroidColorColorWhiteAuthorNameAndroidColorColor000 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(authorName, R.color.color_white)) : (getColorFromResource(authorName, R.color.color_000)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/transparent
                fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorTransparent = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView4, R.color.color_white)) : (getColorFromResource(mboundView4, R.color.transparent)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_theme
                fullscreenMboundView4AndroidColorTransparentMboundView4AndroidColorColorTheme = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView4, R.color.transparent)) : (getColorFromResource(mboundView4, R.color.color_theme)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
                fullscreenCreateTimeAndroidColorColorWhiteCreateTimeAndroidColorColor000 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(createTime, R.color.color_white)) : (getColorFromResource(createTime, R.color.color_000)));
        }
        if ((dirtyFlags & 0x63L) != 0) {


            if ((dirtyFlags & 0x41L) != 0) {

                    if (feed != null) {
                        // read feed.createTime
                        feedCreateTime = feed.createTime;
                    }


                    // read TimeUtils.calculate(feed.createTime)
                    timeUtilsCalculateFeedCreateTime = com.mooc.ppjoke.utils.TimeUtils.calculate(feedCreateTime);
            }

                if (feed != null) {
                    // read feed.author
                    feedAuthor = feed.getAuthor();
                }
                updateRegistration(1, feedAuthor);

            if ((dirtyFlags & 0x43L) != 0) {

                    if (feedAuthor != null) {
                        // read feed.author.name
                        feedAuthorName = feedAuthor.name;
                        // read feed.author.avatar
                        feedAuthorAvatar = feedAuthor.avatar;
                    }
            }

                if (feedAuthor != null) {
                    // read feed.author.hasFollow
                    feedAuthorHasFollow = feedAuthor.isHasFollow();
                }
            if((dirtyFlags & 0x63L) != 0) {
                if(feedAuthorHasFollow) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read feed.author.hasFollow ? @android:string/has_follow : @android:string/unfollow
                feedAuthorHasFollowMboundView4AndroidStringHasFollowMboundView4AndroidStringUnfollow = ((feedAuthorHasFollow) ? (mboundView4.getResources().getString(R.string.has_follow)) : (mboundView4.getResources().getString(R.string.unfollow)));
        }
        if ((dirtyFlags & 0x48L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(leftMargin)
                androidxDatabindingViewDataBindingSafeUnboxLeftMargin = androidx.databinding.ViewDataBinding.safeUnbox(leftMargin);
        }
        // batch finished
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.authorAvatar, feedAuthorAvatar, true, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorName, feedAuthorName);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setPaddingLeft(this.authorInfo, androidxDatabindingViewDataBindingSafeUnboxLeftMargin);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            this.authorName.setTextColor(fullscreenAuthorNameAndroidColorColorWhiteAuthorNameAndroidColorColor000);
            this.createTime.setTextColor(fullscreenCreateTimeAndroidColorColorWhiteCreateTimeAndroidColorColor000);
            this.mboundView4.setStrokeColor(androidx.databinding.adapters.Converters.convertColorToColorStateList(fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorTransparent));
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView4.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(fullscreenMboundView4AndroidColorTransparentMboundView4AndroidColorColorTheme));
            }
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.createTime, timeUtilsCalculateFeedCreateTime);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x63L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, feedAuthorHasFollowMboundView4AndroidStringHasFollowMboundView4AndroidStringUnfollow);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // feed
        com.mooc.ppjoke.model.Feed feed = mFeed;
        // owner
        androidx.lifecycle.LifecycleOwner owner = mOwner;




        com.mooc.ppjoke.ui.InteractionPresenter.toggleFollowUser(owner, feed);
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): feed.author
        flag 2 (0x3L): fullscreen
        flag 3 (0x4L): leftMargin
        flag 4 (0x5L): owner
        flag 5 (0x6L): feed.author.hasFollow
        flag 6 (0x7L): null
        flag 7 (0x8L): feed.author.hasFollow ? @android:string/has_follow : @android:string/unfollow
        flag 8 (0x9L): feed.author.hasFollow ? @android:string/has_follow : @android:string/unfollow
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/transparent
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/transparent
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_theme
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_theme
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_000
    flag mapping end*/
    //end
}