package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedTopCommentBindingImpl extends LayoutFeedTopCommentBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    private final com.mooc.libcommon.view.CornerFrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.FrameLayout mboundView6;
    @NonNull
    private final com.mooc.ppjoke.view.PPImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedTopCommentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private LayoutFeedTopCommentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.mooc.ppjoke.view.PPImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.avatar.setTag(null);
        this.mboundView0 = (com.mooc.libcommon.view.CornerFrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.FrameLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.mooc.ppjoke.view.PPImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.userName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
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
        if (BR.lifeCycleOwner == variableId) {
            setLifeCycleOwner((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.comment == variableId) {
            setComment((com.mooc.ppjoke.model.Comment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLifeCycleOwner(@Nullable androidx.lifecycle.LifecycleOwner LifeCycleOwner) {
        this.mLifeCycleOwner = LifeCycleOwner;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.lifeCycleOwner);
        super.requestRebind();
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
        java.lang.String stringConvertConvertFeedUgcCommentUgcLikeCount = null;
        boolean textUtilsIsEmptyCommentCommentText = false;
        androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;
        boolean commentJavaLangObjectNull = false;
        java.lang.String commentAuthorAvatar = null;
        com.mooc.ppjoke.model.Comment comment = mComment;
        int textUtilsIsEmptyCommentVideoUrlViewGONEViewVISIBLE = 0;
        java.lang.String commentVideoUrl = null;
        android.graphics.drawable.Drawable commentUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike = null;
        boolean commentUgcHasLiked = false;
        int commentUgcHasLikedMboundView3AndroidColorColorThemeMboundView3AndroidColorColor3d3 = 0;
        int textUtilsIsEmptyCommentCommentTextViewGONEViewVISIBLE = 0;
        int commentJavaLangObjectNullViewGONEViewVISIBLE = 0;
        com.mooc.ppjoke.model.Ugc commentUgc = null;
        java.lang.String commentImageUrl = null;
        boolean commentUgcLikeCountInt0 = false;
        int textUtilsIsEmptyCommentImageUrlViewGONEViewVISIBLE = 0;
        boolean textUtilsIsEmptyCommentVideoUrl = false;
        com.mooc.ppjoke.model.User commentAuthor = null;
        boolean textUtilsIsEmptyCommentImageUrl = false;
        java.lang.String commentAuthorName = null;
        int commentUgcLikeCount = 0;
        java.lang.String commentUgcLikeCountInt0StringConvertConvertFeedUgcCommentUgcLikeCountJavaLangObjectNull = null;
        java.lang.String commentCommentText = null;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x21L) != 0) {

                    // read comment == null
                    commentJavaLangObjectNull = (comment) == (null);
                if((dirtyFlags & 0x21L) != 0) {
                    if(commentJavaLangObjectNull) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                    if (comment != null) {
                        // read comment.videoUrl
                        commentVideoUrl = comment.videoUrl;
                        // read comment.imageUrl
                        commentImageUrl = comment.imageUrl;
                        // read comment.commentText
                        commentCommentText = comment.commentText;
                    }


                    // read comment == null ? View.GONE : View.VISIBLE
                    commentJavaLangObjectNullViewGONEViewVISIBLE = ((commentJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read TextUtils.isEmpty(comment.videoUrl)
                    textUtilsIsEmptyCommentVideoUrl = android.text.TextUtils.isEmpty(commentVideoUrl);
                    // read TextUtils.isEmpty(comment.imageUrl)
                    textUtilsIsEmptyCommentImageUrl = android.text.TextUtils.isEmpty(commentImageUrl);
                    // read TextUtils.isEmpty(comment.commentText)
                    textUtilsIsEmptyCommentCommentText = android.text.TextUtils.isEmpty(commentCommentText);
                if((dirtyFlags & 0x21L) != 0) {
                    if(textUtilsIsEmptyCommentVideoUrl) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0x21L) != 0) {
                    if(textUtilsIsEmptyCommentImageUrl) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x21L) != 0) {
                    if(textUtilsIsEmptyCommentCommentText) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read TextUtils.isEmpty(comment.videoUrl) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyCommentVideoUrlViewGONEViewVISIBLE = ((textUtilsIsEmptyCommentVideoUrl) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read TextUtils.isEmpty(comment.imageUrl) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyCommentImageUrlViewGONEViewVISIBLE = ((textUtilsIsEmptyCommentImageUrl) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read TextUtils.isEmpty(comment.commentText) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyCommentCommentTextViewGONEViewVISIBLE = ((textUtilsIsEmptyCommentCommentText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
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
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
                    commentUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike = ((commentUgcHasLiked) ? (getDrawableFromResource(mboundView4, R.drawable.icon_cell_liked)) : (getDrawableFromResource(mboundView4, R.drawable.icon_cell_like)));
                    // read comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
                    commentUgcHasLikedMboundView3AndroidColorColorThemeMboundView3AndroidColorColor3d3 = ((commentUgcHasLiked) ? (getColorFromResource(mboundView3, R.color.color_theme)) : (getColorFromResource(mboundView3, R.color.color_3d3)));
                if ((dirtyFlags & 0x23L) != 0) {

                        if (commentUgc != null) {
                            // read comment.ugc.likeCount
                            commentUgcLikeCount = commentUgc.likeCount;
                        }


                        // read comment.ugc.likeCount > 0
                        commentUgcLikeCountInt0 = (commentUgcLikeCount) > (0);
                    if((dirtyFlags & 0x23L) != 0) {
                        if(commentUgcLikeCountInt0) {
                                dirtyFlags |= 0x80000L;
                        }
                        else {
                                dirtyFlags |= 0x40000L;
                        }
                    }
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

        if ((dirtyFlags & 0x80000L) != 0) {

                // read StringConvert.convertFeedUgc(comment.ugc.likeCount)
                stringConvertConvertFeedUgcCommentUgcLikeCount = com.mooc.ppjoke.utils.StringConvert.convertFeedUgc(commentUgcLikeCount);
        }

        if ((dirtyFlags & 0x23L) != 0) {

                // read comment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(comment.ugc.likeCount) : null
                commentUgcLikeCountInt0StringConvertConvertFeedUgcCommentUgcLikeCountJavaLangObjectNull = ((commentUgcLikeCountInt0) ? (stringConvertConvertFeedUgcCommentUgcLikeCount) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.avatar, commentAuthorAvatar, true, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, commentAuthorName);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(commentJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, commentCommentText);
            this.mboundView5.setVisibility(textUtilsIsEmptyCommentCommentTextViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(textUtilsIsEmptyCommentImageUrlViewGONEViewVISIBLE);
            this.mboundView7.setVisibility(textUtilsIsEmptyCommentImageUrlViewGONEViewVISIBLE);
            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.mboundView7, commentImageUrl, false, (int)0);
            this.mboundView8.setVisibility(textUtilsIsEmptyCommentVideoUrlViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, commentUgcLikeCountInt0StringConvertConvertFeedUgcCommentUgcLikeCountJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            this.mboundView3.setTextColor(commentUgcHasLikedMboundView3AndroidColorColorThemeMboundView3AndroidColorColor3d3);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView4, commentUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // comment
        com.mooc.ppjoke.model.Comment comment = mComment;
        // lifeCycleOwner
        androidx.lifecycle.LifecycleOwner lifeCycleOwner = mLifeCycleOwner;




        com.mooc.ppjoke.ui.InteractionPresenter.toggleCommentLike(lifeCycleOwner, comment);
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): comment
        flag 1 (0x2L): comment.ugc
        flag 2 (0x3L): comment.author
        flag 3 (0x4L): lifeCycleOwner
        flag 4 (0x5L): comment.ugc.hasLiked
        flag 5 (0x6L): null
        flag 6 (0x7L): TextUtils.isEmpty(comment.videoUrl) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): TextUtils.isEmpty(comment.videoUrl) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 9 (0xaL): comment.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 10 (0xbL): comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 11 (0xcL): comment.ugc.hasLiked ? @android:color/color_theme : @android:color/color_3d3
        flag 12 (0xdL): TextUtils.isEmpty(comment.commentText) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): TextUtils.isEmpty(comment.commentText) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): comment == null ? View.GONE : View.VISIBLE
        flag 15 (0x10L): comment == null ? View.GONE : View.VISIBLE
        flag 16 (0x11L): TextUtils.isEmpty(comment.imageUrl) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): TextUtils.isEmpty(comment.imageUrl) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): comment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(comment.ugc.likeCount) : null
        flag 19 (0x14L): comment.ugc.likeCount > 0 ? StringConvert.convertFeedUgc(comment.ugc.likeCount) : null
    flag mapping end*/
    //end
}