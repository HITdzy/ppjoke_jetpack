package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedInteractionBindingImpl extends LayoutFeedInteractionBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedInteractionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutFeedInteractionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            );
        this.comment.setTag(null);
        this.diss.setTag(null);
        this.like.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.share.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
        mCallback12 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 2);
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
        if (BR.feed == variableId) {
            setFeed((com.mooc.ppjoke.model.Feed) variable);
        }
        else if (BR.lifeCycleOwner == variableId) {
            setLifeCycleOwner((androidx.lifecycle.LifecycleOwner) variable);
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
    public void setLifeCycleOwner(@Nullable androidx.lifecycle.LifecycleOwner LifeCycleOwner) {
        this.mLifeCycleOwner = LifeCycleOwner;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.lifeCycleOwner);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFeed((com.mooc.ppjoke.model.Feed) object, fieldId);
            case 1 :
                return onChangeFeedUgc((com.mooc.ppjoke.model.Ugc) object, fieldId);
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
        else if (fieldId == BR.ugc) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFeedUgc(com.mooc.ppjoke.model.Ugc FeedUgc, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.hasLiked) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.hasdiss) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.shareCount) {
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
        java.lang.String feedUgcCommentCountInt0StringConvertConvertFeedUgcFeedUgcCommentCountCommentAndroidStringFeedComment = null;
        com.mooc.ppjoke.model.Feed feed = mFeed;
        java.lang.String feedUgcLikeCountInt0StringConvertConvertFeedUgcFeedUgcLikeCountLikeAndroidStringLike = null;
        androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;
        int feedUgcLikeCount = 0;
        com.mooc.ppjoke.model.Ugc feedUgc = null;
        android.graphics.drawable.Drawable feedUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike = null;
        boolean feedUgcShareCountInt0 = false;
        int feedUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3 = 0;
        java.lang.String stringConvertConvertFeedUgcFeedUgcLikeCount = null;
        int feedUgcHasdissDissAndroidColorColorThemeDissAndroidColorColor3d3 = 0;
        int feedUgcShareCount = 0;
        java.lang.String feedUgcShareCountInt0StringConvertConvertFeedUgcFeedUgcShareCountShareAndroidStringShare = null;
        int feedUgcCommentCount = 0;
        java.lang.String stringConvertConvertFeedUgcFeedUgcCommentCount = null;
        boolean feedUgcCommentCountInt0 = false;
        boolean feedUgcHasLiked = false;
        java.lang.String stringConvertConvertFeedUgcFeedUgcShareCount = null;
        android.graphics.drawable.Drawable feedUgcHasdissDissAndroidDrawableIconCellDissedDissAndroidDrawableIconCellDiss = null;
        boolean feedUgcLikeCountInt0 = false;
        boolean feedUgcHasdiss = false;

        if ((dirtyFlags & 0x7bL) != 0) {



                if (feed != null) {
                    // read feed.ugc
                    feedUgc = feed.getUgc();
                }
                updateRegistration(1, feedUgc);

            if ((dirtyFlags & 0x43L) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.likeCount
                        feedUgcLikeCount = feedUgc.likeCount;
                        // read feed.ugc.commentCount
                        feedUgcCommentCount = feedUgc.commentCount;
                    }


                    // read feed.ugc.likeCount > 0
                    feedUgcLikeCountInt0 = (feedUgcLikeCount) > (0);
                    // read feed.ugc.commentCount > 0
                    feedUgcCommentCountInt0 = (feedUgcCommentCount) > (0);
                if((dirtyFlags & 0x43L) != 0) {
                    if(feedUgcLikeCountInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x43L) != 0) {
                    if(feedUgcCommentCountInt0) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
            if ((dirtyFlags & 0x63L) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.shareCount
                        feedUgcShareCount = feedUgc.getShareCount();
                    }


                    // read feed.ugc.shareCount > 0
                    feedUgcShareCountInt0 = (feedUgcShareCount) > (0);
                if((dirtyFlags & 0x63L) != 0) {
                    if(feedUgcShareCountInt0) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
            if ((dirtyFlags & 0x4bL) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.hasLiked
                        feedUgcHasLiked = feedUgc.isHasLiked();
                    }
                if((dirtyFlags & 0x4bL) != 0) {
                    if(feedUgcHasLiked) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
                    feedUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike = ((feedUgcHasLiked) ? (getDrawableFromResource(like, R.drawable.icon_cell_liked)) : (getDrawableFromResource(like, R.drawable.icon_cell_like)));
                    // read feed.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
                    feedUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3 = ((feedUgcHasLiked) ? (getColorFromResource(like, R.color.color_theme)) : (getColorFromResource(like, R.color.color_3d3)));
            }
            if ((dirtyFlags & 0x53L) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.hasdiss
                        feedUgcHasdiss = feedUgc.isHasdiss();
                    }
                if((dirtyFlags & 0x53L) != 0) {
                    if(feedUgcHasdiss) {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read feed.ugc.hasdiss ? @android:color/color_theme : @android:color/color_3d3
                    feedUgcHasdissDissAndroidColorColorThemeDissAndroidColorColor3d3 = ((feedUgcHasdiss) ? (getColorFromResource(diss, R.color.color_theme)) : (getColorFromResource(diss, R.color.color_3d3)));
                    // read feed.ugc.hasdiss ? @android:drawable/icon_cell_dissed : @android:drawable/icon_cell_diss
                    feedUgcHasdissDissAndroidDrawableIconCellDissedDissAndroidDrawableIconCellDiss = ((feedUgcHasdiss) ? (getDrawableFromResource(diss, R.drawable.icon_cell_dissed)) : (getDrawableFromResource(diss, R.drawable.icon_cell_diss)));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                // read StringConvert.convertFeedUgc(feed.ugc.likeCount)
                stringConvertConvertFeedUgcFeedUgcLikeCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedUgcLikeCount);
        }
        if ((dirtyFlags & 0x100L) != 0) {

                // read StringConvert.convertFeedUgc(feed.ugc.commentCount)
                stringConvertConvertFeedUgcFeedUgcCommentCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedUgcCommentCount);
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                // read StringConvert.convertFeedUgc(feed.ugc.shareCount)
                stringConvertConvertFeedUgcFeedUgcShareCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedUgcShareCount);
        }

        if ((dirtyFlags & 0x43L) != 0) {

                // read feed.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.commentCount) : @android:string/feed_comment
                feedUgcCommentCountInt0StringConvertConvertFeedUgcFeedUgcCommentCountCommentAndroidStringFeedComment = ((feedUgcCommentCountInt0) ? (stringConvertConvertFeedUgcFeedUgcCommentCount) : (comment.getResources().getString(R.string.feed_comment)));
                // read feed.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.likeCount) : @android:string/like
                feedUgcLikeCountInt0StringConvertConvertFeedUgcFeedUgcLikeCountLikeAndroidStringLike = ((feedUgcLikeCountInt0) ? (stringConvertConvertFeedUgcFeedUgcLikeCount) : (like.getResources().getString(R.string.like)));
        }
        if ((dirtyFlags & 0x63L) != 0) {

                // read feed.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.shareCount) : @android:string/share
                feedUgcShareCountInt0StringConvertConvertFeedUgcFeedUgcShareCountShareAndroidStringShare = ((feedUgcShareCountInt0) ? (stringConvertConvertFeedUgcFeedUgcShareCount) : (share.getResources().getString(R.string.share)));
        }
        // batch finished
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.comment, feedUgcCommentCountInt0StringConvertConvertFeedUgcFeedUgcCommentCountCommentAndroidStringFeedComment);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.like, feedUgcLikeCountInt0StringConvertConvertFeedUgcFeedUgcLikeCountLikeAndroidStringLike);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.diss.setOnClickListener(mCallback12);
            this.like.setOnClickListener(mCallback11);
            this.share.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x53L) != 0) {
            // api target 1

            this.diss.setTextColor(feedUgcHasdissDissAndroidColorColorThemeDissAndroidColorColor3d3);
            this.diss.setIcon(feedUgcHasdissDissAndroidDrawableIconCellDissedDissAndroidDrawableIconCellDiss);
            this.diss.setIconTint(androidx.databinding.adapters.Converters.convertColorToColorStateList(feedUgcHasdissDissAndroidColorColorThemeDissAndroidColorColor3d3));
        }
        if ((dirtyFlags & 0x4bL) != 0) {
            // api target 1

            this.like.setTextColor(feedUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3);
            this.like.setIcon(feedUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike);
            this.like.setIconTint(androidx.databinding.adapters.Converters.convertColorToColorStateList(feedUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3));
        }
        if ((dirtyFlags & 0x63L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.share, feedUgcShareCountInt0StringConvertConvertFeedUgcFeedUgcShareCountShareAndroidStringShare);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // feed
                com.mooc.ppjoke.model.Feed feed = mFeed;
                // (Context) lifeCycleOwner
                android.content.Context contextLifeCycleOwner = null;
                // lifeCycleOwner
                androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;



                contextLifeCycleOwner = ((android.content.Context) (lifeCycleOwner));


                com.mooc.ppjoke.ui.InteractionPresenter.openShare(contextLifeCycleOwner, feed);
                break;
            }
            case 1: {
                // localize variables for thread safety
                // feed
                com.mooc.ppjoke.model.Feed feed = mFeed;
                // lifeCycleOwner
                androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;




                com.mooc.ppjoke.ui.InteractionPresenter.toggleFeedLike(lifeCycleOwner, feed);
                break;
            }
            case 2: {
                // localize variables for thread safety
                // feed
                com.mooc.ppjoke.model.Feed feed = mFeed;
                // lifeCycleOwner
                androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;




                com.mooc.ppjoke.ui.InteractionPresenter.toggleFeedDiss(lifeCycleOwner, feed);
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): feed.ugc
        flag 2 (0x3L): lifeCycleOwner
        flag 3 (0x4L): feed.ugc.hasLiked
        flag 4 (0x5L): feed.ugc.hasdiss
        flag 5 (0x6L): feed.ugc.shareCount
        flag 6 (0x7L): null
        flag 7 (0x8L): feed.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.commentCount) : @android:string/feed_comment
        flag 8 (0x9L): feed.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.commentCount) : @android:string/feed_comment
        flag 9 (0xaL): feed.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.likeCount) : @android:string/like
        flag 10 (0xbL): feed.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.likeCount) : @android:string/like
        flag 11 (0xcL): feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 12 (0xdL): feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 13 (0xeL): feed.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 14 (0xfL): feed.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 15 (0x10L): feed.ugc.hasdiss ? @android:color/color_theme : @android:color/color_3d3
        flag 16 (0x11L): feed.ugc.hasdiss ? @android:color/color_theme : @android:color/color_3d3
        flag 17 (0x12L): feed.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.shareCount) : @android:string/share
        flag 18 (0x13L): feed.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.ugc.shareCount) : @android:string/share
        flag 19 (0x14L): feed.ugc.hasdiss ? @android:drawable/icon_cell_dissed : @android:drawable/icon_cell_diss
        flag 20 (0x15L): feed.ugc.hasdiss ? @android:drawable/icon_cell_dissed : @android:drawable/icon_cell_diss
    flag mapping end*/
    //end
}