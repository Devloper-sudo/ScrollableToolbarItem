package toolbar.scroll.reign.com.scrollabletoolbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abhishek on 1/26/2019.
 */

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> itemList;


    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_items, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof ItemHolder) {
            ItemHolder itemHolder = (ItemHolder) holder;
            Item item = itemList.get(position);
            itemHolder.textView.setImageResource(item.getImage());
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    static class ItemHolder extends RecyclerView.ViewHolder {

        public ImageView textView;

        public ItemHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
