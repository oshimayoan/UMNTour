// Generated code from Butter Knife. Do not modify!
package com.umn_11110110122.umntour;

import android.content.res.Resources;
import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BaukActivity$$ViewBinder<T extends com.umn_11110110122.umntour.BaukActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'imgBg'");
    target.imgBg = finder.castView(view, 2131492970, "field 'imgBg'");
    view = finder.findRequiredView(source, 2131492992, "field 'btnHome', method 'btnHomeClick', and method 'btnHomeTouch'");
    target.btnHome = finder.castView(view, 2131492992, "field 'btnHome'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnHomeClick();
        }
      });
    view.setOnTouchListener(
      new android.view.View.OnTouchListener() {
        @Override public boolean onTouch(
          android.view.View p0,
          android.view.MotionEvent p1
        ) {
          return target.btnHomeTouch(p1);
        }
      });
    view = finder.findRequiredView(source, 2131492991, "field 'btnGroup', method 'btnGroupClick', and method 'btnGroupTouch'");
    target.btnGroup = finder.castView(view, 2131492991, "field 'btnGroup'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnGroupClick();
        }
      });
    view.setOnTouchListener(
      new android.view.View.OnTouchListener() {
        @Override public boolean onTouch(
          android.view.View p0,
          android.view.MotionEvent p1
        ) {
          return target.btnGroupTouch(p1);
        }
      });
    view = finder.findRequiredView(source, 2131492990, "field 'btnInfo', method 'btnInfoClick', and method 'btnInfoTouch'");
    target.btnInfo = finder.castView(view, 2131492990, "field 'btnInfo'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnInfoClick();
        }
      });
    view.setOnTouchListener(
      new android.view.View.OnTouchListener() {
        @Override public boolean onTouch(
          android.view.View p0,
          android.view.MotionEvent p1
        ) {
          return target.btnInfoTouch(p1);
        }
      });
    view = finder.findRequiredView(source, 2131492989, "field 'btnHelp', method 'btnHelpClick', and method 'btnHelpTouch'");
    target.btnHelp = finder.castView(view, 2131492989, "field 'btnHelp'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnHelpClick();
        }
      });
    view.setOnTouchListener(
      new android.view.View.OnTouchListener() {
        @Override public boolean onTouch(
          android.view.View p0,
          android.view.MotionEvent p1
        ) {
          return target.btnHelpTouch(p1);
        }
      });
    view = finder.findRequiredView(source, 2131492993, "field 'lblNavBottom'");
    target.lblNavBottom = finder.castView(view, 2131492993, "field 'lblNavBottom'");
    view = finder.findRequiredView(source, 2131492994, "method 'btnNavBottom'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnNavBottom();
        }
      });
    Resources res = finder.getContext(source).getResources();
    target.button_pressed_color = res.getString(2131099671);
    target.button_unpressed_color = res.getString(2131099672);
    target.team = res.getString(2131099691);
    target.member = res.getString(2131099690);
    target.help_title = res.getString(2131099676);
    target.help_content = res.getString(2131099675);
    target.label_lobby_center = res.getString(2131099682);
  }

  @Override public void unbind(T target) {
    target.imgBg = null;
    target.btnHome = null;
    target.btnGroup = null;
    target.btnInfo = null;
    target.btnHelp = null;
    target.lblNavBottom = null;
  }
}
