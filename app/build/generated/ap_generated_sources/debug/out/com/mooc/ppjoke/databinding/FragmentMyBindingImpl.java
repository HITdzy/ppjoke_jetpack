package com.mooc.ppjoke.databinding;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyBindingImpl extends FragmentMyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.action_logout, 9);
        sViewsWithIds.put(R.id.go_detail, 10);
        sViewsWithIds.put(R.id.card_overlap, 11);
        sViewsWithIds.put(R.id.user_feed, 12);
        sViewsWithIds.put(R.id.user_comment, 13);
        sViewsWithIds.put(R.id.user_favorite, 14);
        sViewsWithIds.put(R.id.user_history, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.mooc.ppjoke.view.PPImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentMyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (com.mooc.ppjoke.view.PPImageView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[15]
            );
        this.avatar.setTag(null);
        this.description.setTag(null);
        this.fansCount.setTag(null);
        this.followCount.setTag(null);
        this.likeCount.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.mooc.ppjoke.view.PPImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.name.setTag(null);
        this.scoreCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.user == variableId) {
            setUser((com.mooc.ppjoke.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.mooc.ppjoke.model.User User) {
        updateRegistration(0, User);
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((com.mooc.ppjoke.model.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(com.mooc.ppjoke.model.User User, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.CharSequence stringConvertConvertSpannableUserScoreScoreCountAndroidStringScoreCount = null;
        int userLikeCount = 0;
        java.lang.String userName = null;
        java.lang.String userAvatar = null;
        int userScore = 0;
        int userFollowCount = 0;
        java.lang.CharSequence stringConvertConvertSpannableUserFollowerCountFansCountAndroidStringFansCount = null;
        com.mooc.ppjoke.model.User user = mUser;
        java.lang.CharSequence stringConvertConvertSpannableUserLikeCountLikeCountAndroidStringLikeCount = null;
        java.lang.String userDescription = null;
        int userFollowerCount = 0;
        java.lang.CharSequence stringConvertConvertSpannableUserFollowCountFollowCountAndroidStringFollowCount = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.likeCount
                    userLikeCount = user.likeCount;
                    // read user.name
                    userName = user.name;
                    // read user.avatar
                    userAvatar = user.avatar;
                    // read user.score
                    userScore = user.score;
                    // read user.followCount
                    userFollowCount = user.followCount;
                    // read user.description
                    userDescription = user.description;
                    // read user.followerCount
                    userFollowerCount = user.followerCount;
                }


                // read StringConvert.convertSpannable(user.likeCount, @android:string/like_count)
                stringConvertConvertSpannableUserLikeCountLikeCountAndroidStringLikeCount = com.mooc.ppjoke.utils.StringConvert.convertSpannable(userLikeCount, likeCount.getResources().getString(R.string.like_count));
                // read StringConvert.convertSpannable(user.score, @android:string/score_count)
                stringConvertConvertSpannableUserScoreScoreCountAndroidStringScoreCount = com.mooc.ppjoke.utils.StringConvert.convertSpannable(userScore, scoreCount.getResources().getString(R.string.score_count));
                // read StringConvert.convertSpannable(user.followCount, @android:string/follow_count)
                stringConvertConvertSpannableUserFollowCountFollowCountAndroidStringFollowCount = com.mooc.ppjoke.utils.StringConvert.convertSpannable(userFollowCount, followCount.getResources().getString(R.string.follow_count));
                // read StringConvert.convertSpannable(user.followerCount, @android:string/fans_count)
                stringConvertConvertSpannableUserFollowerCountFansCountAndroidStringFansCount = com.mooc.ppjoke.utils.StringConvert.convertSpannable(userFollowerCount, fansCount.getResources().getString(R.string.fans_count));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.mooc.ppjoke.view.PPImageView.setImageUrl(this.avatar, userAvatar, true, 0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, userDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fansCount, stringConvertConvertSpannableUserFollowerCountFansCountAndroidStringFansCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.followCount, stringConvertConvertSpannableUserFollowCountFollowCountAndroidStringFollowCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.likeCount, stringConvertConvertSpannableUserLikeCountLikeCountAndroidStringLikeCount);
            com.mooc.ppjoke.view.PPImageView.setBlurImageUrl(this.mboundView1, userAvatar, 50);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, userName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.scoreCount, stringConvertConvertSpannableUserScoreScoreCountAndroidStringScoreCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}