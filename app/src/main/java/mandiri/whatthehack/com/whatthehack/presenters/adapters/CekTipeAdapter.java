package mandiri.whatthehack.com.whatthehack.presenters.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import mandiri.whatthehack.com.whatthehack.views.fragments.FifthSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.FirstSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.FourthSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.SecondSoalFragment;
import mandiri.whatthehack.com.whatthehack.views.fragments.ThirdSoalFragment;

public class CekTipeAdapter extends FragmentPagerAdapter {

    public CekTipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0 :
                return FirstSoalFragment.newInstance("0", "Soal 1");
            case 1 :
                return SecondSoalFragment.newInstance("0", "Soal 1");
            case 2 :
                return ThirdSoalFragment.newInstance("0", "Soal 1");
            case 3 :
                return FourthSoalFragment.newInstance("0", "Soal 1");
            case 4 :
                return FifthSoalFragment.newInstance("0", "Soal 1");
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
