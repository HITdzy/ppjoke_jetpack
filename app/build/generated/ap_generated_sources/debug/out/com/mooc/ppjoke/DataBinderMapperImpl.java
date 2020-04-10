package com.mooc.ppjoke;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.databinding.ActivityFeedDetailTypeImageBindingImpl;
import com.mooc.ppjoke.databinding.ActivityLayoutCaptureBindingImpl;
import com.mooc.ppjoke.databinding.ActivityLayoutPreviewBindingImpl;
import com.mooc.ppjoke.databinding.ActivityLayoutProfileBindingImpl;
import com.mooc.ppjoke.databinding.ActivityLayoutPublishBindingImpl;
import com.mooc.ppjoke.databinding.ActivityLayoutTagFeedListBindingImpl;
import com.mooc.ppjoke.databinding.FragmentMyBindingImpl;
import com.mooc.ppjoke.databinding.FragmentSofaBindingImpl;
import com.mooc.ppjoke.databinding.LayoutCommentDialogBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedAuthorBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedCommentListItemBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedDetailAuthorInfoBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedDetailBottomInateractionBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedDetailTypeImageHeaderBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedDetailTypeVideoBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedDetailTypeVideoHeaderBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedInteractionBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTagBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTextBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTopCommentBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTypeCommentBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTypeImageBindingImpl;
import com.mooc.ppjoke.databinding.LayoutFeedTypeVideoBindingImpl;
import com.mooc.ppjoke.databinding.LayoutProfileTabCommentInteractionBindingImpl;
import com.mooc.ppjoke.databinding.LayoutRefreshViewBindingImpl;
import com.mooc.ppjoke.databinding.LayoutTagFeedListHeaderBindingImpl;
import com.mooc.ppjoke.databinding.LayoutTagListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFEEDDETAILTYPEIMAGE = 1;

  private static final int LAYOUT_ACTIVITYLAYOUTCAPTURE = 2;

  private static final int LAYOUT_ACTIVITYLAYOUTPREVIEW = 3;

  private static final int LAYOUT_ACTIVITYLAYOUTPROFILE = 4;

  private static final int LAYOUT_ACTIVITYLAYOUTPUBLISH = 5;

  private static final int LAYOUT_ACTIVITYLAYOUTTAGFEEDLIST = 6;

  private static final int LAYOUT_FRAGMENTMY = 7;

  private static final int LAYOUT_FRAGMENTSOFA = 8;

  private static final int LAYOUT_LAYOUTCOMMENTDIALOG = 9;

  private static final int LAYOUT_LAYOUTFEEDAUTHOR = 10;

  private static final int LAYOUT_LAYOUTFEEDCOMMENTLISTITEM = 11;

  private static final int LAYOUT_LAYOUTFEEDDETAILAUTHORINFO = 12;

  private static final int LAYOUT_LAYOUTFEEDDETAILBOTTOMINATERACTION = 13;

  private static final int LAYOUT_LAYOUTFEEDDETAILTYPEIMAGEHEADER = 14;

  private static final int LAYOUT_LAYOUTFEEDDETAILTYPEVIDEO = 15;

  private static final int LAYOUT_LAYOUTFEEDDETAILTYPEVIDEOHEADER = 16;

  private static final int LAYOUT_LAYOUTFEEDINTERACTION = 17;

  private static final int LAYOUT_LAYOUTFEEDTAG = 18;

  private static final int LAYOUT_LAYOUTFEEDTEXT = 19;

  private static final int LAYOUT_LAYOUTFEEDTOPCOMMENT = 20;

  private static final int LAYOUT_LAYOUTFEEDTYPECOMMENT = 21;

  private static final int LAYOUT_LAYOUTFEEDTYPEIMAGE = 22;

  private static final int LAYOUT_LAYOUTFEEDTYPEVIDEO = 23;

  private static final int LAYOUT_LAYOUTPROFILETABCOMMENTINTERACTION = 24;

  private static final int LAYOUT_LAYOUTREFRESHVIEW = 25;

  private static final int LAYOUT_LAYOUTTAGFEEDLISTHEADER = 26;

  private static final int LAYOUT_LAYOUTTAGLISTITEM = 27;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(27);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_feed_detail_type_image, LAYOUT_ACTIVITYFEEDDETAILTYPEIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_layout_capture, LAYOUT_ACTIVITYLAYOUTCAPTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_layout_preview, LAYOUT_ACTIVITYLAYOUTPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_layout_profile, LAYOUT_ACTIVITYLAYOUTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_layout_publish, LAYOUT_ACTIVITYLAYOUTPUBLISH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.activity_layout_tag_feed_list, LAYOUT_ACTIVITYLAYOUTTAGFEEDLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.fragment_my, LAYOUT_FRAGMENTMY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.fragment_sofa, LAYOUT_FRAGMENTSOFA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_comment_dialog, LAYOUT_LAYOUTCOMMENTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_author, LAYOUT_LAYOUTFEEDAUTHOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_comment_list_item, LAYOUT_LAYOUTFEEDCOMMENTLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_detail_author_info, LAYOUT_LAYOUTFEEDDETAILAUTHORINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction, LAYOUT_LAYOUTFEEDDETAILBOTTOMINATERACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_detail_type_image_header, LAYOUT_LAYOUTFEEDDETAILTYPEIMAGEHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_detail_type_video, LAYOUT_LAYOUTFEEDDETAILTYPEVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_detail_type_video_header, LAYOUT_LAYOUTFEEDDETAILTYPEVIDEOHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_interaction, LAYOUT_LAYOUTFEEDINTERACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_tag, LAYOUT_LAYOUTFEEDTAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_text, LAYOUT_LAYOUTFEEDTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_top_comment, LAYOUT_LAYOUTFEEDTOPCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_type_comment, LAYOUT_LAYOUTFEEDTYPECOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_type_image, LAYOUT_LAYOUTFEEDTYPEIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_feed_type_video, LAYOUT_LAYOUTFEEDTYPEVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction, LAYOUT_LAYOUTPROFILETABCOMMENTINTERACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_refresh_view, LAYOUT_LAYOUTREFRESHVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_tag_feed_list_header, LAYOUT_LAYOUTTAGFEEDLISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mooc.ppjoke.R.layout.layout_tag_list_item, LAYOUT_LAYOUTTAGLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFEEDDETAILTYPEIMAGE: {
          if ("layout/activity_feed_detail_type_image_0".equals(tag)) {
            return new ActivityFeedDetailTypeImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_feed_detail_type_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAYOUTCAPTURE: {
          if ("layout/activity_layout_capture_0".equals(tag)) {
            return new ActivityLayoutCaptureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_layout_capture is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAYOUTPREVIEW: {
          if ("layout/activity_layout_preview_0".equals(tag)) {
            return new ActivityLayoutPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_layout_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAYOUTPROFILE: {
          if ("layout/activity_layout_profile_0".equals(tag)) {
            return new ActivityLayoutProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_layout_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAYOUTPUBLISH: {
          if ("layout/activity_layout_publish_0".equals(tag)) {
            return new ActivityLayoutPublishBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_layout_publish is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAYOUTTAGFEEDLIST: {
          if ("layout/activity_layout_tag_feed_list_0".equals(tag)) {
            return new ActivityLayoutTagFeedListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_layout_tag_feed_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMY: {
          if ("layout/fragment_my_0".equals(tag)) {
            return new FragmentMyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSOFA: {
          if ("layout/fragment_sofa_0".equals(tag)) {
            return new FragmentSofaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sofa is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCOMMENTDIALOG: {
          if ("layout/layout_comment_dialog_0".equals(tag)) {
            return new LayoutCommentDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_comment_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDAUTHOR: {
          if ("layout/layout_feed_author_0".equals(tag)) {
            return new LayoutFeedAuthorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_author is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDCOMMENTLISTITEM: {
          if ("layout/layout_feed_comment_list_item_0".equals(tag)) {
            return new LayoutFeedCommentListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_comment_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDDETAILAUTHORINFO: {
          if ("layout/layout_feed_detail_author_info_0".equals(tag)) {
            return new LayoutFeedDetailAuthorInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_detail_author_info is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDDETAILBOTTOMINATERACTION: {
          if ("layout/layout_feed_detail_bottom_inateraction_0".equals(tag)) {
            return new LayoutFeedDetailBottomInateractionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_detail_bottom_inateraction is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDDETAILTYPEIMAGEHEADER: {
          if ("layout/layout_feed_detail_type_image_header_0".equals(tag)) {
            return new LayoutFeedDetailTypeImageHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_detail_type_image_header is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDDETAILTYPEVIDEO: {
          if ("layout/layout_feed_detail_type_video_0".equals(tag)) {
            return new LayoutFeedDetailTypeVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_detail_type_video is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDDETAILTYPEVIDEOHEADER: {
          if ("layout/layout_feed_detail_type_video_header_0".equals(tag)) {
            return new LayoutFeedDetailTypeVideoHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_detail_type_video_header is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDINTERACTION: {
          if ("layout/layout_feed_interaction_0".equals(tag)) {
            return new LayoutFeedInteractionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_interaction is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTAG: {
          if ("layout/layout_feed_tag_0".equals(tag)) {
            return new LayoutFeedTagBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_tag is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTEXT: {
          if ("layout/layout_feed_text_0".equals(tag)) {
            return new LayoutFeedTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_text is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTOPCOMMENT: {
          if ("layout/layout_feed_top_comment_0".equals(tag)) {
            return new LayoutFeedTopCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_top_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTYPECOMMENT: {
          if ("layout/layout_feed_type_comment_0".equals(tag)) {
            return new LayoutFeedTypeCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_type_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTYPEIMAGE: {
          if ("layout/layout_feed_type_image_0".equals(tag)) {
            return new LayoutFeedTypeImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_type_image is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFEEDTYPEVIDEO: {
          if ("layout/layout_feed_type_video_0".equals(tag)) {
            return new LayoutFeedTypeVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_feed_type_video is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROFILETABCOMMENTINTERACTION: {
          if ("layout/layout_profile_tab_comment_interaction_0".equals(tag)) {
            return new LayoutProfileTabCommentInteractionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_profile_tab_comment_interaction is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTREFRESHVIEW: {
          if ("layout/layout_refresh_view_0".equals(tag)) {
            return new LayoutRefreshViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_refresh_view is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTAGFEEDLISTHEADER: {
          if ("layout/layout_tag_feed_list_header_0".equals(tag)) {
            return new LayoutTagFeedListHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_tag_feed_list_header is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTAGLISTITEM: {
          if ("layout/layout_tag_list_item_0".equals(tag)) {
            return new LayoutTagListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_tag_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.mooc.libcommon.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(21);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "owner");
      sKeys.put(2, "hasFavorite");
      sKeys.put(3, "leftMargin");
      sKeys.put(4, "feedText");
      sKeys.put(5, "author");
      sKeys.put(6, "hasFollow");
      sKeys.put(7, "hasLiked");
      sKeys.put(8, "lifeCycleOwner");
      sKeys.put(9, "tagText");
      sKeys.put(10, "hasdiss");
      sKeys.put(11, "ugc");
      sKeys.put(12, "tagList");
      sKeys.put(13, "feed");
      sKeys.put(14, "shareCount");
      sKeys.put(15, "expand");
      sKeys.put(16, "fullscreen");
      sKeys.put(17, "comment");
      sKeys.put(18, "lines");
      sKeys.put(19, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(27);

    static {
      sKeys.put("layout/activity_feed_detail_type_image_0", com.mooc.ppjoke.R.layout.activity_feed_detail_type_image);
      sKeys.put("layout/activity_layout_capture_0", com.mooc.ppjoke.R.layout.activity_layout_capture);
      sKeys.put("layout/activity_layout_preview_0", com.mooc.ppjoke.R.layout.activity_layout_preview);
      sKeys.put("layout/activity_layout_profile_0", com.mooc.ppjoke.R.layout.activity_layout_profile);
      sKeys.put("layout/activity_layout_publish_0", com.mooc.ppjoke.R.layout.activity_layout_publish);
      sKeys.put("layout/activity_layout_tag_feed_list_0", com.mooc.ppjoke.R.layout.activity_layout_tag_feed_list);
      sKeys.put("layout/fragment_my_0", com.mooc.ppjoke.R.layout.fragment_my);
      sKeys.put("layout/fragment_sofa_0", com.mooc.ppjoke.R.layout.fragment_sofa);
      sKeys.put("layout/layout_comment_dialog_0", com.mooc.ppjoke.R.layout.layout_comment_dialog);
      sKeys.put("layout/layout_feed_author_0", com.mooc.ppjoke.R.layout.layout_feed_author);
      sKeys.put("layout/layout_feed_comment_list_item_0", com.mooc.ppjoke.R.layout.layout_feed_comment_list_item);
      sKeys.put("layout/layout_feed_detail_author_info_0", com.mooc.ppjoke.R.layout.layout_feed_detail_author_info);
      sKeys.put("layout/layout_feed_detail_bottom_inateraction_0", com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction);
      sKeys.put("layout/layout_feed_detail_type_image_header_0", com.mooc.ppjoke.R.layout.layout_feed_detail_type_image_header);
      sKeys.put("layout/layout_feed_detail_type_video_0", com.mooc.ppjoke.R.layout.layout_feed_detail_type_video);
      sKeys.put("layout/layout_feed_detail_type_video_header_0", com.mooc.ppjoke.R.layout.layout_feed_detail_type_video_header);
      sKeys.put("layout/layout_feed_interaction_0", com.mooc.ppjoke.R.layout.layout_feed_interaction);
      sKeys.put("layout/layout_feed_tag_0", com.mooc.ppjoke.R.layout.layout_feed_tag);
      sKeys.put("layout/layout_feed_text_0", com.mooc.ppjoke.R.layout.layout_feed_text);
      sKeys.put("layout/layout_feed_top_comment_0", com.mooc.ppjoke.R.layout.layout_feed_top_comment);
      sKeys.put("layout/layout_feed_type_comment_0", com.mooc.ppjoke.R.layout.layout_feed_type_comment);
      sKeys.put("layout/layout_feed_type_image_0", com.mooc.ppjoke.R.layout.layout_feed_type_image);
      sKeys.put("layout/layout_feed_type_video_0", com.mooc.ppjoke.R.layout.layout_feed_type_video);
      sKeys.put("layout/layout_profile_tab_comment_interaction_0", com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction);
      sKeys.put("layout/layout_refresh_view_0", com.mooc.ppjoke.R.layout.layout_refresh_view);
      sKeys.put("layout/layout_tag_feed_list_header_0", com.mooc.ppjoke.R.layout.layout_tag_feed_list_header);
      sKeys.put("layout/layout_tag_list_item_0", com.mooc.ppjoke.R.layout.layout_tag_list_item);
    }
  }
}
