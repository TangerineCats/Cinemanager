package net.lzzy.cinemanager.fragments;

import android.widget.TextView;

import net.lzzy.cinemanager.R;

/**
 * @author lzzy_gxy
 * @date 2019/3/26
 * Description:
 */
public class OrderFragment extends BaseFragment {


    //未重构
//    public OrderFragment(){}
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//       View view=inflater.inflate(R.layout.fragment_order,null);
//       TextView textView=view.findViewById(R.id.fragment_order_tv);
//        return view;
//    }
    //重构

    @Override
    protected void populate() {
        TextView textView = find(R.id.fragment_order_tv);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_order;
    }
}
