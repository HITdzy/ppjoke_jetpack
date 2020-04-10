package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedCommentListItemBindingImpl extends LayoutFeedCommentListItemBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.label_author, 6);
        sViewsWithIds.put(R.id.comment_delete, 7);
        sViewsWithIds.put(R.id.comment_ext, 8);
        sViewsWithIds.put(R.id.comment_cover, 9);
        sViewsWithIds.put(R.id.video_icon, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedCommentListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private LayoutFeedCommentListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (com.mooc.ppjoke.view.PPImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (android.widget.ImageView) bindings[10]
            );
        this.authorAvatar.setTag(null);
        this.authorName.setTag(null);
        this.commentLike.setTag(null);
        this.commentText.setTag(null);
        this.createTime.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.comment == variableId) {
            setComment((com.mooc.ppjoke.model.Comment) variable);
        }
        else if (BR.owner == variableId) {
            setOwner((androidx.lifecycle.LifecycleOwner) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setComment(@Nullable com.mooc.ppjoke.model.Comment Comment) {
        updateRegistration(0, Comment);
        this.mComment = Comment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.comment);
        super.requestRebind();
    }
    public void setOwner(@Nullable androidx.lifecycle.LifecycleOwner Owner) {
        this.mOwner = Owner;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.owner);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeComment((com.mooc.ppjoke.model.Comment) object, fieldId);
            case 1 :
                return onChangeCommentUgc((com.mooc.ppjoke.model.Ugc) object, fieldId);
            case 2 :
                return onChangeCommentAuthor((com.mooc.ppjoke.model.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeComment(com.mooc.ppjoke.model.Comment Comment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCommentUgc(com.mooc.ppjoke.model.Ugc CommentUgc, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.hasLiked) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCommentAuthor(com.mooc.ppjoke.model.User CommentAuthor, int fieldId) {
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
        java.lang.String stringValueOfCommentUgcLikeCount = null;
        java.lang.String timeUtilsCalculateCommentCreateTime = null;
        java.lang.String commentAuthorAvatar = null;
        int commentUgcHasLikedCommentLikeAndroidColorColorThemeCommentLikeAndroidColorColor999 = 0;
        long commentCreateTime = 0;
        com.mooc.ppjoke.model.Comment comment = mComment;
        boolean commentUgcHasLiked = false;
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        com.mooc.ppjoke.model.Ugc commentUgc = null;
        com.mooc.ppjoke.model.User commentAuthor = null;
        java.lang.String commentAuthorName = null;
        int commentUgcLikeCount = 0;
        java.lang.String commentCommentText = null;
        android.graphics.drawable.Drawable commentUgcHasLikedCommentLikeAndroidDrawableIconCellLikedCommentLikeAndroidDrawableIconCellLike = null;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x21L) != 0) {

                    if (comment != null) {
                        // read comment.createTime
                        commentCreateTime = comment.createTime;
                        // read comment.commentText
                        commentCommentText = comment.commentText;
                    }


                    // read TimeUtils.calculate(comment.createTime)
                    timeUtilsCalculateCommentCreateTime = com.mooc.ppjoke.utils.TimeUtils.calculate(commentCreateTime);
            }
            if ((dirtyFlags & 0x33L) != 0) {

                    if (comment != null) {
                        // read comment.ugc
                        commentUgc = comment.getUgc();
                    }
                    updateRegistration(1, commentUgc);


                    if (commentUgc != null) {
                        // read comment.ugc.hasLiked
                        commentUgcHasLiked = commentUgc.isHasLiked();
                    }
                if((dirtyFlags & 0x33L) != 0) {
                    if(commentUgcHasLiked) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_999
                    commentUgcHasLikedCommentLikeAndroidColorColorThemeCommentLikeAndroidColorColor999 = ((commentUgcHasLiked) ? (getColorFromResource(commentLike, R.color.color_theme)) : (getColorFromResource(commentLike, R.color.color_999)));
                    // read comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
                    commentUgcHasLikedCommentLikeAndroidDrawableIconCellLikedCommentLikeAndroidDrawableIconCellLike = ((commentUgcHasLiked) ? (getDrawableFromResource(commentLike, R.drawable.icon_cell_liked)) : (getDrawableFromResource(commentLike, R.drawable.icon_cell_like)));
                if ((dirtyFlags & 0x23L) != 0) {

                        if (commentUgc != null) {
                            // read comment.ugc.likeCount
                            commentUgcLikeCount = commentUgc.likeCount;
                        }


                        // read String.valueOf(comment.ugc.likeCount)
                        stringValueOfCommentUgcLikeCount = java.lang.String.valueOf(commentUgcLikeCount);
                }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (comment != null) {
                        // read comment.author
                        commentAuthor = comment.author;
                    }
                    updateRegistration(2, commentAuthor);


                    if (commentAuthor != null) {
                        // read comment.author.avatar
                        commentAuthorAvatar = commentAuthor.avatar;
                        // read comment.author.name
                        commentAuthorName = commentAuthor.name;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.authorAvatar, commentAuthorAvatar, true, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorName, commentAuthorName);
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableRight(this.commentLike, commentUgcHasLikedCommentLikeAndroidDrawableIconCellLikedCommentLikeAndroidDrawableIconCellLike);
            this.commentLike.setTextColor(commentUgcHasLikedCommentLikeAndroidColorColorThemeCommentLikeAndroidColorColor999);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.commentLike.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.commentLike, stringValueOfCommentUgcLikeCount);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.commentText, commentCommentText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.createTime, timeUtilsCalculateCommentCreateTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // comment
        com.mooc.ppjoke.model.Comment comment = mComment;
        // owner
        androidx.lifecycle.LifecycleOwner owner = mOwner;




        com.mooc.ppjoke.ui.InteractionPresenter.toggleCommentLike(owner, comment);
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): comment
        flag 1 (0x2L): comment.ugc
        flag 2 (0x3L): comment.author
        flag 3 (0x4L): owner
        flag 4 (0x5L): comment.ugc.hasLiked
        flag 5 (0x6L): null
        flag 6 (0x7L): comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_999
        flag 7 (0x8L): comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_999
        flag 8 (0x9L): comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 9 (0xaL): comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
    flag mapping end*/
    //end
}