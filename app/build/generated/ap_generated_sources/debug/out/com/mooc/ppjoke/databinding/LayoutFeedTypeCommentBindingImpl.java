package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedTypeCommentBindingImpl extends LayoutFeedTypeCommentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"layout_feed_author", "layout_feed_text", "layout_feed_tag", "layout_profile_tab_comment_interaction"},
            new int[] {4, 5, 6, 7},
            new int[] {com.mooc.ppjoke.R.layout.layout_feed_author,
                com.mooc.ppjoke.R.layout.layout_feed_text,
                com.mooc.ppjoke.R.layout.layout_feed_tag,
                com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final com.mooc.ppjoke.databinding.LayoutFeedAuthorBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @Nullable
    private final com.mooc.ppjoke.databinding.LayoutFeedTextBinding mboundView02;
    @Nullable
    private final com.mooc.ppjoke.databinding.LayoutFeedTagBinding mboundView03;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedTypeCommentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutFeedTypeCommentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.mooc.ppjoke.view.PPImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (com.mooc.ppjoke.databinding.LayoutProfileTabCommentInteractionBinding) bindings[7]
            );
        this.iconCover.setTag(null);
        this.iconVideo.setTag(null);
        this.mboundView0 = (com.mooc.ppjoke.databinding.LayoutFeedAuthorBinding) bindings[4];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView02 = (com.mooc.ppjoke.databinding.LayoutFeedTextBinding) bindings[5];
        setContainedBinding(this.mboundView02);
        this.mboundView03 = (com.mooc.ppjoke.databinding.LayoutFeedTagBinding) bindings[6];
        setContainedBinding(this.mboundView03);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mboundView0.invalidateAll();
        mboundView02.invalidateAll();
        mboundView03.invalidateAll();
        interactionBinding.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        if (mboundView02.hasPendingBindings()) {
            return true;
        }
        if (mboundView03.hasPendingBindings()) {
            return true;
        }
        if (interactionBinding.hasPendingBindings()) {
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
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.lifeCycleOwner);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
        mboundView02.setLifecycleOwner(lifecycleOwner);
        mboundView03.setLifecycleOwner(lifecycleOwner);
        interactionBinding.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFeed((com.mooc.ppjoke.model.Feed) object, fieldId);
            case 1 :
                return onChangeFeedTopComment((com.mooc.ppjoke.model.Comment) object, fieldId);
            case 2 :
                return onChangeInteractionBinding((com.mooc.ppjoke.databinding.LayoutProfileTabCommentInteractionBinding) object, fieldId);
            case 3 :
                return onChangeFeedTopCommentAuthor((com.mooc.ppjoke.model.User) object, fieldId);
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
    private boolean onChangeInteractionBinding(com.mooc.ppjoke.databinding.LayoutProfileTabCommentInteractionBinding InteractionBinding, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFeedTopCommentAuthor(com.mooc.ppjoke.model.User FeedTopCommentAuthor, int fieldId) {
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
        com.mooc.ppjoke.model.Feed feed = mFeed;
        java.lang.String feedFeedsText = null;
        com.mooc.ppjoke.model.Comment feedTopComment = null;
        androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;
        int feedItemType = 0;
        java.lang.String feedTopCommentCommentText = null;
        int feedItemTypeFeedTYPEVIDEOViewVISIBLEViewGONE = 0;
        com.mooc.ppjoke.model.User feedTopCommentAuthor = null;
        java.lang.String feedCover = null;
        boolean feedItemTypeFeedTYPEVIDEO = false;
        java.lang.String feedActivityText = null;

        if ((dirtyFlags & 0x2bL) != 0) {


            if ((dirtyFlags & 0x21L) != 0) {

                    if (feed != null) {
                        // read feed.feeds_text
                        feedFeedsText = feed.feeds_text;
                        // read feed.itemType
                        feedItemType = feed.itemType;
                        // read feed.cover
                        feedCover = feed.cover;
                        // read feed.activityText
                        feedActivityText = feed.activityText;
                    }


                    // read feed.itemType == Feed.TYPE_VIDEO
                    feedItemTypeFeedTYPEVIDEO = (feedItemType) == (com.mooc.ppjoke.model.Feed.TYPE_VIDEO);
                if((dirtyFlags & 0x21L) != 0) {
                    if(feedItemTypeFeedTYPEVIDEO) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read feed.itemType == Feed.TYPE_VIDEO ? View.VISIBLE : View.GONE
                    feedItemTypeFeedTYPEVIDEOViewVISIBLEViewGONE = ((feedItemTypeFeedTYPEVIDEO) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (feed != null) {
                    // read feed.topComment
                    feedTopComment = feed.topComment;
                }
                updateRegistration(1, feedTopComment);

            if ((dirtyFlags & 0x23L) != 0) {

                    if (feedTopComment != null) {
                        // read feed.topComment.commentText
                        feedTopCommentCommentText = feedTopComment.commentText;
                    }
            }

                if (feedTopComment != null) {
                    // read feed.topComment.author
                    feedTopCommentAuthor = feedTopComment.author;
                }
                updateRegistration(3, feedTopCommentAuthor);
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.iconCover, feedCover, (boolean)false, (int)0);
            this.iconVideo.setVisibility(feedItemTypeFeedTYPEVIDEOViewVISIBLEViewGONE);
            this.interactionBinding.setFeed(feed);
            this.mboundView03.setTagText(feedActivityText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, feedFeedsText);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.interactionBinding.setLifeCycleOwner(lifeCycleOwner);
        }
        if ((dirtyFlags & 0x2bL) != 0) {
            // api target 1

            this.mboundView0.setUser(feedTopCommentAuthor);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.mboundView02.setFeedText(feedTopCommentCommentText);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView02.setLines(3);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView02);
        executeBindingsOn(mboundView03);
        executeBindingsOn(interactionBinding);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): feed.topComment
        flag 2 (0x3L): interactionBinding
        flag 3 (0x4L): feed.topComment.author
        flag 4 (0x5L): lifeCycleOwner
        flag 5 (0x6L): null
        flag 6 (0x7L): feed.itemType == Feed.TYPE_VIDEO ? View.VISIBLE : View.GONE
        flag 7 (0x8L): feed.itemType == Feed.TYPE_VIDEO ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}