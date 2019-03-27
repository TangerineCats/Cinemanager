package net.lzzy.cinemanager.fragments;

import android.widget.TextView;

import net.lzzy.cinemanager.R;

/**
 * @author lzzy_gxy
 * @date 2019/3/26
 * Description:
 */
public class OrderFragment extends BaseFragment {

    @Override
    protected void populate() {
        TextView tv = find(R.id.fragment_container);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_order;
    }
}
