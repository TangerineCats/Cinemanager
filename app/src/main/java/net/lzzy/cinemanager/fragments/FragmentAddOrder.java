package net.lzzy.cinemanager.fragments;

import android.content.Context;
import android.widget.EditText;

import net.lzzy.cinemanager.R;

/**
 * @author lzzy_gxy
 * @date 2019/3/27
 * Description:
 */
public class FragmentAddOrder extends BaseFragment implements OnFragmentInteractionListener {
    private OnFragmentInteractionListener listener;

    @Override
    protected void populate() {
        listener.hideSearch();
        EditText edt = find(R.id.fragment_add_order_edt);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_add_order;
    }

    @Override
    public void hideSearch() {
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            listener.hideSearch();
        }
    }

    //4 赋值
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "必须实现OnFragmentInteractionListener");
        }
    }

    // 销毁
    @Override
    public void onDestroy() {
        super.onDestroy();
        listener = null;
    }
}
