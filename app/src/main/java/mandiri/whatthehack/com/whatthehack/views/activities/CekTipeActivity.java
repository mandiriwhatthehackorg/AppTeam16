package mandiri.whatthehack.com.whatthehack.views.activities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import mandiri.whatthehack.com.whatthehack.R;
import mandiri.whatthehack.com.whatthehack.presenters.adapters.CekTipeAdapter;
import mandiri.whatthehack.com.whatthehack.views.fragments.FifthSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.FirstSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.FourthSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.SecondSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.ThirdSoalFragment;

public class CekTipeActivity extends AppCompatActivity implements FirstSoalFragment.OnFragmentInteractionListener,
        SecondSoalFragment.OnFragmentInteractionListener,
        ThirdSoalFragment.OnFragmentInteractionListener,
        FourthSoalFragment.OnFragmentInteractionListener,
        FifthSoalFragment.OnFragmentInteractionListener {

    FragmentPagerAdapter fragmentPagerAdapter;

    public class CekTipeViewPager extends ViewPager {
        public CekTipeViewPager(@NonNull Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent ev) {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_tipe);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vpCekTipe);

        fragmentPagerAdapter = new CekTipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
