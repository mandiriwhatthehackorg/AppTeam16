package mandiri.whatthehack.com.whatthehack.presenters.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mandiri.whatthehack.com.whatthehack.R;
import mandiri.whatthehack.com.whatthehack.data.models.Mutasi;

public class MutasiAdapter extends RecyclerView.Adapter<MutasiAdapter.MutasiViewHolder> {

    private ArrayList<Mutasi> mutasiArrayList;

    public MutasiAdapter(ArrayList<Mutasi> mutasiArrayList) {
        this.mutasiArrayList = mutasiArrayList;
    }

    public class MutasiViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivMutasi;
        public TextView tvMutasiTransaction;
        public TextView tvMutasiValue;
        public TextView tvMutasiType;
        public View mutasiDivider;

        public MutasiViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMutasi = (ImageView) itemView.findViewById(R.id.ivMutasi);
            tvMutasiTransaction = (TextView) itemView.findViewById(R.id.tvMutasiTransaction);
            tvMutasiValue = (TextView) itemView.findViewById(R.id.tvMutasiValue);
            tvMutasiType = (TextView) itemView.findViewById(R.id.tvMutasiType);
            mutasiDivider = (View) itemView.findViewById(R.id.mutasiDivider);
        }
    }

    @NonNull
    @Override
    public MutasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_mutasi_rekening, parent, false);
        return new MutasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MutasiViewHolder holder, int position) {

        Mutasi mutasi = mutasiArrayList.get(position);
        holder.tvMutasiTransaction.setText(mutasi.getTransactionName());
        holder.tvMutasiValue.setText(mutasi.getTransactionValue());
        holder.tvMutasiType.setText(mutasi.isTransactionType() ? "Uang Masuk" : "Uang Keluar");
        if (position == mutasiArrayList.size() - 1) holder.mutasiDivider.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
        return (mutasiArrayList != null) ? mutasiArrayList.size() : 0;
    }
}
