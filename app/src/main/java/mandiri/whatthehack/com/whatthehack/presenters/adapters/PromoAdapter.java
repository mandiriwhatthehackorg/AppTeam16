package mandiri.whatthehack.com.whatthehack.presenters.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mandiri.whatthehack.com.whatthehack.R;
import mandiri.whatthehack.com.whatthehack.data.models.Promo;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.PromoViewHolder> {

    private ArrayList<Promo> promoArrayList;

    public PromoAdapter(ArrayList<Promo> promoArrayList) {
        this.promoArrayList = promoArrayList;
    }

    public class PromoViewHolder extends RecyclerView.ViewHolder {

        private TextView tvPromoTitle, tvPromoDetail;
        private LinearLayout llPromo;

        public PromoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPromoTitle = (TextView) itemView.findViewById(R.id.tvPromoTitle);
            tvPromoDetail = (TextView) itemView.findViewById(R.id.tvPromoDetail);
            llPromo = (LinearLayout) itemView.findViewById(R.id.llPromo);
        }
    }

    @NonNull
    @Override
    public PromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_promo, parent, false);
        return new PromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromoViewHolder holder, int position) {
        Promo promo = promoArrayList.get(position);
        holder.tvPromoDetail.setText(promo.getPromoDetail());
        holder.tvPromoTitle.setText(promo.getPromoTitle());

    }

    @Override
    public int getItemCount() {
        return (promoArrayList != null) ? promoArrayList.size() : 0;
    }
}
