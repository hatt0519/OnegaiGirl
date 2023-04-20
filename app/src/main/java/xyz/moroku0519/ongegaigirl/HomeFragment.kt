package xyz.moroku0519.ongegaigirl

import android.databinding.BaseObservable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xyz.moroku0519.ongegaigirl.databinding.FragmentHomeBinding

/**
 * Created by kazuki.hattori on 2018/05/13.
 */

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentHomeBinding = FragmentHomeBinding.bind(inflater.inflate(R.layout.fragment_home, container, false)).apply {
            viewModel = HomeViewModel()
        }
        return binding.root
    }

    companion object {
        fun newInstance(): Fragment = HomeFragment()
    }

    inner class HomeViewModel : BaseObservable() {
        fun onClickFAB(view: View) {
            MockActivity.startMockActivity(view.context, context.getString(R.string.title_shopping_list))
        }
    }
}
