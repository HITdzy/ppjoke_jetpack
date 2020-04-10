package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutFeedDetailBottomInateractionBindingImpl extends LayoutFeedDetailBottomInateractionBinding implements com.mooc.ppjoke.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final android.view.View mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutFeedDetailBottomInateractionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LayoutFeedDetailBottomInateractionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            );
        this.inputView.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.mooc.ppjoke.generated.callback.OnClickListener(this, 1);
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
        else if (BR.owner == variableId) {
            setOwner((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.fullscreen == variableId) {
            setFullscreen((java.lang.Boolean) variable);
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
    public void setOwner(@Nullable androidx.lifecycle.LifecycleOwner Owner) {
        this.mOwner = Owner;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.owner);
        super.requestRebind();
    }
    public void setFullscreen(@Nullable java.lang.Boolean Fullscreen) {
        this.mFullscreen = Fullscreen;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.fullscreen);
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
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.hasFavorite) {
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
        int fullscreenInputViewAndroidColorColorWhiteInputViewAndroidColorColor333 = 0;
        int fullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666 = 0;
        com.mooc.ppjoke.model.Feed feed = mFeed;
        int feedUgcLikeCount = 0;
        com.mooc.ppjoke.model.Ugc feedUgc = null;
        android.graphics.drawable.Drawable feedUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike = null;
        java.lang.String feedUgcLikeCountInt0StringValueOfFeedUgcLikeCountMboundView5AndroidStringLike = null;
        androidx.lifecycle.LifecycleOwner owner = mOwner;
        int fullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666 = 0;
        int fullscreenMboundView10AndroidColorColorWhiteMboundView10AndroidColorColor666 = 0;
        boolean feedUgcLikeCountInt0 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxFullscreen = false;
        int fullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666 = 0;
        java.lang.Boolean fullscreen = mFullscreen;
        boolean feedUgcHasFavorite = false;
        int feedUgcHasLikedMboundView4AndroidColorColorThemeFullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666 = 0;
        int feedUgcHasLikedMboundView5AndroidColorColorThemeFullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666 = 0;
        int fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666 = 0;
        int fullscreenMboundView0AndroidColorTransparentMboundView0AndroidColorColorWhite = 0;
        int fullscreenViewINVISIBLEViewVISIBLE = 0;
        int feedUgcHasFavoriteMboundView7AndroidColorColorThemeFullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666 = 0;
        int feedUgcHasFavoriteMboundView8AndroidColorColorThemeFullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666 = 0;
        android.graphics.drawable.Drawable feedUgcHasFavoriteMboundView7AndroidDrawableIcCollectedMboundView7AndroidDrawableIcCollect = null;
        boolean feedUgcHasLiked = false;
        java.lang.String stringValueOfFeedUgcLikeCount = null;
        java.lang.String feedUgcHasFavoriteMboundView8AndroidStringHasCollectMboundView8AndroidStringCollect = null;
        int fullscreenMboundView11AndroidColorColorWhiteMboundView11AndroidColorColor666 = 0;

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
                    }


                    // read feed.ugc.likeCount > 0
                    feedUgcLikeCountInt0 = (feedUgcLikeCount) > (0);
                if((dirtyFlags & 0x43L) != 0) {
                    if(feedUgcLikeCountInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6bL) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.hasFavorite
                        feedUgcHasFavorite = feedUgc.isHasFavorite();
                    }
                if((dirtyFlags & 0x6bL) != 0) {
                    if(feedUgcHasFavorite) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x200000000L;
                    }
                }
                if((dirtyFlags & 0x63L) != 0) {
                    if(feedUgcHasFavorite) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                }

                if ((dirtyFlags & 0x63L) != 0) {

                        // read feed.ugc.hasFavorite ? @android:drawable/ic_collected : @android:drawable/ic_collect
                        feedUgcHasFavoriteMboundView7AndroidDrawableIcCollectedMboundView7AndroidDrawableIcCollect = ((feedUgcHasFavorite) ? (getDrawableFromResource(mboundView7, R.drawable.ic_collected)) : (getDrawableFromResource(mboundView7, R.drawable.ic_collect)));
                        // read feed.ugc.hasFavorite ? @android:string/has_collect : @android:string/collect
                        feedUgcHasFavoriteMboundView8AndroidStringHasCollectMboundView8AndroidStringCollect = ((feedUgcHasFavorite) ? (mboundView8.getResources().getString(R.string.has_collect)) : (mboundView8.getResources().getString(R.string.collect)));
                }
            }
            if ((dirtyFlags & 0x5bL) != 0) {

                    if (feedUgc != null) {
                        // read feed.ugc.hasLiked
                        feedUgcHasLiked = feedUgc.isHasLiked();
                    }
                if((dirtyFlags & 0x53L) != 0) {
                    if(feedUgcHasLiked) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x5bL) != 0) {
                    if(feedUgcHasLiked) {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x800000L;
                    }
                }

                if ((dirtyFlags & 0x53L) != 0) {

                        // read feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
                        feedUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike = ((feedUgcHasLiked) ? (getDrawableFromResource(mboundView4, R.drawable.icon_cell_liked)) : (getDrawableFromResource(mboundView4, R.drawable.icon_cell_like)));
                }
            }
        }
        if ((dirtyFlags & 0x48L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen)
                androidxDatabindingViewDataBindingSafeUnboxFullscreen = androidx.databinding.ViewDataBinding.safeUnbox(fullscreen);
            if((dirtyFlags & 0x48L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x10000000L;
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x8000000L;
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x8000000000L;
                }
            }
            if((dirtyFlags & 0x200000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x800000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x80000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x200000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_333
                fullscreenInputViewAndroidColorColorWhiteInputViewAndroidColorColor333 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(inputView, R.color.color_white)) : (getColorFromResource(inputView, R.color.color_333)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                fullscreenMboundView10AndroidColorColorWhiteMboundView10AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView10, R.color.color_white)) : (getColorFromResource(mboundView10, R.color.color_666)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_white
                fullscreenMboundView0AndroidColorTransparentMboundView0AndroidColorColorWhite = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView0, R.color.transparent)) : (getColorFromResource(mboundView0, R.color.color_white)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? View.INVISIBLE : View.VISIBLE
                fullscreenViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                fullscreenMboundView11AndroidColorColorWhiteMboundView11AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView11, R.color.color_white)) : (getColorFromResource(mboundView11, R.color.color_666)));
        }
        // batch finished

        if ((dirtyFlags & 0x280a00000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen)
                androidxDatabindingViewDataBindingSafeUnboxFullscreen = androidx.databinding.ViewDataBinding.safeUnbox(fullscreen);
            if((dirtyFlags & 0x48L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x10000000L;
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x8000000L;
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x8000000000L;
                }
            }
            if((dirtyFlags & 0x200000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x800000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x80000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x200000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxFullscreen) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }

            if ((dirtyFlags & 0x200000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                    fullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView8, R.color.color_white)) : (getColorFromResource(mboundView8, R.color.color_666)));
            }
            if ((dirtyFlags & 0x800000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                    fullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView5, R.color.color_white)) : (getColorFromResource(mboundView5, R.color.color_666)));
            }
            if ((dirtyFlags & 0x80000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                    fullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView7, R.color.color_white)) : (getColorFromResource(mboundView7, R.color.color_666)));
            }
            if ((dirtyFlags & 0x200000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                    fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666 = ((androidxDatabindingViewDataBindingSafeUnboxFullscreen) ? (getColorFromResource(mboundView4, R.color.color_white)) : (getColorFromResource(mboundView4, R.color.color_666)));
            }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                // read String.valueOf(feed.ugc.likeCount)
                stringValueOfFeedUgcLikeCount = java.lang.String.valueOf(feedUgcLikeCount);
        }

        if ((dirtyFlags & 0x43L) != 0) {

                // read feed.ugc.likeCount > 0 ? String.valueOf(feed.ugc.likeCount) : @android:string/like
                feedUgcLikeCountInt0StringValueOfFeedUgcLikeCountMboundView5AndroidStringLike = ((feedUgcLikeCountInt0) ? (stringValueOfFeedUgcLikeCount) : (mboundView5.getResources().getString(R.string.like)));
        }
        if ((dirtyFlags & 0x5bL) != 0) {

                // read feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                feedUgcHasLikedMboundView4AndroidColorColorThemeFullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666 = ((feedUgcHasLiked) ? (getColorFromResource(mboundView4, R.color.color_theme)) : (fullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666));
                // read feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                feedUgcHasLikedMboundView5AndroidColorColorThemeFullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666 = ((feedUgcHasLiked) ? (getColorFromResource(mboundView5, R.color.color_theme)) : (fullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666));
        }
        if ((dirtyFlags & 0x6bL) != 0) {

                // read feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                feedUgcHasFavoriteMboundView7AndroidColorColorThemeFullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666 = ((feedUgcHasFavorite) ? (getColorFromResource(mboundView7, R.color.color_theme)) : (fullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666));
                // read feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
                feedUgcHasFavoriteMboundView8AndroidColorColorThemeFullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666 = ((feedUgcHasFavorite) ? (getColorFromResource(mboundView8, R.color.color_theme)) : (fullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666));
        }
        // batch finished
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.inputView.setTextColor(fullscreenInputViewAndroidColorColorWhiteInputViewAndroidColorColor333);
            this.inputView.setHintTextColor(fullscreenInputViewAndroidColorColorWhiteInputViewAndroidColorColor333);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, androidx.databinding.adapters.Converters.convertColorToDrawable(fullscreenMboundView0AndroidColorTransparentMboundView0AndroidColorColorWhite));
            this.mboundView1.setVisibility(fullscreenViewINVISIBLEViewVISIBLE);
            this.mboundView11.setTextColor(fullscreenMboundView11AndroidColorColorWhiteMboundView11AndroidColorColor666);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView10.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(fullscreenMboundView10AndroidColorColorWhiteMboundView10AndroidColorColor666));
            }
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback3);
            this.mboundView6.setOnClickListener(mCallback4);
            this.mboundView9.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x53L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, feedUgcHasLikedMboundView4AndroidDrawableIconCellLikedMboundView4AndroidDrawableIconCellLike);
        }
        if ((dirtyFlags & 0x5bL) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView4.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(feedUgcHasLikedMboundView4AndroidColorColorThemeFullscreenMboundView4AndroidColorColorWhiteMboundView4AndroidColorColor666));
            }
            // api target 1

            this.mboundView5.setTextColor(feedUgcHasLikedMboundView5AndroidColorColorThemeFullscreenMboundView5AndroidColorColorWhiteMboundView5AndroidColorColor666);
        }
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, feedUgcLikeCountInt0StringValueOfFeedUgcLikeCountMboundView5AndroidStringLike);
        }
        if ((dirtyFlags & 0x63L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, feedUgcHasFavoriteMboundView7AndroidDrawableIcCollectedMboundView7AndroidDrawableIcCollect);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, feedUgcHasFavoriteMboundView8AndroidStringHasCollectMboundView8AndroidStringCollect);
        }
        if ((dirtyFlags & 0x6bL) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView7.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(feedUgcHasFavoriteMboundView7AndroidColorColorThemeFullscreenMboundView7AndroidColorColorWhiteMboundView7AndroidColorColor666));
            }
            // api target 1

            this.mboundView8.setTextColor(feedUgcHasFavoriteMboundView8AndroidColorColorThemeFullscreenMboundView8AndroidColorColorWhiteMboundView8AndroidColorColor666);
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
                // (Context) owner
                android.content.Context contextOwner = null;
                // owner
                androidx.lifecycle.LifecycleOwner owner = mOwner;



                contextOwner = ((android.content.Context) (owner));


                com.mooc.ppjoke.ui.InteractionPresenter.openShare(contextOwner, feed);
                break;
            }
            case 2: {
                // localize variables for thread safety
                // feed
                com.mooc.ppjoke.model.Feed feed = mFeed;
                // owner
                androidx.lifecycle.LifecycleOwner owner = mOwner;




                com.mooc.ppjoke.ui.InteractionPresenter.toggleFeedFavorite(owner, feed);
                break;
            }
            case 1: {
                // localize variables for thread safety
                // feed
                com.mooc.ppjoke.model.Feed feed = mFeed;
                // owner
                androidx.lifecycle.LifecycleOwner owner = mOwner;




                com.mooc.ppjoke.ui.InteractionPresenter.toggleFeedLike(owner, feed);
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): feed.ugc
        flag 2 (0x3L): owner
        flag 3 (0x4L): fullscreen
        flag 4 (0x5L): feed.ugc.hasLiked
        flag 5 (0x6L): feed.ugc.hasFavorite
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_333
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_333
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 11 (0xcL): feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 12 (0xdL): feed.ugc.hasLiked ? @android:drawable/icon_cell_liked : @android:drawable/icon_cell_like
        flag 13 (0xeL): feed.ugc.likeCount > 0 ? String.valueOf(feed.ugc.likeCount) : @android:string/like
        flag 14 (0xfL): feed.ugc.likeCount > 0 ? String.valueOf(feed.ugc.likeCount) : @android:string/like
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 21 (0x16L): feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 22 (0x17L): feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 23 (0x18L): feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 24 (0x19L): feed.ugc.hasLiked ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_white
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/transparent : @android:color/color_white
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? View.INVISIBLE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? View.INVISIBLE : View.VISIBLE
        flag 31 (0x20L): feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 32 (0x21L): feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 33 (0x22L): feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 34 (0x23L): feed.ugc.hasFavorite ? @android:color/color_theme : androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 35 (0x24L): feed.ugc.hasFavorite ? @android:drawable/ic_collected : @android:drawable/ic_collect
        flag 36 (0x25L): feed.ugc.hasFavorite ? @android:drawable/ic_collected : @android:drawable/ic_collect
        flag 37 (0x26L): feed.ugc.hasFavorite ? @android:string/has_collect : @android:string/collect
        flag 38 (0x27L): feed.ugc.hasFavorite ? @android:string/has_collect : @android:string/collect
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(fullscreen) ? @android:color/color_white : @android:color/color_666
    flag mapping end*/
    //end
}