package com.umn_11110110122.umntour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.umn_11110110122.umntour.util.MainMenu;
import com.umn_11110110122.umntour.util.Navigation;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;

public class MedicalCenterActivity extends AppCompatActivity {

    MainMenu mainMenu = new MainMenu();
    Navigation navigation = new Navigation();

    @Bind(R.id.imgBg)
    SubsamplingScaleImageView imgBg;
    @Bind(R.id.btnHome)
    ImageButton btnHome;
    @Bind(R.id.btnGroup) ImageButton btnGroup;
    @Bind(R.id.btnInfo) ImageButton btnInfo;
    @Bind(R.id.btnHelp) ImageButton btnHelp;
    @Bind(R.id.lblNavTop)
    TextView lblNavTop;

    @BindString(R.string.button_pressed_color) String button_pressed_color;
    @BindString(R.string.button_unpressed_color) String button_unpressed_color;
    @BindString(R.string.team) protected String team;
    @BindString(R.string.member) protected String member;
    @BindString(R.string.help_title) protected String help_title;
    @BindString(R.string.help_content) protected String help_content;
    @BindString(R.string.label_rear_gate_left) protected String label_rear_gate_left;

    private String getTeam() {
        return team;
    }

    private String getMember() {
        return member;
    }

    private String getHelp_title() {
        return help_title;
    }

    private String getHelp_content() {
        return help_content;
    }

    private String getLabel_rear_gate_left() {
        return label_rear_gate_left;
    }

    //navigation click listeners
    @OnClick(R.id.btnNavTop) void btnNavTop(){
        //change to selected activity and destroy current activity
        navigation.changeActivity(this, RearGateLeftActivity.class);
        finish();
    }
    @OnClick(R.id.btnNavBottomLeft) void btnNavBottomLeft(){
        //change to selected activity and destroy current activity
        navigation.changeActivity(this, RearMedicalCenterActivity.class);
        finish();
    }

    //main menu click listeners
    @OnClick(R.id.btnHome) void btnHomeClick(){
        //change to main activity and destroy current activity
        navigation.toHome(this);
        finish();
    }
    @OnClick(R.id.btnGroup) void btnGroupClick(){
        //show dialog without button
        mainMenu.showDialog(this, this.getTeam(), this.getMember());
    }
    @OnClick(R.id.btnInfo) void btnInfoClick(){
        //show fragment dialog
        mainMenu.showFragmentDialog(this, getLayoutInflater().inflate(R.layout.dialog_info, null));
    }
    @OnClick(R.id.btnHelp) void btnHelpClick(){
        //show dialog with positive button
        mainMenu.showDialogPositive(this, this.getHelp_title(), this.getHelp_content());
    }

    //main menu touch listeners
    @OnTouch(R.id.btnHome) boolean btnHomeTouch(MotionEvent event){
        //set ripple effect for the button
        btnHome = mainMenu.setRipple(btnHome, event, button_pressed_color, button_unpressed_color);

        return false;
    }
    @OnTouch(R.id.btnGroup) boolean btnGroupTouch(MotionEvent event){
        //set ripple effect for the button
        btnGroup = mainMenu.setRipple(btnGroup, event, button_pressed_color, button_unpressed_color);

        return false;
    }
    @OnTouch(R.id.btnInfo) boolean btnInfoTouch(MotionEvent event){
        //set ripple effect for the button
        btnInfo = mainMenu.setRipple(btnInfo, event, button_pressed_color, button_unpressed_color);

        return false;
    }
    @OnTouch(R.id.btnHelp) boolean btnHelpTouch(MotionEvent event){
        //set ripple effect for the button
        btnHelp = mainMenu.setRipple(btnHelp, event, button_pressed_color, button_unpressed_color);

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_center);

        //bind this activity
        ButterKnife.bind(this);

        //set image for background image using scaling image view
        imgBg.setImage(ImageSource.resource(R.drawable.medic));

        //set text for navigation label
        lblNavTop.setText(this.getLabel_rear_gate_left());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_medical_center, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        //unbind this activity when destroyed
        ButterKnife.unbind(this);

        super.onDestroy();
    }
}
