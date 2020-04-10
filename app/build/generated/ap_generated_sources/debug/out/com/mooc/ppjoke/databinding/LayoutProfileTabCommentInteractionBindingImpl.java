package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutProfileTabCommentInteractionBindingImpl extends LayoutProfileTabCommentInteractionBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutProfileTabCommentInteractionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutProfileTabCommentInteractionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            );
        this.comment.setTag(null);
        this.like.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.share.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x8L;
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
                return onChangeFeedTopComment((com.mooc.ppjoke.model.Comment) object, fieldId);
            case 2 :
                return onChangeFeedTopCommentUgc((com.mooc.ppjoke.model.Ugc) object, fieldId);
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
    private boolean onChangeFeedTopComment(com.mooc.ppjoke.model.Comment FeedTopComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFeedTopCommentUgc(com.mooc.ppjoke.model.Ugc FeedTopCommentUgc, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.hasLiked) {
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
        int feedTopCommentUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3 = 0;
        com.mooc.ppjoke.model.Feed feed = mFeed;
        java.lang.String stringConvertConvertFeedUgcFeedTopCommentUgcShareCount = null;
        androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;
        boolean feedTopCommentUgcShareCountInt0 = false;
        java.lang.String stringConvertConvertFeedUgcFeedTopCommentUgcLikeCount = null;
        int feedTopCommentUgcShareCount = 0;
        boolean feedTopCommentUgcHasLiked = false;
        boolean feedTopCommentUgcCommentCountInt0 = false;
        java.lang.String feedTopCommentUgcLikeCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcLikeCountLikeAndroidStringLike = null;
        int feedTopCommentUgcLikeCount = 0;
        com.mooc.ppjoke.model.Comment feedTopComment = null;
        int feedTopCommentUgcCommentCount = 0;
        boolean feedTopCommentUgcLikeCountInt0 = false;
        java.lang.String feedTopCommentUgcCommentCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcCommentCountCommentAndroidStringFeedComment = null;
        java.lang.String feedTopCommentUgcShareCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcShareCountShareAndroidStringShare = null;
        com.mooc.ppjoke.model.Ugc feedTopCommentUgc = null;
        java.lang.String stringConvertConvertFeedUgcFeedTopCommentUgcCommentCount = null;
        android.graphics.drawable.Drawable feedTopCommentUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike = null;

        if ((dirtyFlags & 0x77L) != 0) {



                if (feed != null) {
                    // read feed.topComment
                    feedTopComment = feed.topComment;
                }
                updateRegistration(1, feedTopComment);


                if (feedTopComment != null) {
                    // read feed.topComment.ugc
                    feedTopCommentUgc = feedTopComment.getUgc();
                }
                updateRegistration(2, feedTopCommentUgc);

            if ((dirtyFlags & 0x67L) != 0) {

                    if (feedTopCommentUgc != null) {
                        // read feed.topComment.ugc.shareCount
                        feedTopCommentUgcShareCount = feedTopCommentUgc.getShareCount();
                    }


                    // read feed.topComment.ugc.shareCount > 0
                    feedTopCommentUgcShareCountInt0 = (feedTopCommentUgcShareCount) > (0);
                if((dirtyFlags & 0x67L) != 0) {
                    if(feedTopCommentUgcShareCountInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x57L) != 0) {

                    if (feedTopCommentUgc != null) {
                        // read feed.topComment.ugc.hasLiked
                        feedTopCommentUgcHasLiked = feedTopCommentUgc.isHasLiked();
                    }
                if((dirtyFlags & 0x57L) != 0) {
                    if(feedTopCommentUgcHasLiked) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read feed.topComment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
                    feedTopCommentUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3 = ((feedTopCommentUgcHasLiked) ? (getColorFromResource(like, R.color.color_theme)) : (getColorFromResource(like, R.color.color_3d3)));
                    // read feed.topComment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
                    feedTopCommentUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike = ((feedTopCommentUgcHasLiked) ? (getDrawableFromResource(like, R.drawable.icon_cell_liked)) : (getDrawableFromResource(like, R.drawable.icon_cell_like)));
            }
            if ((dirtyFlags & 0x47L) != 0) {

                    if (feedTopCommentUgc != null) {
                        // read feed.topComment.ugc.likeCount
                        feedTopCommentUgcLikeCount = feedTopCommentUgc.likeCount;
                        // read feed.topComment.ugc.commentCount
                        feedTopCommentUgcCommentCount = feedTopCommentUgc.commentCount;
                    }


                    // read feed.topComment.ugc.likeCount > 0
                    feedTopCommentUgcLikeCountInt0 = (feedTopCommentUgcLikeCount) > (0);
                    // read feed.topComment.ugc.commentCount > 0
                    feedTopCommentUgcCommentCountInt0 = (feedTopCommentUgcCommentCount) > (0);
                if((dirtyFlags & 0x47L) != 0) {
                    if(feedTopCommentUgcLikeCountInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x47L) != 0) {
                    if(feedTopCommentUgcCommentCountInt0) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                // read StringConvert.convertFeedUgc(feed.topComment.ugc.shareCount)
                stringConvertConvertFeedUgcFeedTopCommentUgcShareCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedTopCommentUgcShareCount);
        }
        if ((dirtyFlags & 0x400L) != 0) {

                // read StringConvert.convertFeedUgc(feed.topComment.ugc.likeCount)
                stringConvertConvertFeedUgcFeedTopCommentUgcLikeCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedTopCommentUgcLikeCount);
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                // read StringConvert.convertFeedUgc(feed.topComment.ugc.commentCount)
                stringConvertConvertFeedUgcFeedTopCommentUgcCommentCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(feedTopCommentUgcCommentCount);
        }

        if ((dirtyFlags & 0x47L) != 0) {

                // read feed.topComment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.likeCount) : @android:string/like
                feedTopCommentUgcLikeCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcLikeCountLikeAndroidStringLike = ((feedTopCommentUgcLikeCountInt0) ? (stringConvertConvertFeedUgcFeedTopCommentUgcLikeCount) : (like.getResources().getString(R.string.like)));
                // read feed.topComment.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.commentCount) : @android:string/feed_comment
                feedTopCommentUgcCommentCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcCommentCountCommentAndroidStringFeedComment = ((feedTopCommentUgcCommentCountInt0) ? (stringConvertConvertFeedUgcFeedTopCommentUgcCommentCount) : (comment.getResources().getString(R.string.feed_comment)));
        }
        if ((dirtyFlags & 0x67L) != 0) {

                // read feed.topComment.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.shareCount) : @android:string/share
                feedTopCommentUgcShareCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcShareCountShareAndroidStringShare = ((feedTopCommentUgcShareCountInt0) ? (stringConvertConvertFeedUgcFeedTopCommentUgcShareCount) : (share.getResources().getString(R.string.share)));
        }
        // batch finished
        if ((dirtyFlags & 0x47L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.comment, feedTopCommentUgcCommentCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcCommentCountCommentAndroidStringFeedComment);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.like, feedTopCommentUgcLikeCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcLikeCountLikeAndroidStringLike);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.like.setOnClickListener(mCallback1);
            this.share.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x57L) != 0) {
            // api target 1

            this.like.setTextColor(feedTopCommentUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3);
            this.like.setIcon(feedTopCommentUgcHasLikedLikeAndroidDrawableIconCellLikedLikeAndroidDrawableIconCellLike);
            this.like.setIconTint(androidx.databinding.adapters.Converters.convertColorToColorStateList(feedTopCommentUgcHasLikedLikeAndroidColorColorThemeLikeAndroidColorColor3d3));
        }
        if ((dirtyFlags & 0x67L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.share, feedTopCommentUgcShareCountInt0StringConvertConvertFeedUgcFeedTopCommentUgcShareCountShareAndroidStringShare);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
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
                // feed.topComment
                com.mooc.ppjoke.model.Comment feedTopComment = null;
                // lifeCycleOwner
                androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;
                // feed != null
                boolean feedJavaLangObjectNull = false;




                feedJavaLangObjectNull = (feed) != (null);
                if (feedJavaLangObjectNull) {


                    feedTopComment = feed.topComment;

                    com.mooc.ppjoke.ui.InteractionPresenter.toggleCommentLike(lifeCycleOwner, feedTopComment);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): feed.topComment
        flag 2 (0x3L): feed.topComment.ugc
        flag 3 (0x4L): lifeCycleOwner
        flag 4 (0x5L): feed.topComment.ugc.hasLiked
        flag 5 (0x6L): feed.topComment.ugc.shareCount
        flag 6 (0x7L): null
        flag 7 (0x8L): feed.topComment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 8 (0x9L): feed.topComment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 9 (0xaL): feed.topComment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.likeCount) : @android:string/like
        flag 10 (0xbL): feed.topComment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.likeCount) : @android:string/like
        flag 11 (0xcL): feed.topComment.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.commentCount) : @android:string/feed_comment
        flag 12 (0xdL): feed.topComment.ugc.commentCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.commentCount) : @android:string/feed_comment
        flag 13 (0xeL): feed.topComment.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.shareCount) : @android:string/share
        flag 14 (0xfL): feed.topComment.ugc.shareCount > 0 ? StringConvert.convertFeedUgc(feed.topComment.ugc.shareCount) : @android:string/share
        flag 15 (0x10L): feed.topComment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 16 (0x11L): feed.topComment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
    flag mapping end*/
    //end
}